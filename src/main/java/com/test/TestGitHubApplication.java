package com.test;

/**
 *@version: 1.0
 *@author: y
 *@date: 2020/08/05 15:07
 */

public class TestGitHubApplication {
    private String name;
    private Integer age;
    private String sex;
    private String birth;
    private String high;

    @Override
    public String toString() {
        return "TestGitHubApplication{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", high='" + high + '\'' +
                '}';
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        TestGitHubApplication test = new TestGitHubApplication();
        test.setName("zhangsan");
        test.setAge(14);
        test.setSex("man");
        test.setBirth("1999/08/15");
        test.setHigh("185cm");
        String print = test.toString();
        System.out.println(print);
        System.out.println("name=" + test.name);
        System.out.println("age=" + test.age);
        System.out.println("sex=" + test.sex);
        System.out.println("birt=" + test.birth);
        System.out.println("high=" + test.high);
    }

}
