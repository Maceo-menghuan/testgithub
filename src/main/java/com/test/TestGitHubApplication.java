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

    @Override
    public String toString() {
        return "testgithubapplication{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
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
        String print = test.toString();
        System.out.println(print);
        System.out.println("name=" + test.name +"\t" + "age=" + test.age + "\t" + "sex=" + test.sex);
    }
}
