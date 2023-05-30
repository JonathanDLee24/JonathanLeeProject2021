/*

Java code for thread creation by implementing an adapted chapter 29 
Author: Jonathan Lee
Professor: Gita Faroughi
Class: CSCI12
Date: March 7 2021
Page 974 Ref.

LOW LEVEL UNDERSTANDING CONCURRERNT START AND USE OF ALL THREADS 
Memory reference testing issues with seperated task class clunky no methods.
this is slughish.

*/

import java.util.*;
import java.util.concurrent.CyclicBarrier;
public class TaskthreadingDemoConsecutivelyRunThreads
{
   public static void main (String args[]) throws Exception
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Please choose a number above 2,147,483,648: ");
      long numbercall = console.nextLong();
      CyclicBarrier gate = new CyclicBarrier(10);
      long j = numbercall/4; // this sets up the number into 4ths
      long s = (numbercall-j*3)/8; // this takes the uper 25% of the main number and breaks it into 3rds
      
      Thread thread1 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception e)
               {
               }
               for (long i = 1L; i<=j*3; i++) 
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
   
      Thread thread2 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception i)
               {
               }
               for (long i = j*3; i<=j*3+s; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception o)
                  {
                  }
               }
            }
         };
   
      
      Thread thread3 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception i)
               {
               }
               for (long i = j*3+s; i<=j*3+s*2; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
   
      Thread thread4 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception o)
               {
               }
               for (long i = j*3+(s*2); i<=j*3+s*3; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
         
      Thread thread5 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception o)
               {
               }
               for (long i = j*3+(s*3); i<=j*3+s*4; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
         
      Thread thread6 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception o)
               {
               }
               for (long i = j*3+(s*4); i<=j*3+s*5; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
            
      Thread thread7 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception o)
               {
               }
               for (long i = j*3+(s*5); i<=j*3+s*6; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
            
      Thread thread8 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception o)
               {
               }
               for (long i = j*3+(s*6); i<=j*3+s*7; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
            
      Thread thread9 = 
         new Thread()
         {
            public void run()
            {
               try
               {
                  gate.await();
               }
               catch(Exception o)
               {
               }
               for (long i = j*3+(s*7); i<=numbercall; i++)
               {
                  try
                  {
                     long counter = 0L;
                     for (long s = 1L; s<i; s++)      
                     {
                        if (i % s == 0)
                        {
                           counter = counter + s;
                        }
                     } 
                     if (counter == i) // if perfect number found output it
                     {
                        System.out.print(counter+" ");
                     }
                  }
                  catch (Exception e)
                  {
                  }
               }
            }
         };
   
      thread1.start();                                          
      thread2.start();                                                           
      thread3.start();         
      thread4.start();
      thread5.start();
      thread6.start();
      thread7.start();
      thread8.start();
      thread9.start();
      
      System.out.print("The perfect numbers in "+numbercall+" are: "); 
      
      gate.await(); // last gate runs "concurrently" for all threads
   }
}