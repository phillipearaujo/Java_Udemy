package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {

		// elementos organizados em pilhas. Note que est�o uns sobre os outros.

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		getChildren().addAll(c2, c3, c4, c5, c6, c1); // c1 na ultima posi��o ser� exibido na frente

		setOnMouseClicked(e -> {
			if (e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});

		/*
		 * criado um evento para o click do mouse alterar os elementos na tela. Dentro
		 * do if() foi definido o meio da tela na posi��o vertical(eixo X) sendo este
		 * maior que a metade da cena(getScene().getWidth() / 2. Dessa forma pegamos o
		 * elemento na posi��o (0) e passamos para frente. Para voltar pegamos o �ltimo
		 * elemento no indice e passamos ra tr�s.
		 */

		/*
		 * Abaixo foi criada uma Thread para altera��o altom�tica das telas. Importante
		 * observar o uso da aplica��o Platform que transforma a tread em uma FXThread
		 * permitindo o seu funcionamento.
		 */

		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);

					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});

		t.setDaemon(true); // encerra a aplica��o quando a tela � fechada.
		t.start(); // inicia a Thread
	}

}
