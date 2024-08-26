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

    private Student(Builder bldr){
        this.age=bldr.age;
        this.psp=bldr.psp;
        this.name=bldr.name;
        this.email=bldr.email;
        this.pno=bldr.pno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", psp=" + psp +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pno='" + pno + '\'' +
                '}';
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private int age;
        private int psp;
        private String name;
        private String email;
        private String pno;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPno(String pno) {
            this.pno = pno;
            return this;
        }

        public Student build(){
            //Validation are here now
            if(this.age<0 || this.age >120){
                throw new IllegalArgumentException("Age should be between 0 and 120");
            }

            if(this.psp<0 || this.psp >100){
                throw new IllegalArgumentException("PSP should be between 0 and 100");
            }
            return new Student(this);
        }
    }
}
