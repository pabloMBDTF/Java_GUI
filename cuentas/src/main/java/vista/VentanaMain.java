/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author pablo
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import modelo.Aplicacion;
import modelo.Persona;



public class VentanaMain extends JFrame {
    
    private JLabel lblNombre;
    private JButton btnAgregar;
    private JButton btnActualizar;
    private JButton btnVer;
    private JButton btnEliminar;
    private Container contenedor;
    
    public VentanaMain(){
        iniciarComponentes();
        setSize(650, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("APP");
    }
    
    public void iniciarComponentes(){
        
        contenedor = getContentPane();
        Color azulClaro = new Color(173, 216, 230);
        contenedor.setBackground(azulClaro);
        contenedor.setLayout(new GridLayout(3, 4));
        
        //paneles
        
        
        
        
        
        lblNombre = new JLabel("Bienvenido, que deseas hacer");
        
        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
        
        Font font = new Font("Arial",Font.BOLD,16);
        
        lblNombre.setFont(font);
        
        
    }

    
    
    
    
}
