import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class FioApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner s = new Scanner(System.in);
        CalcWfio obj = new CalcWfio();
        System.out.print("Enter x -> ");
        double y = obj.calculate(s.nextInt());
        System.out.println("Result of example is: " + y);
        try {
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");
            obj.readResBin("BinRes.bin");
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            if (!new File(fName).exists()) {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("non found " + ex.getMessage());
        }
        System.out.println("Result(bin) is: " + y);
        obj.readResTxt("textRes.txt");
        System.out.println("Result(text) is: " + y);
        s.close();
    }
}
