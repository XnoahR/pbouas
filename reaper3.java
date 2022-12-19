import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reaper3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reaper3 extends enemy
{
    reaper3(){
    super();
        SizeSet();
    }
    
    reaper3(int attack,int health,double movespeed){
        super(attack,health,movespeed);
    }
    
    public boolean isStopped = false;
    
    void SizeSet(){
        GreenfootImage image = getImage();
        image.scale(120,120); 
        getImage().mirrorHorizontally();
    }
    public void act()
    {
        if(getX()>=400)
        setLocation(getX() + (int)movespeed, getY());
        else if(getX()<400){
            setLocation(getX() + 0, getY());
            isStopped = true;
    }
    
}
}
