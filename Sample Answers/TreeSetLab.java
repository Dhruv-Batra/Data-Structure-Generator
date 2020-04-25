//TreeSet Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class TreeSetLab
{
   public static void main(String[] args)
   {
      //Create a String TreeSet with the following values: [Computer, Science, is, very, cool]
      Set<String> data = new TreeSet<String>();
      data.add("Computer");
      data.add("Science");
      data.add("is");
      data.add("very");
      data.add("cool");
      
      //Print a boolean confirming whether [Science] exists
      System.out.println(data.contains("Science"));
      
      //Print the size of the TreeSet
      System.out.println(data.size());
      
      //Print each element of the TreeSet on a new line
      Iterator <String> it = data.iterator(); 
      while(it.hasNext())
         System.out.println(it.next());
         
      //Print a boolean answering whether the TreeSet is empty
      System.out.println(data.isEmpty());      
   } 
}