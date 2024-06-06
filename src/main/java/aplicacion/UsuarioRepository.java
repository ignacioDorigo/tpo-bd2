package aplicacion;

import negocio.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    public Usuario findByEmail(String email);

    public Optional<Usuario> findById(String id);

}
