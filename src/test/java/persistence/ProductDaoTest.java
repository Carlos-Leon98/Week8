package persistence;

import com.swapi.Entity.Response;
import com.swapi.persistence.ProductDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains unit tests for the ProductDao class.
 * @author cleonrivas
 */
class ProductDaoTest {

    ProductDao productDao = new ProductDao();

    /**
     * Tests method getProductById from ProductDao class.
     */
    @Test
    void getProductByIdSuccess() {
        Response product = productDao.getProductById(2);
        assertEquals("Change title", product.getTitle());
    }
}