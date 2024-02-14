package testeapi;

import org.junit.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class TesteAPI {
	@Test
	public void trelloAPI(){
		
		baseURI = "https://api.trello.com";	
		Response response = RestAssured
                .given()
                .when()
                .get("/1/actions/592f11060f95a3d3d46a987a")
                .then()
                //.log().all()
                .statusCode(200) 
                .extract()
                .response();
			
		String listName = response.jsonPath().getString("data.list.name");
        System.out.println("O nome da lista é: " + listName);
		
		
	}

}
