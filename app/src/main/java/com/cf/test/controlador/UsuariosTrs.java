package com.cf.test.controlador;

import com.cf.test.modelo.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuariosTrs {
    public List<Usuario> listaUsuario;
    public UsuariosTrs(){
        this.listaUsuario=new ArrayList<>();
        Usuario usuarioA=new Usuario();
        usuarioA.setCodUsu(1);
        usuarioA.setNombreUsu("ajborjal");
        usuarioA.setClaveUsu("joel1911");
        usuarioA.setFechaUsu(new Date());
        this.listaUsuario.add(usuarioA);
        Usuario usuarioB =new Usuario(2,"mastudillo","mastudillo",new Date());
        this.listaUsuario.add(usuarioB);
    }
    public Usuario verificarUsuario(String usuario, String clave){
        Usuario usuarioVal=null;
        for(Usuario usu:listaUsuario){
            if(usu.getNombreUsu().equals(usuario)&&usu.getClaveUsu().equals(clave)){
                usuarioVal=usu;
                break;
            }
        }
        return usuarioVal;
    }
}
