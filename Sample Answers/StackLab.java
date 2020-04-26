//Stack Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class StackLab
{
   public static void main(String[] args)
   {
      //Create a String Stack with the following values: [Computer, Science, is, very, cool]
      Stack<String> data = new Stack<String>();
      data.push("Computer");
      data.push("Science");
      data.push("is");
      data.push("very");
      data.push("cool");
      
      //Print the item on top of the Stack without removing it
      System.out.println(data.peek());
      
      //Print the distance from the top of the Stack from [very]
      System.out.println(data.search("very"));
      
      //Print each element of the LinkedList on a new line method 1
      while(!data.empty())
         System.out.println(data.pop());
      
      //Print each element of the LinkedList on a new line method 2
      for(String x: data)
         System.out.println(x);
         
      //Print a boolean confirming the Stack is empty.
      System.out.println(data.empty());
   }
}