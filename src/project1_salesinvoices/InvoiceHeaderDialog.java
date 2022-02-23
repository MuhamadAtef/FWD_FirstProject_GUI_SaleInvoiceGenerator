/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_salesinvoices;

import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
* @author muhammad atef
*/
public class InvoiceHeaderDialog extends JDialog{
    private JTextField customerNameField;
    private JTextField dateField;
    private JLabel customerNameLabel;
    private JLabel dateLabel;
    private JButton okButton;
    private JButton cancelButton;
    
    public InvoiceHeaderDialog(Generator g) {
        customerNameLabel = new JLabel("customer Name:");
        customerNameField = new JTextField(20);
        dateLabel =new JLabel("Invoice Date:");
        dateField =new JTextField(20);
        okButton = new JButton("Ok");
        okButton.addActionListener(g);
        okButton.setActionCommand("createInvOk");
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(g);
        cancelButton.setActionCommand("createInvCancel");
        setLayout(new GridLayout(3,2));
        add(dateLabel);
        add(dateField);
        add(customerNameLabel);
        add(customerNameField);
        add(okButton);
        add(cancelButton);
  
       
       pack();
    }

    public JTextField getCustomerNameField() {
        return customerNameField;
    }

   public JTextField getDateField() {
        return dateField;
    }
    
    
}
