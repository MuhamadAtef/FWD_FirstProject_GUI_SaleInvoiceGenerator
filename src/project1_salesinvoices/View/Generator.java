
package project1_salesinvoices.View;

import project1_salesinvoices.Model.HeaderTableModel;
import project1_salesinvoices.Model.LineTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import project1_salesinvoices.Controller.InvoiceHeader;
import project1_salesinvoices.Controller.InvoiceLine;


public class Generator extends javax.swing.JFrame implements ActionListener  , ListSelectionListener{
    public Generator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InvoiceTable = new javax.swing.JLabel();
        jPanel_OfInvoiceTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_InvoiceTable = new javax.swing.JTable();
        jTable_InvoiceTable.getSelectionModel().addListSelectionListener(this);
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_InvoiceItems = new javax.swing.JTable();
        jLabel_InvoiceNumberDisplay = new javax.swing.JLabel();
        jLabel_InvoiceDate = new javax.swing.JLabel();
        jLabel_CustomerName = new javax.swing.JLabel();
        jLabel_InvoiceTotalDisplay = new javax.swing.JLabel();
        InvoiceItemsTable = new javax.swing.JLabel();
        jTextField_InvoiceDate = new javax.swing.JTextField();
        jTextField_CustomerName = new javax.swing.JTextField();
        jLabel_InvoiceNumber = new javax.swing.JLabel();
        jLabelInviceTotal = new javax.swing.JLabel();
        CreateNewInvoice = new javax.swing.JButton();
        CreateNewInvoice.addActionListener(this);
        CreateNewInvoice.setActionCommand("CreateNewInv");
        DeleteInvoice = new javax.swing.JButton();
        DeleteInvoice.addActionListener(this);
        DeleteInvoice.setActionCommand("DelInvoice");
        AddItem = new javax.swing.JButton();
        AddItem.addActionListener(this);
        AddItem.setActionCommand("Add");
        DeleteItem = new javax.swing.JButton();
        DeleteItem.addActionListener(this);
        DeleteItem.setActionCommand("DelItem");
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFile = new javax.swing.JMenuItem();
        LoadFile.addActionListener(this);
        LoadFile.setActionCommand("load");
        SaveFile = new javax.swing.JMenuItem();
        SaveFile.addActionListener(this);
        SaveFile.setActionCommand("save");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoiceTable.setText("InvoiceTable");

