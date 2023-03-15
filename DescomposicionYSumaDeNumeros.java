class DescomposicionYSumaDeNumeros {
	public static void main(String[] args) {
		
		int numeroParaIngresar = 123; // INGRESAR CUALQUIER DIGITO.
		int valorOriginal = numeroParaIngresar;
		int sistemaDecimal = 0;
		int sumaSistemaDecimal = 0;
		for (int i = 1; i <= valorOriginal; i *= 10) {
			sistemaDecimal += valorOriginal / i % 10; // VA TOMANDO VALORES DEL SISTEMA DECIMAL(unidad,decena,centena,etc).
	        sumaSistemaDecimal = sistemaDecimal / 10 + sistemaDecimal % 10;
		}
		System.out.println("La suma del numero ingresado es: "+sistemaDecimal);
		System.out.println("La suma del numero " +sistemaDecimal + " es: " + sumaSistemaDecimal); // IMPRIME EL RESULTADO DE LA SUMA.
	}
}