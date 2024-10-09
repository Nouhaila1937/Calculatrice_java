public class NewJFrame extends javax.swing.JFrame {
boolean cha3la=false;
boolean opon=false;
String nbaffiché="0";
double val1,val2;
Operation op;


    public NewJFrame() { // c'est le constructeur
        initComponents();
    }
 
    private void afficher(String s){ 
        if(Labelaffichage.getText().equals("0")|| opon)
        {
            nbaffiché=s;
            opon=false; // cette dernière nous permet de faire le test pour soit dire que le chiffre précédent après que opon soit false va construire un nombre complex comme 75 et non plus d'écraser par exemple le 7 par 5
        }
        else{
        nbaffiché= Labelaffichage.getText().concat(s);
        }
        Labelaffichage.setText(nbaffiché);
    }
    
    private boolean contientVirgule(String nb){
        
        if(nb.contains("."))return true;
        else return false;
    }
    
    private String enlerverVirgule(String nb){
    if(Double.parseDouble(nb)==Math.floor(Double.parseDouble(nb)))    
        nb=nb.substring(0,nb.length()-2); // pour supprimer ce qui est derrière le . exemple 17.0
    return nb;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Labelaffichage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        clear = new javax.swing.JButton();
        effacernb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        square = new javax.swing.JButton();
        racine = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        moins = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        division = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        virgule = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelaffichage.setBackground(new java.awt.Color(255, 255, 255));
        Labelaffichage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Labelaffichage.setOpaque(true);

        jPanel1.setLayout(new java.awt.GridLayout(6, 4, 4, 4));

        buttonGroup1.add(on);
        on.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        on.setText("On");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });
        jPanel1.add(on);

        buttonGroup1.add(off);
        off.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        off.setSelected(true);
        off.setText("Off");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        jPanel1.add(off);

        clear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);

        effacernb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        effacernb.setText("<--");
        effacernb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacernbActionPerformed(evt);
            }
        });
        jPanel1.add(effacernb);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("1/X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        square.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        square.setText("X²");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        jPanel1.add(square);

        racine.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        racine.setText("√x");
        racine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racineActionPerformed(evt);
            }
        });
        jPanel1.add(racine);

        plus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus);

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton16.setText("7");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton15.setText("8");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton14.setText("9");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        moins.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        moins.setText("-");
        moins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moinsActionPerformed(evt);
            }
        });
        jPanel1.add(moins);

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.setText("4");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("5");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        multiplication.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        multiplication.setText("*");
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationActionPerformed(evt);
            }
        });
        jPanel1.add(multiplication);

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.setText("1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.setText("2");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton10.setText("3");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        division.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        jPanel1.add(division);

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton19.setText("+/-");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton20.setText("0");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);

        virgule.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        virgule.setText(".");
        virgule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virguleActionPerformed(evt);
            }
        });
        jPanel1.add(virgule);

        equals.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        jPanel1.add(equals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Labelaffichage, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Labelaffichage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        // TODO add your handling code here:
         nbaffiché="0";
        Labelaffichage.setText(nbaffiché);
        cha3la=true;
    }//GEN-LAST:event_onActionPerformed

    private void virguleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virguleActionPerformed
        // TODO add your handling code here:
        if(cha3la){
          nbaffiché=Labelaffichage.getText();
        if(!contientVirgule(nbaffiché)) {
             nbaffiché=Labelaffichage.getText()+".";
             Labelaffichage.setText(nbaffiché);
        }  
        }
    }//GEN-LAST:event_virguleActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        // TODO add your handling code here:
        nbaffiché="";
         Labelaffichage.setText(nbaffiché);
    }//GEN-LAST:event_offActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        if(cha3la==true){
             nbaffiché="0";
            Labelaffichage.setText(nbaffiché);
        }
    }//GEN-LAST:event_clearActionPerformed

    private void effacernbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacernbActionPerformed
        // TODO add your handling code here:
        if(cha3la){
            nbaffiché=Labelaffichage.getText();
            if(nbaffiché.length()==1)
               nbaffiché="0";
            else
            nbaffiché=nbaffiché.substring(0,nbaffiché.length()-1);
            
            Labelaffichage.setText(nbaffiché);
        }
        
    }//GEN-LAST:event_effacernbActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
              if(cha3la==true){
          afficher("0");
            Labelaffichage.setText(nbaffiché);
    }//GEN-LAST:event_jButton20ActionPerformed
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(cha3la){
            afficher("1");
        }
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
        
            afficher("2");
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
        // TODO add your handling code here:
           if(cha3la){
               nbaffiché=Labelaffichage.getText();
       
        Double nb=Double.valueOf(nbaffiché);
        nb=Math.pow(nb,2);
        nbaffiché=Double.toString(nb);
        Labelaffichage.setText(enlerverVirgule(nbaffiché));
            }
    }//GEN-LAST:event_squareActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
  if(cha3la){
            afficher("4");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void racineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racineActionPerformed
         if(cha3la){
        nbaffiché=Labelaffichage.getText();
        Double nb=Double.valueOf(nbaffiché);
        nb=Math.sqrt(nb);
        nbaffiché=Double.toString(nb);
        Labelaffichage.setText(enlerverVirgule(nbaffiché));
            }    
    }//GEN-LAST:event_racineActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
             nbaffiché=Labelaffichage.getText();
    
        Double nb=Double.valueOf(nbaffiché);
        try{
             nb=1/nb;
        }catch(Exception e){
            e.printStackTrace();
        }
        nbaffiché=Double.toString(nb);
        Labelaffichage.setText(enlerverVirgule(nbaffiché));
             }
    }//GEN-LAST:event_jButton2ActionPerformed
