import java.util.Scanner;

// Custom Exception Class
class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

// InputScanner Class
class InputScanner {
    Scanner s = new Scanner(System.in);
}

// Father Class
class Father extends InputScanner {
    int fatherAge;

    Father() throws WrongAge {
        System.out.print("Enter Father's Age: ");
        fatherAge = s.nextInt();

        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    void displayFather() {
        System.out.println("Father's Age: " + fatherAge);
    }
}

// Son Class
class Son extends Father {
    int sonAge;

    Son() throws WrongAge {
        super();

        System.out.print("Enter Son's Age: ");
        sonAge = s.nextInt();

        if (sonAge > fatherAge) {
            throw new WrongAge("Son's age cannot be greater than father's age");
        } else if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    void displaySon() {
        System.out.println("Son's Age: " + sonAge);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        try {
            Son obj = new Son();
            obj.displayFather();  // Show father’s age
            obj.displaySon();     // Show son’s age
        }
        catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
