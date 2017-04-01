/*
File: Person.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Person class with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

public class Person {

       public  static final int male = 0;
       public  static final int female = 1;
        
       private String name;
       private String ssn;
       private int age;
       private int gender;
       private String address;
       private String phoneNumber;
        
        public Person(String initialName, String initialSsn, int initialAge, int initialGender, String initialAddress,
            String initialPhoneNumber)
        {
                name = initialName;
                ssn = initialSsn;
                age = initialAge;
                gender = initialGender;
                address = initialAddress;
                phoneNumber = initialPhoneNumber;
        }
        
        void writeOutput()
        {
                System.out.println("Name:              " + name);
                System.out.println("Social Security: " + ssn);
                System.out.println("Age:               " + age);
                System.out.print("Gender:            ");
                if (gender == male) {
                        System.out.println("Male");
                } else {
                        System.out.println("Female");
                }
                System.out.println("Address:           " + address);
                System.out.println("Phone:             " + phoneNumber);
        }
}