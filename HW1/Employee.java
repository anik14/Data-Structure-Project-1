/*
File: Employee.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Employee class extending Person with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

class Employee extends Person
{
        private String department;
        private String title;
        private int hired;
        
        public Employee(String initialName, String initialSsn, int initialAge, int initialGender, String initialAddress,
           String initialPhoneNumber, String initialDepartment, String initialTitle, int initialHired)
        {
        
             super(initialName, initialSsn, initialAge, initialGender, initialAddress,
                        initialPhoneNumber);
                department = initialDepartment;
                title = initialTitle;
                hired = initialHired;
        }
        public void writeOutput()
        {
                super.writeOutput();
                System.out.println("Department:        " + department);
                System.out.println("Title:             " + title);
                System.out.println("Year Hired:        " + hired);
        }
}