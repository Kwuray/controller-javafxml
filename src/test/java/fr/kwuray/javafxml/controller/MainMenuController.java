package fr.kwuray.javafxml.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/** This {@code SceneController} is used to control the main menu scene.
 */
public class MainMenuController extends SceneController
{

	
	/**
	 * MainMenuController constructor.
	 * @param stage, a {@code Stage} used to show the current Scene.
	 */
	public MainMenuController(Stage stage)
	{
		super(System.getProperty("user.dir") + "/res/MainMenu.fxml","Menu principal", stage);
	}

	/**
	 * A {@code Button} used to create a new session;
	 */
	@FXML private Button mainButton;

	@FXML private Label mainLabel;
	private int i = 0;
	
	/**
	 * Add all the event handler needed
	 */
	public void initialize()
	{
		//Do something
		this.mainButton.addEventHandler(ActionEvent.ACTION, a -> {
			System.out.println("hello");
			this.mainLabel.setText("" + this.i);
			this.i++;
		});
	}

	public void addChild()
	{
		SubMenuElementController e = new SubMenuElementController();
		try {
			e.updateStage();
			VBox v = (VBox)(this.root);
			v.getChildren().add(e.root);
			e.addChild();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}