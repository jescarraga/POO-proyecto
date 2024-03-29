/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PreguntasFrecuentes;

import static BussinesLogic.ConsultorioJ.InterpreteArchivosPreguntas;
import GUI.Inicial.PaginaPrincipal;

/**
 *
 * @author mauri
 */
public class PreguntasLaboral extends javax.swing.JFrame {

    /**
     * Creates new form PreguntasCivil
     */
    public PreguntasLaboral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seleccion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaT = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione la pregunta y haga click en el boton CONSULTAR");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Como saber si existe un contrato laboral?", "¿Como se levanta una hipoteca?", "¿Como se liquida la segudidad social de los contratistas?", "¿Como se puede conciliar ante el ministerio del trabajo por despido sin justa causa?", "¿Como se puede dar por terminado un contrato Laboral?", "¿Cual es la duracion maxima de un contrato de aprendizaje?", "¿Cuales son los requisitos para contratar a una empleada de servicios generales?", "¿Cuanto dura el periodo de pruebas?", "¿Cuanto puede equivaler la cuota alimentaria?", "¿El aprendiz debe ser afiliado a seguridad social?", "¿El aprendiz tiene derecho a prestaciones sociales?", "¿El contrato de aprendizaje permite licencia de maternidad?", "¿Es posible firmar un segundo contrato laboral a termino indefinido con otra empresa?", "¿Hay alguna norma que regule el horario de uso de apps de mensajeria, hay pagos de horas extras por la tarea solicitada a traves de ese medio?", "¿Para qué se hace un contrato de promesa de compraventa?", "¿Puede haber acoso laboral en el marco de un contrato de prestación de servicio?", "¿Puede un contrato de prestación de servicios generar una vinculacion laboral?", "¿Que es contrato de aprendizaje?", "¿Que es el periodo de pruebas en el contrato de trabajo?", "¿Que es la estabilidad laboral reforzada?", "¿Que es un contrato laboral?", "¿Que formas de contrato laboral hay segun su duracion?", "¿Que hacer si no pagan la segudidad social ni las prestaciones?", "¿Que se puede hacer si una empresa no quiere contratar aprendices?", "¿Quienes pueden contratar aprendices?", "¿Quienes pueden ser contratados como aprendices?", "¿Se esta obligado a asistir a reuniones o cultos religiosos por mandato del empleador?", "¿Se le paga salario a un aprendiz?", "¿Se pagan prestaciones durante el periodo de pruebas?", "¿Se puede renovar el contrato de aprendizaje?", "¿Si nunca se ha cotizado, se tiene derecho a reclamar una pension de vejez?" }));

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        areaT.setEditable(false);
        areaT.setBackground(new java.awt.Color(0, 0, 0));
        areaT.setColumns(20);
        areaT.setForeground(new java.awt.Color(255, 255, 255));
        areaT.setRows(5);
        areaT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        areaT.setDragEnabled(true);
        jScrollPane1.setViewportView(areaT);

        jButton2.setText("Regresar al menu anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(seleccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(seleccion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(195, 195, 195)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton1)
                .addGap(57, 57, 57)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String DireccionErronea = seleccion.getSelectedItem().toString();
        String DireccionCorrecta = DireccionErronea.substring(1, (DireccionErronea.length() - 1));
        String direccion = DireccionCorrecta + ".txt" ;
        String texto = InterpreteArchivosPreguntas(direccion);
        areaT.setText(texto);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreguntasInicio preguntas1 = new PreguntasInicio();
        this.setVisible(false);
        preguntas1.setLocationRelativeTo(null);
        preguntas1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PreguntasLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreguntasLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreguntasLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreguntasLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreguntasLaboral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccion;
    // End of variables declaration//GEN-END:variables
}
