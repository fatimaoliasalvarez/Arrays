import java.util.Scanner;

public class ArraysEjercicio02 {
	
	private static final int NUMERO_ELEMENTOS = 10;
	private static Scanner teclado=new Scanner (System.in);

	public static void main(String[] args) {
		

		int [] array =new int[NUMERO_ELEMENTOS];		
		introducirVectorNumeros(array);
		System.out.println("Hay :" + contarNumerosNegativos(array) + " numeros negativos");
		
	}
	
	/**
	 * Método para introducir enteros en el array. 
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
	 * Método que devuelve cuantos valores negativos hay en el array
	 * @param array
	 * @return
	 */
	private static int contarNumerosNegativos(int[] array) {
		int contadorNegativos=0;
		for(int i=array.length -1; i>=0; i--) {
			if (array[i]<0) {
				contadorNegativos++;
			}
			
		}
		return contadorNegativos;
	}

}
