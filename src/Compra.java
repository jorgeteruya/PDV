import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtd) {
		this.itens.add(new Item(p, qtd));
	}
	
	void adicionarItem(String nome, double preco, int qtd) {
		this.itens.add(new Item(new Produto(nome, preco) , qtd));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}

}
