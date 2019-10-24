import java.util.Scanner;
public class Student {
    private String fname, lname, email, address, city, state, classstanding, id, zip;

    public Student(String fname, String lname, String email, String address, String city, String state, String id, String classstanding, String zip) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.id = id;
        this.classstanding = classstanding;
        this.zip = zip;
    }

    public void getInfo() {
        Scanner inputScanner = new Scanner(System.in);
        String inp = inputScanner.nextLine();
        //FNAME
        while (true) {
            System.out.println("Enter student's first name: ");
            inp = inputScanner.nextLine();
            if (inp.matches("^[a-zA-Z]+$")) {
                this.fname = inp;
                break;
            } else {
                System.out.println("Please only use alphabets.");
            }
        }
        //LNAME
        while (true) {
            System.out.println("Enter student's last name: ");
            inp = inputScanner.nextLine();
            if (inp.matches("^[a-zA-Z]+$")) {
                this.lname = inp;
                break;
            } else {
                System.out.println("Please only use alphabets.");
            }
        }
        //ID
        while (true) {
            System.out.println("Enter student's 7 digit PeopleSoft ID: ");
            inp = inputScanner.nextLine();
            if (inp.length() > 7) {
                System.out.println("Please enter a 7 digit ID: ");
            } else {
                inp.matches(("^[0-9]+$"));{
                    this.id = inp;
                    break;
                }
            }
        }
        //CLASSSTANDING
        while (true) {
            System.out.println("Enter student's class standing: ");
            inp = inputScanner.nextLine();
            if (inp.matches(("^(Freshman|Sophomore|Junior|Senior)$"))) {
                this.classstanding = inp;
                break;
            } else {
                System.out.println("Please only use Freshman, Sophomore, Junior, Senior.");
            }
        }
        //EMAIL
        while (true) {
            System.out.println("Enter student's email: ");
            inp = inputScanner.nextLine();
            if (inp.matches("^[a-zA-Z1-9]+@[a-zA-Z1-9]+.(com|edu|org)$")) {
                this.email = inp;
                break;
            } else {
                System.out.println("Please use the correct format:<username>@<domain>.<com|edu|org>");
            }
        }
        //ADDRESS
        while (true) {
            System.out.println("Enter student's address: ");
            inp = inputScanner.nextLine();
            if (inp.matches("^[0-9]+ [a-zA-Z]+$")) {
                this.address = inp;
                break;
            } else {
                System.out.println("Please use the correct format:<home number> <street name>");
            }
        }
        //CITY
        while (true) {
            System.out.println("Enter student's city: ");
            inp = inputScanner.nextLine();
            if (inp.matches("^[a-zA-Z]+$")) {
                this.city = inp;
                break;
            } else {
                System.out.println("Please only use alphabets!");
            }
        }
        //STATE
        while (true) {
            System.out.println("Enter student's state: ");
            inp = inputScanner.nextLine();
            if (inp.matches("^AK|AL|AR|AZ|CA|CO|CT|DC|DE|FL|GA|HI|IA|ID|IL|IN|KS|KY|LA|MA|MD|ME|MI|MN|MO|MS|MT|NC|ND|NE|NH|NJ|NM|NV|NY|OH|OK|OR|PA|RI|SC|SD|TN|TX|UT|VA|VT|WA|WI|WV|WY$")) {
                this.state = inp;
                break;
            } else {
                System.out.println("Please only use state abbreviations. Ex: TX, FL, NY");
            }
        }
        //ZIP
        while (true) {
            System.out.println("Enter student's your 9 digit zipcode: ");
            inp = inputScanner.nextLine();
            if (inp.length() > 9) {
                System.out.println("Please enter a 9 digit zipcode: ");
            } else {
                inp.matches(("^[0-9]+$"));{
                    this.zip = inp;
                    break;
                }
            }
        }
    }
    public void displayInfo() {
        System.out.println("Students Details, Department of ILT");
        System.out.println("First name: " + this.fname);
        System.out.println("Last name: " + this.lname);
        System.out.println("Peoplesoft ID: " + this.id);
        System.out.println("Class standing: " + this.classstanding);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zipcode: " + this.zip);
        System.out.println("\t");
        }
    }



