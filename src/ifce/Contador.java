package ifce;



public class Contador {
	public String ContaPares(int num){
		int i;
		String texto = "n�meros pares";
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
		return texto;
	}
}

