import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class golem2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class golem2 extends enemy
{
    /**
     * Act - do whatever the golem2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    golem2(){
        super();
        SizeSet();
    }
    golem2(int attack,int health,double movespeed){
        super(attack,health,movespeed);
    }
    
    void SizeSet(){
        GreenfootImage image = getImage();
        image.scale(120,120); 
        getImage().mirrorHorizontally();
    }
    
    public boolean isStopped;
    public void act()
      {
        if(getX()>=145)
        setLocation(getX() + (int)movespeed, getY());
        else if(getX()<145){
            setLocation(getX() + 0, getY());
            isStopped = true;
    }
    if(isStopped){
        
    }
    }
    
   
}
