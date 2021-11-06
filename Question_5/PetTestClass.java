package CS203Course.Lab_5.Question_5;

import java.util.ArrayList;

public class PetTestClass {

    ArrayList<Pet> pets;

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }


    public static void main(String[] args) {

        Pet cat = new Pet("Bobi",'c');
        Pet dog = new Pet("Mobil",'d');
        Pet cat2 = new Pet("Sasi",'c');



        Pet[] pets = {cat,cat2,dog};

        for(Pet p: pets){
            System.out.println(p.toString());

        }
    }
}
