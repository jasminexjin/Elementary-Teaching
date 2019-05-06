
/**
 * Write a description of class Quiz3Lvl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Quiz3Lvl
{
    public static void main(String [] args)
    {
      Scanner scan = new Scanner(System.in);
        int point=1;
        int correctAns;
        Level1 lvl1 = new Level1();
        while (point <=5)
        {   
        int count = 0;
         lvl1.setNum();
         correctAns = lvl1.getAnswer();
         System.out.println (lvl1.toString());
         int answer = scan.nextInt();
         
       
         if (correctAns == answer)
        {
            System.out.println ("You earn one point!");
            point++;
        }
        else
        {
            System.out.println ("Another try!");
            answer = scan.nextInt();
            if (correctAns == answer)
            {
                System.out.println ("You earn one point!");
                point++;
            }
            else
            {
              System.out.println ("Incorrect, the answer is " 
               + correctAns);
            }
        }
      }
      point = 0; 
      System.out.println ("Congrats! Now you are on Level 2");
      
       Level2 lvl2 = new Level2();
        while (point <=5)
        {   
        int count = 0;
         lvl2.setNum();
         correctAns = lvl2.getAnswer();
         System.out.println (lvl2.toString());
         int answer = scan.nextInt();
         
       
         if (correctAns == answer)
        {
            System.out.println ("You earn one point!");
            point++;
        }
        else
        {
            System.out.println ("Another try!");
            answer = scan.nextInt();
            if (correctAns == answer)
            {
                System.out.println ("You earn one point!");
                point++;
            }
            else
            {
              System.out.println ("Incorrect, the answer is " 
               + correctAns);
            }
        }
      }
      point = 0; 
      System.out.println ("Congrats! Now you are on Level 3");
      
       Level3 lvl3 = new Level3();
        while (point <=5)
        {   
        int count = 0;
         lvl3.setNum();
         correctAns = lvl3.getAnswer();
         System.out.println (lvl3.toString());
         int answer = scan.nextInt();
         
       
         if (correctAns == answer)
        {
            System.out.println ("You earn one point!");
            point++;
        }
        else
        {
            System.out.println ("Another try!");
            answer = scan.nextInt();
            if (correctAns == answer)
            {
                System.out.println ("You earn one point!");
                point++;
            }
            else
            {
              System.out.println ("Incorrect, the answer is " 
               + correctAns);
            }
        }
      }
      System.out.println ("Congrats! You complete the challenge");
    }
}
