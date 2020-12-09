package MonteCarloSimulation;
import java.awt.Color;
import javax.swing.*;

public class MonteCarloSimulation {
    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame app = new JFrame("Monte Carlo Simulation");
        
        while(true){
            try {
                panel.num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of points:", "", JOptionPane.QUESTION_MESSAGE));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        app.setBackground(Color.BLACK);
        app.add(panel);
        app.setSize(500, 550);
        app.setResizable(false);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }    
}