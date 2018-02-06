
public class Numero {

	private int a;
	private int b;
	
	public Numero() {
		
	}
	
	public Numero(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int criarNumeroC() throws TamanhoNumero {
		
		String strA = String.valueOf(this.a);
		String strB = String.valueOf(this.b);
		
		if (strA.length() < 3 || strB.length() < 3) {
			throw new TamanhoNumero("A e B tem que ter no mínimo 3 casas decimais. \nTamanho A.: " 
									+ strA.length() + " Tamanho B.: " + strB.length());
		}
		
		
		String primeiroA = strA.substring(0, 1);
		String primeiroB = strB.substring(0, 1);
		String segundoA = strA.substring(1, 2);
		String segundoB = strB.substring(1, 2);
		
		String restanteA = strA.substring(2, strA.length());
		String restanteB = strB.substring(2, strB.length());

		int retorno = Integer.parseInt(primeiroA + primeiroB + 
									   segundoA + segundoB + 
									   restanteB + restanteA);
		
		if (retorno < 1000000) {
			return retorno;
		}
		
		return -1;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
}
