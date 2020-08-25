package techproedturkish01.techproedturkish01api;

public class GetRequest05 {
//	When I send a GET request to REST API URL 
//	   https://restful-booker.herokuapp.com/booking/5  
//Then HTTP Status Code 200 olsun
//And Response content type “application/JSON” olsun
//And “firstname” “Jim” olsun
//And “totalprice” 602 olsun
//	 And “checkin” “2015-06-12" olsun
	
	
	@Test
	public void getMethod01() {
		Response response = given().
							when(). 
								get("https://restful-booker.herokuapp.com/booking/5");
		response.prettyPrint();
		response.
		then().
		assertThat().
		statusCode(200).
		contentType(ContentType.JSON).
		body("firstname", Matchers.equalTo("Jim"),
			 "totalprice", Matchers.equalTo(602),
			 "bookingdates.checkin", Matchers.equalTo("2015-06-12"));
	}

}
