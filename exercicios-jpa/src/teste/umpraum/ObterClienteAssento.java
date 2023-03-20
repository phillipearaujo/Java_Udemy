package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {

		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

			Cliente cliente = daoCliente.getById(2L);
			System.out.println(cliente.getAssento().getNome());

		daoCliente.close();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
			Assento assento = daoAssento.getById(2L);
			System.out.println(assento.getCliente().getNome());
		
		daoAssento.close();
	}
}
