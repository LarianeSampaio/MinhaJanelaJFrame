/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhajanelajframe;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Lariane
 */
public class MinhaJanelaJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setSize( 500, 500);
        janela.setLocation( 300, 300 );
        
        //janela.setExtendedState( JFrame.MAXIMIZED_BOTH );
        //janela.setResizable( true );
        janela.setMinimumSize(new Dimension( 200, 200 ) );
        janela.setTitle( "Minha Janela" );
        
        janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        
        janela.getContentPane().setBackground( Color.blue );
        //janela.setVisible( true );
    }
    
}
