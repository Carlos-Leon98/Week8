import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Pets;
import com.swapi.Planet;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestServiceClient {

    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        String url = "https://petstore.swagger.io/v2/pet/9222968140497180519";
        WebTarget target =
                client.target(url);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
//        assertEquals("???", response);

//        ObjectMapper mapper = new ObjectMapper();
//        Planet planet = mapper.readValue(response, Planet.class);
//        String expectedValue = "Tatooine";
//        assertEquals(expectedValue, planet.getName());

        ObjectMapper mapper = new ObjectMapper();
        Pets pet = mapper.readValue(response, Pets.class);
        String wrongStatus = "Unavailable";
        String expectedValue = "fish";
        assertEquals(expectedValue, pet.getName());
        assertNotEquals(wrongStatus, pet.getStatus());
    }
}