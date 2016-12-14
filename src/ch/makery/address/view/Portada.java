package ch.makery.address.view;

import java.io.File;
import java.io.IOException;

import ch.makery.address.MainApp;
import ch.makery.address.model.Television;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Portada extends Application {

	private static Stage primaryStage;
	private AnchorPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Televisiones	");
		initRootLayout();
	}

	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Portada.class.getResource("portada.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 525, 525);

			//
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			PauseTransition delay = new PauseTransition(Duration.seconds(5));
			delay.setOnFinished(event -> primaryStage.close());

			delay.play();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}