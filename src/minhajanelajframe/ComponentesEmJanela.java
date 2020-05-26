/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhajanelajframe;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lariane
 */
public class ComponentesEmJanela {
    public static void main(String[] args) {
        JFrame f = new JFrame("Janela com componentes");
        f.setSize( 400, 400);
        f.setLocationRelativeTo( null );
        f.setLayout( null );
        f.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        
        
        JLabel jlNome = new JLabel(" Nome: ");
        jlNome.setSize( 100, 30 );
        jlNome.setLocation( 10, 10 );
        jlNome.setForeground( Color.red );
        
        f.add( jlNome );
        
        JTextField jtfNome = new JTextField();
        jtfNome.setSize( 200, 30 );
        jtfNome.setLocation(110, 10 );
        jtfNome.setText( "lari" );
        
        
        
        f.add( jtfNome );
        
        
        JButton jbSalvar = new JButton( "Salvar" );
        jbSalvar.setSize(100, 40 );
        jbSalvar.setLocation(50, 50 );
        
        f.add( jbSalvar );
        
        JCheckBox jcbOpcao = new JCheckBox( "Opçao" );
        jcbOpcao.setBounds( 10, 100, 100, 40 );
        f.add( jcbOpcao );
        
        
        JCheckBox jcbOpcao2 = new JCheckBox( "Opçao2" );
        jcbOpcao2.setBounds( 10, 150, 100, 40 );
        f.add( jcbOpcao2 );
        
        JRadioButton jrbOpcao1 = new JRadioButton( "Opção 1" );
        JRadioButton jrbOpcao2 = new JRadioButton( "Opção 2" );
        JRadioButton jrbOpcao3 = new JRadioButton( "Opção 3" );
        
        jrbOpcao1.setBounds( 10, 200, 100, 40 );
        jrbOpcao2.setBounds( 10, 250, 100, 40 );
        jrbOpcao3.setBounds( 10, 300, 100, 40 );
        
        
        // garante que so uma opcao fique marcada
        ButtonGroup bgGrupoDeOpcoes = new ButtonGroup();
        bgGrupoDeOpcoes.add( jrbOpcao1 );
        bgGrupoDeOpcoes.add( jrbOpcao2 );
        bgGrupoDeOpcoes.add( jrbOpcao3 );
        
        f.add( jrbOpcao1 );
        f.add( jrbOpcao2 );
        f.add( jrbOpcao3 );
        
        
        JComboBox jcbOpcoes = new JComboBox();
        jcbOpcoes.addItem( " A " );
        jcbOpcoes.addItem( " B " );
        jcbOpcoes.addItem( " C " );
        jcbOpcoes.addItem( " 1 " );
        jcbOpcoes.addItem( " 2 " );
        jcbOpcoes.addItem( " 3 " );
        
        jcbOpcoes.setBounds(10, 350, 100, 40 );
        jcbOpcoes.setSelectedIndex( 3 );
        
        f.add( jcbOpcoes );
        
        
        
        
        
        
        
        
        f.setVisible( true );
        
        
        
        
    }
    
}