import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("‪C:/Users/User/pbouas/images/MainMenu.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new Title(),350,150);
        addObject(new Start(),350,305);
        addObject(new Story(),350,375);
    }
}
