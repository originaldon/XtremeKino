package View;

import org.junit.Assert;
import org.junit.Test;

public class MenuTest {

    @Test
    public void testMenu() {

        Menu menu = new Menu();

        Assert.assertTrue(menu instanceof Menu);
    }
}
