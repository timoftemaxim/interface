package Interface;

public interface Animal {
    default void eat() {
        System.out.println("is eating");
    }
    default void walk() {
        System.out.println("is walking");
    }
    default void drink() {
        System.out.println("is drinking");
    }
    default void sleep() {
        System.out.println("is sleeping");
    }
    Elephant elephant = new Elephant();
    public static void main(String[] args) {
        elephant.walk();
        elephant.drink();
        elephant.eat();
    }
}
