import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



// static method, usually the class name is differnet


public class accountmanager {

    private int id;
    private String namepfx;
    private String role;
    private String salary;
    private String bldgnum;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNamePrefix() {
        return namepfx;
    }
    public void setNamePrefix(String pfx) {
        this.namepfx = pfx;
    }
    public String getFirst() {
        return role;
    }
    public void setFirst(String role) {
        this.role = role;
    }
    public String getLast() {
        return salary;
    }
    public void setLast(String salary) {
        this.salary = salary;
    }

    public String getBldgNum() {
        return bldgnum;
    }
    public void setBldgNum(String num) {
        this.bldgnum = num;
    }

    @Override
    public String toString(){
        return "\nAccount Number="+getId()+":: Name:"+getNamePrefix() +getFirst()+" "+getLast()+":: Adr:" + getBldgNum();
    }
}





