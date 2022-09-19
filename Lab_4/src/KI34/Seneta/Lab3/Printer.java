/**
 * lab 3 package
 */
package KI34.Seneta.Lab3;

import java.io.*;

/**
 * Class <code>Printer</code> implements computer mouse
 * 
 * @author Seneta Bohdan
 * @version 1.0
 */
abstract class Printer {
    private PrinterButton PrinterButton;
    private PrinterTablet PrinterTablet;
    private PrinterPort PrinterPort;
    private PrinterMatrix PrinterMatrix;
    private PrintWriter fout;

    /**
     * Constructor
     * 
     * @throws FileNotFoundException
     */
    public Printer() throws FileNotFoundException {
        PrinterButton = new PrinterButton();
        PrinterTablet = new PrinterTablet();
        PrinterPort = new PrinterPort();
        PrinterMatrix = new PrinterMatrix();
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     * 
     * @throws FileNotFoundException
     */

    public Printer(boolean colored) throws FileNotFoundException {
        PrinterButton = new PrinterButton(colored);
        PrinterTablet = new PrinterTablet();
        PrinterPort = new PrinterPort();
        PrinterMatrix = new PrinterMatrix();
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method releases used recourses
     */
    public void dispose() {
        fout.close();
    }

    /**
     * Method implements turning on Printer
     */
    public void turnOnPrinter() {
        if (PrinterPort.get_powerCordConnector()) {
            PrinterButton.set_Power(true);
            if (PrinterButton.get_Power()) {
                System.out.print("The Printer is on\n");
                fout.print("The Printer is on\n");
                fout.flush();
            } else {
                System.out.print("The Printer isn't on\n");
                fout.print("The Printer isn't on\n");
                fout.flush();
            }
        }
    }

    /**
     * Method implements turning off Printer
     */
    public void turnOffPrinter() {
        if (!PrinterPort.get_powerCordConnector()) {
            PrinterButton.set_Power(false);
            if (!PrinterButton.get_Power()) {
                System.out.print("The Printer isn't on\n");
                fout.print("The Printer isn't on\n");
                fout.flush();
            } else {
                System.out.print("The Printer is on\n");
                fout.print("The Printer is on\n");
                fout.flush();
            }
        }
    }

    /**
     * Method implements turn on colored Printning
     */
    public void turnOnColoredPrint() {
        PrinterButton.set_Colored(true);
        if (PrinterButton.get_Colored()) {
            System.out.print("The colored Print is on\n");
            fout.print("The colored Print is on\n");
            fout.flush();
        } else {
            System.out.print("The colored Print isn't on\n");
            fout.print("The colored Print isn't on\n");
            fout.flush();
        }
    }

    /**
     * Method implements turn off colored Printning
     */
    public void turnOffColoredPrint() {
        PrinterButton.set_Colored(false);
        if (PrinterButton.get_Colored()) {
            System.out.print("The colored Print is on\n");
            fout.print("The colored Print is on\n");
            fout.flush();
        } else {
            System.out.print("The colored Print isn't on\n");
            fout.print("The colored Print isn't on\n");
            fout.flush();
        }
    }

    /**
     * Method implements turn on Start button
     */
    public void turnOnStartButton() {
        PrinterButton.set_Start(true);
        if (PrinterButton.get_Start()) {
            System.out.print("The start button is pressed\n");
            fout.print("The start button is pressed\n");
            fout.flush();
        } else {
            System.out.print("The start button isn't pressed\n");
            fout.print("The start button isn't pressed\n");
            fout.flush();
        }
    }

    /**
     * Method implements turn off Start button
     */
    public void turnOffStartButton() {
        PrinterButton.set_Start(false);
        if (PrinterButton.get_Start()) {
            System.out.print("The start button is pressed\n");
            fout.print("The start button is pressed\n");
            fout.flush();
        } else {
            System.out.print("The start button isn't pressed\n");
            fout.print("The start button isn't pressed\n");
            fout.flush();
        }
    }

    /**
     * Method implements putting something on Printer table
     * to Print it
     */
    public void putSmthOnTable() {
        PrinterTablet.set_Tablet(true);
        System.out.print("Something put on table\n");
        fout.print("Something put on table\n");
        fout.flush();
    }

    /**
     * Method implements check if something is on the table
     */
    public boolean canWePrint() {
        return PrinterTablet.get_Tablet();
    }

    /**
     * Method implements connecting USB
     */
    public void connectUSB() {
        PrinterPort.set_USB(true);
        if (PrinterPort.get_USB()) {
            System.out.print("The USB is connected\n");
            fout.print("The USB is connected\n");
            fout.flush();
        } else {
            System.out.print("The USB isn't connected\n");
            fout.print("The USB isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting USB
     */
    public void disconnectUSB() {
        PrinterPort.set_USB(false);
        if (PrinterPort.get_USB()) {
            System.out.print("The USB isn't disconnected\n");
            fout.print("The USB isn't disconnected\n");
            fout.flush();
        } else {
            System.out.print("The USB is disconnected\n");
            fout.print("The USB is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements connecting IEEE 1394
     */
    public void connectIEEE1394() {
        PrinterPort.set_IEEE1394(true);
        if (PrinterPort.get_IEEE1394()) {
            System.out.print("The IEEE1394 PORT is connected\n");
            fout.print("The IEEE1394 PORT is connected\n");
            fout.flush();
        } else {
            System.out.print("The IEEE1394 PORT isn't connected\n");
            fout.print("The IEEE1394 PORT isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting IEEE 1394
     */
    public void disconnectIEEE1394() {
        PrinterPort.set_IEEE1394(false);
        if (PrinterPort.get_IEEE1394()) {
            System.out.print("The IEEE1394 PORT isn't disconnected\n");
            fout.print("TThe IEEE1394 PORT isn't disconnected\n");
            fout.flush();
        } else {
            System.out.print("The IEEE1394 PORT is disconnected\n");
            fout.print("The IEEE1394 PORT is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements connecting Additional Boards
     */
    public void connectAdditionalBoards() {
        PrinterPort.set_connectorForAdditionalBoards(true);
        if (PrinterPort.get_connectorForAdditionalBoards()) {
            System.out.print("The AdditionalBoards is connected\n");
            fout.print("The AdditionalBoards is connected\n");
            fout.flush();
        } else {
            System.out.print("The AdditionalBoards isn't connected\n");
            fout.print("The AdditionalBoards isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting Additional Boards
     */
    public void disconnectAdditionalBoards() {
        PrinterPort.set_connectorForAdditionalBoards(false);
        if (PrinterPort.get_connectorForAdditionalBoards()) {
            System.out.print("AdditionalBoards isn't disconnected\n");
            fout.print("AdditionalBoards isn't disconnected\n");
            fout.flush();
        } else {
            System.out.print("AdditionalBoards is disconnected\n");
            fout.print("AdditionalBoards is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements connecting Power Cord
     */
    public void connectPowerCordConnector() {
        PrinterPort.set_powerCordConnector(true);
        if (PrinterPort.get_powerCordConnector()) {
            System.out.print("The Power Cord is connected\n");
            fout.print("The Power Cord is connected\n");
            fout.flush();
        } else {
            System.out.print("The Power Cord isn't connected\n");
            fout.print("The Power Cord isn't connected\n");
            fout.flush();
        }
    }

    /**
     * Method implements disconnecting Power Cord
     */
    public void disconnectPowerCordConnector() {
        PrinterPort.set_powerCordConnector(false);
        if (PrinterPort.get_powerCordConnector()) {
            System.out.print("The Power Cord isn't disconnected\n");
            fout.print("The Power Cord isn't disconnected\n");
            fout.flush();
        } else {
            System.out.print("The Power Cord is disconnected\n");
            fout.print("The Power Cord is disconnected\n");
            fout.flush();
        }
    }

    /**
     * Method implements Printning
     */
    public void Printning() {
        if (PrinterPort.get_powerCordConnector()) {
            if (PrinterButton.get_Power()) {
                if (PrinterButton.get_Start()) {
                    if (PrinterTablet.get_Tablet()) {
                        if (PrinterButton.get_Colored()) {
                            PrinterMatrix.Printned(true);
                            System.out.print("Colored Printning ...\n");
                            System.out.print("Printned\n");
                            fout.print("Colored Printning ...\n");
                            fout.print("Printned\n");
                            fout.flush();
                        } else {
                            PrinterMatrix.Printned(true);
                            System.out.print("White\\Black Printning ...\n");
                            System.out.print("Printned\n");
                            fout.print("White\\Black Printning ...\n");
                            System.out.print("Printned\n");
                            fout.flush();
                        }
                    } else {
                        System.out.print("Nothing to Print try again\n");
                        fout.print("Nothing to Print try again\n");
                        fout.flush();
                    }
                } else {
                    System.out.print("Start button isn't pressed\n");
                    fout.print("Start button isn't pressed\n");
                    fout.flush();
                }
            } else {
                System.out.print("Power button isn't plugged in\n");
                fout.print("Power button isn't plugged in\n");
                fout.flush();
            }
        } else {
            System.out.print("Power isn't plugged in\n");
            fout.print("Power isn't plugged in\n");
            fout.flush();
        }
    }
}

class PrinterButton {
    private boolean isStart;
    private boolean isColored;
    private boolean isPower;

    /**
     * Constructor default
     */
    public PrinterButton() {
        isStart = false;
        isColored = false;
        isPower = true;
    }

    /**
     * Constructor with three parameters
     */
    public PrinterButton(boolean setStart, boolean setColored, boolean setPower) {
        isStart = setStart;
        isColored = setColored;
        isPower = setPower;
    }

    /**
     * Constructor with one parameter
     */
    public PrinterButton(boolean setColored) {
        isColored = setColored;
    }

    /**
     * Method sets start button
     */
    public void set_Start(boolean setStart) {
        isStart = setStart;
    }

    /**
     * Method sets colored button
     */
    public void set_Colored(boolean setColored) {
        isColored = setColored;
    }

    /**
     * Method sets power button
     */
    public void set_Power(boolean setPower) {
        isPower = setPower;
    }

    /**
     * Method sets start button
     */
    public boolean get_Start() {
        return isStart;
    }

    /**
     * Method get colored button
     */
    public boolean get_Colored() {
        return isColored;
    }

    /**
     * Method get power button
     */
    public boolean get_Power() {
        return isPower;
    }
}

class PrinterTablet {
    private boolean isOnTablet;

    /**
     * Constructor default
     */
    public PrinterTablet() {
        isOnTablet = false;
    }

    /**
     * Method sets tablet
     */
    public void set_Tablet(boolean sOnTablet) {
        isOnTablet = sOnTablet;
    }

    /**
     * Method get tablet
     */
    public boolean get_Tablet() {
        return isOnTablet;
    }
}

class PrinterPort {
    private boolean USB;
    private boolean IEEE1394;
    private boolean connectorForAdditionalBoards;
    private boolean powerCordConnector;

    /**
     * Constructor default
     */
    public PrinterPort() {
        USB = false;
        IEEE1394 = false;
        connectorForAdditionalBoards = false;
        powerCordConnector = false;
    }

    /**
     * Method sets USB connection
     */
    public void set_USB(boolean sUSB) {
        USB = sUSB;
    }

    /**
     * Method sets IEEE 1394 connection
     */
    public void set_IEEE1394(boolean sIEEE1394) {
        IEEE1394 = sIEEE1394;
    }

    /**
     * Method sets Additional Boards connection
     */
    public void set_connectorForAdditionalBoards(boolean sConnectorForAdditionalBoards) {
        connectorForAdditionalBoards = sConnectorForAdditionalBoards;
    }

    /**
     * Method sets Cord Connector connection
     */
    public void set_powerCordConnector(boolean sPowerCordConnector) {
        powerCordConnector = sPowerCordConnector;
    }

    /**
     * Method get USB connection
     */
    public boolean get_USB() {
        return USB;
    }

    /**
     * Method get IEEE 1394 connection
     */
    public boolean get_IEEE1394() {
        return IEEE1394;
    }

    /**
     * Method get Additional Boards connection
     */
    public boolean get_connectorForAdditionalBoards() {
        return connectorForAdditionalBoards;
    }

    /**
     * Method get Cord connection
     */
    public boolean get_powerCordConnector() {
        return powerCordConnector;
    }
}

class PrinterMatrix {
    AnalogDigitalDevice ADD;
    private boolean isTransformed;

    /**
     * Constructor default
     */
    public PrinterMatrix() {
        isTransformed = false;
        ADD = new AnalogDigitalDevice();
    }

    /**
     * Method sets transformation
     */
    public void set_transform(boolean sTransform) {
        isTransformed = sTransform;
    }

    /**
     * Method get transformation
     */
    public boolean get_transform() {
        return isTransformed;
    }

    /**
     * Method implement Printning
     */
    public boolean Printned(boolean run) {
        if (run == true) {
            ADD.set_convert(true);
            return true;
        }
        return false;
    }

}

class AnalogDigitalDevice {
    private boolean isConverted;

    /**
     * Constructor default
     */
    public AnalogDigitalDevice() {
        isConverted = false;
    }

    /**
     * Method sets convert
     */
    public void set_convert(boolean sConvert) {
        isConverted = sConvert;
    }

    /**
     * Method get convert
     */
    public boolean get_convert() {
        return isConverted;
    }

}