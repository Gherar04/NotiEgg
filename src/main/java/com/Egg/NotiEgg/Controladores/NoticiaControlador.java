/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Egg.NotiEgg.Controladores;

import com.Egg.NotiEgg.Entidades.Noticia;
import com.Egg.NotiEgg.MiException.MiException;
import com.Egg.NotiEgg.Servicio.NoticiaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author UsuarioE
 */
@Controller
@RequestMapping("/noticia")

public class NoticiaControlador {

    @Autowired
    NoticiaServicio noticiaServ;

    @GetMapping("")
    public String crearNoticia() {

        return "index.html";

    }

    @GetMapping("/list")
    public String listaNoticias(ModelMap modelo) {     //agarra la informacion y la tira en el html

       List<Noticia> noticias = noticiaServ.listarNoticias();       //guardo la lista en la variable Noticia
        modelo.put("noticias", noticias);                       //mando la lista al html
        return "noticia_list.html";
        
    }
    
    
    @PostMapping("/crearNoticia")

    public String cargarNoticia(@RequestParam String titulo, @RequestParam String cuerpo,ModelMap modelo) {

        try {
            noticiaServ.crearNoticia(titulo, cuerpo);
            modelo.put("exito", "Noticia cargada exitosamente");
                    return "redirect:/noticia/list";
                    

        } catch (MiException ex) {
            modelo.put("error", "La noticia tuvo un problema al cargarla");
            return "index.html";
        }

    }

}
