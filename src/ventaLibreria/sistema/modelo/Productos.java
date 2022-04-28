package ventaLibreria.sistema.modelo;

public class Productos {

	// Atributos de los productos de la libreria

	private int tipoProducto;

	private String nombreProducto;

	private int cantidadProducto;

	private float precioProducto;

	private String autorProducto;

	private int edicionProducto;

	private String referenciaProducto;

	// Creacion de constructor de clase Productos

	public Productos() {
		this.tipoProducto = 0;
		this.nombreProducto = new String();
		this.cantidadProducto = 0;
		this.precioProducto = 0f;
		this.autorProducto = new String();
		this.edicionProducto = 0;
		this.referenciaProducto = new String();
		
	}

	public Productos(int tipoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String autorProducto, int edicionProducto, String referenciaProducto) {

		super();

		this.tipoProducto = tipoProducto;
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.precioProducto = precioProducto;
		this.autorProducto = autorProducto;
		this.edicionProducto = edicionProducto;
		this.referenciaProducto = referenciaProducto;

	}

	// Creacion de getters and setters atributos de clase Producto

	public int getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public float getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getAutorProducto() {
		return autorProducto;
	}

	public void setAutorProducto(String autorProducto) {
		this.autorProducto = autorProducto;
	}

	public int getEdicionProducto() {
		return edicionProducto;
	}

	public void setEdicionProducto(int edicionProducto) {
		this.edicionProducto = edicionProducto;
	}

	public String getReferenciaProducto() {
		return referenciaProducto;
	}

	public void setReferenciaProducto(String referenciaProducto) {
		this.referenciaProducto = referenciaProducto;
	}

}// Final clase Productos
