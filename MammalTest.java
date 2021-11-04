package Lab_5;

public class MammalTest {

    Dog dog = new Dog();

    //Up-casting
    Animal animal1 = (Animal) dog;
    //fixme => OR
    Animal animal2 = new Cat();

    /**fixme => upcasting HERE
     * Upcasting is casting a subtype to a supertype, upward to the inheritance tree.
     * we are upcasting the Dog type to the animal type
     */

    //Down-casting
    Animal animal3 = new Cat();
    Cat cat = (Cat) animal3;

    /**fixme => Down-casting HERE
     * Down-casting is casting to a subtype, downward to the inheritance tree.
     * we are down-casting the Cat type to the animal type
     */
}
