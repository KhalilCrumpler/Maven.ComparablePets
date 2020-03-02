package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet> {
    private String name;
    public Pet(){

    }

    public Pet(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String speak(){
        return "";
    }
    @Override
    public int compareTo(Pet o) {
        if(this.getName().compareTo(o.getName()) == 0){
            return this.getClass().toString().compareTo(o.getClass().toString());
        }
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compare(Pet pet1, Pet pet2) {
        if(pet1.getClass() == pet2.getClass()){
            return pet1.getName().compareTo(pet2.getName());
        }
        else{
            return pet1.getClass().toString().compareTo(pet2.getClass().toString());
        }
    }
}
