import java.math.BigInteger;

public class exercicio1 {
	
	public static BigInteger encontrarElemento(int n) {
		if(n <= 1) { //O(1)
			return BigInteger.ONE;
		}
		return BigInteger.valueOf(n).multiply(encontrarElemento(n - 1)); //O(n)
	}

	public static void main(String[] args) {
		int n = 102;
		BigInteger resultado = encontrarElemento(n);
		
		System.out.println("Elemento: " + n + ": " + resultado); 
	}
}
