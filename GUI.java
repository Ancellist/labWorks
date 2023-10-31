import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        int i = 0;
        JButton button = new JButton("Миша профи капец");
        JFrame test = new JFrame("Test");
        JLabel label = new JLabel("МИША ИМБИЩЕ БЕЗ БАЛАНСА");
        ImageIcon misha = new ImageIcon("test1.jpg");
        label.setSize(1920,1080);
        button.setSize(500,1000);
        button.setBackground(Color.cyan);
        test.setSize(1920,1080);
        test.setLayout(null);
        test.setVisible(true);
        test.add(button);
        //test.add(label);
        button.setIcon(new ImageIcon("test1.jpg"));
        System.out.println(i);
    }
}
