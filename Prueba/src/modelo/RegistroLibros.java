/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class RegistroLibros {
    private ArrayList <Libro> libros;

    public RegistroLibros() {
        libros=new ArrayList<>();
    }
    
    public void setLibro(Libro libro)
    {
      libros.add(libro);
    }
    
    //public 
    public String getInformacion(){
        String datos="";
        for(Libro libro:libros)
            datos+=libro.toString();
        return datos;
    }
    public boolean buscarLibro(String ISBN)
    {
        boolean encontrado= false;
        for(int i=0; i<libros.size(); i++){
            if(libros.get(i).getISBN().equalsIgnoreCase(ISBN))
                encontrado=true;
            
                break;
        }
        System.out.println(encontrado);
        return encontrado;
    }
    
}
