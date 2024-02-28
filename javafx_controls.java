package Problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafx_controls extends Application {

    // launch the application
    public void start(Stage s) {
        // set title for the stage
        s.setTitle("Creating MenuBar");

        // create a menu
        Menu m = new Menu("Menu");

        // create menu items
        MenuItem m1 = new MenuItem("Menu Item 1");
        MenuItem m2 = new MenuItem("Menu Item 2");
        MenuItem m3 = new MenuItem("Menu Item 3");

        // add menu items to menu
        m.getItems().addAll(m1, m2, m3);

        // create a menubar
        MenuBar mb = new MenuBar();

        // add menu to menubar
        mb.getMenus().add(m);

        // create a VBox
        VBox vb = new VBox(mb);

        // create a scene
        Scene sc = new Scene(vb, 500, 300);

        // set the scene
        s.setScene(sc);

        // show the stage
        s.show();
    }

    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}
