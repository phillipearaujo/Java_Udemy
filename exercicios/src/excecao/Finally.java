package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextDouble());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...");
			entrada.close();
			//finally é chamado indepedente do código cair no catch(erro) ou não.
		}
	}
}
