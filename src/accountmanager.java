import java.util.Arrays;

public class accountmanager {

    public static String getname() {
        String HRX = "Mr";
        String firstname = "Noah";
      String lastname  = "Freeman";
      String MI = "A";
      String Suffix = "Jr";
      String LegalName = ("Account Holder: " + "\n Honorific : " + HRX + "\n Last Name: " + lastname + "\n First Name: " + firstname +"\n Suffix: "+ Suffix + "\n MI: " + MI);
      return LegalName;
    }



    public static String getadr() {
        String NUM = "198";
        String STR = "Main ST";
        String PROV  = "MB";
        String POST = "R3C 1A3";
        String COUNT = "CAN";
        String Address = ("Address: " + "\n Building Number: " + NUM + "\n Street: " + STR + "\n Provence: " + PROV +"\n Postal Code: "+ POST + "\n Country: " + COUNT);
        return Address;
    }

    public static String getcontact() {
        String EM1 = "n.freman@anycorp.com";
        String EM2 = "noahfreman@gmail.com";
        String PH1 = "(1)204-154-7589";
        String PH2 = "(1)204-324-3459";
        String PC = "EM1";
        String contact = ("Contact Method : " + "\n Email 1: " + EM1 + "\n Email 2: " + EM2 + "\n Phone 1: " + PH1 + "\n Phone 2: " + PH2 + "\n Pref Contact: " + PC);
        return contact;

    }



        public static String nad(){
            String Warnings = "!!! - (1) 27/02/17 - Lost Card Found.";
            String Advisories = "*** - (1) 27/02/17 - [Deal Ending] Student Advantage Plus is ending this month.";
            String Notes  = "(1) 27/02/17 - Left gloves in lobby, placed behind desk for pick up.";
            String note = ("Notes and Information : " + "\n Warnings: " + Warnings + "\n Advisories: " + Advisories + "\n Notes: " + Notes);
            return note;


        }



    public static boolean ACN(char[] input) {
        boolean found = true;
        char[] ACN = {'1', '2', '3', '4',};

        if (input.length != ACN.length) {
            found = false;
        } else {
            found = Arrays.equals(input, ACN);
        }
        return found;
    }


}


