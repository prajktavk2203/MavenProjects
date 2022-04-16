package restAsscureTests;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
public class GetJWKDetails 
{
	@Test
	public void getJWKSDetails() 
	{
		given()
		 .when()
		   .get("https://auth-api.authqapoc.aws.greenwayhealth.com/oauth2/jwks")
		 .then()
		    .statusCode(200)
		    .header("Content-Type","application/json; charset=utf-8");
		
	}

	private ResponseAwareMatcher<Response> equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
