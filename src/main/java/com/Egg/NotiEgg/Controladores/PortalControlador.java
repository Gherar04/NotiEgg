/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Egg.NotiEgg.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author UsuarioE
 */
@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @GetMapping("")
    public String crearNoticia() {

        return "index.html";

    }
    
    @GetMapping("/registrar")
    public String registrar(){
        return "usuario_register.html";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login.html";
        
    }
    
    
}
