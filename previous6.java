import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class previous6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class previous6 extends previous
{
  previous6(){
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
            Greenfoot.setWorld(new story5());
        }
    }

}
