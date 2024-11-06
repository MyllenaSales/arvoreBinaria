package arvoreBinaria;

public class Principal {

	public static void main(String[] args) {
		
		Estrutura e = new Estrutura();

		No n = new No();
		
		e.inserir(2);
		e.inserir(4);
		e.inserir(1);
		e.inserir(3);

		e.inOrdem();
		
		n = e.valorMinimo();
		
		System.out.println("Valor minimo: "+n.getValor());
		
		n = e.valorMaximo();
		
		System.out.println(("Valor máximo: "+n.getValor()));
		
        e.removerMenor();

        System.out.println("Árvore ordenada após remover o valor mínimo:");
        e.inOrdem();
	
	}
}