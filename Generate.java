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
      int fileNumber1=1;
      boolean questionExists=true;
      while(questionExists)
      {
         String filename1 = String.format(datType+"WORKSHEETversion%03d.txt", fileNumber1);
         fileNumber1++;
         File question1 = new File(filename1);
         questionExists = question1.exists();
         //PrintWriter question = new PrintWriter(filename1);
      }
      int fileNumber2=1;
      boolean answerExists=true;
      
      while(answerExists)
      {
         String filename2 = String.format(datType+"ANSWERSversion%03d.txt", fileNumber2);
         fileNumber2++;
         File answers1 = new File(filename2);
         answerExists = answers1.exists();
         //PrintWriter answer = new PrintWriter(filename2);
         
      }
      PrintWriter question = new PrintWriter(String.format(datType+"QUESTIONSversion%03d.txt", fileNumber1-1));
      PrintWriter answer = new PrintWriter(String.format(datType+"ANSWERSversion%03d.txt", fileNumber2-1));
      question.close();
      answer.close();   
      
      switch(datType.toLowerCase())
      {
         case "array": output = genArray(name,text, varType,question,answer); break;
         case "arraylist": output = genArrayList(name,text, varType,question,answer); break;
         case "linkedlist": output = genLinkedList(name,text, varType,question,answer); break;
         case "stack": output = genStack(name,text, varType,question,answer); break;
         case "queue": output = genQueue(name,text, varType,question,answer); break;
         case "hashset": output = genHashSet(name,text, varType,question,answer); break;
         case "treeset": output = genTreeSet(name,text, varType,question,answer); break;
      }
   }
   private convertArray
}
