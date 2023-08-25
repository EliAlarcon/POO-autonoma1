package com.itsqmet.Spring1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    //Realizo el mapeo
    @GetMapping("/") //http://localhost:8080/
    public String home(){
        return "home";
    }

    @GetMapping("/contactos") //http://localhost:8080/contactos
    public String contactos(){
        return "contactos";
    }

    @GetMapping("/servicios")
    public String servicios(){
        return "servicios";
    }

    @GetMapping("/pacientes")
    public String pacientes(){
        return "pacientes";
    }

    @GetMapping("/doctores")
    public String doctores(){
        return "doctores";
    }
}
