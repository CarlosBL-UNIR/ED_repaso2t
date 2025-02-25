package biblioteca;

import java.util.ArrayList;
import java.util.List;

/** MicommentCBL
 * Clase que representa una biblioteca con una colección de libros
 * Los métodos que se ven en Structure indican que la biblioteca permite agregar, eliminar y buscar libros por título y por autor
 *
 * @ see Libro
 * @author Carlos Barahona
 * @version 4.3.2025
 */
public class Biblioteca {

    // TODO: Documentar estos atributos (Esto es un atributo de clase al estar declarada fuera de cualquier método. Y es constante por declararla FINAL y apunta a la misma dirección de memoria aunque puedan tener más o menos libros)
    /** Lista de libros disponibles en la biblioteca MicommentCBL*/
    private final List<Libro> libros;

    // TODO: Documentar este método (este metodo es un constructor por tener el mismo nombre que la clase)
    /** Constructor por defecto de la biblioteca sin libros*/
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método que es un constructor con parámetros.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /** Es un constructor. (y al tenerlos hay que documentarlos)
     *
     * @param libros lista de libros con la que se inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Documentar este metodo. (de tipo booleano)
    //  Test: Comprobar si se ha agregado

    /**
     * Agrega un libro a la biblioteca
     * @param libro Un libro para agregar
     *
     * @return {@code true} si el libro se ha agregado correctamente o {@code false} si el libro NO se ha agregado correctamente
     */

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros de la biblioteca
     *
     * @return Lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     *
     * @param titulo
     * @return
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated Este metodo ha quedado obsoleto
     * Se recomienda usar{@link #encuentaLibrosPorAutor(String)} en su lugar
     * @param autor
     * @return
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test 01: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test 02: Comprobar la lista de libros que devuelve para un autor NO existente

    /**
     * Busca todos los libros de un autor determinado
     * @since V2.0
     * Sustituye al metodo {@link #encuentraLibrosPorTitulo(String)} en su lugar
     * @param autor
     * @return
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}