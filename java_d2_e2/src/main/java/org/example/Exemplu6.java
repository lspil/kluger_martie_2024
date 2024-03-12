package org.example;

public class Exemplu6 {

    public static void main(String[] args) {

        Type x = Type.MONGO;

        switch (x) {
            case MONGO -> System.out.println(":)");
            case SQL -> System.out.println(":(");
        }

    }
}

enum Type {

    SQL, MONGO

}
