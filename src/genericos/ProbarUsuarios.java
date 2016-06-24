/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Pomposo V
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
        
        //PASO 1 CREAR USUARIO
        Usuario u=new Usuario("Juan",20,"juan@gmail.com");
        //PASO 2 GUARDAR USUARIO;
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            p.guardar(u);
        } catch (Exception ex) {
            Logger.getLogger(ProbarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            p.guardar(u);
            System.out.println("USUARIO GUARDADO");
        } catch (Exception ex){
        System.out.println(ex.getMessage());
        }
        
        
    }
}
