import java.io.*;
import java.util.*;

/**
 * Клас Lab2SenetaKI34 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Seneta Bohdan
 * @version 1.0
 * @since version 1.0
 *
 */
public class Lab_2_Seneta {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * 
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        char o = 'o';
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyTriangle.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введiть розмiр квадратної матрицi: ");
        nRows = in.nextInt();
        in.nextLine();
        arr = new char[nRows][];

        for (int i = 0; i < nRows / 2; i++) {
            arr[i] = new char[nRows / 2 + 1 + i];
        }
        int k = 0;
        for (int i = nRows / 2; i < nRows; i++) {
            arr[i] = new char[nRows - k];
            k++;
        }

        System.out.print("\nВведiть символ-заповнювач: ");
        filler = in.nextLine();
        in.close();
        exit: if (filler.length() == 0) {
            System.out.print("\nНе введено символ заповнювач");
            break exit;
        } else if (filler.length() > 1) {
            System.out.print("\nЗабагато символiв заповнювачiв");
            break exit;
        } else {

            for (int i = 0; i < nRows / 2; i++) {
                for (int j = 0; j < nRows / 2 + 1 + i; j++) {
                    if (j == nRows / 2) {
                        arr[i][j] = o;
                    } else {
                        arr[i][j] = filler.charAt(0);
                    }
                }
            }

            for (int i = nRows / 2, w = 0; i < nRows; i++, w++) {
                for (int j = 0; j < nRows - w; j++) {
                    if (j == nRows / 2) {
                        arr[i][j] = o;
                    } else {
                        arr[i][j] = filler.charAt(0);
                    }
                }
            }
            for (int i = 0; i < nRows / 2; i++) {
                for (int j = (nRows % 2 == 0 ? nRows / 2 - 2 - i : nRows / 2 - 1 - i); j > -1; j--) {
                    arr[i][j] = ' ';
                }
                System.out.println(arr[i]);
                fout.println(arr[i]);
            }
            for (int i = nRows / 2, b = 0; i < nRows; i++, b++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = ' ';
                }
                System.out.println(arr[i]);
                fout.println(arr[i]);
            }

            fout.flush();
            fout.close();
        }
    }
}
