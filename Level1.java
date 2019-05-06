
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level1 extends Test
{
    public Level1()
    {
        super();
    }
    
    @Override
    public void setNum()
    {
        super.setNum();
        while(super.getAnswer(1) >=10)
        {
            super.setNum();
       }
    }
    
    
    public int getAnswer()
    {
        return super.getAnswer(1);
    }

}
