package KI34.Seneta.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Copier2 extends Printer implements Copy {

    private boolean turnOnCopy;
    private boolean isCoppied;

    private PrintWriter fout1;

    public Copier2() throws FileNotFoundException {
        super();
        fout1 = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method releases used recourses
     */
    public void dispose() {
        fout1.close();
    }

    public void set_copy(boolean s_cpy) {
        this.turnOnCopy = s_cpy;
    }

    boolean get_copy() {
        return this.turnOnCopy;
    }

    void set_coppeid(boolean s_c) {
        this.isCoppied = s_c;
    }

    @Override
    public boolean isCopied() {
        return isCoppied;
    }

    @Override
    public void startCopping(boolean s_c) {
        Printning();
        if (get_copy()) {
            System.out.print("Start copping...\n");
            System.out.print("Coppied\n");
            set_coppeid(s_c);
            fout1.print("Start copping...\n");
            fout1.print("Coppied\n");
            fout1.flush();
        }
    }
}
