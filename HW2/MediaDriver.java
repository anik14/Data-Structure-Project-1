/*
File: MediaDriver.java
Author: Mohammad Islam
Date: 09/20/16
HW: 1
Description: Media Driver.
Worked with ZJ Zhang, TJ Cui
*/

import java.util.*;
import java.io.*;


public class MediaDriver 
{
   public static void main(String[] args)
   {
      Scanner inputStream = null;
      PrintWriter outputStream = null;
      
       try
      {
         inputStream =
              new Scanner(new FileInputStream("My.txt"));
        
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Problem opening files.");
         System.exit(0);
      }
   
   
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Any artist you are looking for");
      String type = keyboard.nextLine();
      
      String now = null;
     
   
      while (inputStream.hasNextLine( ))
      {
        
         now = inputStream.nextLine( );
         if(now.equals(type))
         {
            System.out.println(type);
               
            boolean done = false;
               
            
            while(!done)
            {
               now = inputStream.nextLine();
               if(now.equals(""))
                  done = true;
               System.out.println(now);
             
            }
            System.out.println();
         }
         
      }
   
      inputStream.close( );
     
   
   
      try
      {
         inputStream =
              new Scanner(new FileInputStream("My.txt"));
         outputStream = new PrintWriter(
                           new FileOutputStream("My.txt",true));
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Problem opening files.");
         System.exit(0);
      }
   
      String line = null;
     
   
      while (inputStream.hasNextLine( ))
      {
        
         line = inputStream.nextLine( );
         if(line.equals("DVD"))
         {
            System.out.println("DVD");
               
            boolean done = false;
               
            
            while(!done && inputStream.hasNextLine( ))
            {
               line = inputStream.nextLine();
               if(line.equals(""))
                  done = true;
               System.out.println(line);
               outputStream.println(line);
            }
            System.out.println();
         }
         
         else if(line.equals("VHS"))
         {
            System.out.println("VHS");
               
            boolean done = false;
               
            while(!done && inputStream.hasNextLine( ))
            {
               line = inputStream.nextLine();
               if(line.equals(""))
                  done = true;
               System.out.println(line);
               outputStream.println(line);
            }
            System.out.println();
         }
         
         else if(line.equals("Cassette"))
         {
            System.out.println("Cassette");
               
            boolean done = false;
               
            while(!done && inputStream.hasNextLine( ))            
            {
               line = inputStream.nextLine();
               if(line.equals(""))
                  done = true;
               System.out.println(line );
               outputStream.println(line);
            }
            System.out.println();
         }

        else if(line.equals("CD"))
         {
            System.out.println("CD");
               
            boolean done = false;
               
            while(!done && inputStream.hasNextLine( ))
            {
               line = inputStream.nextLine();
               if(line.equals(""))
                  done = true;
               System.out.println(line);
               outputStream.println(line);
            }
            System.out.println();
         }


      
      }
      inputStream.close( );
      outputStream.close( );
   }
}
