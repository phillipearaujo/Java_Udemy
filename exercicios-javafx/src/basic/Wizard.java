package basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

	private Stage window;
	private Scene step1;
	private Scene step2;
	private Scene step3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		createStep1();
		createStep2();
		createStep3();

		window.setScene(step1);
		window.setTitle("Wizard :: Step 1");
		window.show();
	}

	private void createStep1() {
		Button nextStep = new Button("Next  >>");
		nextStep.setOnAction(e -> {
			window.setScene(step2);
			window.setTitle("Wizard :: Step 2");
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(nextStep);

		step1 = new Scene(box, 400, 400);
	}

	private void createStep2() {
		Button backStep = new Button("<<  Back");
		backStep.setOnAction(e -> {
			window.setScene(step1);
			window.setTitle("Wizard :: Step 1");
		});
		Button nextStep = new Button("Next  >>");
		nextStep.setOnAction(e -> {
			window.setScene(step3);
			window.setTitle("Wizard :: Step 3");
		});

		HBox box = new HBox();
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(backStep);
		box.getChildren().add(nextStep);

		step2 = new Scene(box, 400, 400);
	}

	private void createStep3() {
		Button backStep = new Button("<<  Back");
		backStep.setOnAction(e -> {
			window.setScene(step2);
			window.setTitle("Wizard :: Step 2");
		});
		Button finish = new Button("<Finish>");
		finish.setOnAction(e -> System.exit(0));

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(backStep);
		box.getChildren().add(finish);

		step3 = new Scene(box, 400, 400);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
