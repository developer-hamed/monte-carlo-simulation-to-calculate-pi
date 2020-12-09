package MonteCarloSimulation;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class MyPanel extends JPanel{
    public int num;
    
    @Override
    public void paintComponent(Graphics g){
        
        Random rnd = new Random();
        int d = Integer.min(getHeight(), getWidth());
        int x, y, count = 0;
        
        for(int i = 0; i < num; i++){
            x = rnd.nextInt(d);
            y = rnd.nextInt(d);
            if((float)(x*x + y*y)/(d*d) <= 1){
                g.setColor(Color.green);
                g.drawOval(x, y, 0, 0);
                count++;
            }else{
                g.setColor(Color.red);
                g.drawOval(x, y, 0, 0);
            }   
        }

        g.setColor(Color.WHITE);
        g.fillRect(0, getHeight()-25, getWidth(), 25);
        g.setColor(Color.BLACK);
        String str = String.format("Pi:  " + ((double)(count)/(double)num) * 4);
        g.drawString(str, 0, getHeight()-10);
        System.out.println(((double)(count)/(double)num) * 4);
    }
}