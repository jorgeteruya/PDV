
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente("Jorge");
		
		Compra compra =  new Compra();
		compra.adicionarItem("suco", 3.5, 1);
		compra.adicionarItem("almo�o", 10.0, 1);
		compra.adicionarItem("sobremesa", 5.0, 1);
		compra.adicionarItem("caf�", 2.0, 1);
		
		cliente.compras.add(compra);
		
		System.out.println(compra.getCompra());
	}

}
