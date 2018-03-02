import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane4;
    private JTabbedPane tabbedPane5;
    private JPasswordField passwordField1;
    private JButton searchButton;
    private JTextField textField1;
    private JButton depositToChqAcctButton;
    private JButton depositToSavingsAcctButton;
    private JTabbedPane tabbedPane3;
    public JPanel panel1;
    private JPanel MAIN;
    private JTextPane textPane1;

    public MainGUI() {

        panel1.setSize(1024, 1024 );

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountnumber = passwordField1.getText();
                int searchnum = Integer.parseInt(accountnumber);
                int n = 0;
                System.out.println(searchnum);
                accountmanager am = accountmanager.accountById(searchnum);
                String entry = am.toString();
                textPane1.setText(entry);

            }
        });
        depositToSavingsAcctButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //accountmanager.accountById(accountmanager.depositSavings);

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