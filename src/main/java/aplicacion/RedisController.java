package aplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.redis.core.RedisTemplate;


import java.util.Map;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/redis")
public class RedisController {

    @Autowired
    private RedisTemplate<String, String> template;

    @GetMapping("/conexion")
    public ResponseEntity<String> holaRedis() {
        return new ResponseEntity<>("Hola Redis", HttpStatus.OK);
    }

    @GetMapping("/iniciarSesion")
    public ResponseEntity<List<String>> iniciarSesion(@RequestParam String correo) {
        // Obtener los datos de la cuenta del correo proporcionado

        Map<Object, Object> cuenta = template.opsForHash().entries("correo:" + correo);

        if (cuenta.isEmpty()) {
            // Si no se encontró ninguna cuenta, devolver un ArrayList vacío
            return ResponseEntity.ok(new ArrayList<>());
        } else {
            // Si se encontró la cuenta, devolver un ArrayList con la contraseña y el objectID
            List<String> datosCuenta = new ArrayList<>();
            datosCuenta.add((String) cuenta.get("contrasena"));
            datosCuenta.add((String) cuenta.get("mongoRef"));
            return ResponseEntity.ok(datosCuenta);
        }
    }
}
