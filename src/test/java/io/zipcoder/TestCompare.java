package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestCompare {
    @Test
    public void TestC(){
        //given
        Cat tom = new Cat("Tom");
        Dog jerry = new Dog("Jerry");
        Lion simba = new Lion("Jerry");
        ArrayList<Pet> myPets = new ArrayList();
        //when
        myPets.add(tom);
        myPets.add(jerry);
        myPets.add(simba);
        Collections.sort(myPets);
        System.out.println(Arrays.toString(myPets.toArray()));
        for(Pet a : myPets){
            System.out.println(a.getClass());
        }
    }
}
