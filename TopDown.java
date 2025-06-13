import java.math.BigInteger;

public class TopDown {
	
	private static final int MAX_ELEMENTOS = 120;
	
	private static final BigInteger[] elementosFib = new BigInteger[MAX_ELEMENTOS];
	
	public static BigInteger encontrarElementoPD(int n) {
		for(int i = 0; i < MAX_ELEMENTOS; i++){//O(n)
			elementosFib[i] = null;
		}
		
		return encontrarElemento(n);
	}
	
	public static BigInteger encontrarElemento(int n) {//O(n)
	  if(elementosFib[n] != null) {
		  return elementosFib[n];
	  }
		  if(n <= 1) {
				elementosFib[n] = BigInteger.ONE;
			}else {
			  elementosFib[n] = BigInteger.valueOf(n).multiply(encontrarElemento(n - 1)); //O(n)
		    }
	  return elementosFib[n];
		  
   }
		

	public static void main(String[] args) {
		int n = 103;
		BigInteger resultado = encontrarElementoPD(n);
		System.out.println("Elemento " + n + ": " + resultado);
	}


}
