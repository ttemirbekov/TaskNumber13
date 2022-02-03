package com.company;

public class Main {

    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.setName("Scarlett");
        shark.setBreed("BlueShark");
        shark.setAge(5);
        shark.setColor("Blue");

        System.out.println("1) Name of fish: " + shark.getName() + "," + " " + "Breed of fish: "
                + shark.getBreed() + "," + " " + "Age of fish: " + shark.getAge() + "," + " " + "Color of fish: "  + shark.getColor());

        System.out.println("______________________________________________________________________________________________");

        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setBreed("German Shepherd");
        dog.setAge(3);
        dog.setColor("Black");

        System.out.println("2) Name of dog: " + dog.getName() + ","+ " " + "Breed of dog : "
                + dog.getBreed() + "," + "  "+ "Age of dog: "  + dog.getAge() + "," + "  " + " Color of dog: " + dog.getColor());

        System.out.println("______________________________________________________________________________________________________");

        Cat cat = new Cat();
        cat.setName("Mimoza");
        cat.setBreed("Bengal");
        cat.setAge(2);
        cat.setColor("White");

        System.out.println("3) Name of cat: " + cat.getName() + "," + " " + "Breed of cat: "  + cat.getBreed()
                + "," + " " + "Age of cat: " + cat.getAge() + "," + " "+ "Color of: "  + cat.getColor());

        System.out.println("_______________________________________________________________________________________________________");

        Parrot parrot = new Parrot();
        parrot.setName("Coco");
        parrot.setBreed("Seneagal");
        parrot.setAge("3 years");
        parrot.setColor("Grey");
        System.out.println("4) Name of Parrot: " + parrot.getName() + ","+ " "+"Breed of Parrot: " + parrot.getBreed()
                + ","+" " + "Age of Parrot: " + parrot.getAge() +"," + " "+ "Color of Parrot: " + parrot.getColor());
            }
}
