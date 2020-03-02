package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak(){
        //given
        Cat newCat = new Cat("Tom");
        String expected = "meow";

        //when
        String actual = newCat.speak();

        //then
        Assert.assertEquals(expected, actual);
    }
}
