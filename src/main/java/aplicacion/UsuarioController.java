package aplicacion;

import negocio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping
    public List<Usuario> getTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioNuevo = usuarioRepository.save(usuario);

        redisTemplate.opsForValue().set(usuarioNuevo.getEmail(), usuarioNuevo.getId());



        return usuarioRepository.save(usuario);
    }

    @GetMapping("/buscarUsuarioEmail")
    public Usuario getUsuarioPorCorreo(@RequestParam String email) {
        return usuarioRepository.findByEmail(email);
    }

    @GetMapping("/buscarUsuarioID/mongo")
    public Optional<Usuario> getUsuarioPorIdMongo(@RequestParam String id) {
        return usuarioRepository.findById(id);
    }

    @GetMapping("/buscarUsuarioPorID")
    public Optional<Usuario> getUsuarioPorId(@RequestParam String id) {
        // Intentar obtener el usuario desde Redis
        Usuario usuario = (Usuario) redisTemplate.opsForValue().get("usuario:" + id);
        if (usuario != null) {
            return Optional.of(usuario);
        }

        // Si no está en Redis, obtenerlo de MongoDB
        return usuarioRepository.findById(id);
    }


}
