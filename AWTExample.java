import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT example");
        Button button = new Button("click");
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
