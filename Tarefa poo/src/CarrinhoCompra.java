import java.util.List;
import java.util.ArrayList;


public class CarrinhoCompra {
	private List<Produtos> itens;
	
	public CarrinhoCompra() {
		itens = new ArrayList<>();
	}
	
	public void add(Produtos produtos) {
		itens.add(produtos);
	}
	
	public void exibir() {
		for(Produtos produtos:itens) {
			produtos.listarDados();
		}	
	}
	
	public double total() {
		double total = 0;
		for(Produtos produtos:itens) {
			total += produtos.preco * produtos.quantidade;
		} System.out.println("O valor total do carrinho é: " + total);
		return total;
	}
	
}
