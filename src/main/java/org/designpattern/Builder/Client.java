package org.designpattern.Builder;

public class Client {
    public static void main(String[] args) {

//    Student.Builder bldr= Student.getBuilder();
//    bldr.age=10;
//    bldr.psp=55;
//    bldr.name="Builder";
//    bldr.email="bldr@designpattern.com";
//    bldr.pno="999";
//
//    Student st1= bldr.build();

        Student builder = Student.getBuilder()
                .setAge(10)
                .setName("builder")
                .setEmail("builder@g.com")
                .setPno("999999")
                .setPsp(100)
                .build();

        System.out.println(builder);
    }}
