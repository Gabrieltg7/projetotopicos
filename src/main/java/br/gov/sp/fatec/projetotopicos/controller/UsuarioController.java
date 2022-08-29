package br.gov.sp.fatec.projetotopicos.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projetotopicos.entity.Usuario;
import br.gov.sp.fatec.projetotopicos.services.SegurancaService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {
    
    @Autowired
    private SegurancaService segurancaService;

    @GetMapping
    public List<Usuario> todosUsuarios(){
        return segurancaService.todosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario){
        return segurancaService.novoUsuario(usuario);
    } 
    
    @GetMapping(value = "/{id}")
    public List<Usuario> buscarPorId(@PathVariable("id") Long id){
        return segurancaService.buscarPorId(id);
    }
}
