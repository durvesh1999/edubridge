package mypack;

import java.util.Scanner; 

@FunctionalInterface 
interface Stringspace {
 String addSpace (String s);
}
public class Source1 {
 public static String insertSpace (String s) 
{

Stringspace space = str -> String.join(" ", str.split("{?<=.}"));
 return space.addSpace(s);
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String s = sc.next();
    String formatted = Source1.insertSpace(s);
    System.out.println(formatted);
}
}

