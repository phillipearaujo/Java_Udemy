package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {

		// elementos se ajustam de acordo com o fluxo da tela

		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();

		setHgap(10); // espaçamento horizontal entre os quadrados
		setVgap(10); // espacamento vertical entre os quadrados
		setPadding(new Insets(10)); // espaçamento das margens

		setOrientation(Orientation.VERTICAL); // orientação dos elementos na tela
		setAlignment(Pos.CENTER); // posicionamento na tela

		getChildren().addAll(q1, q2, q3, q4, q5);
	}

}
