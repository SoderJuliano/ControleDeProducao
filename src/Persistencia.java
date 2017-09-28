
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliano
 */
public class Persistencia{
 
                File file =  null;
                FileReader leitor;
                BufferedReader reader;
                BufferedWriter writer;
                FileWriter escritor;
                
                String caminho = "c:/db";
                String producao = "/producao";
                String usuario = "/usuario";
                String pessoa = "/pessoa";        

    public Persistencia() throws IOException {
        this.reader = new BufferedReader(leitor);
        this.escritor = new FileWriter(file);
        this.leitor = new FileReader(file);
        this.writer = new BufferedWriter(escritor);
    }
 
                public ArrayList<String> getProducao(String c) throws IOException{
                               ArrayList<String> retorno = new ArrayList();
                               this.file = new File(this.caminho+c);
                               String linha = null;
                                               while(reader.readLine()!=null){
                                                        linha = reader.readLine();
                                                        String[] array = null;
                                                        array=linha.split(";");
                                                        for(int i = 0 ; i< array.length; i++){
                                                            retorno.add(array[i]);
                                                            System.out.println(array[i].toString() +" adicionado..");
                                                        }
                                                }
                                return retorno;
                }
                public void setProducao(String c, HashMap m) throws IOException{
                               this.file = new File(this.caminho+c);
                               for (Object chave: m.keySet()){
                                               writer.write(m.get(chave)+";"+m.toString());                
                                               System.out.println("escrito "+m.get(chave)+";"+m.toString());
                               }
                              
                }
 
 
}