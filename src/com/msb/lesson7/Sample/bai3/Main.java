package com.msb.lesson7.Sample.bai3;

/**
 * @author kienvt2
 */
public class Main {

    static Pet[] pets = new Pet[100];
    static int soThuCung = 0;

    public static void main(String[] args) {

        Dog dog = new Dog("Puppy", 3, 10, "Trắng");
        Cat cat = new Cat("Kitty", 5, 4, "Vàng");
        Mouse mouse = new Mouse("Cat", 4, 1, "Trắng");
        Rabbit rabbit = new Rabbit("Snow", 5, 2, "Xám");

        addPet(dog);
        addPet(cat);
        addPet(mouse);
        addPet(rabbit);

        for(int i = 0; i<soThuCung; i++) {
            System.out.println((i+1)  + " - " + pets[i]);
        }

    }

    public static void addPet(Pet pet) {
        pets[soThuCung] = pet;
        soThuCung++;
    }

}
