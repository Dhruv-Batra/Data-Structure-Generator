import java.util.*;
import java.io.*;


public class Generate
{ 
   //in main method make sure to throws FileNotFoundException
   public static void main(String[] args) throws FileNotFoundException
	{
      generate("I like pizza"," ","Array","String","data");
   }
   
   public static void generate(String str, String delim, String datType, String varType, String name) throws FileNotFoundException
   {
      String[] text = str.split(delim);
      //create worksheet and answer key
      int fileNumber2=1;
      boolean answerExists=true;  
      while(answerExists)
      {
         String filename2 = String.format(datType+"ANSWERSversion%03d.txt", fileNumber2);
         fileNumber2++;
         File answers1 = new File(filename2);
         answerExists = answers1.exists();
         
      }      
      PrintWriter question = new PrintWriter(String.format(datType+"QuestionsVersion%03d.txt", fileNumber2-1));
      PrintWriter answer = new PrintWriter(String.format(datType+"AnswersVersion%03d.txt", fileNumber2-1)); 

      switch(datType.toLowerCase())
      {
         case "array": genArray(name,text, varType,question,answer); break;
         //case "arraylist": output = genArrayList(name,text, varType,question,answer); break;
         //case "linkedlist": output = genLinkedList(name,text, varType,question,answer); break;
         //case "stack": output = genStack(name,text, varType,question,answer); break;
         //case "queue": output = genQueue(name,text, varType,question,answer); break;
         //case "hashset": output = genHashSet(name,text, varType,question,answer); break;
         //case "treeset": output = genTreeSet(name,text, varType,question,answer); break;
      }
   }
   
   private static void genArray(String name, String[] text, String varType, PrintWriter question, PrintWriter answer)
   {
      int num1=-1;
      int num2=-1;
      while(num1==num2)
      {
         num1=(int)(Math.random() * text.length); 
         num2=(int)(Math.random() * text.length);
      }

      question.println("//Array Lab - DATA STRUCTURE GENERATOR\n");
      question.println("/*Objectives:");
      question.println("\t1. Create an array with the following values: "+Arrays.toString(text));
      question.println("\t2. Switch element "+num1+" and element "+num2);
      question.println("\t3. Print the array\n/*\n");
      question.println("import java.util.*;\npublic class arrayLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
      answer.close();
   }
}
