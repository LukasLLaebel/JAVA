
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
    JLabel title = new JLabel("Calculator");

    int titleWidth = 300;
    int titleHeight = 50;
    int titleX = (windowWidth - titleWidth) / 2;

    title.setBounds(titleX, 15, titleWidth, titleHeight);
    title.setHorizontalAlignment(SwingConstants.CENTER);
    title.setFont(new Font("SansSerif", Font.PLAIN, 50));

    frame.add(title); // add labels to frame

    JLabel calcText = new JLabel("0");
    calcText.setBounds(15, 100, windowWidth - 30, 50);
    calcText.setFont(new Font("SansSerif", Font.PLAIN, 30));
    frame.add(calcText);

    // buttons
    int buttonWidth = 100;
    int buttonHeight = 50;

    JButton button11 = new JButton("\u2190");
    button11.setBounds(15, 200, buttonWidth, buttonHeight);
    frame.add(button11);

    JButton button12 = new JButton("CE");
    button12.setBounds(15 * 2 + buttonWidth, 200, buttonWidth, buttonHeight);
    frame.add(button12);

    // button functionality
    button11.addActionListener(e -> {
      title.setText("Button clicked!");
    });

    frame.setVisible(true);
  }
}
