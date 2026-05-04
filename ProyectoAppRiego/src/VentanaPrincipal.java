
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author WEB1-32
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.sistemaR = GestorDatos.cargarCopiaSeguridad();
        setLocationRelativeTo(null);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuDatos.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ZoneGroup = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        gestionDat = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        gestionSis = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        menuConsum = new javax.swing.JLayeredPane();
        agregarA3 = new javax.swing.JLayeredPane();
        jLabel13 = new javax.swing.JLabel();
        jLayeredPane17 = new javax.swing.JLayeredPane();
        volverBorrar2 = new javax.swing.JButton();
        textoCOnsumo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        menuDatos = new javax.swing.JLayeredPane();
        jLayeredPane19 = new javax.swing.JLayeredPane();
        jLabel16 = new javax.swing.JLabel();
        Informe = new javax.swing.JLayeredPane();
        jLabel17 = new javax.swing.JLabel();
        guardarCopia1 = new javax.swing.JLayeredPane();
        jLabel18 = new javax.swing.JLabel();
        cargarDatos = new javax.swing.JLayeredPane();
        jLabel19 = new javax.swing.JLabel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        ZEste = new javax.swing.JRadioButton();
        ZNorte = new javax.swing.JRadioButton();
        ZOeste = new javax.swing.JRadioButton();
        ZSur = new javax.swing.JRadioButton();
        menuGestion = new javax.swing.JLayeredPane();
        agregarA = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        modA = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        borrarA = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        consumoA = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        listaA = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jLayeredPane13 = new javax.swing.JLayeredPane();
        menuModi = new javax.swing.JLayeredPane();
        agregarA1 = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        jLayeredPane15 = new javax.swing.JLayeredPane();
        volverBorrar = new javax.swing.JButton();
        cerrarValvula = new javax.swing.JButton();
        listaMod = new javax.swing.JScrollPane();
        listaModificar = new javax.swing.JList<>();
        abrirValvula = new javax.swing.JButton();
        menuBorrar = new javax.swing.JLayeredPane();
        agregarA2 = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        jLayeredPane16 = new javax.swing.JLayeredPane();
        volverBorrar1 = new javax.swing.JButton();
        borrarBUtton1 = new javax.swing.JButton();
        listaBorr = new javax.swing.JScrollPane();
        listaBorrar1 = new javax.swing.JList<>();
        menuCreacion = new javax.swing.JLayeredPane();
        jLayeredPane14 = new javax.swing.JLayeredPane();
        volverCrear = new javax.swing.JButton();
        gestionSis1 = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        setCaudal = new javax.swing.JTextField();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        setZona = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        menuMost = new javax.swing.JLayeredPane();
        agregarA4 = new javax.swing.JLayeredPane();
        jLabel15 = new javax.swing.JLabel();
        jLayeredPane18 = new javax.swing.JLayeredPane();
        volverMost = new javax.swing.JButton();
        listaMost = new javax.swing.JScrollPane();
        listaMostrar = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane3.setBackground(new java.awt.Color(204, 255, 255));
        jLayeredPane3.setOpaque(true);

        jLayeredPane4.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane4.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de riego");

        jLayeredPane4.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        gestionDat.setBackground(new java.awt.Color(18, 101, 101));
        gestionDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionDat.setOpaque(true);
        gestionDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gestionDatMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion Datos");

        gestionDat.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout gestionDatLayout = new javax.swing.GroupLayout(gestionDat);
        gestionDat.setLayout(gestionDatLayout);
        gestionDatLayout.setHorizontalGroup(
            gestionDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        gestionDatLayout.setVerticalGroup(
            gestionDatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionDatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        gestionSis.setBackground(new java.awt.Color(18, 101, 101));
        gestionSis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionSis.setOpaque(true);
        gestionSis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gestionSisMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestion Sistema");

        gestionSis.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout gestionSisLayout = new javax.swing.GroupLayout(gestionSis);
        gestionSis.setLayout(gestionSisLayout);
        gestionSisLayout.setHorizontalGroup(
            gestionSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionSisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        gestionSisLayout.setVerticalGroup(
            gestionSisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionSisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane3.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(gestionDat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(gestionSis, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4)
                .addContainerGap())
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(gestionDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(gestionSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(gestionDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(gestionSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );

        jLayeredPane1.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jLayeredPane2.setBackground(new java.awt.Color(0, 204, 204));
        jLayeredPane2.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jLayeredPane1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 410));

        menuConsum.setBackground(new java.awt.Color(204, 255, 255));
        menuConsum.setOpaque(true);
        menuConsum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarA3.setBackground(new java.awt.Color(18, 101, 101));
        agregarA3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarA3.setOpaque(true);
        agregarA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarA3MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consumo");

        agregarA3.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout agregarA3Layout = new javax.swing.GroupLayout(agregarA3);
        agregarA3.setLayout(agregarA3Layout);
        agregarA3Layout.setHorizontalGroup(
            agregarA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarA3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        agregarA3Layout.setVerticalGroup(
            agregarA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarA3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuConsum.add(agregarA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLayeredPane17.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane17.setOpaque(true);

        volverBorrar2.setBackground(new java.awt.Color(0, 204, 204));
        volverBorrar2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        volverBorrar2.setForeground(new java.awt.Color(0, 0, 0));
        volverBorrar2.setText("VOLVER");
        volverBorrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBorrar2ActionPerformed(evt);
            }
        });

        jLayeredPane17.setLayer(volverBorrar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane17Layout = new javax.swing.GroupLayout(jLayeredPane17);
        jLayeredPane17.setLayout(jLayeredPane17Layout);
        jLayeredPane17Layout.setHorizontalGroup(
            jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane17Layout.createSequentialGroup()
                .addGap(0, 326, Short.MAX_VALUE)
                .addComponent(volverBorrar2))
        );
        jLayeredPane17Layout.setVerticalGroup(
            jLayeredPane17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverBorrar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menuConsum.add(jLayeredPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        textoCOnsumo.setBackground(new java.awt.Color(0, 204, 204));
        textoCOnsumo.setForeground(new java.awt.Color(0, 0, 0));
        menuConsum.add(textoCOnsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, 40));

        jButton1.setBackground(new java.awt.Color(176, 19, 34));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Abrir/Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuConsum.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 130, 30));

        jLayeredPane1.add(menuConsum, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        menuDatos.setBackground(new java.awt.Color(204, 255, 255));
        menuDatos.setOpaque(true);
        menuDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane19.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane19.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Gestion de datos");

        jLayeredPane19.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane19Layout = new javax.swing.GroupLayout(jLayeredPane19);
        jLayeredPane19.setLayout(jLayeredPane19Layout);
        jLayeredPane19Layout.setHorizontalGroup(
            jLayeredPane19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jLayeredPane19Layout.setVerticalGroup(
            jLayeredPane19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menuDatos.add(jLayeredPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        Informe.setBackground(new java.awt.Color(18, 101, 101));
        Informe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Informe.setOpaque(true);
        Informe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InformeMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Informe");

        Informe.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout InformeLayout = new javax.swing.GroupLayout(Informe);
        Informe.setLayout(InformeLayout);
        InformeLayout.setHorizontalGroup(
            InformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        InformeLayout.setVerticalGroup(
            InformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuDatos.add(Informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 340, 50));

        guardarCopia1.setBackground(new java.awt.Color(18, 101, 101));
        guardarCopia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarCopia1.setOpaque(true);
        guardarCopia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                guardarCopia1MousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Guardar los datos");

        guardarCopia1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout guardarCopia1Layout = new javax.swing.GroupLayout(guardarCopia1);
        guardarCopia1.setLayout(guardarCopia1Layout);
        guardarCopia1Layout.setHorizontalGroup(
            guardarCopia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guardarCopia1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        guardarCopia1Layout.setVerticalGroup(
            guardarCopia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guardarCopia1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuDatos.add(guardarCopia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 340, 50));

        cargarDatos.setBackground(new java.awt.Color(18, 101, 101));
        cargarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarDatos.setOpaque(true);
        cargarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cargarDatosMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cargar copia de seguridad");

        cargarDatos.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout cargarDatosLayout = new javax.swing.GroupLayout(cargarDatos);
        cargarDatos.setLayout(cargarDatosLayout);
        cargarDatosLayout.setHorizontalGroup(
            cargarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        cargarDatosLayout.setVerticalGroup(
            cargarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cargarDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuDatos.add(cargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 50));

        jLayeredPane7.setBackground(new java.awt.Color(0, 204, 204));
        jLayeredPane7.setOpaque(true);

        ZEste.setBackground(new java.awt.Color(18, 101, 101));
        ZoneGroup.add(ZEste);
        ZEste.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ZEste.setForeground(new java.awt.Color(255, 255, 255));
        ZEste.setText("Zona Este");
        ZEste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZEsteActionPerformed(evt);
            }
        });

        ZNorte.setBackground(new java.awt.Color(18, 101, 101));
        ZoneGroup.add(ZNorte);
        ZNorte.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ZNorte.setForeground(new java.awt.Color(255, 255, 255));
        ZNorte.setText("Zona Norte");
        ZNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZNorteActionPerformed(evt);
            }
        });

        ZOeste.setBackground(new java.awt.Color(18, 101, 101));
        ZoneGroup.add(ZOeste);
        ZOeste.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ZOeste.setForeground(new java.awt.Color(255, 255, 255));
        ZOeste.setText("Zona Oeste");
        ZOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZOesteActionPerformed(evt);
            }
        });

        ZSur.setBackground(new java.awt.Color(18, 101, 101));
        ZoneGroup.add(ZSur);
        ZSur.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ZSur.setForeground(new java.awt.Color(255, 255, 255));
        ZSur.setText("Zona Sur");
        ZSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZSurActionPerformed(evt);
            }
        });

        jLayeredPane7.setLayer(ZEste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(ZNorte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(ZOeste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(ZSur, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ZOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(ZEste, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZSur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(ZNorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZEste)
                    .addComponent(ZOeste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZSur)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        menuDatos.add(jLayeredPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, 100));

        jLayeredPane1.add(menuDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        menuGestion.setBackground(new java.awt.Color(204, 255, 255));
        menuGestion.setOpaque(true);

        agregarA.setBackground(new java.awt.Color(18, 101, 101));
        agregarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarA.setOpaque(true);
        agregarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarAMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agregar Aspersor");

        agregarA.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout agregarALayout = new javax.swing.GroupLayout(agregarA);
        agregarA.setLayout(agregarALayout);
        agregarALayout.setHorizontalGroup(
            agregarALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        agregarALayout.setVerticalGroup(
            agregarALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        modA.setBackground(new java.awt.Color(18, 101, 101));
        modA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modA.setOpaque(true);
        modA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modAMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modificar Aspersor");

        modA.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout modALayout = new javax.swing.GroupLayout(modA);
        modA.setLayout(modALayout);
        modALayout.setHorizontalGroup(
            modALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        modALayout.setVerticalGroup(
            modALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        borrarA.setBackground(new java.awt.Color(18, 101, 101));
        borrarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarA.setOpaque(true);
        borrarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borrarAMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Borrar Asperor");

        borrarA.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout borrarALayout = new javax.swing.GroupLayout(borrarA);
        borrarA.setLayout(borrarALayout);
        borrarALayout.setHorizontalGroup(
            borrarALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        borrarALayout.setVerticalGroup(
            borrarALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrarALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        consumoA.setBackground(new java.awt.Color(18, 101, 101));
        consumoA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consumoA.setOpaque(true);
        consumoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consumoAMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consumo Total");

        consumoA.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout consumoALayout = new javax.swing.GroupLayout(consumoA);
        consumoA.setLayout(consumoALayout);
        consumoALayout.setHorizontalGroup(
            consumoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consumoALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        consumoALayout.setVerticalGroup(
            consumoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consumoALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        listaA.setBackground(new java.awt.Color(18, 101, 101));
        listaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaA.setOpaque(true);
        listaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaAMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lista Aspersores");

        listaA.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout listaALayout = new javax.swing.GroupLayout(listaA);
        listaA.setLayout(listaALayout);
        listaALayout.setHorizontalGroup(
            listaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        listaALayout.setVerticalGroup(
            listaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane13.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane13.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane13Layout = new javax.swing.GroupLayout(jLayeredPane13);
        jLayeredPane13.setLayout(jLayeredPane13Layout);
        jLayeredPane13Layout.setHorizontalGroup(
            jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jLayeredPane13Layout.setVerticalGroup(
            jLayeredPane13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        menuGestion.setLayer(agregarA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuGestion.setLayer(modA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuGestion.setLayer(borrarA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuGestion.setLayer(consumoA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuGestion.setLayer(listaA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menuGestion.setLayer(jLayeredPane13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menuGestionLayout = new javax.swing.GroupLayout(menuGestion);
        menuGestion.setLayout(menuGestionLayout);
        menuGestionLayout.setHorizontalGroup(
            menuGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGestionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(menuGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane13)
        );
        menuGestionLayout.setVerticalGroup(
            menuGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGestionLayout.createSequentialGroup()
                .addComponent(jLayeredPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(agregarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrarA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consumoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLayeredPane1.add(menuGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        menuModi.setBackground(new java.awt.Color(204, 255, 255));
        menuModi.setOpaque(true);
        menuModi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarA1.setBackground(new java.awt.Color(18, 101, 101));
        agregarA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarA1.setOpaque(true);
        agregarA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarA1MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Modificar estado");

        agregarA1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout agregarA1Layout = new javax.swing.GroupLayout(agregarA1);
        agregarA1.setLayout(agregarA1Layout);
        agregarA1Layout.setHorizontalGroup(
            agregarA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        agregarA1Layout.setVerticalGroup(
            agregarA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuModi.add(agregarA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLayeredPane15.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane15.setOpaque(true);

        volverBorrar.setBackground(new java.awt.Color(0, 204, 204));
        volverBorrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        volverBorrar.setForeground(new java.awt.Color(0, 0, 0));
        volverBorrar.setText("VOLVER");
        volverBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBorrarActionPerformed(evt);
            }
        });

        jLayeredPane15.setLayer(volverBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane15Layout = new javax.swing.GroupLayout(jLayeredPane15);
        jLayeredPane15.setLayout(jLayeredPane15Layout);
        jLayeredPane15Layout.setHorizontalGroup(
            jLayeredPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane15Layout.createSequentialGroup()
                .addGap(0, 326, Short.MAX_VALUE)
                .addComponent(volverBorrar))
        );
        jLayeredPane15Layout.setVerticalGroup(
            jLayeredPane15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menuModi.add(jLayeredPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        cerrarValvula.setBackground(new java.awt.Color(0, 204, 204));
        cerrarValvula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        cerrarValvula.setForeground(new java.awt.Color(0, 0, 0));
        cerrarValvula.setText("CERRAR");
        cerrarValvula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarValvula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarValvulaActionPerformed(evt);
            }
        });
        menuModi.add(cerrarValvula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        listaModificar.setBackground(new java.awt.Color(0, 204, 204));
        listaModificar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        listaModificar.setForeground(new java.awt.Color(0, 0, 0));
        listaMod.setViewportView(listaModificar);

        menuModi.add(listaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 260));

        abrirValvula.setBackground(new java.awt.Color(0, 204, 204));
        abrirValvula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        abrirValvula.setForeground(new java.awt.Color(0, 0, 0));
        abrirValvula.setText("ABRIR");
        abrirValvula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abrirValvula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirValvulaActionPerformed(evt);
            }
        });
        menuModi.add(abrirValvula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLayeredPane1.add(menuModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        menuBorrar.setBackground(new java.awt.Color(204, 255, 255));
        menuBorrar.setOpaque(true);
        menuBorrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarA2.setBackground(new java.awt.Color(18, 101, 101));
        agregarA2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarA2.setOpaque(true);
        agregarA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarA2MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Borrar Aspersor");

        agregarA2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout agregarA2Layout = new javax.swing.GroupLayout(agregarA2);
        agregarA2.setLayout(agregarA2Layout);
        agregarA2Layout.setHorizontalGroup(
            agregarA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarA2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        agregarA2Layout.setVerticalGroup(
            agregarA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarA2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuBorrar.add(agregarA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLayeredPane16.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane16.setOpaque(true);

        volverBorrar1.setBackground(new java.awt.Color(0, 204, 204));
        volverBorrar1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        volverBorrar1.setForeground(new java.awt.Color(0, 0, 0));
        volverBorrar1.setText("VOLVER");
        volverBorrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBorrar1ActionPerformed(evt);
            }
        });

        jLayeredPane16.setLayer(volverBorrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane16Layout = new javax.swing.GroupLayout(jLayeredPane16);
        jLayeredPane16.setLayout(jLayeredPane16Layout);
        jLayeredPane16Layout.setHorizontalGroup(
            jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane16Layout.createSequentialGroup()
                .addGap(0, 326, Short.MAX_VALUE)
                .addComponent(volverBorrar1))
        );
        jLayeredPane16Layout.setVerticalGroup(
            jLayeredPane16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverBorrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menuBorrar.add(jLayeredPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        borrarBUtton1.setBackground(new java.awt.Color(0, 204, 204));
        borrarBUtton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        borrarBUtton1.setForeground(new java.awt.Color(0, 0, 0));
        borrarBUtton1.setText("BORRAR");
        borrarBUtton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarBUtton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBUtton1ActionPerformed(evt);
            }
        });
        menuBorrar.add(borrarBUtton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        listaBorrar1.setBackground(new java.awt.Color(0, 204, 204));
        listaBorrar1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        listaBorrar1.setForeground(new java.awt.Color(0, 0, 0));
        listaBorr.setViewportView(listaBorrar1);

        menuBorrar.add(listaBorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 260));

        jLayeredPane1.add(menuBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        menuCreacion.setBackground(new java.awt.Color(204, 255, 255));
        menuCreacion.setOpaque(true);
        menuCreacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane14.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane14.setOpaque(true);

        volverCrear.setBackground(new java.awt.Color(0, 204, 204));
        volverCrear.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        volverCrear.setForeground(new java.awt.Color(0, 0, 0));
        volverCrear.setText("Volver");
        volverCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverCrearActionPerformed(evt);
            }
        });

        jLayeredPane14.setLayer(volverCrear, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane14Layout = new javax.swing.GroupLayout(jLayeredPane14);
        jLayeredPane14.setLayout(jLayeredPane14Layout);
        jLayeredPane14Layout.setHorizontalGroup(
            jLayeredPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane14Layout.createSequentialGroup()
                .addGap(0, 328, Short.MAX_VALUE)
                .addComponent(volverCrear))
        );
        jLayeredPane14Layout.setVerticalGroup(
            jLayeredPane14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menuCreacion.add(jLayeredPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        gestionSis1.setBackground(new java.awt.Color(18, 101, 101));
        gestionSis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gestionSis1.setOpaque(true);
        gestionSis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gestionSis1MousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Crear Aspersor");

        gestionSis1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout gestionSis1Layout = new javax.swing.GroupLayout(gestionSis1);
        gestionSis1.setLayout(gestionSis1Layout);
        gestionSis1Layout.setHorizontalGroup(
            gestionSis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gestionSis1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        gestionSis1Layout.setVerticalGroup(
            gestionSis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gestionSis1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuCreacion.add(gestionSis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLayeredPane5.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane5.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Caudal:");

        setCaudal.setBackground(new java.awt.Color(0, 204, 204));
        setCaudal.setForeground(new java.awt.Color(0, 0, 0));

        jLayeredPane5.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(setCaudal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setCaudal, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(setCaudal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        menuCreacion.add(jLayeredPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, 50));

        jLayeredPane6.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane6.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Zona :");

        setZona.setBackground(new java.awt.Color(0, 204, 204));
        setZona.setForeground(new java.awt.Color(0, 0, 0));

        jLayeredPane6.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(setZona, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(setZona, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(setZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        menuCreacion.add(jLayeredPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 50));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("CREAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menuCreacion.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLayeredPane1.add(menuCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        menuMost.setBackground(new java.awt.Color(204, 255, 255));
        menuMost.setOpaque(true);
        menuMost.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarA4.setBackground(new java.awt.Color(18, 101, 101));
        agregarA4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarA4.setOpaque(true);
        agregarA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarA4MousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mostrar");

        agregarA4.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout agregarA4Layout = new javax.swing.GroupLayout(agregarA4);
        agregarA4.setLayout(agregarA4Layout);
        agregarA4Layout.setHorizontalGroup(
            agregarA4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarA4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        agregarA4Layout.setVerticalGroup(
            agregarA4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarA4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuMost.add(agregarA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLayeredPane18.setBackground(new java.awt.Color(18, 101, 101));
        jLayeredPane18.setOpaque(true);

        volverMost.setBackground(new java.awt.Color(0, 204, 204));
        volverMost.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        volverMost.setForeground(new java.awt.Color(0, 0, 0));
        volverMost.setText("VOLVER");
        volverMost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volverMost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMostActionPerformed(evt);
            }
        });

        jLayeredPane18.setLayer(volverMost, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane18Layout = new javax.swing.GroupLayout(jLayeredPane18);
        jLayeredPane18.setLayout(jLayeredPane18Layout);
        jLayeredPane18Layout.setHorizontalGroup(
            jLayeredPane18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane18Layout.createSequentialGroup()
                .addGap(0, 326, Short.MAX_VALUE)
                .addComponent(volverMost))
        );
        jLayeredPane18Layout.setVerticalGroup(
            jLayeredPane18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(volverMost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        menuMost.add(jLayeredPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        listaMostrar.setBackground(new java.awt.Color(0, 204, 204));
        listaMostrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        listaMostrar.setForeground(new java.awt.Color(0, 0, 0));
        listaMost.setViewportView(listaMostrar);

        menuMost.add(listaMost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 260));

        jLayeredPane1.add(menuMost, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 400, 400));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionSisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionSisMousePressed
        // TODO add your handling code here:
        /**
         * Gestion de ventanas
         *
         * @param evt
         */
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_gestionSisMousePressed

    private void gestionDatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionDatMousePressed

        menuGestion.setVisible(false);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(true);


    }//GEN-LAST:event_gestionDatMousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void agregarAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarAMousePressed
        // TODO add your handling code here:
        menuGestion.setVisible(false);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(true);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_agregarAMousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void modAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modAMousePressed
        // TODO add your handling code here:
        refrescarM(sistemaR.getListaAspersores());
        menuGestion.setVisible(false);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(true);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_modAMousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void borrarAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarAMousePressed
        // TODO add your handling code here:
        refrescarB(sistemaR.getListaAspersores());
        menuGestion.setVisible(false);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(true);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_borrarAMousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void consumoAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consumoAMousePressed
        // TODO add your handling code here:

        int res = sistemaR.calcularConsumoTotal();
        textoCOnsumo.setText(Integer.toString(res));

        menuGestion.setVisible(false);
        menuConsum.setVisible(true);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_consumoAMousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void listaAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAMousePressed
        // TODO add your handling code here:
        refrescar(sistemaR.getListaAspersores());
        menuGestion.setVisible(false);
        menuConsum.setVisible(false);
        menuMost.setVisible(true);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_listaAMousePressed

    private void gestionSis1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionSis1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionSis1MousePressed

    private void agregarA1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarA1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarA1MousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void volverBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBorrarActionPerformed
        // TODO add your handling code here:
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_volverBorrarActionPerformed

    private void agregarA2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarA2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarA2MousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void volverBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBorrar1ActionPerformed
        // TODO add your handling code here:
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_volverBorrar1ActionPerformed

    private void agregarA3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarA3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarA3MousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void volverBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBorrar2ActionPerformed
        // TODO add your handling code here:
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_volverBorrar2ActionPerformed

    private void agregarA4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarA4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarA4MousePressed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void volverMostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMostActionPerformed
        // TODO add your handling code here:
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_volverMostActionPerformed
    /**
     * Gestion de ventanas
     *
     * @param evt
     */
    private void volverCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverCrearActionPerformed
        // TODO add your handling code here:
        menuGestion.setVisible(true);
        menuConsum.setVisible(false);
        menuMost.setVisible(false);
        menuModi.setVisible(false);
        menuBorrar.setVisible(false);
        menuCreacion.setVisible(false);
        menuDatos.setVisible(false);
    }//GEN-LAST:event_volverCrearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            sistemaR.agregarAspersor(setZona.getText(), setCaudal.getText());
            refrescar(sistemaR.getListaAspersores());
            setCaudal.setText("");
            setZona.setText("");
            JOptionPane.showMessageDialog(this, "Valores correctos", "Creado con exito", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Creado con exito");
        } catch (Exception ex) {
            System.out.println("Me rompo arriba");
            JOptionPane.showMessageDialog(this, "Valores invalidos", "Error al crear", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void borrarBUtton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBUtton1ActionPerformed
        // TODO add your handling code here:
        //Obtenemos la seleccionç

        int index = listaBorrar1.getSelectedIndex();
        String aspersorLista = listaBorrar1.getSelectedValue();

        if (index != -1) {//Si hay algo seleccionado comenzamos la operacion
            int n = JOptionPane.showConfirmDialog(//Pedimos confirmacion
                    this,
                    "Deseas borrar al usuario?",
                    "Confirmacion borrado",
                    JOptionPane.YES_NO_OPTION);
            System.out.println("N:" + n);
            if (n == 0) {//Si confirma
                String campos[] = aspersorLista.split(",");//Divide en campos ek aspersor
                sistemaR.borrarAspersor(campos[0]);//Borra aquel que su id coincida
                refrescarB(sistemaR.getListaAspersores());//refresca la lista
                JOptionPane.showMessageDialog(this, "Aspersor Borrado", "Borrado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el aspersor a borrar", "Error al borrar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_borrarBUtton1ActionPerformed

    private void abrirValvulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirValvulaActionPerformed
        // TODO add your handling code here:
        int index = listaModificar.getSelectedIndex();
        String aspersorLista = listaModificar.getSelectedValue();

        if (index != -1) {
            String campos[] = aspersorLista.split(",");
            String id = campos[0];

            try {
                // Intentamos modificar el estado del aspersor a 'true'
                boolean modificado = sistemaR.modificarAspersor(id, true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de Sistema", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un aspersor de la lista", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
        }
        refrescarM(sistemaR.getListaAspersores());

    }//GEN-LAST:event_abrirValvulaActionPerformed

    private void cerrarValvulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarValvulaActionPerformed
        // TODO add your handling code here:
        int index = listaModificar.getSelectedIndex();
        String aspersorLista = listaModificar.getSelectedValue();

        if (index != -1) {
            String campos[] = aspersorLista.split(",");
            String id = campos[0];

            try {
                // Intentamos modificar el estado del aspersor a 'true'
                boolean modificado = sistemaR.modificarAspersor(id, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error de Sistema", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un aspersor de la lista", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
        }
        refrescarM(sistemaR.getListaAspersores());

    }//GEN-LAST:event_cerrarValvulaActionPerformed

    private void InformeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformeMousePressed

        String zona = "";

        if (ZNorte.isSelected()) {

            zona = "Norte";

        } else if (ZSur.isSelected()) {

            zona = "Sur";

        } else if (ZEste.isSelected()) {

            zona = "Este";

        } else if (ZOeste.isSelected()) {

            zona = "oeste";

        } else {

            JOptionPane.showMessageDialog(this, "Por favor, selecciona una zona para generar el informe.", "Zona requerida", JOptionPane.WARNING_MESSAGE);

        }

        if (zona != "") {

            try {
                GestorDatos.exportarInformeTexto(sistemaR, zona);
                JOptionPane.showMessageDialog(this, "Informe de la zona " + zona + " generado correctamente", "Informe Generado", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Hubo un error al generar el informe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_InformeMousePressed

    private void guardarCopia1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarCopia1MousePressed

        GestorDatos.guardarCopiaSeguridad(sistemaR);
        JOptionPane.showMessageDialog(this, "Datos guardados correctamente.", "Guardado exitoso :)", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_guardarCopia1MousePressed

    private void cargarDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarDatosMousePressed
        this.sistemaR = GestorDatos.cargarCopiaSeguridad();
        JOptionPane.showMessageDialog(this, "Datos cargados correctamente.", "Carga exitosa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cargarDatosMousePressed

    private void ZOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZOesteActionPerformed

    }//GEN-LAST:event_ZOesteActionPerformed

    private void ZNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZNorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZNorteActionPerformed

    private void ZEsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZEsteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZEsteActionPerformed

    private void ZSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZSurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZSurActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(sistemaR.isValvulaGeneral() == true){
            sistemaR.setValvulaGeneral(false);
        }else{
            sistemaR.setValvulaGeneral(true);
        }
        textoCOnsumo.setText(Integer.toString(sistemaR.calcularConsumoTotal()));
    }//GEN-LAST:event_jButton1ActionPerformed

    public void refrescar(ArrayList<Aspersor> contenido) {

        DefaultListModel<String> model = new DefaultListModel<>();//Necesario para jList

        for (Aspersor item : contenido) {
            model.addElement(item.toString());//Rellena con el contenido del ArrayList el modelo
        }
        listaMostrar.setModel(model);//Le da los valores a la lista

    }

    public void refrescarB(ArrayList<Aspersor> contenido) {

        DefaultListModel<String> model = new DefaultListModel<>();//Necesario para jList

        for (Aspersor item : contenido) {
            model.addElement(item.toString());//Rellena con el contenido del ArrayList el modelo
        }
        listaBorrar1.setModel(model);//Le da los valores a la lista

    }

    public void refrescarM(ArrayList<Aspersor> contenido) {

        DefaultListModel<String> model = new DefaultListModel<>();//Necesario para jList

        for (Aspersor item : contenido) {
            model.addElement(item.toString());//Rellena con el contenido del ArrayList el modelo
        }
        listaModificar.setModel(model);//Le da los valores a la lista

    }

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Informe;
    private javax.swing.JRadioButton ZEste;
    private javax.swing.JRadioButton ZNorte;
    private javax.swing.JRadioButton ZOeste;
    private javax.swing.JRadioButton ZSur;
    private javax.swing.ButtonGroup ZoneGroup;
    private javax.swing.JButton abrirValvula;
    private javax.swing.JLayeredPane agregarA;
    private javax.swing.JLayeredPane agregarA1;
    private javax.swing.JLayeredPane agregarA2;
    private javax.swing.JLayeredPane agregarA3;
    private javax.swing.JLayeredPane agregarA4;
    private javax.swing.JLayeredPane borrarA;
    private javax.swing.JButton borrarBUtton1;
    private javax.swing.JLayeredPane cargarDatos;
    private javax.swing.JButton cerrarValvula;
    private javax.swing.JLayeredPane consumoA;
    private javax.swing.JLayeredPane gestionDat;
    private javax.swing.JLayeredPane gestionSis;
    private javax.swing.JLayeredPane gestionSis1;
    private javax.swing.JLayeredPane guardarCopia1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane13;
    private javax.swing.JLayeredPane jLayeredPane14;
    private javax.swing.JLayeredPane jLayeredPane15;
    private javax.swing.JLayeredPane jLayeredPane16;
    private javax.swing.JLayeredPane jLayeredPane17;
    private javax.swing.JLayeredPane jLayeredPane18;
    private javax.swing.JLayeredPane jLayeredPane19;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane listaA;
    private javax.swing.JScrollPane listaBorr;
    private javax.swing.JList<String> listaBorrar1;
    private javax.swing.JScrollPane listaMod;
    private javax.swing.JList<String> listaModificar;
    private javax.swing.JScrollPane listaMost;
    private javax.swing.JList<String> listaMostrar;
    private javax.swing.JLayeredPane menuBorrar;
    private javax.swing.JLayeredPane menuConsum;
    private javax.swing.JLayeredPane menuCreacion;
    private javax.swing.JLayeredPane menuDatos;
    private javax.swing.JLayeredPane menuGestion;
    private javax.swing.JLayeredPane menuModi;
    private javax.swing.JLayeredPane menuMost;
    private javax.swing.JLayeredPane modA;
    private javax.swing.JTextField setCaudal;
    private javax.swing.JTextField setZona;
    private javax.swing.JTextField textoCOnsumo;
    private javax.swing.JButton volverBorrar;
    private javax.swing.JButton volverBorrar1;
    private javax.swing.JButton volverBorrar2;
    private javax.swing.JButton volverCrear;
    private javax.swing.JButton volverMost;
    // End of variables declaration//GEN-END:variables

    private SistemaRiego sistemaR = new SistemaRiego();//Creamos un objeto del tipo SistemaRiego para poder acceder a sus metodos
    private GestorDatos gestorD;
}
