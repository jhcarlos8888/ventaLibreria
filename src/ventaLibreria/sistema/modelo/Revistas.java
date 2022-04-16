package ventaLibreria.sistema.modelo;

public class Revistas extends Productos {

	
	
	//Atributos Constantes
	public static final String Autor = "Jorge Eduardo Caicedo";
	
	public static final int Edicion = 2020;
	
	public static final String tipoProductoRevista = "Revista";
	
	public static final String referenciaProductoRevista = "RPR";

	
	
	public Revistas() {
		super();
		
	}

	public Revistas(String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		super(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto,
				referenciaProducto);
		
	}
	
	
	
	
	
	
	
	
	
}
