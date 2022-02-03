package com.codedifferently.lab18pt.part_a.examples.tdd.bee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeeTest {

    @Test
    public void constructorTest01(){
        // Given
        String name = "Tyron";
        Integer age = 2;
        Boolean isQueen = false;
        Integer pollenCount = 0;
        Bee bee = new Bee(name,age,isQueen);

        // When
        String expected = name + " " + age + " " + isQueen + " " + pollenCount;
        String actual = bee.toString();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest01(){
        // Given
        String name = "Tyron";
        Integer age = 2;
        Boolean isQueen = false;
        Integer pollenCount = 0;
        Bee bee = new Bee(name,age,isQueen);

        // When
        String expected = "Tyron";
        String actual = bee.getName();

        // Then

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest01(){
        // Given
        String name = "Tyron";
        Integer age = 2;
        Boolean isQueen = false;
        Integer pollenCount = 0;
        Bee bee = new Bee(name,age,isQueen);

        Integer expected = 2;
        Integer actual = bee.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIsQueenTest(){
        // Given
        String name = "Beyonce";
        Integer age = 2;
        Boolean isQueen = true;
        Integer pollenCount = 0;
        Bee bee = new Bee(name,age,isQueen);

        Boolean actual = bee.getIsQueen();

        Assertions.assertTrue(actual);

    }

    @Test
    public void getPollenCountTest01(){
        // Given
        String name = "Tyron";
        Integer age = 2;
        Boolean isQueen = false;
        Integer pollenCount = 0;
        Bee bee = new Bee(name,age,isQueen);

        Integer expected =0;
        Integer actual = bee.getPollenCount();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void collectPollenTest01(){
        String name = "Tyron";
        Integer age = 2;
        Boolean isQueen = false;
        Bee bee = new Bee(name,age,isQueen);

        Integer expected = 10;
        bee.collectPollen();
        Integer actual = bee.getPollenCount();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void collectPollenTest02(){
        String name = "Beyonce";
        Integer age = 2;
        Boolean isQueen = true;
        Bee bee = new Bee(name,age,isQueen);

        Integer expected =  0;
        bee.collectPollen();
        Integer actual = bee.getPollenCount();

        Assertions.assertEquals(expected, actual);
    }
}
