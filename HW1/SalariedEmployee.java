/*
File: SalariedEmployee.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: SalariedEmployee extending employee class with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

public class SalariedEmployee extends Employee
{
        private double level;
        
        public SalariedEmployee(String initialName, String initialSsn, int initialAge, int initialGender, String initialAddress,
                String initialPhoneNumber, String initialDepartment, String initialTitle, int initialHired, double initialLevel)
        {
               
                super(initialName, initialSsn, initialAge, initialGender, initialAddress,
                        initialPhoneNumber, initialDepartment, initialTitle, initialHired);
                level = initialLevel;
        }
        public void writeOutput()
        {
                System.out.println("Salaried Employee");
                super.writeOutput();
                System.out.println("Pay Level:         " + level);
        }
}
