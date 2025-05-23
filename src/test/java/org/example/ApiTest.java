package org.example;

import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

  
    private void logResponse(Response response) {
        System.out.println("\nYanıt Süresi: " + response.time());
        System.out.println("Status Kodu: " + response.statusCode());
        System.out.println("Yanıt Gövdesi:\n" + response.getBody().asPrettyString());
    }

   
    @Test
    public void getCommentById() {
        Response response = given()
                .log().all()
            .when()
                .get("https://jsonplaceholder.typicode.com/comments/1");

        logResponse(response);

        response.then()
                .statusCode(200)
                .time(lessThan(2000L))  
                .body("email", equalTo("Eliseo@gardner.biz")); // Beklenen değer
    }

    // POST: Yeni gönderi oluştur
    @Test
    public void postNewBlogEntry() {
        String jsonData = "{ \"title\": \"Test Başlığı\", \"body\": \"Yazılım Test Mühendisliği\", \"userId\": 1 }";

        Response response = given()
                .contentType("application/json")
                .body(jsonData)
                .log().all()
            .when()
                .post("https://jsonplaceholder.typicode.com/posts");

        logResponse(response);

        response.then()
                .statusCode(201)
                .time(lessThan(2000L))
                .body("title", equalTo("Test Başlığı"));
    }
}
