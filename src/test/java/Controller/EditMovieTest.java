package Controller;

import org.junit.Assert;
import org.junit.Test;

public class EditMovieTest {

    @Test
    public void testEditMovie() {

        EditMovie editMovie = new EditMovie();

        Assert.assertTrue(editMovie instanceof EditMovie);
    }
}
