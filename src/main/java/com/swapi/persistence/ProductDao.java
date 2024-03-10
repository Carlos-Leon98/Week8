package com.swapi.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swapi.Entity.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.Properties;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

public class ProductDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private Properties properties;

    public ProductDao() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/API.properties"));
        } catch (IOException ioe) {
            logger.error("Database.loadProperties()...Cannot load the properties file");
        } catch (Exception e) {
            logger.error("Database.loadProperties()..." + e);
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
            logger.error("Error processing JSON: " + e);
        }

        return product;
    }
}
