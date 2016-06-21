/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.io.*;

public class PersistenciaUsuario {
  //Esta es una clase Model de tipo Logico, solamente contiene
     //metodos que representan acciones concretas, la sintaxis
     //y estructura de dicho metodo depende de la accion.
     ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    
    //Primero generamos el metodo que nos guarda un usuario
    
   public void guardar(Usuario u)throws Exception{
      //Paso 1 generar el archivo a guardarse
      File f=new File("archivaldo.raton");
      if(f.exists()) usuarios= buscarTodos();
   //Indicar que se va a guardar
   FileOutputStream fos=new FileOutputStream(f);
   
   //Generar el objecto que nos va a ayuda a guardar el arrayList de usuarios
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   
   //Ahora si a guardar el objeto
                     usuarios.add(u);
                     oos.writeObject(usuarios);
   
   
   }
   
   //Empieza el método de leer a los usuarios guardados
   public ArrayList<Usuario> buscarTodos()throws Exception{
       File f=new File("archivaldo.raton");
      FileInputStream fis=new FileInputStream(f);
      ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios=    (ArrayList<Usuario>) ois.readObject();
   return usuarios;
   }
}
