import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class story3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class story3 extends World
{

    /**
     * Constructor for objects of class story3.
     * 
     */
    public story3()
    {    
        super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("D:/Kuliah/Semester_3/PBO/UAS/PBOUAS/images/Story/story3.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new next3(),650,30);
        addObject(new previous3(),50,30);
        addObject(new Return(),350,30);
    }
}
