/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_salesinvoices;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
* @author muhammad atef
*/
public class InvoiceLineDialog extends JDialog{
    private JTextField itemNameField;
    private JTextField itemCountField;
     private JTextField itemPriceField;
    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
     private JLabel itemPriceLabel;
    private JButton okButton;
    private JButton cancelButton;
    
    public InvoiceLineDialog(Generator g) {
        itemNameLabel = new JLabel("Item Name:");
        itemNameField = new JTextField(20);
        
        
        itemCountLabel =new JLabel("Item Count");
        itemCountField =new JTextField(20);
        
        itemPriceLabel =new JLabel("Item Price:");
        itemPriceField =new JTextField(20);
        
        okButton = new JButton("Ok");
        okButton.addActionListener(g);
        okButton.setActionCommand("createLineOk");
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(g);
        cancelButton.setActionCommand("createLineCancel");
        
        setLayout(new GridLayout(4,2));
        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemCountField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(okButton);
        add(cancelButton);
        
       
       pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

   public JTextField getItemCountField() {
        return itemCountField;
    }
   
   public JTextField getItemPriceField() {
        return itemPriceField;
    }
    
    
}
