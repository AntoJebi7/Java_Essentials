package Problems;

import java.lang.*;
import java.io.DataInputStream;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String a[]) {
        int no;
        DataInputStream ds = new DataInputStream(System.in);
        try {
            System.out.println("Enter a positive number :");
            no = Integer.parseInt(ds.readLine());
            if (no < 0) {
                throw new MyException("Number must be positive");
            }
            System.out.println("Number: " + no);
        } catch (MyException e) {
            System.out.println("Caught MyException");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Empty catch block, used for catching any other exception types
        }
    }
}

