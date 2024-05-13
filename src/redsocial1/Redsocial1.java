/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redsocial1;

import Frames.InicionDeSesion;
import java.util.Scanner;

/**
 *
 * @author saman
 */
public class Redsocial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InicionDeSesion id= new InicionDeSesion();
        //id.setVisible(true);
        Usuarios u=new Usuarios();
       Scanner scan =new Scanner(System.in);
       
      /* System.out.println("Ingrese el nombre");
       String nombre=scan.next();
       System.out.println("Ingrese el apellido");
       String apellido=scan.next();
       System.out.println("Ingrese el correo electronico");
       String correoelectronico=scan.next();
       System.out.println("Ingrese la contraseña");
       String contraseña=scan.next();
       System.out.println("Ingrese la edad");
       int edad=scan.nextInt();
       System.out.println("Ingrese el sexo");
       String sexo=scan.next();
       System.out.println("Ingrese el estado civil");
       String estadocivil=scan.next();
       
       u.registrarUsuario(nombre, apellido,edad, estadocivil, sexo,correoelectronico,contraseña);*/
   
     
       System.out.println("Ingrese correo electronico");
        String correo=scan.next();
        System.out.println("Ingrese Contraseña");
        String contraseña=scan.next();
        if (u.inicioDeSesion(correo, contraseña)) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("El correo o la contraseña son incorrectos");
        }
    }
    
    
    
    
}
