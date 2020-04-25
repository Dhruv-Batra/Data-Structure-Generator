import java.util.*;
import java.io.*;


public class Generate
{ 
   //in main method make sure to throws FileNotFoundException
   public static void main(String[] args) throws FileNotFoundException
	{
      generate("Computer Science is very cool"," ","linkedlist","String","data","default","default");
   }
   
   public static void generate(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest) throws FileNotFoundException
   {
      String[] text = str.split(delim);
      //create worksheet and answer key
      int fileNumber2=1;
      boolean answerExists=true;  
      while(answerExists)
      {
         String filename2 = String.format(datType+"QuestionsVersion%03d.txt", fileNumber2);
         fileNumber2++;
         File answers1 = new File("Generated Labs/"+filename2);
         answerExists = answers1.exists();
         
      }      
      PrintWriter question = new PrintWriter("Generated Labs/"+String.format(datType+"QuestionsVersion%03d.txt", fileNumber2-1));

      switch(datType.toLowerCase())
      {
         case "array": genArray(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "arraylist": genArrayList(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         case "linkedlist": genLinkedList(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         //case "stack": output = genStack(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         //case "queue": output = genQueue(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         //case "hashset": output = genHashSet(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
         //case "treeset": output = genTreeSet(str,delim,datType, varType,name,caseFirst,caseRest,question); break;
      }
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
      question.println("import java.util.*;\npublic class arrayLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
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
      int num10=(int)(Math.random() * text.length);

      question.println("\t4. Print the size of the ArrayList");
      question.println("\t5. Switch element "+num1+" and element "+num2);
      question.println("\t6. Replace the value of element "+num3+" with ["+text[num4]+"]");
      question.println("\t7. Print the index of the first occurence of ["+text[num9]+"]");
      question.println("\t8. Print the index of the last occurence of ["+text[num4]+"]");
      question.println("\t9. Remove element "+num6);
      question.println("\t10. Print each element of the ArrayList on a new line\n*/\n");
      question.println("import java.util.*;\npublic class arrayLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
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
      int num10=(int)(Math.random() * text.length);

      question.println("\t5. Print the size of the LinkedList");
      question.println("\t6. Switch element "+num1+" and element "+num2);
      question.println("\t7. Replace the value of element "+num3+" with ["+text[num4]+"]");
      question.println("\t8. Print the index of the first occurence of ["+text[num9]+"]");
      question.println("\t10. Remove element "+num6);
      question.println("\t11. Remove and print the first item in the LinkedList");
      question.println("\t12. Remove and print the last item in the LinkedList");
      question.println("\t13. Print each element of the LinkedList on a new line\n*/\n");
      question.println("import java.util.*;\npublic class arrayLab\n{\n\tpublic static void main(String[] args)\n\t{\n\t\t//Code Here\n\n\t}\n}");
      question.close();
   }
}
