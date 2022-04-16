package ventaLibreria.sistema.modelo;

public class Libros extends Productos {

	
	// Atributos Constantes
	public static final String AutorLibro ="Juan Carlos Herrera Blandon";

	public static final int EdicionLibro = 2022;

	public static final String tipoProductoLibro = "Libro";

	public static final String referenciaProductoLibro = "RPL";

	
	
	
	
	
	public Libros() {
		super();
		
	}
	
	
	//Se crea un constructor con parametros super clase
	public Libros(String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto, String autorProducto, int edicionProducto, String referenciaProducto) {
		super(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto,referenciaProducto);
		
		
	}

	

	
	
}
