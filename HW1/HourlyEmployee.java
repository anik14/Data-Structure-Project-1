/*
File: HourlyEmployee.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: HourlyEmployee extending Employee class with parameterized constructors.
Worked with ZJ Zhang, TJ Cui
*/

class HourlyEmployee extends Employee
{
        private double rate;
        
        HourlyEmployee(String initialName, String initialSsn, int initialAge, int initialGender, String initialAddress,
                String initialPhoneNumber, String initialDepartment, String initialTitle, int initialHired, double initialRate)
        {
                // Invoke Employee constructor
                super(initialName, initialSsn, initialAge, initialGender, initialAddress,
                        initialPhoneNumber, initialDepartment, initialTitle, initialHired);
                rate = initialRate;
        }
        public void writeOutput()
        {
                System.out.println("Hourly Employee");
                super.writeOutput();
                System.out.println("Hourly Rate:       " + rate);
        }
}