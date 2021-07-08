package com.company;

public class ObjectsDemo {

    public static void main(String[] args) {
        var reg1 = new RegistrationForm();
        reg1.firstName = "John";
        reg1.lastName = "Smith";
        reg1.phone = "1234567890";
        reg1.age = 54;
        reg1.company = "ABC Co.";

        var reg2 = new RegistrationForm();
        reg2.firstName = "Ivan";
        reg2.lastName = "Ivanov";
        reg2.phone = "77777777777";
        reg2.age = 37;
        reg2.company = "XYZ Co.";

        System.out.println(reg1.firstName + " from " + reg1.company);
        System.out.println(reg2.firstName);
    }

}
