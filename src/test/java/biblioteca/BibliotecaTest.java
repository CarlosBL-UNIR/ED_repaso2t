package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();
    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);

        // no está vacía
        assertNotNull(biblio.getLibros());

        // sólo tiene un libro
        assertEquals(1, biblio.getLibros().size());

        // Contiene el libro recién añadido
        assertTrue(biblio.getLibros().contains(this.libro));
    }

    @Test
    void encuentraLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {

    }
}