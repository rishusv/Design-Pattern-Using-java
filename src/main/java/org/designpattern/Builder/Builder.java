package org.designpattern.Builder;

public class Builder {
    int age;
    int psp;
    String name;
    String email;
    String pno;

    public Student build(){
        //Validation are here now
        if(this.age<0 || this.age >120){
            throw new IllegalArgumentException("Age should be between 0 and 120");
        }

        return new Student(this);
    }

}
