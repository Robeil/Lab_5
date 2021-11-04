package Lab_5;

public class Dog extends Animal { //this is dog concrete class

    public void bark() { //this method exist only in the dog class
        System.out.println("wow wow.......");
    }

    public void eat() { //this method came from animal class
        System.out.println("This Dog is eating......");
    }
}


