/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeproducao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javafx.scene.input.DataFormat;

/**
 *
 * @author Juliano
 */
public class Producao{
    
    private HashMap producao = new HashMap();
    private ArrayList<Maquina> maquinas = new ArrayList();
 
    public void setMaquina(Maquina m){
        maquinas.add(m);
    }
    public void setProducao(int p){
        producao.put(this.PegarData(), p);
    }
    public int getProducao(String d){
        return (int) producao.get(d);
    }
    private String PegarData(){
        Date data = new Date();
        Calendar c;
        c = Calendar.getInstance();
        c.setTime(data);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return (String)sdf.format(data);
    }
    public ArrayList<String> percorrerHash(){
        ArrayList<String> list;
        list = new ArrayList();
        if(!producao.isEmpty()){
            for(Object k: producao.keySet()){
            list.add((String) k);
            }
        }else{
                System.out.println("vaziu");
                
        }
        return list;
    }   
}
