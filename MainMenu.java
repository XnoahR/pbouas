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
        GreenfootImage bg = new GreenfootImage("D:/Kuliah/Semester_3/PBO/UAS/PBOUAS/images/MainMenu.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
    }
}
