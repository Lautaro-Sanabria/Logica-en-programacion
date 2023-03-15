class CruzDeNumeros {
		public static void main(String[] args) {
			CruzDeNumeros cruz = new CruzDeNumeros();
			cruz.impCruz(4);
		}
		public void impCruz(int numero) {
			int fila = numero * 2;
			int columna = fila;
			for (int i = 1; i < fila; i++) {
				for (int j = 1; j < columna; j++) {
					if (i == numero) {
						if (j <= numero) {
							System.out.print(j);
						} else {
							System.out.print(columna-j);
						}
					} else if (j == numero) {
						if (i <= numero) {
							System.out.print(i);
						} else {
							System.out.print(fila - i);
						}
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
