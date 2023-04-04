package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane {

	public TesteAnchorPane() {

		// ancoragem dos quadrados
		/*
		 * o q5 foi aplicado uma técnica utililizando o HBox que por sua vez foi
		 * ancorado em cada ponta dos quadrados q1, q2, q3 e q4.
		 */

		Quadrado q1 = new Quadrado();
		setTopAnchor(q1, 10.0); // define a posição vertical do elemento na tela
		setLeftAnchor(q1, 10.0); // define a posição vertical do elemento na tela

		Quadrado q2 = new Quadrado();
		setTopAnchor(q2, 10.0);
		setRightAnchor(q2, 10.0);

		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, 10.0);
		setLeftAnchor(q3, 10.0);

		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0);

		Quadrado q5 = new Quadrado();

		HBox center = new HBox();
		center.setAlignment(Pos.CENTER);
		setTopAnchor(center, 110.0);
		setBottomAnchor(center, 110.0);
		setRightAnchor(center, 110.0);
		setLeftAnchor(center, 110.0);

		center.getChildren().add(q5);

		getChildren().addAll(q1, q2, q3, q4, center);
	}

}
