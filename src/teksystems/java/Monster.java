package teksystems.java;

// Instructions:
// https://drive.google.com/file/d/1Xnl0R38R8qeAYvZXix6Hv2vjm3ijdC28/view

public class Monster {
    //superclass
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String attack() {
        return "!^_&amp;^$@+%$* I don't know how to attack";
    }

    //need an attack method for each monster type?
    //types: water, fire, stone

    //define a method for a monster "without a type"
    //this method can be inherited and further specified in subclasses
}
