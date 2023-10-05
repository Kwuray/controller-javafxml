package fr.kwuray.javafxml.controller;

import javafx.scene.Parent;

import javax.swing.*;

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
	 * That method is called by the {@code FXMLLoader}, it generally used to add all the event handler.
	 */
	protected abstract void initialize();

}