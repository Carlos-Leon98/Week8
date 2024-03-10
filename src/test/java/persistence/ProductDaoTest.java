package persistence;

import com.swapi.Entity.Response;
import com.swapi.persistence.ProductDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDaoTest {

    ProductDao productDao = new ProductDao();

    @Test
    void getProductByIdSuccess() {
        Response product = productDao.getProductById(2);
        assertEquals("Change title", product.getTitle());
    }
}