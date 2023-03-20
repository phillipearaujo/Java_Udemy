package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
			System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(0);
		a2.raio = 10;
			System.out.println(a2.area());
			
		System.out.println("-------------------------");
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);//PI já é uma constante em java e pode ser acessado usando Math.PI
	}

}
