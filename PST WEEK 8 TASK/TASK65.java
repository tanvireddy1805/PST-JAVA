import java.util.*;

public class TASK65 {

    static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    static class Dog extends Animal {
        @Override
        void walk() {
            System.out.println("I am walking");
        }

        void eat() {
            System.out.println("I am eating");
        }
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.walk();
        dog.eat();
    }
}