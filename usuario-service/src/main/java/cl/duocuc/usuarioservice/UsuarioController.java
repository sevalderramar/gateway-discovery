package cl.duocuc.usuarioservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return List.of(
                new Usuario(1L, "Ana Torres", "ana.torres@biblioteca.cl"),
                new Usuario(2L, "Carlos Perez", "carlos.perez@biblioteca.cl"),
                new Usuario(3L, "Maria Lopez", "maria.lopez@biblioteca.cl")
        );
    }

    public record Usuario(Long id, String nombre, String email) {
    }
}
