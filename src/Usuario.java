
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
    
    PersistenciaProducao p = new PersistenciaProducao();
    ArrayList<String> array = new ArrayList();
    
    public void iniciarUser() throws FileNotFoundException{
        array = p.pegarProducao();
        chave = array.get(0)+array.get(1);
    }
}
