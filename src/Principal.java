import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> listaaleatoria = new ArrayList<Integer>();//arraylist
		int i =0;
		int n =-1;

		
		
		while(i<50) {
			
			n = (int)(Math.random() * 51);// preencher com numero de 0 50
			
			if( (!listaaleatoria.contains(n)) && n!=0){
				listaaleatoria.add(n);
				i++;
			}
			
		}
		System.out.println(listaaleatoria);// imprimindo a lista aleatoria
		
		buscalinear(40,listaaleatoria);// buscando o numero 40 na lista aleatoria e encontrando a posi��o
		
		
		
	}

	private static void buscalinear(int i, ArrayList<Integer> listaaleatoria) {
		boolean encontrou = false;
		int posi��o = -1;
		int itera��es = 1;
		/*for(int num :listaaleatoria) {
			if(listaaleatoria.get(num)==i) {
				posi��o = num ;
				encontrou=true;
				System.out.println("Encontrei o numero 40 apos "+itera��es+" itera��es");
				break;
			}
			else itera��es++;
		}*/
		
		for(int j =0 ; j<listaaleatoria.size();j++) {
			if(listaaleatoria.get(j)==i) {
				posi��o = j ;
				encontrou=true;
				System.out.println("Encontrei o numero 40 apos "+itera��es+" itera��es");
				break;
			}
			else itera��es++;}
		
		
		
	}

}
