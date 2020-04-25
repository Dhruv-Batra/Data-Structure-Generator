//Queue Lab - DATA STRUCTURE GENERATOR
//Sample Answers

import java.util.*;

public class QueueLab
{
   public static void main(String[] args)
   {
      //Create a String Queue with the following values: [Computer, Science, is, very, cool]
      Set<String> data = new HashSet<String>();
      data.add("Computer");
      data.add("Science");
      data.add("is");
      data.add("very");
      data.add("cool");
      
      //Print the item on top of the Queue without removing it
      System.out.println(data.peek());
      
      //Print each element of the Queue on a new line
      for(String x: data)
         System.out.println(x);
   }
}