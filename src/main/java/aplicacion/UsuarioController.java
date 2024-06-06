package aplicacion;

import negocio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/buscarUsuarioEmail")
    public Usuario getUsuarioByEmail(@RequestParam String email) {
        return usuarioRepository.findByEmail(email);
    }
    @GetMapping("/buscarUsuarioID")
    public Optional<Usuario> getUsuarioById(@RequestParam String id) {
        return usuarioRepository.findById(id);
    }


}
