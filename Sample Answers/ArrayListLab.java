//ArrayList Lab - DATA STRUCTURE GENERATOR
//Sample Answers

/*Objectives:
	1. Create a String ArrayList with the following values: [Computer, Science, is, very, very, cool]
	2. Add [cool] to the end of the ArrayList
	3. Add [very] to the ArrayList at index 1
	4. Print the size of the ArrayList
	5. Switch element 3 and element 4
	6. Replace the value of element 2 with [Science]
	7. Print the index of the first occurence of [cool]
   Print the index of the last occurence of
	8. Remove element 1
	9. Print each element of the ArrayList on a new line
*/

import java.util.*;

public class ArrayListLab
{
   public static void main(String[] args)
   {
      //Create a String ArrayList with the following values: [Computer, Science, is, very, cool]
      ArrayList<String> data = new ArrayList<String>();
   data.add("Computer");
   data.add("Science");
   data.add("is");
   data.add("very");
   data.add("cool");
   
   //Add [cool] to the end of the ArrayList
   data.add("cool");
   
   //Add [very] to the ArrayList at index 1
   data.add(1,"very");
   
   //Print the size of the ArrayList
   System.out.println(data.size());
   
   //Switch element 3 and element 4
   String temp = data.get(3);
   data.set(3,data.get(4));
   data.set(4,temp);
   
   //Replace the value of element 2 with [Science]
   data.set(2,"Science");
   
   //Print the index of the first occurence of [cool]
   data.indexOf("cool");
   
   //Print the index of the last occurence of [very]
   data.lastIndexOf("very");
   
   //Remove element 1
   data.remove(1);
   
   //Print each element of the ArrayList on a new line method 1
   for(String x: data)
      System.out.println(x);
   
   //Print each element of the ArrayList on a new line method 2
   for(int i=0; i<data.size();i++)
      System.out.println(data.get(i));
   }
}