package vistas;
import entidades.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logicaNegocio.lnCliente;
public class menuPrincipal extends javax.swing.JFrame {
    public menuPrincipal() {
         initComponents();
        this.setSize(1500, 900);
        menu.setSize(1500, 100);
        RegistroCliente.setVisible(false);
        logoprincipal.setVisible(true);
        ActualizarCliente.setVisible(false);
        ConsultarCliente.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoprincipal = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        RegistroCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rcorreo = new javax.swing.JTextField();
        Rnombre = new javax.swing.JTextField();
        Rapellido = new javax.swing.JTextField();
        rdirecc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rcelular = new javax.swing.JFormattedTextField();
        rcedula = new javax.swing.JFormattedTextField();
        ActualizarCliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        RidCliente1 = new javax.swing.JTextField();
        rcorreo1 = new javax.swing.JTextField();
        Rnombre1 = new javax.swing.JTextField();
        Rapellido1 = new javax.swing.JTextField();
        rdirecc1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bAcutalizarCliente = new javax.swing.JButton();
        rcelular1 = new javax.swing.JFormattedTextField();
        rcedula1 = new javax.swing.JFormattedTextField();
        consulta = new javax.swing.JTextField();
        conActualizarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableActualizarCliente = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        ConsultarCliente = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rcorreo2 = new javax.swing.JTextField();
        Rnombre2 = new javax.swing.JTextField();
        Rapellido2 = new javax.swing.JTextField();
        rdirecc2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        rcelular2 = new javax.swing.JFormattedTextField();
        rcedula2 = new javax.swing.JFormattedTextField();
        consultaCliente = new javax.swing.JTextField();
        bConsultarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaCliente = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        Clientes = new javax.swing.JMenu();
        menuRegistrarCliente = new javax.swing.JMenuItem();
        actualizarCliente = new javax.swing.JMenuItem();
        consultarCliente = new javax.swing.JMenuItem();
        Eventos = new javax.swing.JMenu();
        RegistrarEvento = new javax.swing.JMenu();
        reservacion = new javax.swing.JMenuItem();
        ActualizarEvento = new javax.swing.JMenu();
        EventoAct = new javax.swing.JMenuItem();
        ConsultarEvento = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Menu = new javax.swing.JMenu();
        RegistrarMenu = new javax.swing.JMenuItem();
        ActualizarMenu = new javax.swing.JMenuItem();
        ConsultarMenu = new javax.swing.JMenuItem();
        Nomina = new javax.swing.JMenu();
        RegistrarTrabajador = new javax.swing.JMenuItem();
        ActualizarTrabajador = new javax.swing.JMenuItem();
        ConsultarTrabajador = new javax.swing.JMenuItem();
        PagosTrabajadores = new javax.swing.JMenu();
        RegistrarPago = new javax.swing.JMenuItem();
        ActualizarPago = new javax.swing.JMenuItem();
        ConsultarPago = new javax.swing.JMenu();
        PagoPorFecha = new javax.swing.JMenuItem();
        PagoPorNombre = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1510, 810));
        setPreferredSize(new java.awt.Dimension(1510, 860));

        logoprincipal.setLayout(new java.awt.CardLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2020-02-11 at 22.10.52.jpg"))); // NOI18N
        logoprincipal.add(jLabel7, "card2");

        RegistroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Nombre:");
        RegistroCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Apellido:");
        RegistroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Cédula de cuidadanía:");
        RegistroCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Número de teléfono móvil:");
        RegistroCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Dirección de domicilio:");
        RegistroCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Correo Electrónico:");
        RegistroCliente.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("Registro de Cliente");
        RegistroCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        rcorreo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroCliente.add(rcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 450, 50));

        Rnombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroCliente.add(Rnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 450, 50));

        Rapellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroCliente.add(Rapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 450, 50));

        rdirecc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroCliente.add(rdirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 450, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        RegistroCliente.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        RegistroCliente.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, -1, -1));

        try {
            rcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rcelular.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroCliente.add(rcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 450, 50));

        try {
            rcedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rcedula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroCliente.add(rcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 450, 50));

        ActualizarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("IdCliente:");
        ActualizarCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setText("Apellido:");
        ActualizarCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setText("Cédula de cuidadanía:");
        ActualizarCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("Número de teléfono móvil:");
        ActualizarCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setText("Dirección de domicilio:");
        ActualizarCliente.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel14.setText("Correo Electrónico:");
        ActualizarCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setText("Actualizar un Cliente");
        ActualizarCliente.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        RidCliente1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(RidCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 130, 50));

        rcorreo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ActualizarCliente.add(rcorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 450, 50));

        Rnombre1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(Rnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 450, 50));

        Rapellido1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(Rapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 450, 50));

        rdirecc1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(rdirecc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 450, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        ActualizarCliente.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, -1, -1));

        bAcutalizarCliente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bAcutalizarCliente.setText("Actualizar");
        bAcutalizarCliente.setEnabled(false);
        bAcutalizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAcutalizarClienteActionPerformed(evt);
            }
        });
        ActualizarCliente.add(bAcutalizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 690, -1, -1));

        try {
            rcelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rcelular1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(rcelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 450, 50));

        try {
            rcedula1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rcedula1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(rcedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 450, 50));

        consulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActualizarCliente.add(consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 300, -1));

        conActualizarCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        conActualizarCliente.setText("Consultar");
        conActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conActualizarClienteActionPerformed(evt);
            }
        });
        ActualizarCliente.add(conActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jTableActualizarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableActualizarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableActualizarClienteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableActualizarCliente);

        ActualizarCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 700, 150));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel23.setText("Nombre:");
        ActualizarCliente.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        ConsultarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setText("Nombre:");
        ConsultarCliente.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel17.setText("Apellido:");
        ConsultarCliente.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel18.setText("Cédula de cuidadanía:");
        ConsultarCliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel19.setText("Número de teléfono móvil:");
        ConsultarCliente.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setText("Dirección de domicilio:");
        ConsultarCliente.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel21.setText("Correo Electrónico:");
        ConsultarCliente.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel22.setText("Consultar un Cliente");
        ConsultarCliente.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        rcorreo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConsultarCliente.add(rcorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, 450, 50));

        Rnombre2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConsultarCliente.add(Rnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 450, 50));

        Rapellido2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConsultarCliente.add(Rapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 450, 50));

        rdirecc2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConsultarCliente.add(rdirecc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 450, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ConsultarCliente.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 130, -1));

        try {
            rcelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rcelular2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConsultarCliente.add(rcelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 450, 50));

        try {
            rcedula2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rcedula2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConsultarCliente.add(rcedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 450, 50));

        consultaCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        consultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaClienteActionPerformed(evt);
            }
        });
        ConsultarCliente.add(consultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 300, -1));

        bConsultarCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bConsultarCliente.setText("Consultar");
        bConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarClienteActionPerformed(evt);
            }
        });
        ConsultarCliente.add(bConsultarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jTableConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableConsultaClienteMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableConsultaCliente);

        ConsultarCliente.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 1010, 190));

        menu.setAlignmentX(20.0F);
        menu.setAlignmentY(20.0F);
        menu.setFont(menu.getFont().deriveFont((float)48));
        menu.setMinimumSize(new java.awt.Dimension(0, 5));
        menu.setPreferredSize(new java.awt.Dimension(379, 70));

        Clientes.setText("Cliente");
        Clientes.setAlignmentX(20.0F);
        Clientes.setAlignmentY(20.0F);
        Clientes.setFont(Clientes.getFont().deriveFont((float)48));
        Clientes.setMaximumSize(new java.awt.Dimension(288, 32767));
        Clientes.setMinimumSize(new java.awt.Dimension(100, 60));
        Clientes.setPreferredSize(new java.awt.Dimension(210, 60));

        menuRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        menuRegistrarCliente.setText("Registrar Cliente");
        menuRegistrarCliente.setPreferredSize(new java.awt.Dimension(285, 32));
        menuRegistrarCliente.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                menuRegistrarClienteComponentAdded(evt);
            }
        });
        menuRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarClienteActionPerformed(evt);
            }
        });
        Clientes.add(menuRegistrarCliente);

        actualizarCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        actualizarCliente.setText("Actualizar Cliente");
        actualizarCliente.setPreferredSize(new java.awt.Dimension(285, 32));
        actualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarClienteActionPerformed(evt);
            }
        });
        Clientes.add(actualizarCliente);

        consultarCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        consultarCliente.setText("Consultar Cliente");
        consultarCliente.setPreferredSize(new java.awt.Dimension(285, 32));
        consultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarClienteActionPerformed(evt);
            }
        });
        Clientes.add(consultarCliente);

        menu.add(Clientes);

        Eventos.setText("Eventos");
        Eventos.setFont(Eventos.getFont().deriveFont((float)48));
        Eventos.setMaximumSize(new java.awt.Dimension(288, 32767));
        Eventos.setPreferredSize(new java.awt.Dimension(260, 60));

        RegistrarEvento.setText("Registrar");
        RegistrarEvento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RegistrarEvento.setPreferredSize(new java.awt.Dimension(285, 32));

        reservacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        reservacion.setText("Evento");
        reservacion.setPreferredSize(new java.awt.Dimension(180, 32));
        reservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservacionActionPerformed(evt);
            }
        });
        RegistrarEvento.add(reservacion);

        Eventos.add(RegistrarEvento);

        ActualizarEvento.setText("Actualizar");
        ActualizarEvento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ActualizarEvento.setPreferredSize(new java.awt.Dimension(285, 32));

        EventoAct.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        EventoAct.setText("Evento");
        EventoAct.setPreferredSize(new java.awt.Dimension(180, 32));
        ActualizarEvento.add(EventoAct);

        Eventos.add(ActualizarEvento);

        ConsultarEvento.setText("Consultar");
        ConsultarEvento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConsultarEvento.setPreferredSize(new java.awt.Dimension(285, 32));

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem9.setText("Por nombre del evento");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(260, 32));
        ConsultarEvento.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem10.setText("Por fecha de la reserva");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(260, 32));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        ConsultarEvento.add(jMenuItem10);

        Eventos.add(ConsultarEvento);

        menu.add(Eventos);

        Menu.setText("Menú");
        Menu.setFont(Menu.getFont().deriveFont((float)48));
        Menu.setMaximumSize(new java.awt.Dimension(288, 32767));
        Menu.setPreferredSize(new java.awt.Dimension(190, 60));

        RegistrarMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RegistrarMenu.setText("Registrar Menu");
        Menu.add(RegistrarMenu);

        ActualizarMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ActualizarMenu.setText("Actualizar Menu");
        Menu.add(ActualizarMenu);

        ConsultarMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConsultarMenu.setText("Consultar Menu");
        ConsultarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarMenuActionPerformed(evt);
            }
        });
        Menu.add(ConsultarMenu);

        menu.add(Menu);

        Nomina.setText("Nómina");
        Nomina.setFont(Nomina.getFont().deriveFont((float)48));
        Nomina.setMaximumSize(new java.awt.Dimension(288, 32767));
        Nomina.setPreferredSize(new java.awt.Dimension(240, 60));

        RegistrarTrabajador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RegistrarTrabajador.setText("Registrar Trabajador");
        Nomina.add(RegistrarTrabajador);

        ActualizarTrabajador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ActualizarTrabajador.setText("Actualizar Trabajador");
        ActualizarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTrabajadorActionPerformed(evt);
            }
        });
        Nomina.add(ActualizarTrabajador);

        ConsultarTrabajador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConsultarTrabajador.setText("Consultar Trabajador");
        Nomina.add(ConsultarTrabajador);

        menu.add(Nomina);

        PagosTrabajadores.setText("Pagos");
        PagosTrabajadores.setFont(PagosTrabajadores.getFont().deriveFont((float)48));
        PagosTrabajadores.setMaximumSize(new java.awt.Dimension(288, 32767));
        PagosTrabajadores.setPreferredSize(new java.awt.Dimension(210, 60));

        RegistrarPago.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RegistrarPago.setText("Registrar Pago");
        PagosTrabajadores.add(RegistrarPago);

        ActualizarPago.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ActualizarPago.setText("Actualiza Pago");
        PagosTrabajadores.add(ActualizarPago);

        ConsultarPago.setText("Consultar Pago");
        ConsultarPago.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConsultarPago.setPreferredSize(new java.awt.Dimension(285, 32));

        PagoPorFecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PagoPorFecha.setText("Pago Por Fecha");
        PagoPorFecha.setPreferredSize(new java.awt.Dimension(180, 32));
        PagoPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoPorFechaActionPerformed(evt);
            }
        });
        ConsultarPago.add(PagoPorFecha);

        PagoPorNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PagoPorNombre.setText("Pago Por Nombre");
        PagoPorNombre.setPreferredSize(new java.awt.Dimension(180, 32));
        PagoPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoPorNombreActionPerformed(evt);
            }
        });
        ConsultarPago.add(PagoPorNombre);

        PagosTrabajadores.add(ConsultarPago);

        menu.add(PagosTrabajadores);

        Reportes.setText("Reportes");
        Reportes.setFont(Reportes.getFont().deriveFont((float)48));
        Reportes.setMaximumSize(new java.awt.Dimension(288, 32767));
        Reportes.setPreferredSize(new java.awt.Dimension(260, 60));
        menu.add(Reportes);

        jMenu1.setText("Salir");
        jMenu1.setFont(jMenu1.getFont().deriveFont((float)48));
        jMenu1.setPreferredSize(new java.awt.Dimension(210, 60));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        menu.add(jMenu1);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 1510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 110, Short.MAX_VALUE)
                    .addComponent(ActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 110, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(ConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(logoprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ConsultarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void menuRegistrarClienteComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_menuRegistrarClienteComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRegistrarClienteComponentAdded

    private void menuRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarClienteActionPerformed
        Rnombre.setText("");
        Rapellido.setText("");
        rcedula.setText("");
        rcelular.setText("");
        rdirecc.setText("");
        rcorreo.setText("");
        RegistroCliente.setVisible(true);
        logoprincipal.setVisible(false);
        ActualizarCliente.setVisible(false);
        ConsultarCliente.setVisible(false);
        Rnombre.setBackground(Color.white);
        Rapellido.setBackground(Color.white);
        rcedula.setBackground(Color.white);
        rcelular.setBackground(Color.white);
        rdirecc.setBackground(Color.white);
        rcorreo.setBackground(Color.white); 

    }//GEN-LAST:event_menuRegistrarClienteActionPerformed

    private void actualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarClienteActionPerformed
        ActualizarCliente.setVisible(true);
        RegistroCliente.setVisible(false);
        logoprincipal.setVisible(false);
        RidCliente1.setEditable(false);
        Rnombre1.setEditable(false);
        Rapellido1.setEditable(false);
        rcedula1.setEditable(false);
        rcelular1.setEditable(false);
        rdirecc1.setEditable(false);
        rcorreo1.setEditable(false);
        ConsultarCliente.setVisible(false);
        consulta.setText("");
        Rnombre1.setText("");
        Rapellido1.setText("");
        rcedula1.setText("");
        rdirecc1.setText("");
        rcorreo1.setText("");
        rcelular1.setText("");
        bAcutalizarCliente.setEnabled(false);

    }//GEN-LAST:event_actualizarClienteActionPerformed

    private void consultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarClienteActionPerformed
        Rnombre2.setText("");
        Rapellido2.setText("");
        rcedula2.setText("");
        rcelular2.setText("");
        rdirecc2.setText("");
        rcorreo2.setText("");
        Rnombre2.setEditable(false);
        Rapellido2.setEditable(false);
        rcedula2.setEditable(false);
        rcelular2.setEditable(false);
        rdirecc2.setEditable(false);
        rcorreo2.setEditable(false);
        RegistroCliente.setVisible(false);
        logoprincipal.setVisible(false);
        ActualizarCliente.setVisible(false);
        ConsultarCliente.setVisible(true);
        
    }//GEN-LAST:event_consultarClienteActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        if(JOptionPane.showConfirmDialog(null,"¿Seguro desea salir?", "SALIR", JOptionPane.YES_NO_OPTION)==0){
            RegistroCliente.setVisible(false);
            logoprincipal.setVisible(false);
            ActualizarCliente.setVisible(false);
            ConsultarCliente.setVisible(false);
            formularioLogin logeo = new formularioLogin();
            logeo.setSize(1100, 550);
            logeo.setLocationRelativeTo(null);
            logeo.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void reservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservacionActionPerformed
        ActualizarCliente.setVisible(false);
        RegistroCliente.setVisible(false);
        logoprincipal.setVisible(false);
        Rnombre1.setEditable(false);
        Rapellido1.setEditable(false);
        rcedula1.setEditable(false);
        rcelular1.setEditable(false);
        rdirecc1.setEditable(false);
        rcorreo1.setEditable(false);
        ConsultarCliente.setVisible(false); 
        
        
    }//GEN-LAST:event_reservacionActionPerformed

    private void ActualizarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarTrabajadorActionPerformed

    private void PagoPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoPorFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagoPorFechaActionPerformed

    private void PagoPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoPorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagoPorNombreActionPerformed

    private void ConsultarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultarMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"¿Seguro desea abandonar el registro?", "SALIR DEL REGISTRO", JOptionPane.YES_NO_OPTION)==0){
            RegistroCliente.setVisible(false);
            logoprincipal.setVisible(true);
            ActualizarCliente.setVisible(false);
            ConsultarCliente.setVisible(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cliente ent = new Cliente();
        ent.setNombresCliente(Rnombre.getText());
        ent.setApellidosCliente(Rapellido.getText());
        ent.setCedulaRucCliente(rcedula.getText());
        ent.setDireccionCliente(rdirecc.getText());
        ent.setTelefonoCliente(rcelular.getText());
        ent.setEmailCliente(rcorreo.getText());
        lnCliente objlnCliente= new lnCliente();
        objlnCliente.registrar(ent);
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"¿Seguro desea abandonar el registro?", "SALIR DEL REGISTRO", JOptionPane.YES_NO_OPTION)==0){
            RegistroCliente.setVisible(false);
            logoprincipal.setVisible(true);
            ActualizarCliente.setVisible(false);
            ConsultarCliente.setVisible(false);
            consulta.setText("");
            Rnombre1.setText("");
            Rapellido1.setText("");
            rcedula1.setText("");
            rcelular1.setText("");
            rdirecc1.setText("");
            rcorreo1.setText("");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bAcutalizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAcutalizarClienteActionPerformed
        
       int res=JOptionPane.showConfirmDialog(null, "¿Seguro deseas Actualizar?");
        if(res==JOptionPane.YES_OPTION){
            lnCliente objlnCliente = new lnCliente();
            Cliente ent = new Cliente();
            ent.setIdCliente(Integer.parseInt(RidCliente1.getText()));
            ent.setNombresCliente(Rnombre1.getText());
            ent.setApellidosCliente(Rapellido1.getText());
            ent.setCedulaRucCliente(rcedula1.getText());
            ent.setDireccionCliente(rdirecc1.getText());
            ent.setTelefonoCliente(rcelular1.getText());
            ent.setEmailCliente(rcorreo1.getText());
            if(objlnCliente.modificar(ent)==true){
                JOptionPane.showMessageDialog(null,"Actualizacion Correcta");
            }else{
                    JOptionPane.showMessageDialog(null,"No se pudo Actualizar");
            }
        }
    }//GEN-LAST:event_bAcutalizarClienteActionPerformed

    private void conActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conActualizarClienteActionPerformed
        lnCliente objlnCliente = new lnCliente();
        int fila=0;
        Cliente ent = new Cliente();
        ent.setNombresCliente(consulta.getText());
        ArrayList<Cliente> lista= objlnCliente.buscar(ent);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IdCargo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cedula Ruc");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Email");
        modelo.setRowCount(lista.size());
               
        for(Cliente c: lista){
        modelo.setValueAt(c.getIdCliente(), fila, 0);
        modelo.setValueAt(c.getNombresCliente(), fila, 1);
        modelo.setValueAt(c.getApellidosCliente(), fila, 2);
        modelo.setValueAt(c.getCedulaRucCliente(), fila, 3);
        modelo.setValueAt(c.getDireccionCliente(), fila, 4);
        modelo.setValueAt(c.getTelefonoCliente(), fila, 5);
        modelo.setValueAt(c.getEmailCliente(), fila, 6);
        fila++;
        }
        jTableActualizarCliente.setModel(modelo);
        //RidCliente1.setEditable(true);
        Rnombre1.setEditable(true);
        Rapellido1.setEditable(true);
        rcedula1.setEditable(true);
        rdirecc1.setEditable(true);
        rcelular1.setEditable(true);
        rcorreo1.setEditable(true);
    }//GEN-LAST:event_conActualizarClienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(JOptionPane.showConfirmDialog(null,"¿Seguro desea salir de la búsqueda?", "SALIR DE LA CONSULTA", JOptionPane.YES_NO_OPTION)==0){
            RegistroCliente.setVisible(false);
            logoprincipal.setVisible(true);
            ActualizarCliente.setVisible(false);
            ConsultarCliente.setVisible(false);
            consultaCliente.setText("");
            Rnombre2.setText("");
            Rapellido2.setText("");
            rcedula2.setText("");
            rcelular2.setText("");
            rdirecc2.setText("");
            rcorreo2.setText("");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarClienteActionPerformed
        lnCliente objlnCliente = new lnCliente();
        int fila=0;
        Cliente ent = new Cliente();
        ent.setNombresCliente(consultaCliente.getText());
        ArrayList<Cliente> lista= objlnCliente.buscar(ent);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IdCargo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cedula Ruc");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Email");
        modelo.setRowCount(lista.size());
               
        for(Cliente c: lista){
        modelo.setValueAt(c.getIdCliente(), fila, 0);
        modelo.setValueAt(c.getNombresCliente(), fila, 1);
        modelo.setValueAt(c.getApellidosCliente(), fila, 2);
        modelo.setValueAt(c.getCedulaRucCliente(), fila, 3);
        modelo.setValueAt(c.getDireccionCliente(), fila, 4);
        modelo.setValueAt(c.getTelefonoCliente(), fila, 5);
        modelo.setValueAt(c.getEmailCliente(), fila, 6);
        fila++;
        }
        jTableConsultaCliente.setModel(modelo);
        
    }//GEN-LAST:event_bConsultarClienteActionPerformed
       
    private void consultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaClienteActionPerformed
        
    }//GEN-LAST:event_consultaClienteActionPerformed

    private void jTableConsultaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaClienteMousePressed
        int i=jTableConsultaCliente.getSelectedRow();
        
        Rnombre2.setText(jTableConsultaCliente.getValueAt(i, 1).toString());
        Rapellido2.setText(jTableConsultaCliente.getValueAt(i, 2).toString());
        rcedula2.setText(jTableConsultaCliente.getValueAt(i, 3).toString());
        rdirecc2.setText(jTableConsultaCliente.getValueAt(i, 4).toString());
        rcelular2.setText(jTableConsultaCliente.getValueAt(i, 5).toString());
        rcorreo2.setText(jTableConsultaCliente.getValueAt(i, 6).toString());
        
          // TODO add your handling code here:
    }//GEN-LAST:event_jTableConsultaClienteMousePressed

    private void jTableActualizarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableActualizarClienteMousePressed
        int i=jTableActualizarCliente.getSelectedRow();
        RidCliente1.setText(jTableActualizarCliente.getValueAt(i, 0).toString());
        Rnombre1.setText(jTableActualizarCliente.getValueAt(i, 1).toString());
        Rapellido1.setText(jTableActualizarCliente.getValueAt(i, 2).toString());
        rcedula1.setText(jTableActualizarCliente.getValueAt(i, 3).toString());
        rdirecc1.setText(jTableActualizarCliente.getValueAt(i, 4).toString());
        rcelular1.setText(jTableActualizarCliente.getValueAt(i, 5).toString());
        rcorreo1.setText(jTableActualizarCliente.getValueAt(i, 6).toString());
        bAcutalizarCliente.setEnabled(true);
    }//GEN-LAST:event_jTableActualizarClienteMousePressed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActualizarCliente;
    private javax.swing.JMenu ActualizarEvento;
    private javax.swing.JMenuItem ActualizarMenu;
    private javax.swing.JMenuItem ActualizarPago;
    private javax.swing.JMenuItem ActualizarTrabajador;
    private javax.swing.JMenu Clientes;
    private javax.swing.JPanel ConsultarCliente;
    private javax.swing.JMenu ConsultarEvento;
    private javax.swing.JMenuItem ConsultarMenu;
    private javax.swing.JMenu ConsultarPago;
    private javax.swing.JMenuItem ConsultarTrabajador;
    private javax.swing.JMenuItem EventoAct;
    private javax.swing.JMenu Eventos;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu Nomina;
    private javax.swing.JMenuItem PagoPorFecha;
    private javax.swing.JMenuItem PagoPorNombre;
    private javax.swing.JMenu PagosTrabajadores;
    private javax.swing.JTextField Rapellido;
    private javax.swing.JTextField Rapellido1;
    private javax.swing.JTextField Rapellido2;
    private javax.swing.JMenu RegistrarEvento;
    private javax.swing.JMenuItem RegistrarMenu;
    private javax.swing.JMenuItem RegistrarPago;
    private javax.swing.JMenuItem RegistrarTrabajador;
    private javax.swing.JPanel RegistroCliente;
    private javax.swing.JMenu Reportes;
    private javax.swing.JTextField RidCliente1;
    private javax.swing.JTextField Rnombre;
    private javax.swing.JTextField Rnombre1;
    private javax.swing.JTextField Rnombre2;
    private javax.swing.JMenuItem actualizarCliente;
    private javax.swing.JButton bAcutalizarCliente;
    private javax.swing.JButton bConsultarCliente;
    private javax.swing.JButton conActualizarCliente;
    private javax.swing.JTextField consulta;
    private javax.swing.JTextField consultaCliente;
    private javax.swing.JMenuItem consultarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableActualizarCliente;
    private javax.swing.JTable jTableConsultaCliente;
    private javax.swing.JPanel logoprincipal;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuRegistrarCliente;
    private javax.swing.JFormattedTextField rcedula;
    private javax.swing.JFormattedTextField rcedula1;
    private javax.swing.JFormattedTextField rcedula2;
    private javax.swing.JFormattedTextField rcelular;
    private javax.swing.JFormattedTextField rcelular1;
    private javax.swing.JFormattedTextField rcelular2;
    private javax.swing.JTextField rcorreo;
    private javax.swing.JTextField rcorreo1;
    private javax.swing.JTextField rcorreo2;
    private javax.swing.JTextField rdirecc;
    private javax.swing.JTextField rdirecc1;
    private javax.swing.JTextField rdirecc2;
    private javax.swing.JMenuItem reservacion;
    // End of variables declaration//GEN-END:variables
}
