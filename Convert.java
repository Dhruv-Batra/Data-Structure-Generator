public class Convert
{  
   public static void main(String[] args) 
	{
      System.out.print(convert("Computer Science is very cool"," ","stack","String","data","default","default"));
   }

   public static String convert(String str, String delim, String datType, String varType, String name, String caseFirst, String caseRest)
   {
      String[] text = str.split(delim);
      String output="";
      
      switch(caseFirst.toLowerCase())
      {
         case "default": break;
         case "uppercase": text=upperFirst(text); break;
         case "lowercase": text=lowerFirst(text); break;
      }
      
      switch(caseRest.toLowerCase())
      {
         case "default": break;
         case "uppercase": text=upperRest(text); break;
         case "lowercase": text=lowerRest(text); break;
         case "random": text=randomRest(text); break;
      }
      
      switch(datType.toLowerCase())
      {
         case "array": output = convertArray(name,text, varType, output); break;
         case "arraylist": output = convertArrayList(name,text, varType, output); break;
         case "linkedlist": output = convertLinkedList(name,text, varType, output); break;
         case "stack": output = convertStack(name,text, varType, output); break;
         case "queue": output = convertQueue(name,text, varType, output); break;
         case "hashset": output = convertHashSet(name,text, varType, output); break;
         case "treeset": output = convertTreeSet(name,text, varType, output); break;
      }
      return output;
   }
   
   private static String convertArray(String name,String[] text, String varType, String output)
   {
      //String[] stringArray = {"I", "like", "pizza"};
      output = varType+"[] "+name+" = {";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //Integer[] data = {1, 2, 3, 4};
            output+=text[i]+", ";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //String[] data = {"I", "like", "pizza"};
            output+="\""+text[i]+"\", ";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //Character[] data = {'c', 'o', 'o', 'l'};
            output+="'"+text[i].charAt(0)+"', ";
         }
      }
      output=output.substring(0, output.length()-2);
      output+="};";
      return output;        
   }
   
   private static String convertArrayList(String name,String[] text, String varType, String output)
   {
      //ArrayList<String> data = new ArrayList<String>();
      output="ArrayList<"+varType+">"+" "+name+" = new ArrayList<"+varType+">();\n";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //data.add(1);
            output+=name+".add("+text[i]+");\n";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //data.add("I");
            output+=name+".add(\""+text[i]+"\");\n";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //data.add('c');
            output+=name+".add('"+text[i]+"');\n";
         }
      }  
      return output;
   }
   
   private static String convertLinkedList(String name,String[] text, String varType, String output)
   {
      //LinkedList<String> data = new LinkedList<String>();
      output="LinkedList<"+varType+"> "+name+" = new LinkedList<"+varType+">();\n";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //data.add(1);
            output+=name+".add("+text[i]+");\n";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //data.add("I");
            output+=name+".add(\""+text[i]+"\");\n";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //data.add('c');
            output+=name+".add('"+text[i]+"');\n";
         }
      } 
      return output;
   }
   
    private static String convertStack(String name,String[] text, String varType, String output)
    {
      //Stack<Integer> data = new Stack<Integer>();
      output="Stack<"+varType+"> "+name+" = new Stack<"+varType+">();\n";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //data.push(1);
            output+=name+".push("+text[i]+");\n";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //data.push("I");
            output+=name+".push(\""+text[i]+"\");\n";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //data.push('c');
            output+=name+".push('"+text[i]+"');\n";
         }
      }
      return output;
    }
    
   private static String convertQueue(String name,String[] text, String varType, String output)
   {
      //Queue<Integer> data = new LinkedList<Integer>();
      output="Queue<"+varType+"> "+name+" = new LinkedList<"+varType+">();\n";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //data.add(1);
            output+=name+".add("+text[i]+");\n";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //data.add("I");
            output+=name+".add(\""+text[i]+"\");\n";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //data.add('c');
            output+=name+".add('"+text[i]+"');\n";
         }
      } 
      return output;
   }
   
   private static String convertHashSet(String name,String[] text, String varType, String output)
   {  
      //Set<Integer> data = new HashSet<Integer>();
      output="Set<"+varType+"> "+name+" = new HashSet<"+varType+">();\n";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //data.add(1);
            output+=name+".add("+text[i]+");\n";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //data.add("I");
            output+=name+".add(\""+text[i]+"\");\n";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //data.add('c');
            output+=name+".add('"+text[i]+"');\n";
         }
      } 
      return output;
   }
   
   private static String convertTreeSet(String name,String[] text, String varType, String output)
   {  
      //Set<Integer> data = new TreeSet<Integer>();
      output="Set<"+varType+"> "+name+" = new TreeSet<"+varType+">();\n";
      for (int i=0; i<text.length; i++)
      {
         //add text
         if(varType.equalsIgnoreCase("Double")||varType.equalsIgnoreCase("Integer"))
         {
            //data.add(1);
            output+=name+".add("+text[i]+");\n";
         }
         if(varType.equalsIgnoreCase("String"))
         {
            //data.add("I");
            output+=name+".add(\""+text[i]+"\");\n";
         }
         if(varType.equalsIgnoreCase("Character"))
         {
            //data.add('c');
            output+=name+".add('"+text[i]+"');\n";
         }
      } 
      return output;
   }
   
   private static String[] upperFirst (String[] text)
   {
      for(int i=0; i<text.length; i++)
      {
         text[i]=Character.toUpperCase(text[i].charAt(0))+ text[i].substring(1);
      }
      return text;
   }
   
   private static String[] lowerFirst (String[] text)
   {
      for(int i=0; i<text.length; i++)
      {
         text[i]=Character.toLowerCase(text[i].charAt(0))+ text[i].substring(1);
      }
      return text;
   }
   
   private static String[] upperRest (String[] text)
   {
      for(int i=0; i<text.length; i++)
      {
         text[i]=text[i].charAt(0)+text[i].substring(1).toUpperCase();
      }
      return text;
   }
   private static String[] lowerRest (String[] text)
   {
      for(int i=0; i<text.length; i++)
      {
         text[i]=text[i].charAt(0)+text[i].substring(1).toLowerCase();
      }
      return text;
   }
   private static String[] randomRest (String[] text)
   {
	   for(int i=0; i<text.length; i++)
	   {
		   String s = "";
		   for(int j = 1; j < text[i].length(); j++)
		   {
			   int n = (int)(Math.random() * 2);
			   switch(n)
			   {
			   case 0: s += text[i].substring(j, j + 1).toUpperCase(); break;
			   case 1: s += text[i].substring(j, j + 1).toLowerCase(); break;
			   }
		   }
		   text[i] = text[i].charAt(0) + s;
	   }
	   return text;
   }
}