package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int counter = 0;

	private void changeLabelNumber(Label label) {
		label.setText(Integer.toString(counter));

		label.getStyleClass().remove("red");
		label.getStyleClass().remove("green");

		if (counter > 0) {
			label.getStyleClass().add("green");
		} else if (counter < 0) {
			label.getStyleClass().add("red");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitle = new Label("Contador");
		labelTitle.getStyleClass().add("title");

		Label labelNumber = new Label("0");
		labelNumber.getStyleClass().add("number");

		Button reset = new Button("Reset");
		reset.setOnAction(e -> {
			counter = 0;
		});

		Button btDown = new Button("-");
		btDown.getStyleClass().add("buttons");
		btDown.setOnAction(e -> {
			counter--;
			changeLabelNumber(labelNumber);
		});

		Button btUp = new Button("+");
		btUp.getStyleClass().add("buttons");
		btUp.setOnAction(e -> {
			counter++;
			changeLabelNumber(labelNumber);
		});

		HBox boxButtons = new HBox();
		boxButtons.setAlignment(Pos.CENTER);
		boxButtons.setSpacing(20);
		boxButtons.getChildren().add(btDown);
		boxButtons.getChildren().add(btUp);

		VBox boxMain = new VBox();
		boxMain.getStyleClass().add("container");
		boxMain.setAlignment(Pos.CENTER);
		boxMain.setSpacing(10);
		boxMain.getChildren().add(labelTitle);
		boxMain.getChildren().add(labelNumber);
		boxMain.getChildren().add(boxButtons);
		boxMain.getChildren().add(reset);

		String pathCss = getClass().getResource("/basico/Contador.css").toExternalForm();

		Scene sceneMain = new Scene(boxMain, 400, 400);
		sceneMain.getStylesheets().add(pathCss);
		sceneMain.getStylesheets().add("https://fonts.googleapis.com/css?family=Gruppo");

		primaryStage.setScene(sceneMain);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
