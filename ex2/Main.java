//package ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pet pet = new Pet();
        Person p1 = new Person();
        for (int i = 0; i < 3; i++) {
            System.out.println("Type the name of the " + i + " Person");
            String num = sc.next();
            System.out.println("Type the age of the " + i + " Person");
            int age = sc.nextInt();
            p1.setName(i, num);
            p1.setAge(i, age);
        }
        //System.out.println(p1.toString());
        System.out.println("How many pets you would like to add?");
        int number_of_pets = sc.nextInt();
        for (int j = 0; j < number_of_pets; j++) {
            System.out.println("Type the nickname of the " + j + " pet");
            String nick = sc.next();
            System.out.println("Type the type of the " + j + " pet");
            String tp = sc.next();
            pet.setNickname(nick);
            pet.setType(tp);
            p1.setPets(j,pet);

        }
        System.out.println("The family has the following people and pets "+p1.toString());
    }
}

