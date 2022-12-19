import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class story4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class story4 extends World
{

    /**
     * Constructor for objects of class story4.
     * 
     */
    public story4()
    {    
        super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("D:/Kuliah/Semester_3/PBO/UAS/PBOUAS/images/Story/story4.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg); 
        addObject(new next4(),650,30);
        addObject(new previous4(),50,30);
        addObject(new Return(),350,30);
    }
}
