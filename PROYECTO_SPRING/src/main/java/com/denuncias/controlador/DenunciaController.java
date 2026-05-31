package com.denuncias.controlador;

import com.denuncias.modelo.Denuncia;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador REST construido con el framework Spring.
 * Gestiona las peticiones HTTP del módulo de denuncias.
 */
@RestController
@RequestMapping("/api/denuncias")
public class DenunciaController {

    // Simulación de base de datos en memoria
    private List<Denuncia> baseDatos = new ArrayList<>();

    /**
     * Endpoint para obtener todas las denuncias registradas.
     * @return Lista de objetos Denuncia en formato JSON automáticamente.
     */
    @GetMapping
    public List<Denuncia> obtenerDenuncias() {
        return baseDatos;
    }

    /**
     * Endpoint para registrar una nueva denuncia.
     * Utiliza la anotación del framework para mapear el cuerpo de la petición.
     * @param nuevaDenuncia Objeto JSON enviado desde el cliente (Stand alone/Móvil/Web)
     * @return Confirmación de la operación.
     */
    @PostMapping
    public String registrarDenuncia(@RequestBody Denuncia nuevaDenuncia) {
        baseDatos.add(nuevaDenuncia);
        return "Denuncia radicada exitosamente con el ID: " + nuevaDenuncia.getIdRadicado();
    }
}