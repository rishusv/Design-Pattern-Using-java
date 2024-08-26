package org.designpattern.Builder;

public class Client {
    public static void main(String[] args) {

    Builder bldr= Student.getBuilder();
    bldr.age=10;
    bldr.psp=55;
    bldr.name="Builder";
    bldr.email="bldr@designpattern.com";
    bldr.pno="999";

    Student st1= bldr.build();
    Student st= new Student(bldr);
}}
