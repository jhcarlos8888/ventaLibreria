package ventaLibreria.sistema.modelo;



public class ArtCientificos extends Productos {
	
	//Atributos Constantes
	public static final String Autor = "Angela Yurany Restrepo";
	
	public static final int Edicion = 2006;
	
	public static final String tipoProductoartCienfico = "Articulo Cientifico";
	
	public static final String referenciaProductoArticuloCientifico = "RPAC";

	
	
	public ArtCientificos() {
		super();
		
	}

	public ArtCientificos(String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		super(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto,
				referenciaProducto);
		
	}
	
	
	
	

}
