package ventaLibreria.sistema.logica;

import java.util.ArrayList;
import java.util.List;

import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;



public class InventarioLibreria {
	
	
	//Se crea un atributo tipo lista de objeto de clase Libros llamada lstLibros
	private List<Libros> lstLibros;
	
	//Se crea un atributo tipo lista de clase Revistas
	private List<Revistas> lstRevistas;

	
	//Atributo de tipo lista de clase Articulos Cientificos
	private List<ArtCientificos> lstArtCientificos;
	
	
	//Se inicializa esta lista para poder ser utilizada y quede activa para operar y funcionar
	//Si no se inicializa no podemos modificarla
	public InventarioLibreria() {
		super();
		this.lstLibros = new ArrayList<Libros>();
		this.lstRevistas = new ArrayList<Revistas>();
		this.lstArtCientificos = new ArrayList<ArtCientificos>();
	}

	
	
	
	/*** Categoria Libros */
	
	//Metodo que no retorna nada y sirve para  ingresar un nuevo libro a la lista lstLibros donde recibe como parametros un objeto Libros llamado libro
	public void IngresarLibro(Libros libro)
	{
		
		//Condicion, si se recibe como parametro algo entonces se procede a ingresar a la lista y agregar un nuevo objeto
		if(libro != null)
		{
			this.lstLibros.add(libro);
		}else {
			this.lstLibros.add(null);
		}
		
		
	}
	
	
	
	//Este metodo sirve para traer la lista e instanciarla en cualquier clase que se necesite 
	//para poder manipularla como se quiera 
	public List<Libros> obtenerLibros(){
		
		//Se retorna la lista lstLibros
		return this.lstLibros;
		
	}
	
	

	
	
	
	//Este metodo es para obtener un objeto de la lista Libros si coincide el nombre pasado por parametros
	//el cual me retornara el nodo que fue consultado en la lista lstLibros
	
	public Libros getLibrosByNombre(String nombre) {
		
		
		
		if(nombre != null) {
			
			
			Libros libroByNombre;
			
			for(int i = 0; i < lstLibros.size(); i++) {
				
				libroByNombre = lstLibros.get(i);
				
				if(libroByNombre.getNombreProducto().equals(nombre)) {
					
					return libroByNombre;
				}
				
			}
			
			
		}
		return null;
		
	}
	
	
	
	
	/*** Categoria Revistas */
	
	//Metodo para agregar un nuevo objeto de clase revistas donde se recibe por parametros
		public void IngresarRevista(Revistas revista)
		{
			
			//condicion para agregar un nodo a la lista Revistas
			if(revista != null)
			{
				this.lstRevistas.add(revista);
			}else {
				this.lstRevistas.add(null);
			}
			
			
		}
	
	
	//Metodo que retorna la lista revistas
	public List<Revistas> obtenerRevistas()
	
	{
		return this.lstRevistas;
	}
	
	
	
	/*** Categoria Articulos Cientificos */
	
	//Se crea un metodo para agregar un articulo cientifico 
	
	public void IngresarArtCientifico (ArtCientificos artcientifico)
	{
		
		if(artcientifico != null) {
			this.lstArtCientificos.add(artcientifico);
		}else {
			this.lstArtCientificos.add(null);
		}
			
		
	}
	
	
	//Metodo que retorna una lista de tipo clase ArtCientificos
	public List<ArtCientificos> obtenerArticulos(){
		
		return this.lstArtCientificos;
	}
	
	

	
	
}
