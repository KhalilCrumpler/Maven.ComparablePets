package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSpeak(){
        //given
        Dog newDog = new Dog("Fido");
        String expected = "woof";

        //when
        String actual = newDog.speak();

        //then
        Assert.assertEquals(expected, actual);
    }
}
