 

import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 Ned = new Problem3(1,6,North,100000);
        Ned.closeAllWindows();
        Ned.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig6-28.kwld");
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(19);  
        World.setVisible(true);
    }
}