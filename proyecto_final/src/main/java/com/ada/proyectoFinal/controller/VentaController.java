package com.ada.proyectoFinal.controller;



import com.ada.proyectoFinal.entity.Producto;
import com.ada.proyectoFinal.entity.Usuario;
import com.ada.proyectoFinal.entity.Venta;
import com.ada.proyectoFinal.repository.VentaRepository;
import com.ada.proyectoFinal.service.ProductoService;
import com.ada.proyectoFinal.service.UsuarioService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(path = "api/ventas")
public class VentaController {

    @Autowired
    ProductoService productoService;
    @Autowired
    UsuarioService usuarioService;

    Venta venta;
     VentaRepository ventaRepo;
    Log log = LogFactory.getLog(VentaController.class);

    @PostMapping("nuevo")
    @PreAuthorize("hasRole('COMPRADOR')")
    public ResponseEntity<Venta> guardarVenta(@RequestBody Producto producto, Usuario usuario) {
       log.info("guardarventa "  + producto + usuario);
        venta.save ();
        return new ResponseEntity<> ( venta, HttpStatus.CREATED );
    }
}

