/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroLibros;
import vista.GuiLibro;
import vista.PanelBotonesAccion;
import vista.PanelDatosLibro;

/**
 *
 * @author usuario
 */
public class ManejadorLibro implements ActionListener {

    private RegistroLibros registroLibros;
    private PanelDatosLibro panelDatosLibros;
    private GuiLibro guiLibro;

    public ManejadorLibro(RegistroLibros registroLibros, PanelDatosLibro panelDatosLibros, GuiLibro guiLibro) {
        this.registroLibros = registroLibros;
        this.panelDatosLibros = panelDatosLibros;
        this.guiLibro= guiLibro;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       //To change body of generated methods, choose Tools | Templates.
        if(e.getActionCommand().equals(PanelBotonesAccion.BOTON_ACEPTAR)){
         if(panelDatosLibros.verificarDatos()){
             if(registroLibros.buscarLibro(panelDatosLibros.getLibro().getISBN())==false){
                 registroLibros.setLibro(panelDatosLibros.getLibro());
                 System.out.print("Se registro correctamente");
             }
         }   
        }
        if(e.getActionCommand().equals("Cancelar")){
           
            guiLibro.setVisible(false);
            System.out.println("");
        }
         
    }
   
}
