import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// static method, usually the class name is differnet
public class AccountData {
    class Account {
        public int getId(){


            return id;
        }
        public String getname(){

            return name;
        }

        public String getaddress(){
           return address;
        }
        public String getcontact(){
            return contact;

        }
        public String getaccounts() {
            return account;

        }
        public Double getballancechq() {
            return chqbal;

        }
        public Double getballancesav() {
            return savbal;

        }
    }
    List<Account> accounts = new ArrayList<Account>();

    public static String loadDataFromFile(File file) {

        Scanner scan = new Scanner("src/accountdata.csv");


    }
}

