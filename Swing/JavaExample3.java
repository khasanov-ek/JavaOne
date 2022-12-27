import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaExample3 extends JFrame implements ActionListener {
    static JTextField jTextField;
    static JLabel jLabel;
    static JButton jButton;

    public static void main(String[] args) {
        JFrame jFrame = new JavaExample3();
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public JavaExample3() {
        jLabel = new JLabel();
        jLabel.setBounds(50, 150, 350, 40);

        jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);

        jButton = new JButton("Submit");
        jButton.setBounds(50, 100, 100, 30);

        jButton.addActionListener(this);

        add(jLabel);
        add(jButton);
        add(jTextField);

        setSize(400, 400);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!jTextField.getText().equals("")) {
            jLabel.setText(jTextField.getText());
        } else {
            jLabel.setText("Please write something in the edit box");
        }
    }
}