import java.util.*;
import java.io.*;

public class Generate
{  
   public static String generate(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest)
   {
      //create worksheet
      int fileNumber2=1;
      File answers1 = null;
      boolean answerExists=true;  
      while(answerExists)
      {
         String filename2 = String.format(datType+"QuestionsVersion%03d.java", fileNumber2);
         fileNumber2++;
         answers1 = new File(filename2);
         answerExists = answers1.exists();
         
      }      
      PrintWriter question = null;
	try
	{
		question = new PrintWriter(String.format(datType+"QuestionsVersion%03d.java", fileNumber2-1));
	}
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
      switch(datType.toLowerCase())
      {
         case "array": genArray(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "arraylist": genArrayList(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "linkedlist": genLinkedList(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "stack": genStack(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "queue": genQueue(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "hashset": genHashSet(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "treeset": genTreeSet(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
      }
      return answers1.getAbsolutePath();
   }
   
   private static void genArray(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      int num1=-1;
      int num2=-1;
      while(num1==num2)
      {
         num1=(int)(Math.random() * text.length); 
         num2=(int)(Math.random() * text.length);
      }
      
      question.println("//Array Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+" array with the following values: "+Arrays.toString(text));
      question.println("\t2. Switch element "+num1+" and element "+num2);
      question.println("\t3. Print each element of the array on a new line\n");
      question.println("\t4. Print length of array\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html");
      question.println("\nimport java.util.*;\npublic class ArrayLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
   
   private static void genArrayList(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      int num5=(int)(Math.random() * text.length);
      int num7=(int)(Math.random() * text.length);
      int num8=(int)(Math.random() * text.length);
   
      question.println("//Array Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+ " ArrayList with the following values: "+Arrays.toString(text));
      question.println("\t2. Add ["+text[num5]+"] to the end of the ArrayList");
      question.println("\t3. Add ["+text[num7]+"] to the ArrayList at index "+num8);
      
      int num1=-1;
      int num2=-1;
      while(num1==num2)
      {
         num1=(int)(Math.random() * text.length); 
         num2=(int)(Math.random() * text.length);
      }
      int num3=-1;
      int num4=-1;
      while(num3==num4)
      {
         num3=(int)(Math.random() * text.length); 
         num4=(int)(Math.random() * text.length);
      }
      int num6=(int)(Math.random() * text.length);
      int num9=(int)(Math.random() * text.length);

      question.println("\t4. Print the size of the ArrayList");
      question.println("\t5. Switch element "+num1+" and element "+num2);
      question.println("\t6. Replace the value of element "+num3+" with ["+text[num4]+"]");
      question.println("\t7. Print the index of the first occurence of ["+text[num9]+"]");
      question.println("\t8. Print the index of the last occurence of ["+text[num4]+"]");
      question.println("\t9. Remove element "+num6);
      question.println("\t10. Print each element of the ArrayList on a new line\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html");
      question.println("\nimport java.util.*;\npublic class ArrayListLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
   
   private static void genLinkedList(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      int num5=(int)(Math.random() * text.length);
      int num7=(int)(Math.random() * text.length);
      int num8=(int)(Math.random() * text.length);
      int num11=(int)(Math.random() * text.length);
   
      question.println("//LinkedList Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+ " LinkedList with the following values: "+Arrays.toString(text));
      question.println("\t2. Add ["+text[num5]+"] to the end of the LinkedList");
      question.println("\t3. Add ["+text[num11]+"] to the beginning of the LinkedList");
      question.println("\t4. Add ["+text[num7]+"] to the LinkedList at index "+num8);
      
      int num1=-1;
      int num2=-1;
      while(num1==num2)
      {
         num1=(int)(Math.random() * text.length); 
         num2=(int)(Math.random() * text.length);
      }
      int num3=-1;
      int num4=-1;
      while(num3==num4)
      {
         num3=(int)(Math.random() * text.length); 
         num4=(int)(Math.random() * text.length);
      }
      int num6=(int)(Math.random() * text.length);
      int num9=(int)(Math.random() * text.length);

      question.println("\t5. Print the size of the LinkedList");
      question.println("\t6. Switch element "+num1+" and element "+num2);
      question.println("\t7. Replace the value of element "+num3+" with ["+text[num4]+"]");
      question.println("\t8. Print the index of the first occurence of ["+text[num9]+"]");
      question.println("\t9. Remove element "+num6);
      question.println("\t10. Remove and print the first item in the LinkedList");
      question.println("\t11. Remove and print the last item in the LinkedList");
      question.println("\t12. Print each element of the LinkedList on a new line\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html");
      question.println("\nimport java.util.*;\npublic class LinkedListLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
   
   private static void genStack(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      int num1=(int)(Math.random() * text.length);
      
      question.println("//Stack Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+ " Stack with the following values: "+Arrays.toString(text));
      question.println("\t2. Print the item on top of the Stack without removing it");
      question.println("\t3. Print the distance from the top of the Stack from ["+text[num1]+"]");
      question.println("\t4. Print each element of the Stack on a new line");
      question.println("\t5. Print a boolean confirming the Stack is empty.\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html");
      question.println("\nimport java.util.*;\npublic class StackLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
   
   private static void genQueue(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      
      question.println("//Queue Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+ " Queue with the following values: "+Arrays.toString(text));
      question.println("\t2. Print the item on top of the stack without removing it");
      question.println("\t3. Print each element of the Queue on a new line\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html");
      question.println("\nimport java.util.*;\npublic class QueueLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
   
   private static void genHashSet(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      int num1=(int)(Math.random() * text.length);
      
      question.println("//HashSet Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+ " HashSet with the following values: "+Arrays.toString(text));
      question.println("\t2. Print a boolean confirming whether ["+text[num1]+"] exists"); 
      question.println("\t3. Print the size of the HashSet");
      question.println("\t4. Print each element of the HashSet on a new line");
      question.println("\t5. Print a boolean answering whether the HashSet is empty\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html");
      question.println("\nimport java.util.*;\npublic class HashSetLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
   
   private static void genTreeSet(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest, PrintWriter question)
   {
      String[] text = str.split(delim);
      int num1=(int)(Math.random() * text.length);
      
      question.println("//TreeSet Lab Questions - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create a "+varType+ " TreeSet with the following values: "+Arrays.toString(text));
      question.println("\t2. Print a boolean confirming whether ["+text[num1]+"] exists"); 
      question.println("\t3. Print the size of the TreeSet");
      question.println("\t4. Print each element of the TreeSet on a new line");
      question.println("\t5. Print a boolean answering whether the TreeSet is empty\n*/\n");
      question.println("//For help completing the lab refer to:");
      question.println("//https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html");
      question.println("\nimport java.util.*;\npublic class TreeSetLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
}