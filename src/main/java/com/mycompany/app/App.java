package com.mycompany.app;
import java.io.*;
import java.util.*;

public class App {
  public static double addition(double a,double b)
  {
    return a+b;
  }
  public static double subtraction(double a,double b)
  {
    return a-b;
  }
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      String s;
      Scanner in = new Scanner(System. in);
      System. out. println("Enter an equation (like 3+4) ");
      s = in. nextLine();
      Scanner reader = new Scanner(System.in);
      String t="";
      int i=0;
      while(i<s.length() && s.charAt(i)!='+' && s.charAt(i)!='/' && s.charAt(i)!='-' && s.charAt(i)!='*' )
      {
        char c=s.charAt(i);
        t+=c;
        i++;
      }
      System. out. println(t);
      num1 = Double.valueOf(t);
      op = s.charAt(i);
      i++;
      t="";
      for (int j = i; j < s.length(); j++)
        t+=s.charAt(j);
      num2 = Double.valueOf(t);
      switch(op) {
         case '+': ans = addition(num1,num2);
            break;
         case '-': ans = subtraction(num1,num2);
            break;
         // case '*': ans = num1 * num2;
         //    break;
         // case '/': ans = num1 / num2;
         //    break;
         default:  System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
