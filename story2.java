import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class story2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class story2 extends World
{

    /**
     * Constructor for objects of class story2.
     * 
     */
    public story2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("D:/Kuliah/Semester_3/PBO/UAS/PBOUAS/images/Story/story2.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new next2(),650,30);
        addObject(new previous2(),50,30);
        addObject(new Return(),350,30);
    }
}
