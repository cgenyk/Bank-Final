import javax.swing.*;
import java.awt.event.*;

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

    public MainGUI() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Test");
                System.out.println("Search Btn");
            }
        });
    }
}
