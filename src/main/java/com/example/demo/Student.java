package com.example.demo;

public class Student implements Person, Comparable {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public boolean equals(Person person) {
        if (!(person instanceof Person)) {
            return false;
        }
        Student other = (Student) person;
        return id.equals(other.id);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object object) {
        if (!(object instanceof Student)) {
            throw new IllegalArgumentException();
        }
        Student other = (Student) object;
        return this.age - other.age;
    }
}
