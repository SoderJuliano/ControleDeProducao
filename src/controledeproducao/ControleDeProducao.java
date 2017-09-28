/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeproducao;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Juliano
 */
public class ControleDeProducao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        // TODO code application logic here
        ArrayList<Usuario> users = new ArrayList();
        Conexao c = new Conexao();
        c.conectar();
        String query = "select * from usuario";
        users = c.pegarUsuarios(query);
        
        
       ArrayList<String> a = new ArrayList();
       Persistencia1 p = new Persistencia1();
        
        a = p.pegarProducao();
        for(int i =0; i<p.pegarProducao().size(); i++){
            System.out.println(a.get(i));
            String st = a.get(0)+a.get(1);
            a.add(st);
        }
        Tela00 t = new Tela00();
        t.setVisible(true);
        
        String st1 = users.get(0).getChave();
        System.out.println("st1  -->" +st1);
        a.add(st1);
        t.getLoguins(a);
        
        /*m.setProduction(380, 95);
        System.out.println(m.getProducao("19.08.2017"));
       for(int i=0;i<m.getProducaoClass().percorrerHash().size();i++){
            System.out.println(m.getProducaoClass().percorrerHash().get(i));
        }
       PersistenciaProducao p = new PersistenciaProducao();
       p.gravarProducao(m.getProducao("19.08.2017"), "19.08.2017");*/
    }
    
}
