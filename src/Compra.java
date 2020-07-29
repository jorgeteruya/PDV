import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int qtd) {
//promocao
		if (itens.size() < 10 && qtd <= 3 && p.getPreco() <= 20.00) {

			itens.add(new Item(p, qtd));
		}
	}

	public double getPrecoItem(int index) {

		return itens.get(index).getProduto().getPreco();

	}

	void adicionarItem(String nome, double preco, int qtd) {

		adicionarItem(new Produto(nome, preco), qtd);

	}

	public String getCompra() {
		for(Item item : itens) {
			System.out.print(item.getProduto().getNome() + " - R$" );
			System.out.println(item.getProduto().getPreco());
		}
		return "\nCompra com " + itens.size() + " iten(s) e valor total de R$ " + obterValorTotal();
	}

	double obterValorTotal() {

		double total = 0;

		for (Item item : itens) {
			total += item.getQuantidade() * item.getProduto().getPreco();
		}
		return total;
	}
}
