package md.tekwillacademy.zooclubservice;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;

public class Cat extends Animal  implements AnimalInterface {

    public Cat(String name){
        super(name);
    }

    public void makeSound(){

        System.out.println(getName() + "  The cat speaking meow, meow ");

    }

    @Override
    public void eat() {
        System.out.println(getName() + "  The Cat is eating fish ");
    }
}
