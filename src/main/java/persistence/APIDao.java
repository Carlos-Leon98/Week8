package persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Response;

import java.io.IOException;
import java.util.Properties;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

public class APIDao {

    private Properties properties;

    public APIDao() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/API.properties"));
        } catch (IOException ioe) {
            System.out.println("Database.loadProperties()...Cannot load the properties file");
            ioe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Database.loadProperties()..." + e);
            e.printStackTrace();
        }

    }

    public Response getProductById(int id) {
        String url = properties.getProperty("productsURL");
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url + id);
        String response = target
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Response product = null;

        try {
            product = mapper.readValue(response, Response.class);
        } catch (JsonProcessingException e) {
            // Add a logger
            throw new RuntimeException(e);
        }

        return product;
    }
}
