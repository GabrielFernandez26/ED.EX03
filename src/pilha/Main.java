package pilha;

public class Main {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.empilhaA(1);
		p.empilhaB(3);
		p.empilhaA(2);
		p.empilhaB(4);
		p.empilhaA(5);
		p.empilhaB(7);
		p.empilhaA(11);
		p.empilhaB(15);
		p.empilhaA(55);
		System.out.println(p.cheiaA());
		p.empilhaB(35);
		p.mostrarA();
		System.out.println("==========================");
		p.mostrarB();
		System.out.println(p.tamanhoA());
		System.out.println();
		p.desempilhaA();
		p.desempilhaB();
		p.mostrarA();
		System.out.println("==========================");
		p.mostrarB();
	}

}
