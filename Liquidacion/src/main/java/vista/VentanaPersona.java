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
import modelo.Persona;





public class VentanaPersona extends JFrame 
implements ActionListener{
    
    private JLabel lblBase;
    private JLabel lblEps;
    private JLabel lblSalud;
    private JTextField txtBase;
    private JTextField txtEps;
    private JTextField txtSalud;
    private JButton btnNuevo;
    private JButton btnCalcular;
    private Container contenedor;
    
    
    
    
    public VentanaPersona(){
        iniciarComponentes();
        setSize(650, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Valores de persona");
    }
    
    
    public void iniciarComponentes(){
        lblBase = new JLabel("Base: ");
        lblEps = new JLabel("Eps: ");
        lblSalud = new JLabel("Salud: ");     
        
        lblBase.setHorizontalAlignment(SwingConstants.CENTER);
        lblEps.setHorizontalAlignment(SwingConstants.CENTER);
        lblSalud.setHorizontalAlignment(SwingConstants.CENTER);
        
        Font font = new Font("Arial",Font.BOLD,16);
        Font fontBtn = new Font("Tahoma",Font.BOLD,20);
        
        Color azulClaro = new Color(173, 216, 230);
        
        
        lblBase.setFont(font);
        lblEps.setFont(font);
        lblSalud.setFont(font);
        
                
        
        txtBase = new JTextField(15);
        txtBase.setHorizontalAlignment(JTextField.RIGHT);
        
        
        txtEps = new JTextField(15);
        txtEps.setHorizontalAlignment(JTextField.CENTER);
        
        txtSalud = new JTextField(15);
        txtSalud.setHorizontalAlignment(JTextField.CENTER);
        
                
        txtEps.setEnabled(false);
        txtEps.setBackground(Color.BLUE);
        txtEps.setDisabledTextColor(Color.white);
        txtEps.setHorizontalAlignment(JTextField.RIGHT);
        
        txtSalud.setEnabled(false);
        txtSalud.setBackground(Color.BLUE);
        txtSalud.setDisabledTextColor(Color.white);
        txtSalud.setHorizontalAlignment(JTextField.RIGHT);
        
        
        btnNuevo = new JButton("Nuevo");
        btnNuevo.addActionListener(this);
        
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);
        btnNuevo.setEnabled(false);
        
        
        btnCalcular.setFont(fontBtn);
        btnNuevo.setFont(fontBtn);
        
        
        
        
        
        contenedor = getContentPane();
        contenedor.setBackground(azulClaro);
        contenedor.setLayout(new GridLayout(4, 2));
        
        contenedor.add(lblBase);
        contenedor.add(txtBase);
        
        contenedor.add(lblEps);
        contenedor.add(txtEps);
        
        contenedor.add(lblSalud);
        contenedor.add(txtSalud);
        
        contenedor.add(btnNuevo);
        contenedor.add(btnCalcular);
              
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== btnCalcular){
            float base = Float.parseFloat(txtBase.getText());
            Persona per = new Persona(base);
            float valorEps = per.calcEps();
            float valorSalud = per.calcSalud();
            txtEps.setText(valorEps + "");
            txtSalud.setText(valorSalud + "");
            btnNuevo.setEnabled(true);
            btnCalcular.setEnabled(false);
            txtBase.setEditable(false);
        }else if (e.getSource() == btnNuevo) {
            txtBase.setText("");
            txtEps.setText("");
            txtSalud.setText("");
            btnNuevo.setEnabled(false);
            btnCalcular.setEnabled(true);
            txtBase.setEditable(true);
            
        }

    }
    
        
                         
    
}
