import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class previous5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class previous5 extends previous
{
  previous5(){
        getImage().scale(60,60);
    }
   public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.8),
            (int)Math.round(getImage().getHeight()*0.8));
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new story4());
        }
    }

}
