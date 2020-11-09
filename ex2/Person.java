//package ex2;

import java.util.ArrayList;

public class Person {

    private ArrayList<String>  name=new ArrayList<>();
    private ArrayList<Integer> age=new ArrayList<>();
    private ArrayList<Pet> pets=new ArrayList<>();

    Person() {

    }

    public ArrayList getName() {
        return name;
    }

    public void setName(int i, String nm) {
        name.add(i,nm);
    }

    public ArrayList  getAge() {
        return age;
    }

    public void setAge(int i, int ag) {
        age.add(i,ag);
    }

    public ArrayList getPets() {
        return pets;
    }

    public void setPets(int i, Pet Pet) {
        pets.add(i, Pet);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pets=" + pets.toString() +
                '}';
    }
}
