package controledeproducao;


import controledeproducao.PersistenciaProducao;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliano
 */
public class Usuario {
    private String nome;
    private String senha;
    
    private String chave;
    
    
    public void addNomeSenha(String n, String s){
        this.nome = n;
        this.senha = s;
         chave = n+s;
    }
    public String getChave(){
        return this.chave;
    }
}
