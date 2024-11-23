package arvoreBinaria;

public class Principal {

	public static void main(String[] args) {
		
		Estrutura e = new Estrutura();

		No n = new No();
		
		e.inserir(2);
		e.inserir(4);
		e.inserir(1);
		e.inserir(3);

		System.out.println("Árvore antes da ordenação: ");
		e.preOrdem();

		System.out.println("\nÁrvore após a ordenação: ");
		e.inOrdem();
		
		n = e.valorMinimo();
		
		System.out.println("\nValor minimo: "+n.getValor());
		
		n = e.valorMaximo();
		
		System.out.println(("Valor máximo: "+n.getValor()));
		
        e.removerMenor();

        System.out.println("\nÁrvore ordenada após remover o valor mínimo:");
        e.inOrdem();

		System.out.println("\nAltura da árvore: "+ e.alturaArvore());
	
	}
}