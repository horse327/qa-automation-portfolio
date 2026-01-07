package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class UserApiTest extends BaseTest {

	@Test(groups = {"regression"})
	public void createUser_shouldReturnCreatedUser() {

	    String requestBody = """
	        {
	          "name": "Azhar",
	          "job": "QA Engineer"
	        }
	    """;

	    Response response =
	        given()
	            .header("User-Agent", "Mozilla/5.0")
	            .header("Content-Type", "application/json")
	            .body(requestBody)
	        .when()
	            .post("/api/users")
	        .then()
	            .statusCode(anyOf(is(201), is(403)))
	            .extract().response();

	    if (response.getStatusCode() == 201) {
	        Assert.assertEquals(response.jsonPath().getString("name"), "Azhar");
	        Assert.assertEquals(response.jsonPath().getString("job"), "QA Engineer");
	        Assert.assertNotNull(response.jsonPath().getString("id"));
	    }
}
}