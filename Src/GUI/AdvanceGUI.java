package GUI;
import javax.swing.*;
import java.awt.*;

public class AdvanceGUI {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Advance GUI");
        
        // Set the size of the frame
        frame.setSize(400, 400);
        
        // Set the layout manager
        frame.setLayout(new FlowLayout());
        
        // Create components
        JLabel label = new JLabel("Hello, User");
        JButton button = new JButton("Click Me!");
        JTextField textField = new JTextField(10);
        
        // Add components to the frame
        frame.add(label);
        frame.add(button);
        frame.add(textField);
        
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
