package hoc3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

public class HOC3Vista extends javax.swing.JFrame {
    AnalizadorSintactico Sintac;
    
    public HOC3Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(HOC3Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOC3Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOC3Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOC3Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOC3Vista().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoAAnalizar = new javax.swing.JTextArea();
        Clean = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaTokens = new javax.swing.JTextArea();
        btnAnalizLexico = new javax.swing.JButton();
        btnSintactico = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResultSintactico = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOC3");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        TextoAAnalizar.setColumns(20);
        TextoAAnalizar.setRows(5);
        jScrollPane1.setViewportView(TextoAAnalizar);

        Clean.setText("Limpiar");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        txtAreaTokens.setColumns(20);
        txtAreaTokens.setRows(5);
        jScrollPane2.setViewportView(txtAreaTokens);

        btnAnalizLexico.setText("Analizar Lexicamente");
        btnAnalizLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizLexicoActionPerformed(evt);
            }
        });

        btnSintactico.setText("Analizar Sintacticamente");
        btnSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSintacticoActionPerformed(evt);
            }
        });

        txtResultSintactico.setColumns(20);
        txtResultSintactico.setRows(5);
        jScrollPane4.setViewportView(txtResultSintactico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clean)
                    .addComponent(btnAnalizLexico)
                    .addComponent(btnSintactico))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clean)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizLexico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSintactico)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizLexicoActionPerformed
        Symbol simb;
        String Lexema = new String ();
        String CadAux = new String ();
        File ArchEntrada = new File("ArchEntrada.txt");
        PrintWriter escribir;
        txtAreaTokens.setText("");
        try {
            escribir = new PrintWriter(ArchEntrada);
            escribir.print(TextoAAnalizar.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HOC3Vista.class.getName());
        }
        try {
            Reader lector;
            lector = new FileReader("ArchEntrada.txt");
            
            AnalizadorLexico AnalizLexico = new AnalizadorLexico(lector);
            do{
                simb = AnalizLexico.next_token();
                CadAux = Integer.toString(simb.sym);
                Lexema = AnalizLexico.yytext();
                if(simb.sym == AnalizadorSintacticoSym.EOF)
                    CadAux = "Token: "+CadAux + "\tIdentToken: FIN\n";
                else{
                    switch(simb.sym){
                        case AnalizadorSintacticoSym.SEMIC:
                            CadAux = "Token: "+CadAux+"\tIdentToken: SEMIC\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.NUM:
                            CadAux = "Token: "+CadAux+"\tIdentToken: NUM\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.CONST_PRED:
                            CadAux = "Token: "+CadAux+"\tIdentToken: CONST_PRED\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.BLTIN:
                            CadAux = "Token: "+CadAux+"\tIdentToken: BLTIN\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.OpAsig:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OpAsig\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.OpSuma:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OpSuma\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.OpResta:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OpResta\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.OpProd:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OpProd\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.OpDiv:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OpDiv\t\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.ParIzq:
                            CadAux = "Token: "+CadAux+"\tIdentToken: ParIzq\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.ParDer:
                            CadAux = "Token: "+CadAux+"\tIdentToken: ParDer\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.error:
                            CadAux = "Token: "+CadAux+"\tIdentToken: error\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.VAR:
                            CadAux = "Token: "+CadAux+"\tIdentToken: VAR\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.OpPotencia:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OpPotencia\t Lexema: "+Lexema+"\n";
                        break;
                        default:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OTRO\t Lexema: "+ AnalizLexico.yytext()+"\n";
                        break;
                    }
                }
                txtAreaTokens.append(CadAux);
            }while(simb.sym != AnalizadorSintacticoSym.EOF);
        } catch (IOException ex) {
            txtAreaTokens.append("Entro\' al catch");
            Logger.getLogger(HOC3Vista.class.getName()).log(Level.SEVERE,null,ex);
        }
        txtAreaTokens.repaint();
    }//GEN-LAST:event_btnAnalizLexicoActionPerformed

    private void btnSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSintacticoActionPerformed
        AnalizadorLexico Lexic = null;
        try {
            Lexic = new AnalizadorLexico(new FileReader("ArchEntrada.txt"));
        } catch (FileNotFoundException e) {
            Logger.getLogger(HOC3Vista.class.getName());
        }
        Sintac = new AnalizadorSintactico(Lexic);
        Sintac.frmInterfaz = this;
        try {
            Object result = Sintac.parse().value;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSintacticoActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        TextoAAnalizar.setText("");
        txtAreaTokens.setText("");
        txtResultSintactico.setText("");
    }//GEN-LAST:event_CleanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clean;
    private javax.swing.JTextArea TextoAAnalizar;
    private javax.swing.JButton btnAnalizLexico;
    private javax.swing.JButton btnSintactico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtAreaTokens;
    public javax.swing.JTextArea txtResultSintactico;
    // End of variables declaration//GEN-END:variables

    public void txtResultSintactico(String string) {
    }
}
