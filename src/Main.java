import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Main {


    private JPanel Main_Panel;
    private JButton storeButton;
    private JButton serviceButton;
    private JButton salaryButton;
    private JButton billingButton;
    private JButton reportsButton;

    public static void main(String [] args){
        JFrame Frame = new JFrame("App");
        Frame.setSize (500,400);
        Frame.setContentPane (new Main().Main_Panel);
        Frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Frame.setVisible (true);
    }
}
