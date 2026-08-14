
// make sure to have xwayland-satellite
// export _JAVA_AWT_WM_NONREPARENTING=1
// Make permenent set it at the buttom of .bashrc fie
import javax.swing.*; // Using Swing components and containers
import java.awt.*; // Using AWT container and component classes

public class UI {
  public static void main(String[] args) {
    // setup
    int windowWidth = 500;
    int windowHeight = 750;

    JFrame frame = new JFrame("Calculator");
    frame.setSize(windowWidth, windowHeight);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setResizable(false);

    // labels
    JLabel title = new JLabel("Enter first number:");
    int titleWidth = 300;
    int titleHeight = 50;
    title.setBounds(titleWidth / 2, 15, titleWidth, titleHeight);
    frame.add(title); // add labels to frame
    title.setFont(new Font("SansSerif", Font.PLAIN, 20));

    // buttons
    JButton button1 = new JButton("Add");
    button1.setBounds(15, 200, 100, 50);
    frame.add(button1);

    // button functionality
    button1.addActionListener(e -> {
      title.setText("Button clicked!");
    });

    frame.setVisible(true);
  }
}
