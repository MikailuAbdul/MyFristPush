package com.My_First_Package;

public class MyFirstJavaClass2 {
    public static void main (String [] arg) {

        MyFirstJavaClass1 myFirstJavaClass1 = new MyFirstJavaClass1();
        myFirstJavaClass1.myProgramingInstructor = "Mr. Mallam, Ogbeni Tunji Moronkola";
        myFirstJavaClass1.complexion = "Light";
        myFirstJavaClass1.religion = "Islam";

        String myGreetings = myFirstJavaClass1.greetings();
        System.out.print(myGreetings);

        String hisComplexion = myFirstJavaClass1.getComplexion();
        System.out.print(hisComplexion);

        String hisReligion = myFirstJavaClass1.getReligion();
        System.out.print(hisReligion);

    }
}
