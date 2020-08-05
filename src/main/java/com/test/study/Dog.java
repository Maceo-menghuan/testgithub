package com.test.study;

public class Dog {
    private String name;
    private Integer age;
    private String weight;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getAge() {

        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
