package cl.duocuc.libroservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @GetMapping
    public List<Libro> listarLibros() {
        return List.of(
                new Libro(1L, "Clean Code", "Robert C. Martin", true),
                new Libro(2L, "Domain-Driven Design", "Eric Evans", false),
                new Libro(3L, "Refactoring", "Martin Fowler", true)
        );
    }

    public record Libro(Long id, String titulo, String autor, boolean disponible) {
    }
}