        jTable_InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        jTable_InvoiceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable_InvoiceTable);

        jTable_InvoiceItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jTable_InvoiceItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jTable_InvoiceItems);

        jLabel_InvoiceNumberDisplay.setText("InvNum");

        jLabel_InvoiceDate.setText("Invoice Date");

        jLabel_CustomerName.setText("Customer Name");

        jLabel_InvoiceTotalDisplay.setText("InvTotal");

        InvoiceItemsTable.setText("Invoice Items");

        jTextField_CustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CustomerNameActionPerformed(evt);
            }
        });

        jLabel_InvoiceNumber.setText("Invoice Number");

        jLabelInviceTotal.setText("Invoice Total");

        CreateNewInvoice.setText("Create New Invoice");
        CreateNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewInvoiceActionPerformed(evt);
            }
        });

        DeleteInvoice.setText("Delete Invoice");
        DeleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceActionPerformed(evt);
            }
        });

        AddItem.setText("Add Item");
        AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt);
            }
        });

        DeleteItem.setText("Del Item");
        DeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_OfInvoiceTableLayout = new javax.swing.GroupLayout(jPanel_OfInvoiceTable);
        jPanel_OfInvoiceTable.setLayout(jPanel_OfInvoiceTableLayout);
        jPanel_OfInvoiceTableLayout.setHorizontalGroup(
            jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CreateNewInvoice)
                        .addGap(74, 74, 74)
                        .addComponent(DeleteInvoice))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_InvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_CustomerName)
                                            .addComponent(jLabel_InvoiceDate)
                                            .addComponent(jLabelInviceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_InvoiceTotalDisplay)
                                                    .addComponent(jTextField_CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_InvoiceNumberDisplay)
                                                    .addComponent(jTextField_InvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(96, 96, 96))
                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvoiceItemsTable)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddItem)
                        .addGap(76, 76, 76)
                        .addComponent(DeleteItem)
                        .addGap(113, 113, 113))))
        );
        jPanel_OfInvoiceTableLayout.setVerticalGroup(
            jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_InvoiceNumber)
                            .addComponent(jLabel_InvoiceNumberDisplay))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_InvoiceDate)
                            .addComponent(jTextField_InvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_CustomerName)
                            .addComponent(jTextField_CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_InvoiceTotalDisplay)
                            .addComponent(jLabelInviceTotal))
                        .addGap(18, 18, 18)
                        .addComponent(InvoiceItemsTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddItem)
                            .addComponent(DeleteItem))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteInvoice)
                            .addComponent(CreateNewInvoice))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("File");

        LoadFile.setText("Load File");
        jMenu1.add(LoadFile);

        SaveFile.setText("Save File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvoiceTable)
                    .addComponent(jPanel_OfInvoiceTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InvoiceTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_OfInvoiceTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateNewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewInvoiceActionPerformed

    private void DeleteInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceActionPerformed

    private void jTextField_CustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CustomerNameActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileActionPerformed

    private void AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddItemActionPerformed

    private void DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItem;
    private javax.swing.JButton CreateNewInvoice;
    private javax.swing.JButton DeleteInvoice;
    private javax.swing.JButton DeleteItem;
    private javax.swing.JLabel InvoiceItemsTable;
    private javax.swing.JLabel InvoiceTable;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JLabel jLabelInviceTotal;
    private javax.swing.JLabel jLabel_CustomerName;
    private javax.swing.JLabel jLabel_InvoiceDate;
    private javax.swing.JLabel jLabel_InvoiceNumber;
    private javax.swing.JLabel jLabel_InvoiceNumberDisplay;
    private javax.swing.JLabel jLabel_InvoiceTotalDisplay;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_OfInvoiceTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_InvoiceItems;
    private javax.swing.JTable jTable_InvoiceTable;
    private javax.swing.JTextField jTextField_CustomerName;
    private javax.swing.JTextField jTextField_InvoiceDate;
    // End of variables declaration//GEN-END:variables

               // New Variables declaration
        private ArrayList<InvoiceHeader> invoices = new ArrayList<>();
        private HeaderTableModel headerTableModel ;
        private LineTableModel lineTableModel ;
        private InvoiceHeaderDialog headerDialog ;
        private InvoiceLineDialog lineDialog;
	private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");

           // adding action performed depending on action command(controller)
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand().equals("load")){
         System.out.println("load clicked");
         try { loadFile();}
         catch(Exception ex) { ex.printStackTrace();}
		 }
		 else if (e.getActionCommand().equals("save")){
	         //System.out.println("save clicked");
                 try { saveData();}
         catch(Exception ex) { ex.printStackTrace();}
                 
                 }
                 
                  else if (e.getActionCommand().equals("CreateNewInv")){
	         //System.out.println("Create New Invoice");
                 createInv(); }
                 
                  else if (e.getActionCommand().equals("DelInvoice")){
	         //System.out.println("Delete Invoice");
                  deleteInv();}
                 
                  else if (e.getActionCommand().equals("Add")){
	         //System.out.println("Add a new Item");
                  addItem();}
                 
                  else if (e.getActionCommand().equals("DelItem")){
	         //System.out.println("Delete Item");
                  deleteItem();}
                 
                  else if (e.getActionCommand().equals("createInvOk")){
	         //System.out.println("create new invoice");
                  createInvOk();}
                 
                 else if (e.getActionCommand().equals("createInvCancel")){
                    //System.out.println("cancel invoice");
	           createInvCancel();
                  }
                 else if (e.getActionCommand().equals("createLineOk")){
                      //System.out.println("add new item");
	           createLineOk();
                  }
                 
                 else if (e.getActionCommand().equals("createLineCancel")){
                     //System.out.println("canacel item");
	           createLineCancel();
                  }
                 

     } 
        /////////////////////////////////////////////////////////
	// load file feature
	   private void loadFile() throws Exception {
		 
		   JOptionPane.showMessageDialog(this, "please select header file","invoice header",JOptionPane.WARNING_MESSAGE);
	       JFileChooser fc = new JFileChooser();
	       int result = fc.showOpenDialog(this);
	       if (result == JFileChooser.APPROVE_OPTION) {
	    	   File selectFile = fc.getSelectedFile();
	    	   FileReader fr = new FileReader(selectFile);
	    	   BufferedReader br = new BufferedReader(fr);
	    	   String line = null ;
	    	   while ((line = br.readLine()) != null) {
	    		   String [] headerSegments = line.split(",");
	    		   String invIDStr = headerSegments[0];
	    		   String invDateStr = headerSegments[1];
	    		   String custName = headerSegments[2];
	    		   int invID = Integer.parseInt(invIDStr);
	    		   Date invDate = df.parse(invDateStr);
	    		   InvoiceHeader header = new InvoiceHeader(invID,invDate,custName);
	    		   invoices.add(header);
	    	   }
	    	   br.close();
	    	   fr.close();
	    	   System.out.println("check");
	    
	    	   
	    	   JOptionPane.showMessageDialog(this, "please select Invoice line file","invoice line",JOptionPane.WARNING_MESSAGE);
		       result = fc.showOpenDialog(this);
		       if (result == JFileChooser.APPROVE_OPTION) {
		    	   selectFile = fc.getSelectedFile();
		    	   fr = new FileReader(selectFile);
		    	   br = new BufferedReader(fr);
		    	   line = null ;
		    	   while ((line = br.readLine()) != null) {
		    		   String [] lineSegments = line.split(",");
		    		   String invIDStr = lineSegments[0];
		    		   String invItem  = lineSegments[1];
		    		   String pricestr = lineSegments[2];
		    		   String countstr = lineSegments[3];
		    		   int invID = Integer.parseInt(invIDStr);
		    		   double price = Double.parseDouble(pricestr);
		    		   int count = Integer.parseInt(countstr);
		    		   InvoiceHeader header = findByNum(invID);
		    		   InvoiceLine invline = new InvoiceLine (invItem,price,count,header);
		    		   header.addLine(invline);
		    	   }
		    	   br.close();
		    	   fr.close();
		    	//   System.out.println("check 2");
             headerTableModel = new HeaderTableModel(invoices);
	     jTable_InvoiceTable.setModel(headerTableModel);
             jTable_InvoiceTable.validate();

	    		   
	    	   }
	      
	       }
	   }
	   //function to attach headerTable by lineTable with given "invoiceID"
	   private InvoiceHeader findByNum (int num) {
		   for(InvoiceHeader header : invoices ) {
			   if(header.getInvoiceID() == num ) {
				   return header;
			   }
		   }
		   return null ;
		} 

  /////////////////////////////////////////////////////////////////////////
     // function for selection
   @Override
    public void valueChanged(ListSelectionEvent e) {
        HeaderTableRowSelected();
        
    }
    // 
    private void HeaderTableRowSelected() {
        
        int selectedRowIndex = jTable_InvoiceTable.getSelectedRow();
        if(selectedRowIndex>=0){
        InvoiceHeader row = headerTableModel.getInvoices().get(selectedRowIndex);
        
    jTextField_CustomerName.setText(row.getInvoiceCustomerName());
    jTextField_InvoiceDate.setText(row.getInvoiceDate().toString());
      jLabel_InvoiceNumberDisplay.setText(""+row.getInvoiceID());
     jLabel_InvoiceTotalDisplay.setText(""+row.getInvoiceTotal());
    ArrayList<InvoiceLine> lines= row.getLines();
    lineTableModel =new LineTableModel(lines);
    jTable_InvoiceItems.setModel(lineTableModel);
    lineTableModel.fireTableDataChanged();
    }
    }
  //////////////////////////////////////////////////////////
    // save file feature
    private void saveData() throws Exception{
        
        //for Header Tabel
        JOptionPane.showMessageDialog(this, "Please Choose File Header to Save", "Invooice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChoosers = new JFileChooser();
        int option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfile = fileChoosers.getSelectedFile();
            PrintWriter out = new PrintWriter(Csvfile);
 
           for (InvoiceHeader header : invoices) {
             
               out.printf("%d ,%s,%s",header.getInvoiceID(),header.getInvoiceDate().toString(),header.getInvoiceCustomerName());
               out.println();
            }
           out.close();
            JOptionPane.showMessageDialog(this, "Successfully Header Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        //for Lines Tabel
               JOptionPane.showMessageDialog(this, "Please Chosce File Line to Save", "Invooice Line", JOptionPane.WARNING_MESSAGE);
          fileChoosers = new JFileChooser();
         option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfilee = fileChoosers.getSelectedFile();
            PrintWriter outt = new PrintWriter(Csvfilee);
 
 
           for (InvoiceHeader header : invoices) {
               for(InvoiceLine Lines :header.getLines()){
               outt.printf("%s ,%s,%d",Lines.getItemName(),""+Lines.getItemPrice(),Lines.getItemCount());
               outt.println();
            }}
           outt.close();
            JOptionPane.showMessageDialog(this, "Successfully Lines Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
 
    }
    //////////////////////////////////////////////////////////////
   // create new invoice feature
    private void createInv() {
        headerDialog=new InvoiceHeaderDialog(this);
        headerDialog.setVisible(true);
    }

    private void createInvOk() {
        String customerName= headerDialog.getCustomerNameField().getText();
        String invDateStr = headerDialog.getDateField().getText();
       Date invDate =new Date();
        try{
            invDate = df.parse(invDateStr);
            
         }catch(ParseException ex){
           
         }
        
        headerDialog.setVisible(false);
        int num= getMaxInvNum() +1;
        InvoiceHeader newInvoiceHeader = new InvoiceHeader(num,invDate,customerName);
        invoices.add(newInvoiceHeader);
        headerTableModel.fireTableDataChanged(); 
        
    }
     private void deleteInv() {
        int row = jTable_InvoiceTable.getSelectedRow();
         headerTableModel.removeRow(row);
         headerTableModel.fireTableDataChanged();
         lineTableModel.fireTableDataChanged();
   
    }
    private void createInvCancel() {
        headerDialog.setVisible(false);
    }

    private int getMaxInvNum()
    {
      int num = 0;
      for(InvoiceHeader headr:  invoices)
      {
         if(headr.getInvoiceID() > num)
         {
           num= headr.getInvoiceID();
         }
      }
      return num;
    }
    
    /////////////////////////////////////////////////////////
    
           // add item feature
    
      private void addItem() {
         lineDialog=new InvoiceLineDialog(this);
        lineDialog.setVisible(true);
    }
      
    private void createLineOk() {
       String itemName= lineDialog.getItemNameField().getText();
        String itemCountStr= lineDialog.getItemCountField().getText();
         String itemPriceStr= lineDialog.getItemPriceField().getText();
         lineDialog.setVisible(false);
         
         int itemCount =Integer.parseInt(itemCountStr);
         double itemPrice=Double.parseDouble(itemPriceStr);
        
         InvoiceHeader invoiceHeader= invoices.get(jTable_InvoiceTable.getSelectedRow());
         InvoiceLine line= new InvoiceLine(itemName,itemPrice,itemCount,invoiceHeader);
         invoiceHeader.addLine(line);
         lineTableModel.fireTableDataChanged();
         headerTableModel.fireTableDataChanged();
    }
    
    
    private void deleteItem() {
        int row = jTable_InvoiceItems.getSelectedRow();
         lineTableModel.removeRow(row);
         lineTableModel.fireTableDataChanged();
         headerTableModel.fireTableDataChanged();
    }
    private void createLineCancel() {
        lineDialog.setVisible(false);
        }

    }
   
	   

	   
