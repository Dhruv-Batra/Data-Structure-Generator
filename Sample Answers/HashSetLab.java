//HashSet Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class HashSetLab
{
   public static void main(String[] args)
   {
      //Create a String HashSet with the following values: [Computer, Science, is, very, cool]
      Set<String> data = new HashSet<String>();
      data.add("Computer");
      data.add("Science");
      data.add("is");
      data.add("very");
      data.add("cool");
      
      //Print a boolean confirming whether [Science] exists
      System.out.println(data.contains("Science"));
      
      //Print the size of the HashSet
      System.out.println(data.size());
      
      //Print each element of the HashSet on a new line
      Iterator <String> it = data.iterator();
      while(it.hasNext())
         System.out.println(it.next());
         
      //Print a boolean answering whether the HashSet is empty
      System.out.println(data.isEmpty());      
   } 
}