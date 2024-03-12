package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu10 {

    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("John", 18),
                new Person("Mary", 16),
                new Person("Luka", 21)
        );

        Map<Boolean, List<Person>> res =
            list.stream()
                    .collect(
                            Collectors.partitioningBy(p -> p.getAge() >= 18)
                    );

        System.out.println(res);
    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
