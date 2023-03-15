
class TrianguloDePascal {

	public void crearTriangulo(int cantidadDeFilas){
		int i = 1;
		int j = 10;
		System.out.println(Math.pow(i, 2));
		System.out.println(Math.pow(i+j, 2));
	}
	
	
	public static void main(String[] args) {
		TrianguloDePascal n = new TrianguloDePascal();
		
		n.crearTriangulo(500);
	}
}
