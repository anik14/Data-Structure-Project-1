/*
File: PersonDriver.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Driver class.
Worked with ZJ Zhang, TJ Cui
*/

public class PersonDriver
{

 public static String majors[] = {"Computer Science","Biology", "Physics", "Chemistry", "Electrical Engineering", "German", "Music",
                "Chemical Engineering", "Animal Husbandry"
                 };
 public static String lastNames[] = {"Patterson", "Butler", "Pratt", "Jackson", "Davidson", "Fleming", "Flintoff",
                "Smith", "Henry"
        };
                

public static String male[] = {"Joseph", "Mathew", "Lawrence", "Carl", "Edward", "David", "Steve", "Andrew", "Frank", "Peter",
                "Howard", "William", "Seth", "Aaron", "John"
        };
       
public static String female[] = {"Emily", "Joanne", "Victoria", "Maria", "Jennifer", "Livia", "Brittney", "Shirly", "Chelsea",
                           "Katy", "Ashley", "Haley"
        };

public static String streets[] = {"43rd st.", "54th st.", "37th st.", "36th st.", "18th st.", "39th st.", "25th st.", "21st st.",
                "40th st.", "11th st."
        };
        

       
public static String titles[] = {"Assitant Professor", "Dean", "Princial", "Counselor", "Cashier", "Janitor", "Cook", 
                     "Instructor", "Professor", "Catering Driver"
        };
               
       public static String randomNumber(String[] args)
        {
                return args[(int) (Math.random() * args.length)];
        }
        public static String randomNumbersDigits(int numbers, int num, int num1)
        {
                int i;
                String result = "";
                for (i = 0; (i < numbers); i++) {
                        char jk = (char) ('0' + ((int) (Math.random() * 10)));
                        if ((i == num) || (i == num1)) {
                                result += "-";
                        }
                        result += jk;
                }
                return result;
        }

        public static void main(String[] args)
        {
                int i;
                Person individuals[] = new Person[30];
                
                
                for (i = 0; (i < 3); i++) 
                
                {
                        int gender = (int) (Math.random() * 2);
                        String name;
                        if (gender == Person.male) {
                                name = randomNumber(male);
                        } else {
                                name = randomNumber(female);
                        }
                        individuals [i] = new Student(name + " " + randomNumber(lastNames), randomNumbersDigits(9, 4, 6),
                        (int) (Math.random() * 50.0) + 16, gender, (int) (Math.random() * 1000) + " " + randomNumber(streets),
                                randomNumbersDigits(10, 4, 7), ((int) (Math.random() * 4 * 100)) / 100.0, randomNumber(majors),
                                1995 + (int) (Math.random() * 6));
                }
                for (i = 3; (i < 6); i++) {
                        int gender = (int) (Math.random() * 2);
                        String name;
                        if (gender == Person.male) {
                                name = randomNumber(male);
                        } else {
                                name = randomNumber(female);
                        }
                        individuals[i] = new HourlyEmployee(name + " " + randomNumber(lastNames), randomNumbersDigits(9, 4, 6),
                         (int) (Math.random() * 50.0) + 16, gender, (int) (Math.random() * 1000) + " " + randomNumber(streets),
                          randomNumbersDigits(10, 4, 7), randomNumber(majors), randomNumber(titles), 1920 + (int) (Math.random() * 84),
                      8.00 + ((int) Math.random() * 50 * 100)/ 100.0);
                }
                for (i = 6; (i < 9); i++) {
                        int gender = (int) (Math.random() * 2);
                        String name;
                        if (gender == Person.male) {
                                name = randomNumber(male);
                        } else {
                                name = randomNumber(female);
                        }
                        individuals[i] = new SalariedEmployee(name + " " + randomNumber(lastNames), randomNumbersDigits(9, 4, 6),
                         (int) (Math.random() * 50.0) + 16, gender, (int) (Math.random() * 1000) + " " + randomNumber(streets),
                          randomNumbersDigits(10, 4,7), randomNumber(majors), randomNumber(titles), 
                          1965 + (int) (Math.random() * 84), 15000 + 1000 * ((int) (Math.random() * 50)));
                } 
                
                for (i = 0; (i < 9); i++) 
                {
                        System.out.println("Person :" + (i + 1));
                        individuals[i].writeOutput();
                        System.out.println();
                }
        }
}