/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Luis Pomposo V
 */
public class ProbarGuardado {
    public static void main(String[] args) {
        
        Usuario u=new Usuario("Ana", 18, "Ana@gmail.com");
        PersistenciaUsuario p=new PersistenciaUsuario();
        try{
            p.guardar(u);
            System.out.println("usuario guardado");
            
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
