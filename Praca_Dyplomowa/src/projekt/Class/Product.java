/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Andrzej Kierepka
 */
public class Product {
    private String name;// nazwa produktu
    private Double protein; // zawartość białka
    private Double carbohydrates; // zawartość węglowoadnów.
    private Double kalc;// wartość energentyczna
    private Double fibre; // zawartość błonnika
    private Double fat;// zawartość tłszczu
    List<String> vitOrMineral;// witaminy lub minerały
    List<Double> con_vit;// wartość w mg witaminy  lub minerału.

    public Product() {
        name = new String();
        vitOrMineral= new ArrayList<>();
        con_vit= new ArrayList<>();
    }

    public Product(String name) {
        this.name = name;
        vitOrMineral= new ArrayList<>();
        con_vit= new ArrayList<>();
    }

    public Product(String name, Double protein, Double carbohydrates, Double kalc,Double fat, Double fibre) {
        this.name = name;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.kalc = kalc;
        this.fibre = fibre;
        this.fat=fat;
        vitOrMineral= new ArrayList<>();
        con_vit= new ArrayList<>();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    static String readInput(String path) {
    StringBuilder buffer = new StringBuilder();
    try {
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis,"UTF8");
        Reader in = new BufferedReader(isr);
        int ch;
        while ((ch = in.read()) > -1) {
            buffer.append((char)ch);
        }
        in.close();
        return buffer.toString();
    } 
    catch (IOException e) {
        e.printStackTrace();
        return null;
    }
    }
    public void readData(String path){
        String line= readInput(path);
        StringTokenizer st = new StringTokenizer(line, "-;");
        boolean count=true;
        while(st.hasMoreElements()){
            //System.out.println(st.nextElement().toString());
            if(count){
                vitOrMineral.add(st.nextElement().toString());
            }
            else{
                con_vit.add(Double.valueOf(st.nextElement().toString()));
            }
            count=!count;
        }
        System.out.println(vitOrMineral.size());
    }
    
}