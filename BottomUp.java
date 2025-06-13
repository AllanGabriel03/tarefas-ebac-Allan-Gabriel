import java.math.BigInteger;

public class BottomUp {
	public static BigInteger encontrarElemento(int n) {
		BigInteger[] tabela = new BigInteger[n + 1];//O(n)
		
		tabela[0] = BigInteger.ONE;
		
		for(int i = 1; i <= n; i++) {//O(n)
			tabela[i] = BigInteger.valueOf(i).multiply(tabela[i - 1]);
		}
		
		return tabela[n];
	}
	
	public static void main(String[] args) {
		int n = 7;
		System.out.println("Fatorial de " + n + ": " + encontrarElemento(n));
	}

}//O(n)
