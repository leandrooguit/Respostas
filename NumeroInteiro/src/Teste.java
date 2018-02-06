
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Numero teste_1 = new Numero(10256, 512);
			int numeroC_1 = teste_1.criarNumeroC();
			System.out.println("Número C_1.: " + numeroC_1);
			
			Numero teste_2 = new Numero(102, 512);
			int numeroC_2 = teste_2.criarNumeroC();
			System.out.println("Número C_2.: " + numeroC_2);
		} catch(TamanhoNumero e) {
			System.out.println(e.getMessage()); 
		}
	}

}
