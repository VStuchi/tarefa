
public class Programa {
public static void main(String[] args) {
	Produtos p1 = new Produtos();
	p1.codigo = 1;
	p1.descProduto = "Nescau";
	p1.preco = 5.50;
	p1.quantidade = 2;
	
	Produtos p2 = new Produtos();
	p2.codigo = 2;
	p2.descProduto = "Leite";
	p2.preco = 3.30;
	p2.quantidade = 5;
	
	Produtos p3 = new Produtos();
	p3.codigo = 3;
	p3.descProduto = "Maçã";
	p3.preco = 1.50;
	p3.quantidade = 7;
	
	CarrinhoCompra c = new CarrinhoCompra();
	c.add(p1);
	c.add(p2);
	c.total();
	c.exibir();
}
}
