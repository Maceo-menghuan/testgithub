package com.test.parent;

/**
 * @version: 2.0
 * @author wh_yi
 * @date: 2020/08/05 17:36
 */

public class Father {
    private String name;
    private Integer age;
    private String sex;
    private String birth;
    private String high;
    private String weigth;
    private String child;

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", high='" + high + '\'' +
                ", weigth='" + weigth + '\'' +
                ", child='" + child + '\'' +
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWeigth() {
        return weigth;
    }

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }
}
