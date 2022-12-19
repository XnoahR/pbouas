import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class story6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class story6 extends World
{

    /**
     * Constructor for objects of class story6.
     * 
     */
    public story6()
    {    
       super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("D:/Kuliah/Semester_3/PBO/UAS/PBOUAS/images/Story/story6.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject(new previous6(),50,30);
        addObject(new Return(),350,30);
    }
}
