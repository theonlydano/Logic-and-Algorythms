package application;

import ui.core.GUIFactory;
import ui.mac.MacOSGUIFactory;
import ui.windows.WindowsGUIFactory;

public class Main {

    public static void main(String[] args) {
        Application app = new Application(configureFactory("Mac"));
    }

    private static GUIFactory configureFactory(String os){
        switch(os){
            case "Windows":
                return new WindowsGUIFactory();
            case "Mac":
                return new MacOSGUIFactory();
            default:
                System.out.println("Invalid OS");
                return null;
        }
    }

}