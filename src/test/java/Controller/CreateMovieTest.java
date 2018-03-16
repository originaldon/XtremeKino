package Controller;

import org.junit.Assert;
import org.junit.Test;

public class CreateMovieTest {

    @Test
    public void testCreateMovie() {

        CreateMovie createMovie = new CreateMovie();

        Assert.assertTrue(createMovie instanceof CreateMovie);
    }
}
