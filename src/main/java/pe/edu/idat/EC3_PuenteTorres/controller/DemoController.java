package pe.edu.idat.EC3_PuenteTorres.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("hasRole('ADMIN')")
@RestController
@RequestMapping("api/v1/demo")
public class DemoController {

    @GetMapping("/saludo")
    public ResponseEntity<String> saludo(){
        return new ResponseEntity<>("respuesta REST", HttpStatus.OK);
    }
}
