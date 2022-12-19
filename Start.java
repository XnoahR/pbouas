import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Start(){
        getImage().scale(200,60);
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
            Greenfoot.delay(3);
            Greenfoot.setWorld(new map1());
        }
    }
}
