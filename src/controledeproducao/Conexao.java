package controledeproducao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Juliano
 */
public class Conexao {
 
    public Conexao () {    } //Possibilita instancias
    public static Connection con = null;
    
 
    public static void conectar() {
        System.out.println("Conectando ao banco...");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/controledeproducao","root","");
        System.out.println("Conectado.");
    } catch (ClassNotFoundException ex) {
        System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
        Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
    } catch(SQLException e) {
         System.out.println(e);
         throw new RuntimeException(e);
    }
    }
    public ArrayList<Usuario> pegarUsuarios(String q) throws SQLException, FileNotFoundException{
        ArrayList<Usuario> n = new ArrayList();
        PreparedStatement stm = con.prepareStatement(q);
        ResultSet rs = stm.executeQuery(q);
        Usuario u = new Usuario();
        if (rs.next()) {
                //1-ID | 2-LOGIN | 3-SENHA |
               String resultado = (rs.getString(2)+";"+rs.getString(3));
               System.out.println(resultado);
               u.addNomeSenha(rs.getString(2), rs.getString(3));
               n.add(u);
        }
        return n;
    }
    public ArrayList<Maquina> pegarMaquinas(String q) throws SQLException{ // ver...
        ArrayList<Maquina> n = new ArrayList();
        ArrayList<Object> n2 = new ArrayList();
        PreparedStatement stm = con.prepareStatement(q);
        ResultSet rs = stm.executeQuery(q);
        
            while(rs.next()){
                Maquina u = new Maquina();
                u.setNome(rs.getString(1));
                n.add(u); 
                System.out.println("conexão -> "+u.getName());
            }
            /*for(int i =0;i<n.size();i++){
                
                Maquina u = new Maquina();
                System.out.println(rs.getString(i));
                u.setNome(rs.getString(1));
                n.add(u); 
            }*/
     /*   }else{
            System.out.println(rs.first());
        }*/
        return n;
    }
}
