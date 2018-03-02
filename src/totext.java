import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class totext {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/accountdata.csv"));
        Scanner dataScanner = null;
        int index = 0;
        List<accountmanager> empList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            dataScanner = new Scanner(scanner.nextLine());
            dataScanner.useDelimiter(",");
            accountmanager emp = new accountmanager();

            try {
                emp.setId(dataScanner.nextInt());
                emp.setNamePrefix(dataScanner.next());
                emp.setFirst(dataScanner.next());
                emp.setLast(dataScanner.next());
                emp.setMI(dataScanner.next());
                emp.setSFX(dataScanner.next());
                emp.setBldgNum(dataScanner.next());
                emp.setStreet(dataScanner.next());
                emp.setCity(dataScanner.next());
                emp.setProv(dataScanner.next());
                emp.setPostal(dataScanner.next());
                emp.setEmail(dataScanner.next());
                emp.setPhone(dataScanner.next());
                emp.setChqBal(dataScanner.next());
                emp.setChqEnabled(dataScanner.next());
                emp.setSavingEnabled(dataScanner.next());
                emp.setSavBal(dataScanner.next());

            } catch(NoSuchElementException err) {
                System.out.println("invalid data");
            }

          /*
            while (dataScanner.hasNext()) {
                String data = dataScanner.next();

                // Sets Data for Name and ID Fields
                if (index == 0)
                    emp.setId(Integer.parseInt(data));
                else if (index == 1)
                    emp.setNamePrefix(data);
                else if (index == 2)
                    emp.setFirst(data);
                else if (index == 3)
                    emp.setLast(data);
                else if (index == 4)
                    emp.setMI(data);
                else if (index == 5)
                    emp.setSFX(data);

                // Sets Address Information
                else if (index == 6)
                     emp.setBldgNum(data);
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            index = 0;
          */

            empList.add(emp);
        }

        scanner.close();

        System.out.println(empList);

    }

}