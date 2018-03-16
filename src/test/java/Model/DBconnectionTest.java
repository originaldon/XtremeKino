package Model;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class DBconnectionTest{

    @Test
    public void testDBconnection() {

        DBconnection db = new DBconnection();

        Assert.assertTrue(db.get() instanceof Connection);
    }
}
