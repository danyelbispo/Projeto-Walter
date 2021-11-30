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
		
		buscalinear(40,listaaleatoria);// buscando o numero 40 na lista aleatoria e encontrando a posição
		
		
		
	}

	private static void buscalinear(int i, ArrayList<Integer> listaaleatoria) {
		boolean encontrou = false;
		int posição = -1;
		int iterações = 1;
		/*for(int num :listaaleatoria) {
			if(listaaleatoria.get(num)==i) {
				posição = num ;
				encontrou=true;
				System.out.println("Encontrei o numero 40 apos "+iterações+" iterações");
				break;
			}
			else iterações++;
		}*/
		
		for(int j =0 ; j<listaaleatoria.size();j++) {
			if(listaaleatoria.get(j)==i) {
				posição = j ;
				encontrou=true;
				System.out.println("Encontrei o numero 40 apos "+iterações+" iterações");
				break;
			}
			else iterações++;}
		
		
		
	}

}
