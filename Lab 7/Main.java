import java.util.Scanner;


class WrongAge extends Exception {
    WrongAge(String message) {
        super(message);
    }
}


class InputScanner {
    Scanner s = new Scanner(System.in);
}


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


public class Main {
    public static void main(String[] args) {
        try {
            Son obj = new Son();
            obj.displayFather();  
            obj.displaySon();     
        }
        catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

