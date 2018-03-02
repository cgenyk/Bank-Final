// File One - accountmanager.java //

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;



// static method, usually the class name is differnet


public class accountmanager {

    // Variables for Calls //
    static List<accountmanager> accList = new ArrayList<accountmanager>();

    // Variables for ID/Name //
    private int id;
    private String namepfx;
    private String first;
    private String last;
    private String mi;
    private String sfx;

    // Variables for Address //
    private String BldgNum;
    private String Street;
    private String City;
    private String Prov;
    private String Postal;

    private String Email;
    private String Phone;
    private String CHQStatus;
    private double CHQBal;
    private String SAVStatus;
    private double SAVBallance;


    public void setId(int id) {
        this.id = id;
    } // Sets User Account Number

    public String getNamePrefix() {
        return namepfx;
    } // Gets User's Honorific (Mr/Mrs/Ms)

    public void setNamePrefix(String pfx) {
        this.namepfx = pfx;
    } // Sets User's Honorific (Mr/Mrs/Ms)

    public String getFirst() {
        return first;
    } // Gets Users First Name

    public void setFirst(String first) {
        this.first = first;
    } // Sets Users First Name

    public String getLast() {
        return last;
    }  // Gets Users Last Name

    public void setLast(String last) {
        this.last = last;
    } // Sets Users Last Name

    public String getMI() {
        return mi;
    } // Gets Users Middle Inital

    public void setMI(String mi) {
        this.mi = mi;
    } // Sets Users Middle Inital

    public String getSFX() {
        return sfx;
    } // Gets Users Suffix (Ie. Jr, Sr)

    public void setSFX(String sfx) {
        this.sfx = sfx;
    } // Sets Users Suffix (Ie. Jr, Sr)

    public int getId() {
        return id;
    }

    // Variables for Contact//
    public String getBldgNum() {
        return BldgNum;
    } // Gets Address Number

    public void setBldgNum(String BldgNum) {
        this.BldgNum = BldgNum;
    } // Sets Address Number

    public String getStreet() {
        return Street;
    } // Gets Address Number

    public void setStreet(String Street) {
        this.Street = Street;
    } // Gets Address Number


    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;

    } // Sets Address Number


    public String getProv() {
        return Prov;
    }

    public void setProv(String prov) {
        this.Prov = prov;

    } // Sets Address Number


    public String getPostal() {
        return Postal;
    }

    public void setPostal(String postal) {
        this.Postal = postal;

    } // Sets Address Number

    public String getEmail(){
        return Email;
    }

    public void setEmail(String email){
        this.Email=email;

    }


    public String getPhone(){
        return Email;
    }

    public void setPhone(String phone){
        this.Phone=phone;
    }


    public void depositSavings(double amount){
        SAVBallance += amount;
    }

    public void withdrawlSavings(double amount){
        SAVBallance -= amount;
    }

    public void depositChecking(double amount){
        CHQBal += amount;
    }

    public void withdrawlChecking(double amount){
        CHQBal -= amount;
    }

    // Variables for Accounts //


    public double getCHQBal() {
        return CHQBal;
    }

    public void setCHQBal(double CHQBal) {
        this.CHQBal = CHQBal;
    }

    public double getSAVBallance(){
        return SAVBallance;
    }

    public void setSAVBallance(double SAVBallance){
        this.SAVBallance=SAVBallance;
    }

    public static void loadCSV() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/accountdata.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner Scanner = null;
        accList = new ArrayList<accountmanager>();

        while (scanner.hasNextLine()) {
            Scanner = new Scanner(scanner.nextLine());
            Scanner.useDelimiter(",");
            accountmanager acc = new accountmanager();

            try {
                acc.setId(Scanner.nextInt());
                acc.setNamePrefix(Scanner.next());
                acc.setFirst(Scanner.next());
                acc.setLast(Scanner.next());
                acc.setMI(Scanner.next());
                acc.setSFX(Scanner.next());
                acc.setBldgNum(Scanner.next());
                acc.setStreet(Scanner.next());
                acc.setCity(Scanner.next());
                acc.setProv(Scanner.next());
                acc.setPostal(Scanner.next());
                acc.setEmail(Scanner.next());
                acc.setPhone(Scanner.next());
                double savings = Scanner.nextDouble();
                acc.depositSavings(savings);
                double checking = Scanner.nextDouble();
                acc.depositChecking(checking);
                acc.setCHQBal(Scanner.nextDouble());
                acc.setSAVBallance(Scanner.nextDouble());

            } catch (NoSuchElementException err) {
                System.out.println("invalid data");
            }

            accList.add(acc);
        }

        scanner.close();

        System.out.println(accList);
    }

    // Prints Output for Verification //
    @Override
    public String toString() {
        return "\n Account Number=" + getId() + "\n Name: " + getNamePrefix() + getFirst() + " " + getMI() + ". " + getLast() + " " + getSFX() + "\n Address: " + getBldgNum() +" "+ getStreet()+","+getCity()+","+getProv()+","+getPostal()+"\n Contact Info: "+ "Email:"+getEmail()+" | Phone:"+getPhone()+"\n Accounts: CHQ|SAV" + getCHQBal()+"|"+ getSAVBallance();
    }


    public static accountmanager accountById(int id) {
        for (int i = 0; i < accList.size(); i++) {
            accountmanager am = accList.get(i);
            if (am.getId() == id) {

                return am;
            }
        }
        return null;
    }
}