package pilha;

public class Pilha {
	
	private Object p[];
	private int posicaoA;
	private int posicaoB;
	private int tamanhoA;
	private int tamanhoB;
	
	public Pilha() {
		this.p = new Object [10];
		this.posicaoA = -1;
		this.posicaoB = 10;
		this.tamanhoA = 0;
		this.tamanhoB = 0;
	}
	
	public void empilhaA(Object obj) {
		if (this.posicaoA < this.posicaoB) {
			this.p[++posicaoA] = obj;
			this.tamanhoA++;
		}
		
	}
	
	public void empilhaB(Object obj) {
		if (this.posicaoB > this.posicaoA) {
			this.p[--posicaoB] = obj;
			this.tamanhoB++;
		}
		
	}
	
	public boolean vaziaA() {
		if (posicaoA == -1) {
			return true;
		}
		return false;
	}
	
	public boolean vaziaB() {
		if (posicaoB == 10) {
			return true;
		}
		return false;
	}
	
	public void desempilhaA() {
		if (vaziaA()) {
			System.out.println("Pilha está vazia, não tem como desempilhar");
		}else {
			this.tamanhoA--;
			this.posicaoA--;
		}
	}
	
	public void desempilhaB() {
		if (vaziaB()) {
			System.out.println("Pilha está vazia, não tem como desempilhar");
		}else {
			this.tamanhoB--;
			this.posicaoB++;
		}
	}
	
	public boolean cheiaA() {
		if (posicaoA == posicaoB-1) {
			return true;
		}
		return false;
	}
	
	public boolean cheiaB() {
		if (posicaoB == posicaoA+1) {
			return true;
		}
		return false;
	}
	
	public Object topoA() {
		return this.p[this.posicaoA];
	}
	
	public Object topoB() {
		return this.p[this.posicaoB];
	}
	
	public void mostrarA() {
		for (int i = 0; i <= posicaoA; i++) {
			System.out.println(this.p[i]);
		}
	}
	
	public void mostrarB() {
		for (int i = p.length - 1; i >= posicaoB; i--) {
			System.out.println(this.p[i]);
		}
	}
	
	public int tamanhoA() {
		return tamanhoA;
	}
	
	public int tamanhoB() {
		return tamanhoB;
	}
}
