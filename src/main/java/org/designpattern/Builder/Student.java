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
        this.age=bldr.age;
        this.psp=bldr.psp;
        this.name=bldr.name;
        this.email=bldr.email;
        this.pno=bldr.pno;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
