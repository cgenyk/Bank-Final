import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



// static method, usually the class name is differnet


public class accountmanager {

// Variables for Calls //

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

    private String ChqEnabled;
    private String ChqBal;
    private String SavingEnabled;
    private String SavBal;

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
    public void setLast(String last){
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
    } // Sets Address Number

    public String getCity() {
        return City;
    } // Gets Address Number
    public void setCity(String City) {
        this.City = City;
    } // Sets Address Number

    public String  getProv() {
        return Prov;
    } // Gets Address Number
    public void setProv(String Prov) {
        this.Prov = Prov;


    } // Sets Address Number
    public String getPostal(){
        return Postal;
    }
    public void setPostal(String Postal){
        this.Postal = Postal;
    }
    // Variables for Accounts //


    public String getEmail() {
        return Email ;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }

    public String getPhone() {
        return Phone ;
    }
    public void setPhone(String Phone){
        this.Phone=Phone;
    }

    public String getChqEnabled() {
        return ChqEnabled ;
    }
    public void setChqEnabled(String ChqEnabled){
        this.ChqEnabled=ChqEnabled;
    }

    public String getChqBal() {
        return ChqBal ;
    }
    public void setChqBal(String ChqBal){
        this.ChqBal=ChqBal;
    }

    public String getSavingEnabledE() {
        return SavingEnabled ;
    }
    public void setSavingEnabled(String SavingEnabled){
        this.SavingEnabled=SavingEnabled;
    }

    public String getSavBal() {
        return SavBal ;
    }
    public void setSavBal(String savBal){
        this.SavBal=savBal;
    }














    // Prints Output for Verification //













    // Prints Output for Verification //

    public String toString(){
        return "\nAccount Number="+getId()+" " + " " + getNamePrefix() + " " +getFirst()+" " +getMI()+". " +getLast()+ " " + getSFX() +" :ADR: " + getBldgNum()+" " + getStreet() +" " + getCity()+" " + getProv()+" " +getPostal()+" " +getEmail()+" " +getPhone()+" " +getChqEnabled()+" " +getChqBal()+" " +getSavingEnabledE()+" " +getSavBal();
    }
}





