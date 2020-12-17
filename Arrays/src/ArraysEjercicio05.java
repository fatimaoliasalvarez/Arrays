import java.util.Random;

public class ArraysEjercicio05 {

	private static final int TAMANNO_COMBINACION = 6;
	private static final int MAXIMO = 49;

	public static void main(String[] args) {
		
		int[] combinacion=new int[TAMANNO_COMBINACION];
		crearCombinacion( combinacion);
		mostrarCombinacion(combinacion);
		

	}

	private static void mostrarCombinacion(int[] combinacion) {
		System.out.print("Combinacion: ");
		for ( int i=0; i <combinacion.length; i++) {
			System.out.print( combinacion[i] + " ");
		}
		System.out.println();
		
	}

	private static void crearCombinacion(int[] combinacion) {
		
		int numero;
		int i=0;
		Random serie=new Random();
		while (i< combinacion.length ) {
			
			numero=serie.nextInt(MAXIMO) +1;
			
			if (!estaenArray( numero, combinacion)) {
				combinacion[i]=numero;
				i++;
			}
		}
		
	}

	private static boolean estaenArray(int numero, int[] array) {
		boolean esta=false;
		
		for (int i = 0; i < array.length && !esta; i++) {
			if ( array[i]==numero) {
				esta=true;
			}
		}
		
		return false;
	}

}
