/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendecoreano;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Laura M
 */
public class TipoPalabra {
    private String nameES;
    private String nameKR;
    private ArrayList<Palabra> palabras;

    public TipoPalabra(String nameES, String nameKR, ArrayList<Palabra> palabras) {
        this.nameES = nameES;
        this.nameKR = nameKR;
        this.palabras = palabras;
    }

    public String getNameES() {
        return nameES;
    }

    public void setNameES(String nameES) {
        this.nameES = nameES;
    }

    public String getNameKR() {
        return nameKR;
    }

    public void setNameKR(String nameKR) {
        this.nameKR = nameKR;
    }

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<Palabra> palabras) {
        this.palabras = palabras;
    }
    
    
    public boolean addWord(Palabra palabra){
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            
            File file=new File("profesiones.txt");
            switch (this.nameES) {
                case "Paises":
                    file=new File("paises.txt");
                    break;
                case "Verbos":
                    file=new File("verbos.txt");
                    System.out.println("Archivo de verbos esta");
                    break;
                case "Animales":
                    file=new File("animales.txt");
                    break;
                case "Comida":
                    file=new File("comida.txt");
                    break;
                case "Sustantivos Varios":
                    file=new File("sustantivosVarios.txt");
                    break;
                default:
                    break;
            }
          if (!file.exists()) {
            file.createNewFile();
              System.out.println("Se esta creando nuevo archivo");
          } else System.out.println("Archivo existente");
        
          fw = new FileWriter(file.getAbsoluteFile(), true);
          bw = new BufferedWriter(fw);
          bw.newLine();
          bw.write(palabra.getEspanol());
          bw.write(".");
          bw.write(palabra.getCoreano());
          bw.newLine();
          bw.write("0");
          bw.write(palabra.getConjKR()[0]);
          bw.write("1");
          bw.write(palabra.getConjKR()[1]);
          bw.write("2");
          bw.write(palabra.getConjKR()[2]);
          
            System.out.println("Palabra en archivo");

        } catch (IOException e) {
          e.printStackTrace();
        } finally {
            try {
                        //Cierra instancias de FileWriter y BufferedWriter
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
          }
        }
        return this.palabras.add(palabra);
        
    }
}
