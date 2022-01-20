package com.company;

import java.io.*;

public class Dog implements Serializable {
    String name;
    byte age;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1 = new Dog();
        d1.name = "Poppins";
        d1.age = 4;
        FileOutputStream fos = new FileOutputStream("serializedDog.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("serializedDog.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();
        System.out.println(d2.name);
    }
}
