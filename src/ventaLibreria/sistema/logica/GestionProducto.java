package ventaLibreria.sistema.logica;


import java.util.ArrayList;
import java.util.List;


import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;
import ventaLibreria.sistema.persistencia.dao.LibrosDao;




public class GestionProducto {
	
	
	/***Libros*/
	
	//Se crea un metodo para crear un nuevo libro de clase Libros
	
	public Libros crearLibro(int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		Libros libro = this.obtenerLibroByRef(referenciaProducto);
		
		
		if(libro == null || libro.getReferenciaProducto() == null)
		
		
		//Se crea una variable libro de tipo clase Libros donde se le asigna un objeto de clase Libros con los parametros recibidos dentro del metodo crearLibro
		libro = new Libros(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto,
				edicionProducto, referenciaProducto);
		
		LibrosDao libDao = new LibrosDao();
		
		libDao.insertarLibro(libro);
		
		
		return libro;
		
	}
	
	
	
	
	//Metodo para obtener un libro segun el tipo de referencia que se entregue por parametros
	public Libros obtenerLibroByRef(String referenciaProducto) {
		
			
		Libros lib;

		
		LibrosDao libDao = new LibrosDao();
		
		
		
		lib = libDao.buscarLibroByReferencia(referenciaProducto);
		
		
		return lib;
		
		
	}
	
	
	
	//Este metodo me retorna una lista que contiene los registros de base de datos
	public List<Libros> crearlstLibrosOFBase(int tipoProducto ){
		
		//Se crea una lista tipo Libros para guardar todos los libros de base de datos
		List<Libros> listaLibros = new ArrayList<Libros>();
		
		//Se instancia un objeto tipo DAO  de la clase LibrosDao para ejecutar sus metodos
		//y obtener informacion
		LibrosDao libDao = new LibrosDao();
		
		//la Lista sera igual a una operacion realizada por un metodo de la clase
		//LibrosDao donde se le pasara como parametro tipoProducto que es un numero entero
		listaLibros = libDao.agregarProductosTOlstLibros(tipoProducto);
		
		//Luego retornaremos ese resultado que contiene la lista 
		//con todos los registros que sean de tipo libro 
		return listaLibros;
		
	}
	
	
	
	
	//Metodo para modificar los valores de un libro en base de datos
	public Libros modificarLibro(String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		
		
		Libros libro = this.obtenerLibroByRef(referenciaProducto);
		
		
		
		if(libro != null && libro.getReferenciaProducto() != null) {
		
			libro.setPrecioProducto(precioProducto);
			libro.setCantidadProducto(cantidadProducto);
			libro.setPrecioProducto(precioProducto);
			libro.setAutorProducto(autorProducto);
			libro.setEdicionProducto(edicionProducto);
			
			
			LibrosDao libDao = new LibrosDao();
			
			
			
			if(!libDao.actualizarLibro(libro))
				libro = null;
			
		
		}
		
		return libro;
		
	}
	
	
	
	//Metodo para eliminar un libro de la base de datos por medio de la referencia
	public Libros quitarLibro(String referenciaProducto) {
		
		
		Libros libro = this.obtenerLibroByRef(referenciaProducto);
		
		if(libro != null && libro.getReferenciaProducto() != null) {
			
			
			LibrosDao libDao = new LibrosDao();
			
			libDao.eliminarLibro(libro);
			
		}
		
		
		return libro;
	}
	
	
	
	
	//Metodo para vender un libro, esto resta la cantidad actual con la cantidad ingresada por parametro
	public Libros ventaLibro(String referenciaProducto, int cantidadVenta)
	{
		
		
		Libros libro = this.obtenerLibroByRef(referenciaProducto);
		
		
		
		if(libro != null && libro.getReferenciaProducto() != null) {
		
		int CantidadActualLibro = 	libro.getCantidadProducto();
		
		int operacionRestaLibro = (CantidadActualLibro - cantidadVenta);
		
		libro.setCantidadProducto(operacionRestaLibro);
		
		LibrosDao libDao = new LibrosDao();
		
		libDao.restarCantLibro(libro);
		
			
		}
		
		
		return libro;
		
	}
	
	
	
	
	
	
	
	
	
	
	/***Revistas*/
	//Se crea un metodo para guardar un objeto tipo clase revista 
	public Revistas crearRevista (int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		//esta variable revista guarda lo que recibe por parametros del metodo crear revista
		Revistas revista = new Revistas(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto,
				edicionProducto, referenciaProducto);
		
		return revista;
		
	}
	
	/***Articulos Cientificos*/
	

	public ArtCientificos crearArticuloCientifico(int tipoProducto, String nombreProducto, int cantidadProducto,
			float precioProducto, String autorProducto, int edicionProducto, String referenciaProducto) {
		
		ArtCientificos articuloCientifico = new ArtCientificos(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto,
				edicionProducto, referenciaProducto);
		
		return articuloCientifico;
		
				
	}
	

	
	
	
	
	

}
