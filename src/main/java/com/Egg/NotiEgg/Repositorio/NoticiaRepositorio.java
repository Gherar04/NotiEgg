/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Egg.NotiEgg.Repositorio;

import com.Egg.NotiEgg.Entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UsuarioE
 */
@Repository
public interface NoticiaRepositorio  extends JpaRepository<Noticia,Long>{
    
    
    
    
}
