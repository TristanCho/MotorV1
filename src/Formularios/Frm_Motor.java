
package Formularios;


public class Frm_Motor extends javax.swing.JFrame {

    Frm_Config FC = new Frm_Config();
    Frm_Motor FM = new Frm_Motor();    
     
     /**
     * Creates new form Frm_Motor
     */
    public Frm_Motor() {
        initComponents();
        FM.setVisible(true);  
        //PanelConfig.setLayout(null);
        //PanelConfig.setEnabled(false);
        
        /*
        PanelConfig.setLocation(1500,1100);
        PanelConfig.setBounds(0,200,1225,300);
        PanelSensores.setLocation(1500,1100);
        PanelSensores.setBounds(0,200,1225,300);
                        
        PanelBase.add(PanelConfig);
        PanelBase.add(PanelSensores);
             */   
        System.out.println("PanelConfig"+PanelConfig.getLocation());
        System.out.println("PanelSensores"+PanelSensores.getLocation());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBase = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        TituloEncabezado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jlbUser = new javax.swing.JLabel();
        PanelConfig = new javax.swing.JPanel();
        btnConfig = new javax.swing.JButton();
        PanelSensores = new javax.swing.JPanel();
        btnSensores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        PanelBase.setBackground(new java.awt.Color(255, 255, 255));
        PanelBase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Encabezado.setBackground(new java.awt.Color(11, 173, 253));
        Encabezado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Encabezado.setAlignmentX(0.0F);
        Encabezado.setAlignmentY(0.0F);
        Encabezado.setEnabled(false);
        Encabezado.setMaximumSize(new java.awt.Dimension(1246, 109));

        TituloEncabezado.setFont(new java.awt.Font("Univers 45 Light", 2, 24)); // NOI18N
        TituloEncabezado.setText("Motor 19-07-03");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("SALIR");

        jlbUser.setText("Cristhian Llanos");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(TituloEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 569, Short.MAX_VALUE)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TituloEncabezado)
                        .addGap(36, 36, 36)))
                .addGap(30, 30, 30))
        );

        PanelConfig.setBackground(new java.awt.Color(204, 255, 204));
        PanelConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConfig.setBackground(new java.awt.Color(0, 255, 51));
        btnConfig.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConfig.setText("Configuración");
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConfigLayout = new javax.swing.GroupLayout(PanelConfig);
        PanelConfig.setLayout(PanelConfigLayout);
        PanelConfigLayout.setHorizontalGroup(
            PanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        PanelConfigLayout.setVerticalGroup(
            PanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConfigLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelSensores.setBackground(new java.awt.Color(51, 51, 255));
        PanelSensores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSensores.setBackground(new java.awt.Color(51, 51, 255));
        btnSensores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSensores.setText("Sensores");
        btnSensores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSensoresLayout = new javax.swing.GroupLayout(PanelSensores);
        PanelSensores.setLayout(PanelSensoresLayout);
        PanelSensoresLayout.setHorizontalGroup(
            PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSensoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSensores)
                .addContainerGap())
        );
        PanelSensoresLayout.setVerticalGroup(
            PanelSensoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSensoresLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnSensores)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBaseLayout = new javax.swing.GroupLayout(PanelBase);
        PanelBase.setLayout(PanelBaseLayout);
        PanelBaseLayout.setHorizontalGroup(
            PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBaseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelSensores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(PanelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelBaseLayout.setVerticalGroup(
            PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseLayout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
                .addGroup(PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelSensores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
       //FC.setVisible(true);
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnSensoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSensoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel PanelBase;
    private javax.swing.JPanel PanelConfig;
    private javax.swing.JPanel PanelSensores;
    private javax.swing.JLabel TituloEncabezado;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSensores;
    private javax.swing.JLabel jlbUser;
    // End of variables declaration//GEN-END:variables
}
