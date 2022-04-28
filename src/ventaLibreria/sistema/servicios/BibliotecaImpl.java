package ventaLibreria.sistema.servicios;

import java.util.ArrayList;
import java.util.List;

import ventaLibreria.sistema.logica.GestionProducto;
import ventaLibreria.sistema.logica.InventarioLibreria;
import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;

public class BibliotecaImpl implements IBiblioteca {
	
	
	
	
	//Se crean dos atributos tipo clase para poder traer los metodos que se encuentran en las clases GestionProducto  y InventarioLibreria
	private GestionProducto gestionproducto;
	private InventarioLibreria inventariolibreria;
	


	// Este Constructor me inicializa los atributos para poder traer la informacion que se encuentran en las  clases InventarioLibreria  y GestionProducto
	//entonces la clase BibliotecaImpl compartira esa informacion
	public BibliotecaImpl() {
		super();
		this.gestionproducto = new GestionProducto();
		this.inventariolibreria = new InventarioLibreria();


	}


	
	
	/*** Metodos para categoria Libros */	


	//Este atributo lo que hara es crear un objeto libro con todos sus parametros completos traidos desde la interfas IBiblioteca
	//Al guardar el objeto en la variable libro ira hasta la clase inventariolibreria e ingresara al metodo IngresarLibro para pasarle 
	//como parametro el objeto libro que se creo anteriormente. Esta variable libro contiene toda la informacion necesaria 
	//para poder ser agregada en el invetario de almacenamiento lista
	
	@Override
	public void adicionarLibro(int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
			//Esta variable libro sera igual a una operacion dentro de la clase gestionproducto y llamara al metodo crearLibro donde le pasaremos como parametros
			//los parametros que escribimos en el metodo adicionarLibro de la interfas Ibiblioteca 
			Libros libro = gestionproducto.crearLibro(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto, referenciaProducto);
			
			//Ahora lo que tenemos almacenado en la variable libro iremos hasta la clase inventariolibreria y le pasaremos como parametro esta variable 
			//al metodo IngresarLibro, entonces con esto se nos agregara a la lista de libros que esta creada en la clase inventariolibreria
			inventariolibreria.IngresarLibro(libro);
			

		
	}


	//Este metodo se comunicara con la clase Gestion de Producto para obtener una lista con 
	//todos los registros de base de datos que sean libros
	@Override
	public List<Libros> adicionarBaseLibrosToList(int tipoProducto) {
		
		//Se crea una lista para guardar los registros 
		List<Libros> lstLibros = new ArrayList<Libros>();
		
		//la lista sera igual a una operacion que se ecuentra en gestionproducto
		 lstLibros = gestionproducto.crearlstLibrosOFBase(tipoProducto);
		
		 //Retornamos una lista de tipo Libros
		return lstLibros;
	}
	
	
	//Metodo para actualizar lo valores principales de un registro de libros
	@Override
	public Libros actualizarLibro(String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		Libros libro = gestionproducto.modificarLibro( nombreProducto,  cantidadProducto,  precioProducto,
			autorProducto, edicionProducto,  referenciaProducto);
		
		return libro;
	}
	
	
	//Metodo para eliminar un registro de libro entregando su referencia 
	@Override
	public Libros eliminarLibro(String referenciaProducto) {
		
		Libros libro = gestionproducto.quitarLibro(referenciaProducto);
		
		
		return libro;
	}


	//Metodo para vender un libro, este permite restar la cantidad ingresada por parametros
	//de la cantidad que se tiene en la base de datos
	@Override
	public Libros venderLibro(String referenciaProducto, int cantidadVenta) {
		
		
		Libros libro = gestionproducto.ventaLibro(referenciaProducto,cantidadVenta);
		
		return libro;
	}

	

	
	/***Solamente se consultara la informacion dentro de una lista actualmente con informacion */
	//Este metodo me retornara un objeto de clase Libros donde se le pasara como parametros una variable String
	//al pasarle el parametros de tipo string el me retornara el resultado de una operacion de un metodo que se encuentra en 
	//la clase de inventariolibreria
	@Override
	public Libros consultarLibroByNombre(String nombre) {
		
		
		//Aca me retorna entonces una operacion del metodo getLibrosByNombre que se encuentra en la clase inventariolibreria
		//donde para que se ejecute esa operacion debemos pasarle un parametro String, seria el mismo parametros que pasamos en 
		//la interfaz cuando se invoca. El parametro que le pasamos es nombre, el mismo que esta en el metodo consultarLibroByNombre
		//que fue el que le pasamos
		return inventariolibreria.getLibrosByNombre(nombre);
		
		//Entonces este metodo me guardara en memoria la operacion que anteriormente se realizo
		
		
	}


	
	
	
	/*** Metodos para categoria Revistas */	

	//Metodo para agregar un objeto revistas a el inventario de la libreria
	@Override
	public void adicionarRevista(int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {
		
		Revistas revista = gestionproducto.crearRevista(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto, referenciaProducto);
		
		inventariolibreria.IngresarRevista(revista);
		
	}


	

	@Override
	public List<Revistas> obtenerInventarioRevistas() {
		
		
		
		return inventariolibreria.obtenerRevistas();
	}


	/*** Metodos para categoria Articulos cientificos */
	
	
	//Se agrega un articulo cientifico
	@Override
	public void adicionarArtCientifico(int tipoProducto, String nombreProducto, int cantidadProducto,
			float precioProducto, String autorProducto, int edicionProducto, String referenciaProducto) {
		
		ArtCientificos articuloCientifico = gestionproducto.crearArticuloCientifico(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto, referenciaProducto);
		
		inventariolibreria.IngresarArtCientifico(articuloCientifico);
		
		
	}

	

	//Se obtiene la lista actual de Articulos cientificos
	@Override
	public List<ArtCientificos> obtenerInventarioArticulosCientificos() {
		
		return inventariolibreria.obtenerArticulos();
		
	}









	



	





















	

	
	





	
	
	
	
	
}
