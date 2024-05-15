package md.tekwillacademy.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Dog bimDog = new Dog("Bim");
        Cat lucyCat = new Cat("Lucy meow");
        Animal mouseMickey = new Mouse("Mickey Mouse");

        lucyCat.eat();
        lucyCat.makeSound();

        bimDog.eat();
        bimDog.makeSound();

        mouseMickey.eat();
        mouseMickey.getName();

    }


}
