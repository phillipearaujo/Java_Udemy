package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("21A");
		Cliente cliente = new Cliente("Ashley Olsen", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.includeAtomic(cliente);
		
	}
}
