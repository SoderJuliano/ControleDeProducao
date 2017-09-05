/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeproducao;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Juliano
 */
public class ControleDeProducao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       
        Maquina m = new Maquina();
        PersistenciaProducao p = new PersistenciaProducao();
        ArrayList<String> a = new ArrayList();
        a = p.pegarProducao();
        for(int i =0; i<p.pegarProducao().size(); i++){
            System.out.println(a.get(i));
        }
        Tela00 t = new Tela00();
        t.setVisible(true);
        t.setSize(900, 640);
        t.setBackground(Color.red);
        
        /*m.setProduction(380, 95);
        System.out.println(m.getProducao("19.08.2017"));
       for(int i=0;i<m.getProducaoClass().percorrerHash().size();i++){
            System.out.println(m.getProducaoClass().percorrerHash().get(i));
        }
       PersistenciaProducao p = new PersistenciaProducao();
       p.gravarProducao(m.getProducao("19.08.2017"), "19.08.2017");*/
    }
    
}
