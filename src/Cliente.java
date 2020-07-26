import java.util.ArrayList;

public class Cliente {
	
	final String nomeCliente;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total  += compra.obterValorTotal();
		}
		return total;
				
	}

}
