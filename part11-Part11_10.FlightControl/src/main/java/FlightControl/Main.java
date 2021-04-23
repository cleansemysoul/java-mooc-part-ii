package FlightControl;

import FlightControl.UI.TextUserInterface;
import FlightControl.UI.UserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        ui.run();
    }
}
