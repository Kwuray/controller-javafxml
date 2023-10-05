package fr.kwuray.javafxml.main;

import fr.kwuray.javafxml.controller.MainMenuController;
import fr.kwuray.javafxml.controller.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFX extends Application {


    public void start(Stage stage)
    {
        SceneController controller = new MainMenuController(stage);
        try
        {
            controller.updateStage();
            controller.getStage().show();
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
