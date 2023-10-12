package fr.kwuray.javafxml.main;

import fr.kwuray.javafxml.controller.MainMenuController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFX extends Application {


    public void start(Stage stage)
    {
        MainMenuController controller = new MainMenuController(stage);
        try
        {
            controller.updateStage();
            controller.getStage().show();
            controller.addChild();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
