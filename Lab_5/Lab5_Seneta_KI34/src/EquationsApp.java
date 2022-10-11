import KI34.SENETA.LAB5.*;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class EquationsApp {
    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    double result = eq.calculate(in.nextInt());
                    System.out.println("Result: " + result);
                    fout.print(result);
                } finally {
                    fout.flush();
                    fout.close();
                }
            } catch (CalculationException ex) {
                out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}
