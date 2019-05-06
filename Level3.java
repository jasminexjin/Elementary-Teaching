
/**
 * Write a description of class Level3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level3 extends Test
{
    public Level3()
    {
        super();
    }
    
    @Override
    public void setNum()
    {
        super.setNum();
        while (this.getAnswer() <=0)
        {
        super.setNum();
      }
    }
   
    public int getAnswer()
    {
        return super.getAnswer(-1);
    }
    
    @Override 
    public String toString()
    {
        return getFirstNum() + " - " + getSecondNum() + " = ";
    }
}
