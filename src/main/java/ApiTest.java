import static io.restassured.Resassured.*;
import static.org.io.hamcrest.Machers.*;
public class ApiTest {

    @Test
   public void GetTest()
   {

        System.out.println("Test");
       Given(param("q", "Greenway").and().param("state","ACT")
              .and().Headers("auth-key","780437db-be2e-4a13-b3c1-ee16e92e49b3"))
       When("Get","https://digitalapi.auspost.com.au/postcode/search")
    }
}
