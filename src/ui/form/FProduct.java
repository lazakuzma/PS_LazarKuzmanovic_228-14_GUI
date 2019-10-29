/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lazar-PC
 */
public class FProduct extends JDialog{
    
    private JLabel id;
    private JLabel name;
    private JLabel description;
    private JLabel manufacturer;
    private JLabel price;
    private JLabel measureUnit;
    
    private JButton cancel;
    private JButton save;
    
    private TextField txtId;
    private TextField txtName;
    private TextField txtprice;
    
    private JComboBox jComboManufacturer;
    private JComboBox jComboMeasureUnit;
    
    private TextArea txtarea;
    
    private JPanel panel;
    
    public FProduct (){
        setTitle("Proizvod");
        setLocationRelativeTo(null);
        setSize(500, 600);
        setLayout(null);
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        id = new JLabel("ID:");
        id.setBounds(30, 20, 100, 50);
        
        name = new JLabel("Name:");
        name.setBounds(30, 60, 100, 50);
        
        description = new JLabel("Description:");
        description.setBounds(30, 100, 100, 50);
       
        manufacturer = new JLabel("Manufacturer:");
        manufacturer.setBounds(30, 220, 100, 50);
        
        price = new JLabel("Price:");
        price.setBounds(30, 260, 100, 50);
        
        measureUnit = new JLabel("MeasureUnit:");
        measureUnit.setBounds(30, 300, 100, 50);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(30, 490, 100, 50);
        
        save = new JButton("Save");
        save.setBounds(350, 490, 100, 50);
        
        txtId = new TextField("");
        txtId.setBounds(150, 37, 140, 20);
        
        txtName = new TextField("");
        txtName.setBounds(150, 77, 140, 20);
        
       
        
        txtarea = new TextArea("");
        txtarea.setBounds(150, 117, 300, 100);
        
        jComboManufacturer = new JComboBox();
        jComboManufacturer.setBounds(150, 233, 140, 25);
        
        txtprice = new TextField("");
        txtprice.setBounds(150, 273, 140, 20);
        
        jComboMeasureUnit = new JComboBox();
        jComboMeasureUnit.setBounds(150, 313, 140, 25);
       
        panel = new JPanel();
        panel.setSize(500, 480);
        panel.setLayout(null);
        panel.add(id);
        panel.add(name);
        panel.add(description);
        panel.add(manufacturer);
        panel.add(price);
        panel.add(measureUnit);
        panel.add(txtId);
        panel.add(txtName);
        panel.add(txtarea);
        panel.add(jComboManufacturer);
        panel.add(txtprice);
        panel.add(jComboMeasureUnit);
        
        
        add(panel);
        add(cancel);
        add(save);
        
        
        setVisible(true);
        
    }
    
    
}
