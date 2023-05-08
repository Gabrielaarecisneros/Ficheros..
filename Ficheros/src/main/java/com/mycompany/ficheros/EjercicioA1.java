/*
 * Ejercicio A1 - Mostrar información de ficheros
Implementa un programa que pida al usuario introducir por teclado una ruta del sistema de
archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre información sobre dicha ruta (ver
función más abajo). El proceso se repetirá una y otra vez hasta que el usuario introduzca una ruta
vacía (tecla intro). Deberá manejar las posibles excepciones.
Necesitarás crear la función void muestraInfoRuta(File ruta) que dada una ruta de tipo File haga
lo siguiente:
● Si es un archivo, mostrará por pantalla el nombre del archivo.
● Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus
nombres). Deberá mostrar primero los directorios y luego los archivos.
● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si es un
directorio o un archivo respectivamente.
● Si el path no existe lanzará un FileNotFoundException
 */
package com.mycompany.ficheros;

import java.io.File;
public class EjercicioA1 {

    /**
     * @param args the command line arguments
     */
   public static File MuestaInfoRuta(file ruta) throw FileNotFoundExcetion}
        //lanza una excepcion al  principio  de la funcion 
        try {
        FileInfoRuta=new FileInputStream(file:ruta);
        }
catch (IOExeption e ){
e.printSta
        
    }
    
}
