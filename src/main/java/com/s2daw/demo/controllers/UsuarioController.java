package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Yuta");
        usuario.setApellido("Aoi");
        usuario.setEmail("ignorado@hotmail.com");
        usuario.setTelefono("123412341");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Yuta");
        usuario.setApellido("Aoi");
        usuario.setEmail("ignorado@hotmail.com");
        usuario.setTelefono("123412341");

        Usuario usuario2 = new Usuario();
        usuario2.setId(123L);
        usuario2.setNombre("Hinata");
        usuario2.setApellido("Aoi");
        usuario2.setEmail("noignorado@hotmail.com");
        usuario2.setTelefono("4812774");

        Usuario usuario3 = new Usuario();
        usuario3.setId(142L);
        usuario3.setNombre("Selene Inmaculada");
        usuario3.setApellido("García Chacón");
        usuario3.setEmail("enana@cute.com");
        usuario3.setTelefono("81200");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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

    @RequestMapping(value="usuario321")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yuta");
        usuario.setApellido("Aoi");
        usuario.setEmail("ignorado@hotmail.com");
        usuario.setTelefono("123412341");
        return usuario;
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
}
