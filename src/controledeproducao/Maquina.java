/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeproducao;

import java.util.ArrayList;

/**
 *
 * @author Juliano
 */
public class Maquina extends Producao{
    private Producao p;
    private String nome;
    private ArrayList<Integer> irog = new ArrayList();
    
    
    Maquina(){
        p=new Producao();
        p.setMaquina(this);
    }
    public String getName(){
        return this.nome;
    }
    public void setProduction(int p, int irog){
            this.p.setProducao(p);
            this.irog.add(irog);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Producao getProducaoClass(){
        return this.p;
    }
    public int getProducao(String d){
        return p.getProducao(d);
    }
}
