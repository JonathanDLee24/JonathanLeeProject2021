/*
Problem request Jonathan Lee: Convert M94 into a digtal system with a Java program
Week 9 Dicussion Post Make your own program problem.
Author: Jonathan Lee Pass Peer
Professor: Gita Faroughi
Class: Sierra College CSCI12
Date: Octorber 3 2021
*/
import java.util.Scanner;
public class JonathanLeeM94CipherProgram2021PeerTutor
{
   public static void main (String args[])
   { 
      String B1  = "ABCEIGDJFVUYMHTQKZOLRXSPWN";
      String C2  = "ACDEHFIJKTLMOUVYGZNPQXRWSB";
      String D3  = "ADKOMJUBGEPHSCZINXFYQRTVWL";
      String E4  = "AEDCBIFGJHLKMRUOQVPTNWYXZS";
      String F5  = "AFNQUKDOPITJBRHCYSLWEMZVXG";
      String G6  = "AGPOCIXLURNDYZHWBJSQFKVMET";
      String H7  = "AHXJEZBNIKPVROGSYDULCFMQTW";
      String I8  = "AIHPJOBWKCVFZLQERYNSUMGTDX";
      String J9  = "AJDSKQOIVTZEFHGYUNLPMBXWCR";
      String K10 = "AKELBDFJGHONMTPRQSVZUXYWIC";
      String L11 = "ALTMSXVQPNOHUWDIZYCGKRFBEJ";
      String M12 = "AMNFLHQGCUJTBYPZKXISRDVEWO";
      String N13 = "ANCJILDHBMKGXUZTSWQYVORPFE";
      String O14 = "AODWPKJVIUQHZCTXBLEGNYRSMF";
      String P15 = "APBVHIYKSGUENTCXOWFQDRLJZM";
      String Q16 = "AQJNUBTGIMWZRVLXCSHDEOKFPY";
      String R17 = "ARMYOFTHEUSZJXDPCWGQIBKLNV";
      String S18 = "ASDMCNEQBOZPLGVJRKYTFUIWXH";
      String T19 = "ATOJYLFXNGWHVCMIRBSEKUPDZQ";
      String U20 = "AUTRZXQLYIOVBPESNHJWMDGFCK";
      String V21 = "AVNKHRGOXEYBFSJMUDQCLZWTIP";
      String W22 = "AWVSFDLIEBHKNRJQZGMXPUCOTY";
      String X23 = "AXKWREVDTUFOYHMLSIQNJCPGBZ";
      String Y24 = "AYJPXMVKBQWUGLOSTECHNZFRID";
      String Z25 = "AZDNBUHYFWJLVGRCQMPSOEXTKI";
      
      final String[] wheelarray = {B1, C2, D3, E4, F5, G6, H7, I8, J9, K10, L11, M12, N13, O14, P15, Q16, R17, S18, T19, U20, V21, W22, X23, Y24, Z25};
      
      //System.out.println(wheelarray[2]); // testing for array print per numerical use
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your offset for M94 cipher 1-25 or negative offsets: ");
      while(!kb.hasNextInt())
      {
         kb.next(); // discard input 
         System.out.println("Error! Please only enter a numerical offset cipher discs");
         System.out.print("Enter your offset for M94 cipher: ");
      }
      int offset = kb.nextInt();
      kb.nextLine();//flush buffer
      System.out.print("Enter a message to encrypt with a M94 cipher 25 letter max per input: ");
      String testing = kb.nextLine();
      testing = testing.toUpperCase(); 
      int len = testing.length();
      int i = 0;
      int s = 0;
      while (i<len) // i is less then the length of hello
      {
         String array_in_use = (wheelarray[i]);
         char letter = testing.charAt(i);
         if(letter == ' ')
         {
            System.out.print(" ");
            i++;
            s=0;
            continue;
         }
         while(letter != array_in_use.charAt(s))
         {
            s++;
         }
         s = s + offset;
         if (s<0 && s!=-25)
         {
            s = Math.abs(s);
            System.out.print(array_in_use.charAt(26-s));
            i++;
            s=0;
            continue;
         }
         else if (s>25)
         {
            s = s - 25;
         }
         else if (s == -25)
         {
            s = 26;
         }
         else
         {
            System.out.print(array_in_use.charAt(s));
            i++;
            s=0;
            continue;
         }
         System.out.print(array_in_use.charAt(s-1));
         i++;
         s=0;
      }
   }
}