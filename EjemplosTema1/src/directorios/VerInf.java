package directorios;

import java.io.*;
public class VerInf {
public static void main(String[] args) {
  System.out.println("INFORMACI�N SOBRE EL FICHERO:");
  File f = new File("E:\\Programacion\\Proyetos Programacion\\Proyectos Eclipse\\EjemplosTema1\\src\\directorios\\VerInf.java");
  if(f.exists()){
        System.out.println("Nombre del fichero  : "+f.getName());
        System.out.println("Ruta                : "+f.getPath());
        System.out.println("Ruta absoluta       : "+f.getAbsolutePath());
        System.out.println("Se puede escribir   : "+f.canRead());
        System.out.println("Se puede leer       : "+f.canWrite());
        System.out.println("Tama�o              : "+f.length());
		System.out.println("Es un directorio    : "+f.isDirectory()); 
		System.out.println("Es un fichero       : "+f.isFile());		
   }
 }
}

