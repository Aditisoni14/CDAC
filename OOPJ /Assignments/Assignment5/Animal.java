
public class Animal {
    private String name;

    public Animal(String name) {
    this.name = name;
    }

    public void eat() {
    System.out.println(name + " is eating.");
    }

    public void sleep() {
    System.out.println(name + " is sleeping.");
    }
}

 class Dog extends Animal {
    public Dog(String name) {
    super(name); 
    }

    public void bark() {
    System.out.println(getName() + " is barking.");
    }

    private String getName() {

    throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
} class Main {
    public static void main(String[] args) {

    Animal animal = new Animal("Generic Animal");
    animal.eat();
    animal.sleep();

    Dog dog = new Dog("Fido");
    dog.eat();
    dog.sleep();
     dog.bark();
    }
}
