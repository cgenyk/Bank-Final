import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane4;
    private JTabbedPane tabbedPane5;
    private JTextArea DisplayAcN;
    private JTextArea DisplayName;
    private JTextArea DisplayBalance;
    private JPasswordField passwordField1;
    private JButton searchButton;
    private JTextField textField1;
    private JButton depositToChqAcctButton;
    private JButton depositToSavingsAcctButton;
    private JTabbedPane tabbedPane3;
    public JPanel panel1;
    private JTextArea Adr;
    private JTextArea Contact;
    private JTextArea Notes;
    private JPanel MAIN;

    public MainGUI() {

        panel1.setSize(1024, 1024 );

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountnumber = passwordField1.getText();
                int searchnum = Integer.parseInt(accountnumber);
                char[] input = passwordField1.getPassword();
                int n = 0;
                if (accountnumber.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Successes \n Record Found." ,"Bank System", JOptionPane.INFORMATION_MESSAGE);


                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();

                }


            }
        });
    }

    public void setData(userinterface data) {
        panel1.setSize(1024, 1024 );
    }

    public void getData(userinterface data) {

    }

    public boolean isModified(userinterface data) {
        return false;
    }


}