import java.util.Scanner;

public class ArraysEjercicio01 {
	
	private static final int NUMERO_ELEMENTOS = 10;
	private static Scanner teclado=new Scanner (System.in);
	public static void main(String[] args) {
		

		int [] vector =new int[NUMERO_ELEMENTOS];		
		introducirVectorNumeros(vector);
		imprimirVectorOrdenInverso(vector);
		
		
	}
	/**
	 * Método para introducir enteros en el array
	 * @param array
	 */
	private static void introducirVectorNumeros(int[] array){
		int i;
		
		for(i=0; i < array.length ;i++){
			
			System.out.println("Introduce el elemento "+(i+1));
			array[i]=Integer.parseInt(teclado.nextLine());
			System.out.println();
		}
		
	}
	/**
	 * Método que imprime en orden inverso el contenido del array
	 * @param array
	 */
	
	private static void imprimirVectorOrdenInverso(int[] array){
		int i;
		
		for(i=array.length-1 ;i>=0;i--){
			System.out.println("El elemento "+(i+1)+"es "+array[i]);
		}
		
	}
	

}
