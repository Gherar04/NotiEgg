/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Egg.NotiEgg.Servicio;

import com.Egg.NotiEgg.Entidades.Noticia;
import com.Egg.NotiEgg.MiException.MiException;
import com.Egg.NotiEgg.Repositorio.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author UsuarioE
 */
@Service
public class NoticiaServicio {

    @Autowired
    NoticiaRepositorio noticiaRep;

    @Transactional

    public void crearNoticia(String titulo, String cuerpo) throws MiException {

        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFechaPublicacion(new Date());
        noticiaRep.save(noticia);

    }
    public List<Noticia> listarNoticias() {         //guardar todas las noticias que tengo en la base de datos y despues lo devuelve 

        List<Noticia> noticias = new ArrayList();

        noticias = noticiaRep.findAll();

        return noticias;
    }

    private void validar(String titulo, String cuerpo) throws MiException {

        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede ser nulo o estar vacio");

        }
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("El cuerpo no puede ser nulo o estar vacio");

        }
        
        
        
        
        
        
        
        
        
    }
    
}