private void operation(Operation o){
    val1=Double.parseDouble(Labelaffichage.getText());
        op=o;
        opon=true;
   // Labelaffichage.setText(" ");
}
    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
      if(cha3la) 
          operation(op.plus);
       //
        
    }//GEN-LAST:event_plusActionPerformed

    private void moinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moinsActionPerformed
        // TODO add your handling code here:
          if(cha3la)
        operation(op.moins);
    }//GEN-LAST:event_moinsActionPerformed

    private void multiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationActionPerformed
        // TODO add your handling code here:
          if(cha3la) 
        operation(op.fois);
    }//GEN-LAST:event_multiplicationActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
          if(cha3la) 
        operation(op.sur);
    }//GEN-LAST:event_divisionActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        // TODO add your handling code here:
     if (cha3la) {
        val2 = Double.parseDouble(Labelaffichage.getText());

        switch (op) {
            case fois:
                nbaffiché = String.valueOf(val1 * val2);
                break;
            case moins:
                nbaffiché = String.valueOf(val1 - val2);
                break;
            case sur:
                if (val2 != 0) {
                    nbaffiché = String.valueOf(val1 / val2);
                } else {
                    // Gestion d'erreur si val2 est 0
                    nbaffiché = "Erreur";
                }
                break;
            case plus:
            default:
                nbaffiché = String.valueOf(val1 + val2);
                break;
        }
        Labelaffichage.setText(nbaffiché);
    }
    }//GEN-LAST:event_equalsActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
            afficher("3");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
            afficher("5");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
            afficher("6");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
            afficher("7");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
            afficher("8");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
         if(cha3la){
            afficher("9");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              NewJFrame frame=  new NewJFrame();
              frame.setTitle("Calculatrice");
              frame.setVisible(true);
              frame.setResizable(false);
              frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labelaffichage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton division;
    private javax.swing.JButton effacernb;
    private javax.swing.JButton equals;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton moins;
    private javax.swing.JButton multiplication;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton plus;
    private javax.swing.JButton racine;
    private javax.swing.JButton square;
    private javax.swing.JButton virgule;
    // End of variables declaration//GEN-END:variables
}
