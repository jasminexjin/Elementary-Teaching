
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Test
{
    int answer;
    int firstNum;
    int secondNum;
    Random gen;
    
    public Test()
    { 
        gen = new Random();
    }
    
    public void setNum()
    {
        firstNum = gen.nextInt(10);
        secondNum = gen.nextInt(10);
    }
       
    public int getAnswer(int add)
    {
        
        return firstNum + secondNum*add;      
    }
    
    public int getFirstNum()
    {
        return firstNum;
    }
   
    public int getSecondNum()
    {
        return secondNum;
    }
    
    public String toString()
    {
        return firstNum + " + " + secondNum + " = ";
    }
}
