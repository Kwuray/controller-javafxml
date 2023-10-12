package fr.kwuray.javafxml.controller;

import javafx.fxml.FXMLLoader;

import java.io.File;
import java.io.IOException;

/** 
 * This abstract class set the minimum requirement to be a FXML Element controller
 */
public abstract class ElementController extends Controller
{
	
	/**
	 * Element controller constructor.
	 * @param fxmlPath a {@code String} representing the fxml file path.
	 */
	public ElementController(String fxmlPath)
	{
		super(fxmlPath);
	}
	
	/**
	 * This method load the FXML element into the {@code Parent} root attribute.
	 * @throws IOException in case of problem with the file path.
	 */
	public final void updateStage() throws IOException
	{
		FXMLLoader loader = new FXMLLoader(new File(this.fxmlPath).toURI().toURL());
		loader.setController(this);
		this.root = loader.load();
	}
}