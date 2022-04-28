package ventaLibreria.sistema.servicios;

import java.util.List;

import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;


//Se crea la interfas donde se encuentra las operaciones generales que realizara el programa
public interface IBiblioteca {

	
	
	/*** Metodos para categoria Libros */	
	
	//Se crea un metodo que no retorna nada tipo void y solo es para ingresar como parametros informacion 
	//Se adiciona libro a base de datos
		public void adicionarLibro(int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
		
	
		
	//Se crea metodo para actualizar un libro, donse se realizara la operacion si la referencia es encontrada
		public Libros actualizarLibro(String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
	
		
	
	//Se crea metodo para eliminar un libro dependiendo de la referencia que se le pase	
		public Libros eliminarLibro(String referenciaProducto);
		
		
     //Se crea un metodo para poder ingresar lo que se tiene dentro de base de datos a la Lista de Libros
	//Se traen todos los registros de basede datos tipo libro
		public List<Libros> adicionarBaseLibrosToList(int tipoProducto);
		
		
		//Se crea un metodo para vender un libro, en otras palabras se modifica la cantidad actual de un libro
		public Libros venderLibro(String referenciaProducto,int cantidadVenta);
		
		
		
	
	//Se crea un metodo que retorna un objeto de clase Libros y recibe como parametros un String 
		public Libros consultarLibroByNombre(String nombre);		
		
		
		
		
	/*** Metodos para categoria Revistas */	
		
	//Metodo no me retorna nada, solo es para ingresar un objeto de clase Revistas por medio de parametros 	
		public void adicionarRevista (int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
	
	
	
	//Se crea metodo que me devolvera una lista de objeto clase Revistas
	public List<Revistas> obtenerInventarioRevistas();
	
	
		
	
	/*** Metodos para categoria Articulos Cientificos */	
	
	//Se crea metodo para agregar un articulo cientifico
	public void adicionarArtCientifico(int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto);
	
	
	//Obtener le inventario completo de articulos
	public List<ArtCientificos> obtenerInventarioArticulosCientificos();
	
	

	
	
	
}
