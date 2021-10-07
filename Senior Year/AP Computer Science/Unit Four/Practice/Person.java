/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class describes a person
 **/

import java.util.*;

public class Person

{

    private int age;
    private String name;

    public Person() {

        this.age = 0;
        this.name = "";

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {

        return this.name;

    }

    public int getAge() {

        return this.age;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String eat(String food) {

        return "Eating " + food;

    }

    public String sleep(int time) {

        return "Sleeping for " + time + " hour(s)";

    }

    public void birthday() {

        this.age += 1;

    }

    public String toString() {

        return name + " is " + age + " years old";

    }

    public boolean equals(Person someone) {

        if (this.name.equals(someone.getName()) && this.age == someone.getAge()) {

            return true;

        }

        return false;

    }

}
