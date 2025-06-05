
public class HashMap {
	
	private static final int TAMANHO = 10;
	
	static class Entrada{
		int chave;
		int valor;
		Entrada proximo;
		
		Entrada(int chave, int valor){
			this.chave = chave;
			this.valor = valor;
		}
	}
	
	private Entrada[] tabela;
	
	public HashMap() {
		tabela = new Entrada[TAMANHO];
	}
	
	 private int hash(int chave) {
		 if (chave < 0) {
		        chave = -chave;
		    }
		    return chave % TAMANHO;
	    }
	 
	 public void put(int chave, int valor) {
		 int indice = hash(chave);
		 Entrada atual = tabela[indice];
		 
		 while(atual != null) {
			 if (atual.chave == chave) {
				 atual.valor = valor;
				 return;
			 }
			 atual = atual.proximo;
		 }
		 
		 Entrada nova = new Entrada(chave, valor);
		 nova.proximo = tabela[indice];
		 tabela[indice] = nova;
	 }
	 
	 public Integer get(int chave) {
	        int indice = hash(chave);
	        Entrada atual = tabela[indice];

	        while (atual != null) {
	            if (atual.chave == chave) {
	                return atual.valor;
	            }
	            atual = atual.proximo;
	        }

	        return null;
	    }
	 
	 public Integer delete(int chave) {
	        int indice = hash(chave);
	        Entrada atual = tabela[indice];
	        Entrada anterior = null;

	        while (atual != null) {
	            if (atual.chave == chave) {
	                if (anterior == null) {
	                    // Remover o primeiro da lista
	                    tabela[indice] = atual.proximo;
	                } else {
	                    anterior.proximo = atual.proximo;
	                }
	                return atual.valor;
	            }
	            anterior = atual;
	            atual = atual.proximo;
	        }

	        return null; // Não encontrado
	    }
	 
	 public void clear() {
	        for (int i = 0; i < TAMANHO; i++) {
	            tabela[i] = null;
	        }
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap mapa = new HashMap();
        mapa.put(10, 100);
        mapa.put(20, 200);
        mapa.put(30, 300);

        System.out.println("Antes do delete:");
        System.out.println("20: " + mapa.get(20));
        Integer removido = mapa.delete(20);
        System.out.println("Valor removido da chave 20: " + removido);
        System.out.println("Depois do delete:");
        System.out.println("20: " + mapa.get(20));

        mapa.clear();
        System.out.println("Depois do clear:");
        System.out.println("10: " + mapa.get(10));
        System.out.println("30: " + mapa.get(30));
    }
}


