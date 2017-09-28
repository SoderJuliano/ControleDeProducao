/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeproducao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class Persistencia1 {
    
    String diretorio = "C:\\Users\\Juliano\\Desktop/p";
    File dir = new File(diretorio);
    File arq;
    
    public void novoDiretorio(String s){
        this.dir.mkdir();
    }

    public void gravarProducao(int v, String d) {
        this.arq = new File(dir, d+".txt");
        try {

            //neste ponto criamos o arquivo fisicamente
            arq.createNewFile();

            //Devemos passar no construtor do FileWriter qual arquivo
            // vamos manipular.
            // Esse construtor aceita dois tipos de parâmetros,
            // File ou String.
            //O parâmetro true indica que reescrevemos no arquivo
            // sem apagar o que já existe.
            // O false apagaria o conteúdo do arquivo e escreveria
            // o novo conteúdo.
            // Se não usar o 2° parâmetro, ele por padrão será false.
            //O mais importante, essa linha abre o fluxo do arquivo 
            FileWriter fileWriter = new FileWriter(arq, false);

            //Agora vamos usar a classe PrintWriter para escrever
            //fisicamente no arquivo.
            //Precisamos passar o objeto FileReader em seu construtor
            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Agora vamos escrever no arquivo com o método  println(),
            // que nos permite escrever linha a linha no arquivo
            printWriter.println(v);

            //o método flush libera a escrita no arquivo
            printWriter.flush();

            //No final precisamos fechar o arquivo
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<String> pegarProducao() throws FileNotFoundException{
        ArrayList<String> p = new ArrayList();
        String[] a = new String[2];
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\Juliano\\Desktop\\p\\usuarios/users.txt")).useDelimiter(";");
            while (scanner.hasNext()) {
                p.add(scanner.next());
            }
            return p;
    }
}
