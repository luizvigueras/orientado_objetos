/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

public class ValidarArchivo {
    public static void validarExtension(String extencion)throws ArchivoNoTxtException{
        if (!extencion.equals("txt")) throw new ArchivoNoTxtException();
            
            }
}
