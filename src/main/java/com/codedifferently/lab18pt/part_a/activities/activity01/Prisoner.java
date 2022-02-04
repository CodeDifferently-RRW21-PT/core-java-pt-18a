package com.codedifferently.lab18pt.part_a.activities.activity01;

public class Prisoner {
    //Fields
    public String name;
    public double height;
    public int sentence;
    public Cell cell;
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell cell){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell;
    }


    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }

    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell name: "+cell.name  );
    }
}
