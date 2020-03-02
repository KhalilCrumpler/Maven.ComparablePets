package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {
    @Test
    public void testSpeak(){
        //given
        Lion simba = new Lion("Simba");
        String expected = "roar";

        //when
        String actual = simba.speak();

        //then
        Assert.assertEquals(expected, actual);
    }
}
