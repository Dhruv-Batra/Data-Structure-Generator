//Array Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class ArrayLab
{
   public static void main(String[] args)
   {
      //Create Array with given elements
      String[] data = {"Computer", "Science", "Is", "Very", "Cool"};
      
      //Switch element two and three
      String temp = data[2];
      data[2] = data[3];
      data[3] = temp;
        
      //Print each element of the array on a new line - method 1
      for(int i=0;i<data.length;i++)
      {
         System.out.println(data[i]);
      }
      
      //Print each element of the array on a new line - method 2
      for(String x:data)
      {
         System.out.println(x);
      }
      
      //Print length of array
      System.out.println(data.length);
   }
}