package com.codedifferently.lab18pt.part_a.examples.tdd.bee;

public class Bee {

    private String name;
    private Integer age;
    private Boolean isQueen;
    private Integer pollenCount;

    public Bee(String name, Integer age, Boolean isQueen){
        this.name = name;
        this.age = age;
        this.isQueen = isQueen;
        this.pollenCount = 0;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public Boolean getIsQueen(){
        return isQueen;
    }

    public Integer getPollenCount(){
        return pollenCount;
    }

    public void collectPollen(){
        if(!isQueen) {
            pollenCount += 10;
        }
    }

    public String toString(){
        return name + " " + age + " " + isQueen + " " + pollenCount;
    }
}
