package ventaLibreria.sistema.logica;

import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;




public class GestionProducto {
	
	
	/***Libros*/
	
	//Se crea un metodo para crear un nuevo libro de clase Libros
	
	public Libros crearLibro(String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		//Se crea una variable libro de tipo clase Libros donde se le asigna un objeto de clase Libros con los parametros recibidos dentro del metodo crearLibro
		Libros libro = new Libros(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto,
				edicionProducto, referenciaProducto);
		
		//retornaremos la variable libro de tipo clase Libros donde contendra los datos que se trajieron desde la clase 
		return libro;
		
	}
	
	/***Revistas*/
	//Se crea un metodo para guardar un objeto tipo clase revista 
	public Revistas crearRevista (String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		//esta variable revista guarda lo que recibe por parametros del metodo crear revista
		Revistas revista = new Revistas(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto,
				edicionProducto, referenciaProducto);
		
		return revista;
		
	}
	
	/***Articulos Cientificos*/
	

	public ArtCientificos crearArticuloCientifico(String tipoProducto, String nombreProducto, int cantidadProducto,
			float precioProducto, String autorProducto, int edicionProducto, String referenciaProducto) {
		
		ArtCientificos articuloCientifico = new ArtCientificos(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto,
				edicionProducto, referenciaProducto);
		
		return articuloCientifico;
		
				
	}
	

	
	
	
	
	

}
