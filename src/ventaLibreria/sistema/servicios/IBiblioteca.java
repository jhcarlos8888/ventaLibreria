package ventaLibreria.sistema.servicios;

import java.util.List;

import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;


//Se crea la interfas donde se encuentra las operaciones generales que realizara el programa
public interface IBiblioteca {

	
	
	/*** Metodos para categoria Libros */	
	
	//Se crea un metodo que no retorna nada tipo void y solo es para ingresar como parametros informacion 
		public void adicionarLibro(String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
	
	
	//Se crea un metodo que retorne una lista de clase Libros
		public List<Libros> obtenerInventarioLibros();
	
	//Se crea un metodo que retorna un objeto de clase Libros y recibe como parametros un String 
		public Libros consultarLibroByNombre(String nombre);		
		
		
		
	/*** Metodos para categoria Revistas */	
		
	//Metodo no me retorna nada, solo es para ingresar un objeto de clase Revistas por medio de parametros 	
		public void adicionarRevista (String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
	
	
	
	//Se crea metodo que me devolvera una lista de objeto clase Revistas
	public List<Revistas> obtenerInventarioRevistas();
	
	
		
	
	/*** Metodos para categoria Articulos Cientificos */	
	
	//Se crea metodo para agregar un articulo cientifico
	public void adicionarArtCientifico(String tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
	
	
	//Obtener le inventario completo de articulos
	public List<ArtCientificos> obtenerInventarioArticulosCientificos();
	
	

	
	
	
}
