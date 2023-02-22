package Interface;

public class Elephant implements Animal {
    @Override
    public void eat() {
        System.out.println("is eating");

    }

    @Override
    public void walk() {
        System.out.println("is walking");

    }

    @Override
    public void drink() {
        System.out.println("is drinking");

    }

    @Override
    public void sleep() {
        System.out.println("is sleeping");

    }
}
