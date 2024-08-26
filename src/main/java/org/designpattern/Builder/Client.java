package org.designpattern.Builder;

public class Client {
    public static void main(String[] args) {

    Builder bldr= new Builder();
    bldr.age=10;
    bldr.psp=55;
    bldr.name="Builder";
    bldr.email="bldr@designpattern.com";
    bldr.pno="999";

    Student st= new Student(bldr);
}}
