import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Auth {
    private JPasswordField passwordField1;
    private JPanel panel1;
    private JLabel Instructions;
    private JButton OKButton;

    public Auth() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (passwordsystem.login(entry)) {
                    JOptionPane.showMessageDialog(null, "Press the button to proceed " ,"Login OK", JOptionPane.INFORMATION_MESSAGE);

                    System.out.println(moneymanager.DEPOSITCHQ());
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Error \n No Record Found." ,"Login OK", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
