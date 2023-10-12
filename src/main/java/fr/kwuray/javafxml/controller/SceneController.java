package fr.kwuray.javafxml.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/** 
 * This abstract class set the minimum requirement to be a JavaFXML Scene controller
 */
public abstract class SceneController extends Controller
{

	/**
	 * The stage's title.
	 */
	protected String title;
	
	/**
	 * The {@code Stage} where display current scene.
	 */
	protected Stage stage;
	
	/**
	 * A {@code Scene} container to contain {@code Parent} root attribute.
	 */
	protected Scene scene;
	
	/**
	 * Scene controller constructor
	 * @param fxmlPath a {@code String} representing the fxml file path.
	 * @param title a {@code String} representing the scene's title.
	 * @param stage, a {@code Stage} used to show current Scene.
	 */
	public SceneController(String fxmlPath, String title, Stage stage)
	{
		super(fxmlPath);
		this.title = title;
		this.stage = stage;
	}
	
	/**
	 * This method load the FXML element into the {@code Stage} attribute.
	 * @throws IOException in case of problem with the file path.
	 */
	public final void updateStage() throws IOException
	{
		FXMLLoader loader = new FXMLLoader(new File(this.fxmlPath).toURI().toURL());
		loader.setController(this);
		this.root = loader.load();
		this.scene = new Scene(this.root);
		this.stage.setScene(this.scene);
		this.stage.setTitle(this.title);
	}

	/**
	 * @return the {@code Stage} attached to that Controller
	 */
	public Stage getStage()
	{
		return stage;
	}

	/**
	 * @return the {@code String} controller's title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the {@code Scene} controller's scene
	 */
	public Scene getScene()
	{
		return scene;
	}
}