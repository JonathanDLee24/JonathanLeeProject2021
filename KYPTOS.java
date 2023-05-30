/*
Problem request Jonathan Lee: Convert M94 into a digtal system with a Java program decode kyptos
Week 9 Dicussion Post Make your own program problem.
Author: Jonathan Lee
Professor: Gita Faroughi
Class: Sierra College CSCI12
Date: March 27 2021
*/
import java.util.Scanner;
public class KYPTOS
{
   public static void main (String args[])
   { 
      String B1  = " ABCDEFGHIJKLMNOPQRSTUVWXYZABCD";
      String C2  = "AKRYPTOSABCDEFGHIJLMNQUVWXZKRYP";
      String D3  = "BRYPTOSABCDEFGHIJLMNQUVWXZKRYPT";
      String E4  = "CYPTOSABCDFFGHIJLMNQUVWXZKRYPTO";
      String F5  = "DPTOSABCDEFGHIJLMNQUVWXZKRYPTOS";
      String G6  = "ETOSABCDEFGHIJLMNQUVWXZKRYPTOSA";
      String H7  = "FOSABCDEFGHIJLMNQUVWXZKRYPTOSAB";
      String I8  = "GSABCDEFGHIJLMNQUVWXZKRYPTOSABC";
      String J9 =  "HABCDEFGHIJLMNQUVWXZKRYPTOSABCD";
      String K10 = "IBCDEFGHIJLMNQUVWXZKRTPTOSABCDE";
      String L11 = "JCDEFGHIJLMNQUVWXZKRYPTOSABCDEF";
      String M12 = "KDEFGHIJLMNQUVWXZKRYPTOSABCDEFG";
      String N13 = "LEFGHIJKMNQUVWXZKRYPTOSABCDEFGH";
      String O14 = "MFGHIJLMNQUVWXZKRYPTOSABCDEFGHI";
      String P15 = "NGHIJLMNQUVWXZKRYPTOSABCDEFGHIJL";
      String Q16 = "OHIJLMNQUVWXZKRYPTOSABCDEFGHIJL";
      String R17 = "PIJLMNQUVWXZKRYPTOSABCDEFGHIJLM";
      String S18 = "QJLMNQUVWXZKRYPTOSABCDEFGHIJLMN";
      String T19 = "RLMNQUVWXZKRYPTOSABCDEFGHIJLMNQ";
      String U20 = "SMNQUVWXZKRYPTOSABCDEFGHIJLMNQU";
      String V21 = "TNQUVWXZKRYPTOSABCDEFGHIJLMNQUV";
      String W22 = "UQUVWXZKRYPTOSABCDEFGHIJLMNQUVW";
      String X23 = "VUVWXZKRYPTOSABCDEFGHIJLMNQUVWX";
      String Y24 = "WVWXZKRYPTOSABCDEFGHIJLMNQUVWXZ";
      String Z25 = "XWXZKRYPTOSABCDEFGHIJLMNQUVWXZK";
      String a26 = "YXZKRYPTOSABCDEFGHIJLMNQUVWXZKR";
      String b27 = "ZZKRYPTOSABCDEFGHIJLMNQUVWXZKRY";
      String c28 = " ABCDEFGHIJKLMNOPQRSTUVWXYZABCD";
      
      String[] wheelarray = {B1, C2, D3, E4, F5, G6, H7, I8, J9, K10, L11, M12, N13, O14, P15, Q16, R17, S18, T19, U20, V21, W22, X23, Y24, Z25, a26, b27, c28};
      
      //System.out.println(wheelarray[2]); // testing for array print per numerical use
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your offset for cipher 1-31 or negative offsets: ");
      while(!kb.hasNextInt())
      {
         kb.next(); // discard input 
         System.out.println("Error! Please only enter a numerical offset cipher discs");
         System.out.print("Enter your offset for M94 cipher: ");
      }
      int offset = kb.nextInt();
      kb.nextLine();//flush buffer
      System.out.print("Enter a message to encrypt with a M94 cipher 31 letter max per input: ");
      String testing = kb.nextLine();
      testing = testing.toUpperCase();
      int len = testing.length();
      int i = 0;
      int j = 0;
      int s = 0;
      while(i<len) // i is less then the length of hello
      {
         String array_in_use = (wheelarray[i]);
         char letter = testing.charAt(i);
         j = array_in_use.indexOf(testing.charAt(i));
         s = j + offset;
         if (s>30)
         {
            s = 31-offset;
            if (s<0)
            {
               s = Math.abs(s);
               System.out.print(array_in_use.charAt(s));
            }
            else
               System.out.print(array_in_use.charAt(s));
         }
         else if (s < 0)
         {
            s = offset + 31;
            System.out.print(array_in_use.charAt(s));
         }
         else
            System.out.print(array_in_use.charAt(s));
         i++;
         s=0;
      }
   }
}