package Model;

import org.junit.Assert;
import org.junit.Test;

public class DatabaseTest {

        @Test
        public void testDatabase() throws Exception {

            Database datab = new Database();

            boolean test1 = datab.execute("INSERT INTO movie (title, genre, price, length) " +
                    "VALUES('test', 'test', 'test', 'test')");

            boolean test2 = datab.execute("DELETE FROM movie WHERE title='test';");

            Assert.assertTrue(test1);
            Assert.assertTrue(test2);

        }
}
