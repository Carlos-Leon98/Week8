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

/**
 * This class represents a Data Access Object (DAO) for product
 * information from a remote API.
 * @author cleonrivas
 */
public class ProductDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private Properties properties;

    /**
     * Default constructor for the ProductDao class.
     * Initializes the properties.
     */
    public ProductDao() {
        loadProperties();
    }

    /**
     * Loads properties file into the class.
     */
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

    /**
     * Retrieves product information from the remote
     * API based on the provided product ID.
     *
     * @param id The ID of the product to retrieve.
     * @return A Response object containing product information.
     */
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
