/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Luis Pomposo V
 * AQUI USAREMOS LAS EXCEPCIONES DE TIPO CHECKED EN LAS QUE TUTIENES QUE HACERTE CARGO DE ELLAS.
 * VAMOS A USAR UN PAQUETE QUE NO SE ENCUENTRA POR DEFECTO, TIENES QUE AGREGARLO CON UN IMPORT
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class segundaExecpcion {
    public static void main(String[] args) {
        File f=new File("C\\Users\\Luis Pomposo V\\Desktop\\texto.txt");
        try {
            int x=2;
            int y=0;
            int div=x/y;
            FileInputStream fis=new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new StringBuilder();
            while(( ch=fis.read() )!=-1){
                builder.append((char)ch);
                System.out.println("SE LEYO BIEN Y SE ENCONTRO ESTO"+builder.toString());{
           
            }catch(FileNotFoundException ex){
                    System.out.println("checa el nombre de tu archivo");
                    }catch(IOException ex){
                      
            
        }catch(Exception e){
        }finally{
                    
                }
        {
            
        }
    

