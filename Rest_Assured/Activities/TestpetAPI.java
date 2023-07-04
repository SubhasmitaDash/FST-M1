import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestpetAPI {
    @Test
    public void GetPetDetails(){
        String baseURL="https://petstore.swagger.io/v2/pet";
        Response response=given().contentType(ContentType.JSON).when().get(baseURL+ "/findByStatus?status=sold");

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        // Assertions
        response.then().statusCode(200);
        response.then().body("[0].status", equalTo("sold"));
    }

    }

