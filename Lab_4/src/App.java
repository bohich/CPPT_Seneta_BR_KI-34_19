import KI34.Seneta.Lab3.*;

public class App {
    public static void main(String[] args) throws Exception {
        Copier copier = new Copier();
        copier.connectPowerCordConnector();
        copier.turnOnStartButton();
        copier.turnOnPrinter();
        copier.putSmthOnTable();
        copier.set_copy(true);
        copier.startCopping(true);
        copier.dispose();
        copier.turnOffPrinter();
        copier.disconnectPowerCordConnector();
    }
}
