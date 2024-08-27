package org.designpattern.PrototypeAndRegistry;

public class Client {

    private static void fillRegistry(StudentRegistry registry){
        Student apr24Batch = new Student();
        apr24Batch.setBatch("Apr 24 Intermediate");
        apr24Batch.setBatchAvgPsp(75.0);

        registry.register("apr24Batch",apr24Batch);

        IntelligentStudent apr24IntelligentStudent = new IntelligentStudent();
        apr24IntelligentStudent.setBatch("Apr 24 Intermediate");
        apr24IntelligentStudent.setBatchAvgPsp(95.0);
        apr24IntelligentStudent.setIq(150);

        registry.register("apr24IntelligentStudent",apr24IntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        //xyz belongs to apr24 batch

        Student xyz= registry.get("apr24Batch").clone();
        xyz.setName("XYZ");
        xyz.setAge(21);
        xyz.setPsp(90.0);

        Student abc= registry.get("apr24IntelligentStudent").clone();
        abc.setName("ABC");
        abc.setAge(22);
        abc.setPsp(99.0);

        System.out.println(xyz);
        System.out.println(abc);
    }
}
