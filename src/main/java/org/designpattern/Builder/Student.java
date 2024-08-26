package org.designpattern.Builder;

public class Student {
    private int age;
    private int psp;
    private String name;
    private String email;
    private String pno;

    public int getAge() {
        return age;
    }

    public int getPsp() {
        return psp;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPno() {
        return pno;
    }

    public Student(Builder bldr){
        if(bldr.age<0 || bldr.age >120){
            throw new IllegalArgumentException("Age should be between 0 and 120");
        }
        this.age=bldr.age;
        this.psp=bldr.psp;
        this.name=bldr.name;
        this.email=bldr.email;
        this.pno=bldr.pno;
    }
}
