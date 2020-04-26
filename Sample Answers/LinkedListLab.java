//LinkedList Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class LinkedListLab
{
   public static void main(String[] args)
   {
      //Create a String LinkedList with the following values: [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
      LinkedList<String> days = new LinkedList<String>();
      days.add("Sunday");
      days.add("Monday");
      days.add("Tuesday");
      days.add("Wednesday");
      days.add("Thursday");
      days.add("Friday");
      days.add("Saturday");
      
      //Add [Sunday] to the end of the LinkedList
      days.add("Sunday");
      
      //Add [Tuesday] to the beginning of the LinkedList
      days.add(0,"Tuesday");
      
      //Add [Thursday] to the LinkedList at index 2
      days.add(2, "Thursday");
      
      //Print the size of the LinkedList
      System.out.println(days.size());
      
      //Switch element 2 and element 4
      Collections.swap(days,2,4);
      
      //Replace the value of element 3 with [Friday]
      days.set(3, "Friday");
      
      //Print the index of the first occurence of [Friday]
      System.out.println(days.indexOf("Friday"));
      
      //Remove element 4
      days.remove(4);
      
      //Remove and print the first item in the LinkedList
      System.out.println(days.removeFirst());
      
      //Remove and print the last item in the LinkedList
      System.out.println(days.removeLast());
      
      //Print each element of the LinkedList on a new line
      for(String x:days)
         System.out.println(x);
   }
}