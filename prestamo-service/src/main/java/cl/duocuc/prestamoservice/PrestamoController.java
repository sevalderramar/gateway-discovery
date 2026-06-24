package cl.duocuc.prestamoservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return List.of(
                new Prestamo(1L, 1L, 2L, "ACTIVO"),
                new Prestamo(2L, 2L, 1L, "DEVUELTO"),
                new Prestamo(3L, 3L, 3L, "PENDIENTE")
        );
    }

    public record Prestamo(Long id, Long usuarioId, Long libroId, String estado) {
    }
}
