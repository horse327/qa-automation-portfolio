package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseApiTest;

import static io.restassured.RestAssured.given;

public class EchoApiTest extends BaseApiTest{

    @Test
    public void postEcho_validPayload_shouldReturn200() {


        // Request body
        String requestBody = """
                {
                  "email": "qa.engineer@example.com",
                  "password": "Password123"
                }
                """;

        // Send request and extract response
        String email =
                given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post("/post")
                .then()
                    .statusCode(200)
                    .extract()
                    .path("json.email");

        // Assertion
        Assert.assertEquals(email, "qa.engineer@example.com",
                "Email in response should match request");
    }
    
    @Test
    public void postEcho_missingPassword_shouldStillReturn200ButPasswordNull() {

        // Missing password field
        String requestBody = """
                {
                  "email": "qa.engineer@example.com"
                }
                """;

        String password =
                given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post("/post")
                .then()
                    .statusCode(200)
                    .extract()
                    .path("json.password");

        // Assertion: password should be null
        Assert.assertNull(password,
                "Password should be null when not provided");
    }

}
