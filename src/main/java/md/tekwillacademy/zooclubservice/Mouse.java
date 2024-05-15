package md.tekwillacademy.zooclubservice;

public class Mouse extends Animal {
    public Mouse (String name){
        super(name);
    }


    @Override
    public void eat() {

        System.out.println(getName() + " Mickey ");

    }
    @Override
    public void makeSound() {
        System.out.println("The mouse is saying kits kits");

    }
    }

