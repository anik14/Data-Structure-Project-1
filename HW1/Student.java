/*
File: Student.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Student class extending person with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

class Student extends Person
{
        private double gpa;
        private String major;
        private int year;
        
        public Student(String initialName, String initialSsn, int initialAge, int initialGender, String initialAddress, 
        String initialPhoneNumber, double initialGpa, String initialMajor, int initialYear)
        {
                super(initialName, initialSsn, initialAge, initialGender, initialAddress,
                        initialPhoneNumber);
                gpa = initialGpa;
                major = initialMajor;
                year = initialYear;
        }
        void writeOutput()
        {
                System.out.println("Student");
                super.writeOutput();
                System.out.println("GPA:               " + gpa);
                System.out.println("Major:             " + major);
                System.out.println("Year of Grad.:     " + year);
        }
}