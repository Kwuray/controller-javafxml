package fr.kwuray.javafxml.controller;

import javafx.scene.Parent;

import javax.swing.*;
import java.io.IOException;

/** 
 * This abstract class set the minimum requirement to be a JavaFXML controller
 */
public abstract class Controller
{
	
	/**
	 * A {@code String} representing the fxml file path.
	 */
	protected String fxmlPath;
	
	/**
	 * A {@code Parent} used to store root element of fxml file.
	 */
	protected Parent root;
	
	/**
	 * Controller constructor.
	 * @param fxmlPath a {@code String} representing the fxml file path.
	 */
	protected Controller(String fxmlPath)
	{
		this.fxmlPath = fxmlPath;
	}

	/**
	 * This method load the FXML element into the {@code Stage} attribute.
	 * @throws IOException in case of problem with the file path.
	 */
	public abstract void updateStage() throws IOException;

	/** 
	 * That method is called by the {@code FXMLLoader}, it generally used to add all the event handler.
	 */
	public abstract void initialize();

	public Parent getRoot()
	{
		return this.root;
	}

}