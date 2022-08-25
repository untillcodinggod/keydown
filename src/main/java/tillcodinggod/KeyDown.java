package tillcodinggod;

import javax.swing.*;
import java.awt.*;

public class KeyDown {
    private final JFrame frame;
    private final JPanel panel;
    private final JTextField input;

    private final JLabel message;

    public KeyDown() {
        this.frame = new JFrame();
        this.panel = new JPanel(new FlowLayout());
        this.input = new JTextField(20);
        this.message = new JLabel("");
    }

    public void set() {
        panel.add(message);
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.addKeyListener(new KeyDownKeyListener(this));
    }

    public void updateMessage() {
        message.setText("Yeah!");
    }

    public void run() {
       this.set();
    }
}
