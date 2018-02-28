import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Auth {
    private JPasswordField passwordField1;
    public JPanel panel1;
    private JLabel Instructions;
    private JButton OKButton;

    public Auth() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] entry = passwordField1.getPassword();
                if (passwordsystem.login(entry)) {

                    JFrame frame = new JFrame("Banking System | Main UI");
                    frame.setContentPane(new MainGUI().panel1);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                    ImageIcon pic = new ImageIcon("/Users/connorgenyk/IdeaProjects/Bank-Final/.idea/AppResources/bank-building.png");
                    panel1.add(new JLabel(pic));



                  //  System.out.println(moneymanager.DEPOSITCHQ());
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, " Error \n Wrong Password... \n Try password" ,"Login Error" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}