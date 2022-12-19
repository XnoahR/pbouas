import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class story5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class story5 extends World
{

    /**
     * Constructor for objects of class story5.
     * 
     */
    public story5()
    {    
       super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("‪C:/Users/User/pbouas/images/Story/story5.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new next5(),650,30);
        addObject(new previous5(),50,30);
        addObject(new Return(),350,30);
    }
}
