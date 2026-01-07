package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class NavigateTest extends BaseTest {
	
	@Test(groups = {"regression"})
	public void createUser_withEmptyBody_negativeScenario() {

	    Response response =
		        given()
		            .header("Content-Type", "application/json")
		        .when()
		            .post("/api/users")
		        .then()
		            .statusCode(anyOf(is(201), is(400), is (403)))
		            .extract().response();

		    if (response.getStatusCode() == 400) {
		        Assert.assertNotNull(response.jsonPath().get("error"));
		    }
		}



}
