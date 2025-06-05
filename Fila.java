
public class Fila {
	
	  private int elementos[];
	  private int inicio;
	  private int fim;
	  private int tamanho;
	  private int capacidade;
	   
	  public Fila(int capacidade){
	    this.elementos = new int[capacidade];
	    this.inicio = 0;
	    this.fim = 0;
	    this.tamanho = 0;
	    this.capacidade = capacidade;
	  }
	       
	  public boolean isCheia(){
	    return this.capacidade == this.tamanho;
	  }
	       
	  public void enfileirar(int valor){
	    if(this.isCheia()){
	      System.out.println("Fila cheia. Não foi possível enfileirar");
	    }
	       
	    this.elementos[this.fim] = valor;
	    this.fim += 1;
	    this.tamanho += 1;
	    System.out.println("O valor " + valor + " foi enfileirado.");
	  }
	     
	  public int desenfileirar(){
	    int valor = -1;
	 
	    if(this.isVazia()){
	      System.out.println("A fila esta vazia");
	      return valor;
	    }
	       
	    valor = this.elementos[this.inicio];
	    this.inicio += 1;
	     
	   
	    if(this.inicio == this.fim){
	      this.inicio = 0;
	      this.fim = 0;
	    }
	 
	 
	    this.tamanho -= 1;
	   
	    return valor;
	  }
	       
	  
	  public boolean isVazia(){
	     
	    return this.tamanho == 0;
	  }
	       
	 
	  public void exibir(){
	   
	    if(this.isVazia()){
	      System.out.println("A fila esta vazia");
	    }
	    else {
	      System.out.print("Elementos na fila: ");
	      for(int i = this.inicio; i < this.fim; i++){
	        System.out.print(this.elementos[i] + " ");
	      }
	 
	      System.out.println("\nO elemento no início da fila é: " + this.elementos[this.inicio]);
	      System.out.println("O elemento no final da fila é: " + this.elementos[this.fim - 1]);
	      System.out.println("O índice do elemento no início da fila é: " + this.inicio);
	      System.out.println("O índice do elemento no final da fila é: " + (this.fim - 1));
	    }
	  }
  public static void main(String args[]) {
	  Fila fila = new Fila(5);
      fila.enfileirar(10);
      fila.enfileirar(20);
      fila.enfileirar(30);
      fila.exibir();
      fila.desenfileirar();
      fila.exibir();
  }

}



