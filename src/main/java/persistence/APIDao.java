package persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Response;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

public class APIDao {

    public Response getProductById(int id) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://api.escuelajs.co/api/v1/products/" + id);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

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
