//Stack Lab - DATA STRUCTURE GENERATOR
//Sample Answers

/*Objectives:
	1. Create a String Stack with the following values: [Computer, Science, is, very, cool]
	2. Print the item on top of the stack without removing it
	3. Print the distance from the top of the stack from [very]
	4. Print each element of the LinkedList on a new line
	5. Print a boolean confirming the stack is empty.
*/

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
      
      //Print the item on top of the stack without removing it
      System.out.println(data.peek());
      
      //Print the distance from the top of the stack from [very]
      System.out.println(data.search("very"));
      
      //Print each element of the LinkedList on a new line method 1
      while(!data.empty())
         System.out.println(data.pop());
         
      //Print a boolean confirming the stack is empty.
      System.out.println(data.empty());
   }
}