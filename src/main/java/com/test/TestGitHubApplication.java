package com.test;

import com.test.child.Child;
import com.test.study.Cat;
import com.test.study.Dog;

/**
 * @version: 2.0
 * @author wh_yi
 * @date: 2020/08/05 17:36
 */

public class TestGitHubApplication {

    public static void main(String[] args) {
        Child child = new Child();
        child.setName("zhangsan");
        child.setAge(14);
        child.setSex("man");
        child.setBirth("1999/08/15");
        child.setHigh("185cm");
        Cat cat = new Cat();
        cat.setName("小白");
        cat.setAge(5);
        cat.setWeight("3kg");
        Dog dog = new Dog();
        dog.setName("小黑");
        dog.setAge(3);
    }

}
