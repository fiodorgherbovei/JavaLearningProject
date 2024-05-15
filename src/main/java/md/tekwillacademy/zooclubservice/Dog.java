package md.tekwillacademy.zooclubservice;

public class Dog extends Animal {

    public Dog(String dogName){
        super(dogName);
        Dog bimDog = new Dog("Bim");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " The dog is eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is saying Ham Ham ");

    }
}
