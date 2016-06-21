/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.io.Serializable;
public class Usuario implements Serializable {
    
    private String nombre;
    private Integer edad;
    private String email;

    Usuario(String text, int parseInt, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "usuario{" + "nombre=" + nombre + ",edad= " + edad + ", email=" + email +'}';
        
    }
           
}
