
class RombitoYArbol {
	static void rombito(int h) {
		for (int i = h / 2 - 1; i >= 0; i--) {
			fila(h / 2, i);
		}
		for (int i = 1; i <= h / 2; i++) {
			fila(h / 2, i);
		}

	}

	static void pinito(int h) {
		// 2*h-1
		for (int i = h - 1; i >= 0; i--) {
			fila(h, i);
		}
		fila(h, h - 1);
	}

	public static void fila(int h, int x) {
		for (int n = 1; n <= x; n++) {
			System.out.print(" ");
		}
		for (int n = 1; n <= 2 * (h - x) - 1; n++) {
			System.out.print("#");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		pinito(4);
	}
}
