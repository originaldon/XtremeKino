package Controller;

import org.junit.Assert;
import org.junit.Test;

public class AdminTest {

    @Test
    public void testAdmin() {

        Admin admin = new Admin();

        Assert.assertTrue(admin instanceof Admin);
    }
}
