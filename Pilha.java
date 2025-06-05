
public class Pilha {
	
	public Object[] pilha;
	
	public int posicaoPilha;
	
	public Pilha() {
		this.posicaoPilha = -1;
		this.pilha = new Object[10];
	}
	
	public boolean isEmpty() {
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}
	
	public int tamanho() {
		if(this.isEmpty()) {
			return 0;
		}
		return this.posicaoPilha + 1;
	}
		
	public void push(Object valor) {
		if(this.posicaoPilha < this.pilha.length -1) {
			this.pilha[++posicaoPilha] = valor;
		}
	}
	
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return this.pilha[this.posicaoPilha --];
	}
	
	public Object top() {
		if(isEmpty()) {
			return null;
		}
		return this.pilha[this.posicaoPilha];
	}
	
	public static void main(String args[]) {
		Pilha p = new Pilha();
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		p.push(6);
		p.push(7);
		p.push(8);
		p.push(9);
		p.push(10);
		System.out.println("Size: "+ p.tamanho());
		System.out.println("Top: "+ p.top());
		System.out.println("Pop: ");
		while(p.isEmpty() == false) {
			System.out.println(p.pop());
		}
	}
}
