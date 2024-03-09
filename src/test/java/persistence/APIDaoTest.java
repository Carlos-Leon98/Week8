package persistence;

import com.swapi.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APIDaoTest {

    APIDao productDao = new APIDao();

    @Test
    void getProductByIdSuccess() {
        Response product = productDao.getProductById(2);
        assertEquals("Change title", product.getTitle());
    }
}