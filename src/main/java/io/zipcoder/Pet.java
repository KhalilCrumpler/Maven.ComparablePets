package io.zipcoder;

public class Pet implements Comparable<Pet> {
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
}
