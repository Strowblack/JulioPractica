package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController{
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Yuta");
        usuario.setApellido("Aoi");
        usuario.setEmail("ignorado@hotmail.com");
        usuario.setTelefono("123412341");
        return usuario;
    }

    @RequestMapping(value="api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value="usuario123")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yuta");
        usuario.setApellido("Aoi");
        usuario.setEmail("ignorado@hotmail.com");
        usuario.setTelefono("123412341");
        return usuario;
    }

    @RequestMapping(value="api/eliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value="usuario132")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yuta");
        usuario.setApellido("Aoi");
        usuario.setEmail("ignorado@hotmail.com");
        usuario.setTelefono("123412341");
        return usuario;
    }

    public List<Usuario> patito() {
        return null;
    }
}
