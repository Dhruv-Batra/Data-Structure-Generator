//LinkedList Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class LinkedListLab
{
   public static void main(String[] args)
   {
      //Create a String LinkedList with the following values: [Computer, Science, is, very, cool]
      LinkedList<String> data = new LinkedList<String>();
      data.add("Computer");
      data.add("Science");
      data.add("is");
      data.add("very");
      data.add("cool");
      
      //Add [Computer] to the end of the LinkedList
      data.addLast("Computer");
      
      //Add [is] to the beginning of the LinkedList
      data.addFirst("is");
      
      //Add [cool] to the LinkedList at index 1
      data.add(1, "cool");
      
      //Print the size of the LinkedList
      System.out.println(data.size());
      
      //Switch element 2 and element 4
      Collections.swap(data,2,4);
      
      //Replace the value of element 3 with [Science]
      data.set(3, "Science");
      
      //Print the index of the first occurence of [very]
      System.out.println(data.indexOf("very"));
      
      //Remove element 4
      data.remove(4);
      
      //Remove and print the first item in the LinkedList
      System.out.println(data.removeFirst());
      
      //Remove and print the last item in the LinkedList
      System.out.println(data.removeLast());
      
      //Print each element of the LinkedList on a new line
      for(String x:data)
         System.out.println(x);
   }
}