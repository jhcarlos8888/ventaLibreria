package ventaLibreria.sistema.vista;



import java.util.List;
import java.util.Scanner;


import ventaLibreria.sistema.modelo.ArtCientificos;
import ventaLibreria.sistema.modelo.Libros;
import ventaLibreria.sistema.modelo.Revistas;
import ventaLibreria.sistema.servicios.BibliotecaImpl;
import ventaLibreria.sistema.servicios.IBiblioteca;

public class VentaProductos {

	
	

	
	
	//Metodo main donde correra el programa
	public static void main(String[] args) {

		
		
		
		/***
		 *  Notas adicionales del programa para realizar operaciones
		 * 	
		 *  Codigo para traer un objeto por medio del nombre
		 *  
		 *  Esta linea de codigo es para traer un objeto de una lista Libros por medio de su nombre 
			Si el nombre entregado por parametros coincide con el de la lista lstLibros se guardara en la variable guardarObjetoByNombre
			==> Libros guardarObjetoByNombre = operacionesProductos.consultarLibroByNombre("Cien años de Soledad");
		    Ahora podemos manipular el objeto que tengamos dentro de la variable tipo clase libros llamada guardarObjetoByNombre
		    en este caso entonces vamos a imprimir la cantidad de libros que tiene ese objeto que llamamos 
		    ==> System.out.println("La cantidad del producto consultado es " + guardarObjetoByNombre.getCantidadProducto());
		    
		    otra forma de simplificar scanner
			==> Scanner nombreVariable = new Scanner(System.in);

		 * 
		 */

		
		
		// Se declara variable para guardar opcion del menu principal
		int escogerOpcionCategorias;

		// Se declara variable para guardar opcion escogida menu libros
		int escogerOpcionCrudLibros;

		// Se declara variable para guardar opcion escogida menu Revistas
		int escogerOpcionCrudRevistas;

		// Se declara variable para guardar opcion escogida menu Articulos
		int escogerOpcionCrudArticulos;

		// Se declara e inicializa variable booleana para salir del menu principal
		boolean doneMenuPrincipal = false;

		// Se declara e inicializa variable booleana para salir del menu crud Libros
		boolean doneMenuLibros = false;

		// Se declara e inicializa variable booleana para salir del menu crud Revistas
		boolean doneMenuRevistas = false;

		// Se declara e inicializa variable booleana para salir del menu crud Articulos
		// Cientificos
		boolean doneMenuArticulos = false;

		// ----------------------------Inventario actual de las categorias
		
		
		//Se instancia un objeto de clase Interfas llamado operacionesProductos y se inicializa con sus metodos donde tienen las operaciones a realizar
		IBiblioteca operacionesProductos = new BibliotecaImpl();

		
		//Se adiciona a la lista lstLibros todos los registros que se tienen en la base de Datos MariaDB
		List<Libros> lstLibros; //= operacionesProductos.adicionarBaseLibrosToList(1);
		
		
		
		
		
		
		// Revistas agregadas cuando arranca el programa
		
		operacionesProductos.adicionarRevista(2, "National Geographi", 3, 26000f, "Hernesto Henao",2015, "REF125");
		operacionesProductos.adicionarRevista(2, "Motor", 5, 15000f, "Hernesto Henao",2023, "REF126");
		
		
		//Luego se llama la lista para poder manipularla dentro del main
		List<Revistas> lstRevistas = operacionesProductos.obtenerInventarioRevistas();
		

		
		// Articulos agredados cuando inicia el programa
		operacionesProductos.adicionarArtCientifico(3, "Paper sobre Combustión Interna", 2,65000f, "Franco Ruiz", 2013,"Ref2548");
		operacionesProductos.adicionarArtCientifico(3,"Paper Programación orienta a Objetos ", 3, 48000f, "Franco Ruiz", 2013,"Ref2549");
	
		
		//Se llama la lista de la clase ArtCientificos para poder manipularla 
		List<ArtCientificos> lstArtCientificos = operacionesProductos.obtenerInventarioArticulosCientificos();
		
		
		// -------------------------Comienzo de Menus para realizar operaciones--------------

		
		
		// Metodo do-While para mostrar siempre el menu Principal
		do {

			// Menu principal para ingresar a categorias
			System.out.println("*/*/*/*/*/*//*/*/*MENU PRINCIPAL---SISTEMA JCHB*/*/*/*/*/*//*/*/*");
			System.out.println();
			System.out.println("Elija la categoria donde desea ingresar");
			System.out.println("1. Libros");
			System.out.println("2. Revistas");
			System.out.println("3. Articulos Cientificos");
			System.out.println("4. Salir del programa");
			System.out.println();
			System.out.print("ingrese opcion:  ");
			

			
			// Variable Scanner para obtener datos de opcion categorias
			escogerOpcionCategorias = new Scanner(System.in).nextInt();
			
			
			

			// Comienzo Swith con variable guardada Menu principal
			switch (escogerOpcionCategorias) {
			
			

			// ******************************************************** CATEGORIA LIBROS ***********************************************************************

			case 1:

				
				
				// Metodo do-while Menu categoria Libros
				do {
					System.out.println();
					System.out.println("*/*/*/*/*/*//*/*/*--CATEGORIA LIBROS--*/*/*/*/*/*//*/*/*");
					System.out.println();
					System.out.println("Selecciona el numero de la opcion requerida");
					System.out.println();
					System.out.println("1. Ingresar libro");
					System.out.println("2. Modificar libro existente");
					System.out.println("3. Eliminar libro existente");
					System.out.println("4. Ver todos los libros");
					System.out.println("5. Vender un libro");
					System.out.println("6. Ir al menu principal");
					System.out.println();
					System.out.print("ingrese opcion:  ");

					// Variable que recoge la opcion de menu crud Libros
					escogerOpcionCrudLibros = new Scanner(System.in).nextInt();

					switch (escogerOpcionCrudLibros) {

					case 1:

						
						
						
						// Opcion para registrar un nuevo libro
						System.out.println();
						System.out.println("Nuevo registro de libro");
						System.out.println();
						
						System.out.println("Ingrese el numero 1 para crear un producto libro en base de datos: ");
						int tipoProducto = new Scanner(System.in).nextInt();
						
						System.out.println("Nombre de Libro: ");
						String nombreProducto = new Scanner(System.in).nextLine();

						System.out.println("Cantidad de libros a agregar: ");
						int cantidadProducto = new Scanner(System.in).nextInt();

						System.out.println("Cual es el precio del libro(Ingrese solamente numeros): ");
						float precioProducto = new Scanner(System.in).nextFloat();
						
						System.out.println("Cual es el autor del libro: ");
						String autorProducto = new Scanner(System.in).nextLine();
						
						System.out.println("Cual es la edicion del libro(Ingrese el año de creacion): ");
						int edicionProducto = new Scanner(System.in).nextInt();
						
						System.out.println("Ingrese la referencia del Libro(Se ingrea un codigo Numeros y Letras): ");
						String referenciaProducto = new Scanner(System.in).nextLine();
						
						
						//Se llama a la interfas IBiblioteca y a su metodo adicionar libro para agregar un nuevo libro
						operacionesProductos.adicionarLibro(tipoProducto, nombreProducto, cantidadProducto,precioProducto, autorProducto, edicionProducto, referenciaProducto);
						
						
						System.out.println();
						System.out.println("Tipo de producto: (Libro)  agregado satisfactoriamente");
						System.out.println();

						break; // Final opcion ingresar libro

					case 2:
						
						//Se injecta la lista con datos actualizados
						lstLibros = operacionesProductos.adicionarBaseLibrosToList(1);	
					
						// Opcion para modificar libro
						
						System.out.println();
						System.out.println("Modificar Libro Existente");
						System.out.println();
						System.out.println();
						System.out.println("Listado de libros actuales, cantidad: " + lstLibros.size()); 
						System.out.println();
						
						
						
							for(int i = 0; i < lstLibros.size(); i++) { 
								  System.out.println("--------------------------Campo Libro-------------------------------------------------------------------------" ); 
								  Libros totalLibros = lstLibros.get(i); 
								  System.out.println("Campo " + i+"," + " Tipo Producto: "+ totalLibros.getTipoProducto()+"," + " Nombre: " + totalLibros.getNombreProducto()+"," + " Cantidad de libros: " +totalLibros.getCantidadProducto()+"," + " Precio: " + totalLibros.getPrecioProducto()+"," + " Autor: " + totalLibros.getAutorProducto()+"," + " Edicion: " + totalLibros.getEdicionProducto()+"," + " Referencia: " +totalLibros.getReferenciaProducto()+ " ");   
								  System.out.println(); 
							   }
							
									
						
						if(lstLibros.size()>0) {
							
							  System.out.println(); 
							  System.out.println("Observe cual es la referencia del producto a modificar"); 
							  System.out.println();
							  
							  //tipoProducto, nombreProducto, cantidadProducto,precioProducto, autorProducto, edicionProducto, referenciaProducto
							  
							  System.out.println("Ingrese la referencia del producto a modificar: "); 
							  String refProducto = new Scanner(System.in).nextLine();
							  
							
							  System.out.println("nuevo nombre de Libro: "); 
							  String newNombreProducto = new Scanner(System.in).nextLine();
							  
							  System.out.println("nueva cantidad de libros a agregar: "); 
							  int newCantidadProducto = new Scanner(System.in).nextInt();
							  
							  System.out.println("Cual es el precio del libro:(Ingrese solamente numeros) "); 
							  float newPrecioProducto = new Scanner(System.in).nextFloat();
							  
							  System.out.println("Nuevo autor de Libro: "); 
							  String newAutorProducto = new Scanner(System.in).nextLine();
							  
							  System.out.println("Nueva edicion del libro:(Ingrese el año de creacion) "); 
							  int newEdicionProducto = new Scanner(System.in).nextInt();
							  
							  
							  operacionesProductos.actualizarLibro(newNombreProducto, newCantidadProducto, newPrecioProducto, newAutorProducto, newEdicionProducto, refProducto);

							  
							  
							  
							  System.out.println(); 
							  System.out.println("Tipo de producto:  (Libro) modificado satisfactoriamente");
							  System.out.println();
							  
						}else {
							System.out.println("No tenemos ningun libro a modificar, ingrese por favor algun libro");
						}
						
					
						  
						break;

					case 3:
						
						  //Se injecta la lista con datos actualizados
						  lstLibros = operacionesProductos.adicionarBaseLibrosToList(1);	
						
						  //Opcion para eliminar un registro o nodo completo de un objeto libro
						  System.out.println();
						  System.out.println("Listado de libros actuales, cantidad: " + lstLibros.size()); 
						  System.out.println();
						  
						  
							for(int i = 0; i < lstLibros.size(); i++) { 
								  System.out.println("--------------------------Campo Libro-------------------------------------------------------------------------" ); 
								  Libros totalLibros = lstLibros.get(i); 
								  System.out.println("Campo " + i+"," + " Tipo Producto: "+ totalLibros.getTipoProducto()+"," + " Nombre: " + totalLibros.getNombreProducto()+"," + " Cantidad de libros: " +totalLibros.getCantidadProducto()+"," + " Precio: " + totalLibros.getPrecioProducto()+"," + " Autor: " + totalLibros.getAutorProducto()+"," + " Edicion: " + totalLibros.getEdicionProducto()+"," + " Referencia: " +totalLibros.getReferenciaProducto()+ " "); 
								  System.out.println(); 
							   }
						  
							
						if(lstLibros.size()>0) {
							  System.out.println(); 
							  System.out.println("Indique la referencia del producto que se requiere eliminar"); 
							  System.out.println();
							  
							  
							  
							  
							  String referencialibroEliminar = new Scanner(System.in).nextLine();
							  
							  System.out.println(); 
							  System.out.println("Libro eliminado de la base");
							  
							  operacionesProductos.eliminarLibro(referencialibroEliminar);
							
							  
							  //lstLibros.remove(campolibroEliminar); 
							  System.out.println();
							  
						}else {
							System.out.println("No tenemos ningun libro a eliminar, ingrese por favor algun libro");
						}

						  
						  break;
						 

					case 4:
						// Opcion para ver el inventario de libros
						
						//Se injecta lista con datos desde la base de datos
						lstLibros = operacionesProductos.adicionarBaseLibrosToList(1);
						
						System.out.println();
						System.out.println("Inventario de Libros");
						System.out.println();
						System.out.println("Listado de libros actuales, cantidad: " + lstLibros.size()); 
						System.out.println();
						
						
						if(lstLibros.size()>0) {
							for(int i = 0; i < lstLibros.size(); i++) { 
								  System.out.println("--------------------------Campo Libro-------------------------------------------------------------------------" ); 
								  Libros totalLibros = lstLibros.get(i); 
								  System.out.println("Campo " + i+"," + " Tipo Producto: "+ totalLibros.getTipoProducto()+"," + " Nombre: " + totalLibros.getNombreProducto()+"," + " Cantidad de libros: " +totalLibros.getCantidadProducto()+"," + " Precio: " + totalLibros.getPrecioProducto()+"," + " Autor: " + totalLibros.getAutorProducto()+"," + " Edicion: " + totalLibros.getEdicionProducto()+"," + " Referencia: " +totalLibros.getReferenciaProducto()+ " "); 
								  System.out.println(); 
							   }
									
						}else {
							System.out.println("No tenemos ningun libro a consultar, ingrese por favor algun libro");
						}
							
							
							
						
						
						break;
						
						
						
					case 5:

						
						 //Opcion para vender un libro - Se descuenta la cantidad de los libros
						
						 //Se injecta lista con datos desde la base de datos
						 lstLibros = operacionesProductos.adicionarBaseLibrosToList(1);

						
						  System.out.println(); 
						  System.out.println("Venta de libros, revise la referencia que desea vender"); 
						  System.out.println();
						  System.out.println("Listado de libros actuales, cantidad: " + lstLibros.size()); 
						  System.out.println();
						  
						  		
								
								for(int i = 0; i < lstLibros.size(); i++) { 
									  System.out.println("--------------------------Campo Libro-------------------------------------------------------------------------" ); 
									  Libros totalLibros = lstLibros.get(i); 
									  System.out.println("Campo " + i+"," + " Tipo Producto: "+ totalLibros.getTipoProducto()+"," + " Nombre: " + totalLibros.getNombreProducto()+"," + " Cantidad de libros: " +totalLibros.getCantidadProducto()+"," + " Precio: " + totalLibros.getPrecioProducto()+"," + " Autor: " + totalLibros.getAutorProducto()+"," + " Edicion: " + totalLibros.getEdicionProducto()+"," + " Referencia: " +totalLibros.getReferenciaProducto()+ " "); 
									  System.out.println(); 
								   }
								
								
								
						if(lstLibros.size()>0) {
							
							  System.out.println(); 
							  System.out.println("Indique la referencia del producto que desea Vender");
							  System.out.println();
							  
							 
							  
							  	  String refVentaLibro = new Scanner(System.in).nextLine();
							  
							 
								  System.out.println();
								  System.out.println("Cuantas unidades quiere vender de ese libro ? ");
								  System.out.println();
								  
								  int cantidadProductoVender = new Scanner(System.in).nextInt();
								  
								  
								  operacionesProductos.venderLibro(refVentaLibro, cantidadProductoVender);
								  
								  
								 // System.out.println("Le quedan " + operacionRestaLibro + " Libros, del producto " + lstLibros.get(campolibroVender).getNombreProducto());  
								  System.out.println();
								  System.out.println("Libro vendido de la base"); 
								  System.out.println(); 
							  

							
						}else {
							System.out.println("No tenemos ningun libro para vender, ingrese por favor algun libro");
						}

						  
						  break;
						  
						  
						 

					case 6:

						// Opcion para salir del menu de Libros
						System.out.println();
						
						doneMenuLibros = true;
						
						break;

					default:
						// Si el usuario no selecciona una opcion correcta
						System.out.println();
						System.out.println("Escoge una opcion correcta del 1 al 6");
						System.out.println();

					}// Final de Switch Menu categoria Libros

				} while (!doneMenuLibros); // Final do-While Menu libros

				break;

//********************************************************               CATEGORIA REVISTAS                   ***********************************************************************/*				

			case 2: //

				// Metodo do-while Menu categoria Revistas
				do {
					System.out.println();
					System.out.println("*/*/*/*/*/*//*/*/*--CATEGORIA REVISTAS--*/*/*/*/*/*//*/*/*");
					System.out.println();
					System.out.println("Selecciona el numero de la opcion requerida");
					System.out.println();
					System.out.println("1. Ingresar revista");
					System.out.println("2. Modificar revista existente");
					System.out.println("3. Eliminar revista existente");
					System.out.println("4. Ver todas las revistas");
					System.out.println("5. Vender una revista");
					System.out.println("6. Ir al menu principal");
					System.out.println();
					System.out.print("ingrese opcion:  ");

					// Variable que recoge la opcion de menu crud revistas
					escogerOpcionCrudRevistas = new Scanner(System.in).nextInt();
					
					
					switch (escogerOpcionCrudRevistas) {

					case 1:

						// Opcion para registrar un nueva Revista
						System.out.println();
						System.out.println("Nuevo registro de Revista");
						System.out.println();
						
						System.out.println("Ingrese numero 2 para ingresar una revista en base de datos ");
						int tipoProducto = new Scanner(System.in).nextInt();
						
						System.out.println("Nombre de Revista: ");
						String nombreProducto = new Scanner(System.in).nextLine();

						System.out.println("Cantidad de Revistas a agregar: ");
						int cantidadProducto = new Scanner(System.in).nextInt();

						System.out.println("Cual es el precio de la  revista: ");
						float precioProducto = new Scanner(System.in).nextFloat();
						
						System.out.println("Autor de la revista: ");
						String autorProducto = new Scanner(System.in).nextLine();
						
						System.out.println("Cual es la edicion de la revista: ");
						int edicionProducto = new Scanner(System.in).nextInt();
						
						System.out.println("Ingrese referencia de la revista ");
						String referenciaProducto = new Scanner(System.in).nextLine();
						

						//Operacion para adicionar una nueva revista
						operacionesProductos.adicionarRevista(tipoProducto, nombreProducto, cantidadProducto,precioProducto, autorProducto, edicionProducto, referenciaProducto);

						System.out.println();
						System.out.println("Tipo de producto: (Revista) agregada satisfactoriamente");
						System.out.println();

						break; // Final opcion ingresar Revista

					case 2:

						// Opcion para modificar Revista

						System.out.println();
						System.out.println("Modificar revista existente");
						System.out.println();
						System.out.println();
						System.out.println("Listado de revistas actuales, cantidad: " + lstRevistas.size()); 
						System.out.println();
						
						

						for (int i = 0; i < lstRevistas.size(); i++) {
							System.out.println("--------------------------Campo Revista-------------------------------------------------------------------------");
							Revistas totalRevistas = lstRevistas.get(i);
							System.out.println("Campo " + i + "," + " Tipo Producto: " + totalRevistas.getTipoProducto() + "," + " Nombre: " + totalRevistas.getNombreProducto() + ","+ " Cantidad de revistas: " + totalRevistas.getCantidadProducto() + ","+ " Precio: " + totalRevistas.getPrecioProducto() + "," + " Autor: "+ totalRevistas.getAutorProducto() + "," + " Edicion: "+ totalRevistas.getEdicionProducto() + "," + " Referencia: "+ totalRevistas.getReferenciaProducto() + " ");
							System.out.println();
						}
						
						if(lstRevistas.size()>0) {
							
							System.out.println();
							System.out.println("Indique el numero del campo donde se encuentra la revista a modificar");
							System.out.println();

							int campoRevistaModificar = new Scanner(System.in).nextInt();

							System.out.println("Nombre de revista: ");
							String newNombreProducto = new Scanner(System.in).nextLine();

							System.out.println("Cantidad de revistas a agregar: ");
							int newCantidadProducto = new Scanner(System.in).nextInt();

							System.out.println("Cual es el precio de la revista: ");
							float newPrecioProducto = new Scanner(System.in).nextFloat();

							lstRevistas.get(campoRevistaModificar).setNombreProducto(newNombreProducto);

							lstRevistas.get(campoRevistaModificar).setCantidadProducto(newCantidadProducto);

							lstRevistas.get(campoRevistaModificar).setPrecioProducto(newPrecioProducto);

							System.out.println();
							System.out.println("Tipo de producto: (Revista) modificada satisfactoriamente");
							System.out.println();
							
						}else {
							System.out.println("No tenemos ninguna revista a Modificar, ingrese por favor alguna revista");
						}


						break;

					case 3:

						// Opcion para eliminar un registro o nodo completo de un objeto revista
						System.out.println();
						System.out.println("Listado de revistas actuales, cantidad: " + lstRevistas.size());
						System.out.println();

						
						for (int i = 0; i < lstRevistas.size(); i++) {
							System.out.println("--------------------------Campo Revista-------------------------------------------------------------------------");
							Revistas totalRevistas = lstRevistas.get(i);
							System.out.println("Campo " + i + "," + " Tipo Producto: " + totalRevistas.getTipoProducto() + "," + " Nombre: " + totalRevistas.getNombreProducto() + ","+ " Cantidad de revistas: " + totalRevistas.getCantidadProducto() + ","+ " Precio: " + totalRevistas.getPrecioProducto() + "," + " Autor: "+ totalRevistas.getAutorProducto() + "," + " Edicion: "+ totalRevistas.getEdicionProducto() + "," + " Referencia: "+ totalRevistas.getReferenciaProducto() + " ");
							System.out.println();
						}

						
						
						if(lstRevistas.size()>0) {
							
							System.out.println();
							System.out.println("Indique el numero del campo donde se encuentra la revista a eliminar");
							System.out.println();

							int campoRevistaEliminar = new Scanner(System.in).nextInt();

							System.out.println();
							System.out.println(
									"Revista eliminada de la base, " + "Registro " + lstRevistas.get(campoRevistaEliminar));
							
							//Codigo eliminar el campo de la revista seleccionada
							lstRevistas.remove(campoRevistaEliminar);
							
							System.out.println();
							
						}else {
							System.out.println("No tenemos ninguna revista a eliminar, ingrese por favor alguna revista");
						}
						


						
						break;

					case 4:

						// Opcion para ver el inventario de Revistas
						System.out.println();
						System.out.println("Inventario de Revistas");
						System.out.println();
						System.out.println("Listado de revistas actuales, cantidad: " + lstRevistas.size());
						System.out.println();
						
						
						if(lstRevistas.size()>0) {
							
							// Recorrido lista revistas actuales
							for (int i = 0; i < lstRevistas.size(); i++) {
								System.out.println("--------------------------Campo Revista-------------------------------------------------------------------------");
								Revistas totalRevistas = lstRevistas.get(i);
								System.out.println("Campo " + i + "," + " Tipo Producto: " + totalRevistas.getTipoProducto() + "," + " Nombre: " + totalRevistas.getNombreProducto() + ","+ " Cantidad de revistas: " + totalRevistas.getCantidadProducto() + ","+ " Precio: " + totalRevistas.getPrecioProducto() + "," + " Autor: "+ totalRevistas.getAutorProducto() + "," + " Edicion: "+ totalRevistas.getEdicionProducto() + "," + " Referencia: "+ totalRevistas.getReferenciaProducto() + " ");
								System.out.println();
							}
							
						}else {
							System.out.println("No tenemos ninguna revista a consultar, ingrese por favor alguna Revista");
						}
												
						
						
						break;

					case 5:

						// Opcion para vender una revista - Se descuenta la cantidad de las revistas
						// segun el campo seleccionado

						System.out.println();
						System.out.println("Venta de revistas, seleccione el campo de la revista que requiere vender");
						System.out.println();
						System.out.println("Listado de revistas actuales, cantidad: " + lstRevistas.size());
						System.out.println();


						// Recorrido lista revistas actuales
						for (int i = 0; i < lstRevistas.size(); i++) {
							System.out.println("--------------------------Campo Revista-------------------------------------------------------------------------");
							Revistas totalRevistas = lstRevistas.get(i);
							System.out.println("Campo " + i + "," + " Tipo Producto: " + totalRevistas.getTipoProducto() + "," + " Nombre: " + totalRevistas.getNombreProducto() + ","+ " Cantidad de revistas: " + totalRevistas.getCantidadProducto() + ","+ " Precio: " + totalRevistas.getPrecioProducto() + "," + " Autor: "+ totalRevistas.getAutorProducto() + "," + " Edicion: "+ totalRevistas.getEdicionProducto() + "," + " Referencia: "+ totalRevistas.getReferenciaProducto() + " ");
							System.out.println();
						}

						
						if(lstRevistas.size()>0) {
							
							System.out.println();
							System.out.println("Indique el numero del campo: ");
							System.out.println();

							int campoRevistaVender = new Scanner(System.in).nextInt();

							System.out.println();
							System.out.println("Cuantas unidades quiere vender de esa revista ? ");
							System.out.println();

							int cantidadProductoRevistaVender = new Scanner(System.in).nextInt();

							int cantidadActualRevista = lstRevistas.get(campoRevistaVender).getCantidadProducto();

							int operacionRestaRevista = (cantidadActualRevista - cantidadProductoRevistaVender);

							// Asignacion de nueva cantidad de revistas segun el campo seleccionado
							lstRevistas.get(campoRevistaVender).setCantidadProducto(operacionRestaRevista);

							System.out.println("Le quedan " + operacionRestaRevista + " revistas, del producto: " + lstRevistas.get(campoRevistaVender).getNombreProducto());

							System.out.println();
							System.out.println("Revista vendida de la base, Registro de venta: " + lstRevistas.get(campoRevistaVender));
							System.out.println();
							
						}else {
							System.out.println("No tenemos ninguna revista a eliminar, ingrese por favor alguna revista");
						}
							

						
						break;

					case 6:

						// Opcion para salir del menu de Revistas
						System.out.println();
						doneMenuRevistas = true;
						break;

					default:
						// Si el usuario no selecciona una opcion correcta
						System.out.println();
						System.out.println("Escoge una opcion correcta del 1 al 6");
						System.out.println();

					}// Final de Switch Menu categoria Revistas

				} while (!doneMenuRevistas); // Final do-While Menu Revistas

				break;

//********************************************************               CATEGORIA ARTICULOS CIENTIFICOS                 ***********************************************************************/*				

			case 3:

				// Metodo do-while Menu categoria articulos cientificos
				do {
					System.out.println();
					System.out.println("*/*/*/*/*/*//*/*/*--CATEGORIA ARTICULOS CIENTIFICOS--*/*/*/*/*/*//*/*/*");
					System.out.println();
					System.out.println("Selecciona el numero de la opcion requerida");
					System.out.println();
					System.out.println("1. Ingresar articulo");
					System.out.println("2. Modificar articulo existente");
					System.out.println("3. Eliminar articulo existente");
					System.out.println("4. Ver todos los articulos");
					System.out.println("5. Vender un articulo");
					System.out.println("6. Ir al menu principal");
					System.out.println();
					System.out.print("ingrese opcion:  ");

					// Variable que recoge la opcion de menu crud Articulos
					escogerOpcionCrudArticulos = new Scanner(System.in).nextInt();

					switch (escogerOpcionCrudArticulos) {

					case 1:

						
						// Opcion para registrar un nuevo Articulo
						System.out.println();
						System.out.println("Nuevo registro de articulo");
						System.out.println();
						
						
						System.out.println("Ingrese el numero 3 para registrar un articulo en base de datos ");
						int tipoProducto = new Scanner(System.in).nextInt();
						
						System.out.println("Nombre de articulo cientifico: ");
						String nombreProducto = new Scanner(System.in).nextLine();

						System.out.println("Cantidad de articulos a agregar: ");
						int cantidadProducto = new Scanner(System.in).nextInt();

						System.out.println("Cual es el precio del articulo cientifico: ");
						float precioProducto = new Scanner(System.in).nextFloat();
						
						
						System.out.println("Autor de articulo cientifico: ");
						String autorProducto = new Scanner(System.in).nextLine();
						
						System.out.println("Cual es la edicion del articulo: ");
						int edicionProducto = new Scanner(System.in).nextInt();
						
						System.out.println("Referencia de  articulo cientifico: ");
						String referenciaProducto = new Scanner(System.in).nextLine();
						
						//Codigo para adicionar un nuevo articulo cientifico
						operacionesProductos.adicionarArtCientifico(tipoProducto, nombreProducto, cantidadProducto, precioProducto, autorProducto, edicionProducto, referenciaProducto);

						System.out.println();
						System.out.println("Tipo de producto: (Articulo Cientifico)  agregado satisfactoriamente");
						System.out.println();

						break; // Final opcion ingresar Articulo Cientifico
						
						

					case 2:

						// Opcion para modificar Articulo Cientifico

						System.out.println();
						System.out.println("Modificar articulo existente");
						System.out.println();
						System.out.println();
						System.out.println("Listado de articulos cientificos actuales, cantidad: " + lstArtCientificos.size());
						System.out.println();
						
						
						
						// Recorrido de lista Articulos Cientificos

						for (int i = 0; i < lstArtCientificos.size(); i++)

						{
							System.out.println(
									"--------------------------Campo Articulos Cientificos-------------------------------------------------------------------------");
							ArtCientificos totalArtCientificos = lstArtCientificos.get(i);
							System.out.println("Campo " + i + "," + " Tipo Producto: " + totalArtCientificos.getTipoProducto()+ "," + " Nombre: " + totalArtCientificos.getNombreProducto() + ","+ " Cantidad de libros: " + totalArtCientificos.getCantidadProducto() + ","+ " Precio: " + totalArtCientificos.getPrecioProducto() + "," + " Autor: "+ totalArtCientificos.getAutorProducto() + "," + " Edicion: "+ totalArtCientificos.getEdicionProducto() + "," + " Referencia: "+ totalArtCientificos.getReferenciaProducto() + " ");
							System.out.println();
						}
						
						
						
						if(lstArtCientificos.size()>0){
							
							System.out.println();
							System.out.println("Indique el numero del campo donde se encuentra el articulo a modificar");
							System.out.println();

							int campolArtModificar = new Scanner(System.in).nextInt();

							System.out.println("Nombre de articulo cientifico: ");
							String newNombreProducto = new Scanner(System.in).nextLine();

							System.out.println("Cantidad de articulos a agregar: ");
							int newCantidadProducto = new Scanner(System.in).nextInt();

							System.out.println("Cual es el precio del articulo: ");
							float newPrecioProducto = new Scanner(System.in).nextFloat();

							lstArtCientificos.get(campolArtModificar).setNombreProducto(newNombreProducto);

							lstArtCientificos.get(campolArtModificar).setCantidadProducto(newCantidadProducto);

							lstArtCientificos.get(campolArtModificar).setPrecioProducto(newPrecioProducto);

							System.out.println();
							System.out.println("Tipo de producto: (Acticulo Cientifico) modificado satisfactoriamente");
							System.out.println();
							
						}else {
							System.out.println("No tenemos ningun articulo cientifico a modificar, ingrese por favor algun articulo");
						}



						
						break;

					case 3:

						// Opcion para eliminar un registro o nodo completo de un objeto Articulo cientifico

						System.out.println();
						System.out.println("Listado de articulos cientificos actuales, cantidad: " + lstArtCientificos.size());
						System.out.println();

						// Recorrido de lista Articulos Cientificos

						for (int i = 0; i < lstArtCientificos.size(); i++)

						{
							System.out.println(
									"--------------------------Campo Articulos Cientificos-------------------------------------------------------------------------");
							ArtCientificos totalArtCientificos = lstArtCientificos.get(i);
							System.out.println("Campo " + i + "," + " Tipo Producto: " + totalArtCientificos.getTipoProducto()+ "," + " Nombre: " + totalArtCientificos.getNombreProducto() + ","+ " Cantidad de libros: " + totalArtCientificos.getCantidadProducto() + ","+ " Precio: " + totalArtCientificos.getPrecioProducto() + "," + " Autor: "+ totalArtCientificos.getAutorProducto() + "," + " Edicion: "+ totalArtCientificos.getEdicionProducto() + "," + " Referencia: "+ totalArtCientificos.getReferenciaProducto() + " ");
							System.out.println();
						}

						if(lstArtCientificos.size()>0) {
							
							System.out.println();
							System.out.println("Indique el numero del campo donde se encuentra el articulo a eliminar");
							System.out.println();

							int campoArtEliminar = new Scanner(System.in).nextInt();

							System.out.println();
							System.out.println("Libro eliminado de la base, " + "Registro " + lstArtCientificos.get(campoArtEliminar));
							
							//Se eliminar el campo seleccionado
							lstArtCientificos.remove(campoArtEliminar);
							System.out.println();
							
						}else {
							System.out.println("No tenemos ningun articulo cientifico a eliminar, ingrese por favor algun articulo");
						}
						


						break;

					case 4:

						// Opcion para ver el inventario de articulos cientificos

						System.out.println();
						System.out.println("Inventario de articulos cientificos");
						System.out.println();
						System.out.println("Listado de articulos cientificos actuales, cantidad: " + lstArtCientificos.size());
						System.out.println();

						
						if(lstArtCientificos.size()>0) {
							
							// Recorrido de lista Articulos Cientificos
							for (int i = 0; i < lstArtCientificos.size(); i++)

							{
								System.out.println(
										"--------------------------Campo Articulos Cientificos-------------------------------------------------------------------------");
								ArtCientificos totalArtCientificos = lstArtCientificos.get(i);
								System.out.println("Campo " + i + "," + " Tipo Producto: " + totalArtCientificos.getTipoProducto()+ "," + " Nombre: " + totalArtCientificos.getNombreProducto() + ","+ " Cantidad de libros: " + totalArtCientificos.getCantidadProducto() + ","+ " Precio: " + totalArtCientificos.getPrecioProducto() + "," + " Autor: "+ totalArtCientificos.getAutorProducto() + "," + " Edicion: "+ totalArtCientificos.getEdicionProducto() + "," + " Referencia: "+ totalArtCientificos.getReferenciaProducto() + " ");
								System.out.println();
							}
							
						}else {
							System.out.println("No tenemos ningun articulo cientifico a consultar, ingrese por favor algun articulo");
						}
						


						break;

					case 5:

						// Opcion para vender un articulo - Se descuenta la cantidad de los articulos

						System.out.println();
						System.out.println("Venta de articulos, seleccione el campo del articulo que requiere vender");
						System.out.println();
						System.out.println();
						System.out.println("Listado de articulos cientificos actuales, cantidad: " + lstArtCientificos.size());
						System.out.println();

						
						// Recorrido de lista Articulos Cientificos
						for (int i = 0; i < lstArtCientificos.size(); i++)

						{
							System.out.println(
									"--------------------------Campo Articulos Cientificos-------------------------------------------------------------------------");
							ArtCientificos totalArtCientificos = lstArtCientificos.get(i);
							System.out.println("Campo " + i + "," + " Tipo Producto: " + totalArtCientificos.getTipoProducto()+ "," + " Nombre: " + totalArtCientificos.getNombreProducto() + ","+ " Cantidad de libros: " + totalArtCientificos.getCantidadProducto() + ","+ " Precio: " + totalArtCientificos.getPrecioProducto() + "," + " Autor: "+ totalArtCientificos.getAutorProducto() + "," + " Edicion: "+ totalArtCientificos.getEdicionProducto() + "," + " Referencia: "+ totalArtCientificos.getReferenciaProducto() + " ");
							System.out.println();
						}

						
						if(lstArtCientificos.size()>0) {
							
							System.out.println();
							System.out.println("Indique el numero del campo: ");
							System.out.println();

							int campoArtVender = new Scanner(System.in).nextInt();

							System.out.println();
							System.out.println("Cuantas unidades quiere vender de ese articulo ? ");
							System.out.println();

							int cantidadProductoVender = new Scanner(System.in).nextInt();

							int cantidadActualArt = lstArtCientificos.get(campoArtVender).getCantidadProducto();

							int operacionRestaArt = (cantidadActualArt - cantidadProductoVender);

							
							// Asignacion de nueva cantidad de articulos en la lista articulos cientificos segun el campo seleccionado
							lstArtCientificos.get(campoArtVender).setCantidadProducto(operacionRestaArt);

							System.out.println("Le quedan " + operacionRestaArt + " articulos , del producto " + lstArtCientificos.get(campoArtVender).getNombreProducto());

							System.out.println();
							System.out.println("Articulo vendido de la base, Registro de venta: " + lstArtCientificos.get(campoArtVender));
							System.out.println();
							
						}else {
							System.out.println("No tenemos ningun articulo cientifico para vender , ingrese por favor algun articulo");
						}
						
						
						
						break;

					case 6:

						// Opcion para salir del menu de Articulos
						System.out.println();
						doneMenuArticulos = true;
						break;

					default:
						// Si el usuario no selecciona una opcion correcta
						System.out.println();
						System.out.println("Escoge una opcion correcta del 1 al 6");
						System.out.println();

					}// Final de Switch Menu categoria Articulos

				} while (!doneMenuArticulos); // Final do-While Menu Articulos

				break;
				
			case 4:

				System.out.println();
				System.out.println("Gracias por probar el sistema, Hasta luego");
				System.out.println();
				doneMenuPrincipal = true;
				break;

			default:
				System.out.println();
				System.out.println("Opcion Invalida ingrese opciones del 1 - 4 ");
				System.out.println();

			}// Final del Switch Menu principal

		} while (!doneMenuPrincipal); // Final do-while Menu principal

	}// Final Metodo Main

}// Final clase Venta Productos
