package Menus;

import Usuarios.Doctor;
import Veterinaria.Servicios;
import Veterinaria.Insumos;
import Veterinaria.OtrosServ;
import Veterinaria.Servicios_Principales;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Menu extends javax.swing.JFrame {

    //Variables importantes
    LinkedList<Doctor> doctores = new LinkedList(); //Lista que guarda los doctores
    LinkedList<Insumos> insumos = new LinkedList(); //Lista que guarda los insumos a vender
    LinkedList<Servicios_Principales> mainservicios = new LinkedList(); //Lista que guarda los servicios principales
    LinkedList<OtrosServ> opservicios = new LinkedList(); //Lista que guarda los servicios secundarios
    LinkedList ventas = new LinkedList(); //Guarda las ventas realizadas bajo un arreglo que contiene los datos relevantes de cada venta
    Object[] prodventa = new Object[3]; //Guarda las cantidades y datos relevantes para añadir al carrito de compra
    Float total = 0f; //Variable que contiene el total de venta
    int id_venta = 1000; //Variable que genera un id venta
    Object[] insumo = new Object[4]; //Arreglo que guarda un objeto insumo, su posicion en la lista insumos, si ya ha sido agregado al carrito o no y su cantidad vendida (o a vender).

    String formato_ticket //String que contiene el formato para la creación de un ticket
            = "\tTICKET DE VENTA\t\t\t\t\n"
            + "\tGRACIAS POR SU COMPRA\t\t\t\t\n"
            + "\tID de VENTA: %d" + "\n"
            + "Dia: " + LocalDate.now() + "\t\tHora: " + LocalTime.now() + "\n"
            + "\n\n"
            + "Servicio   Cantidad   $Subtotal\n"
            + "%s"
            + "Total= $ %s";

    public Menu() { //Constructor por defecto que inicializa el programa y carga lo necesario
        cargar_usuarios();
        cargar_med();
        cargar_mainserv();
        cargar_opserv();
        initComponents();
        mostrar_med();
        mostrar_usuarios();
        mostrar_main_servicios();
        mostrar_op_servicios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cedula_field = new javax.swing.JTextField();
        nombre_field = new javax.swing.JTextField();
        is_active = new java.awt.Checkbox();
        clean_botton = new javax.swing.JButton();
        save_botton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar_usuarios = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        buscar_cedula_field = new javax.swing.JTextField();
        buscar_cedula_botton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Medicamento = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cantidad_field = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        precio_field = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        guardar_med = new javax.swing.JButton();
        limpia_med = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrar_med = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        nombre_med = new javax.swing.JTextField();
        delete_med_button = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        service_name_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        base_price_field = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        kg_pricefield = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        perday_pricefield = new javax.swing.JTextField();
        buscar_mainserv_button = new javax.swing.JButton();
        del_mainservice = new javax.swing.JButton();
        save_mainservice = new javax.swing.JButton();
        cancel_mainservice = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        mostrar_mainserv = new javax.swing.JTextArea();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        service_id_field = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        opservice_name_field = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        opbase_price_field = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        opextra_price_field = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mostrar_opserv = new javax.swing.JTextArea();
        search_opserv_button = new javax.swing.JButton();
        del_opserv = new javax.swing.JButton();
        save_opserv = new javax.swing.JButton();
        cancel_opserv = new javax.swing.JButton();
        opservice_id_field = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ticket_servicios = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        total_servicios = new javax.swing.JTextField();
        cancelar_servicios = new javax.swing.JButton();
        terminar_servicios = new javax.swing.JButton();
        agrega_servicio = new javax.swing.JButton();
        seleccion_servicio = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        kg_pricefield_chko = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        perday_pricefield_chko = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        base_price_field_chko = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        med_quan_field_chko = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        service_name_field_chko = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        preciounidad_med_chko = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        opextra_price_field_chko = new javax.swing.JTextField();
        peso_field = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        days_field = new javax.swing.JTextField();
        cobrar_extra = new java.awt.Checkbox();
        jLabel70 = new javax.swing.JLabel();
        add_sell = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        nombre_med_chko1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ventaID_field = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        ver_ventas_box = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        search_ventaid = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        clean_button_verventas = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        diatotalfield = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        vertotalventafield = new javax.swing.JTextField();
        corte_caja = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        selldate = new javax.swing.JTextField();

        jLabel17.setText("jLabel17");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Usuarios y Doctores");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("#Cedula");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Está Activo?");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Constraseña");

        is_active.setName(""); // NOI18N

        clean_botton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clean_botton.setText("Limpiar Casillas");
        clean_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clean_bottonActionPerformed(evt);
            }
        });

        save_botton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save_botton1.setText("Guardar Cambios");
        save_botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_botton1ActionPerformed(evt);
            }
        });

        mostrar_usuarios.setEditable(false);
        mostrar_usuarios.setColumns(20);
        mostrar_usuarios.setRows(5);
        jScrollPane1.setViewportView(mostrar_usuarios);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("#Cedula");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Nombre");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Está Activo?");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Lista de Usuarios");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Buscar # Cedula");

        buscar_cedula_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_cedula_fieldActionPerformed(evt);
            }
        });

        buscar_cedula_botton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar_cedula_botton.setText("Buscar");
        buscar_cedula_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_cedula_bottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cedula_field)
                                    .addComponent(nombre_field, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(is_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass_field)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(buscar_cedula_field, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(save_botton1)
                                    .addComponent(clean_botton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar_cedula_botton)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel11)
                                .addGap(149, 149, 149)
                                .addComponent(jLabel15))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(buscar_cedula_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar_cedula_botton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cedula_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(is_active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(save_botton1)
                                .addGap(18, 18, 18)
                                .addComponent(clean_botton)))
                        .addContainerGap(342, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(115, 115, 115))))
        );

        jTabbedPane1.addTab("Usuarios / Doctores", jPanel1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("Modificar Insumos Disponibles");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Clave del insumo");

        Medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicamentoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Cantidad disponible");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Precio");

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        guardar_med.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guardar_med.setText("Guardar");
        guardar_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_medActionPerformed(evt);
            }
        });

        limpia_med.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        limpia_med.setText("Cancelar");
        limpia_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpia_medActionPerformed(evt);
            }
        });

        mostrar_med.setEditable(false);
        mostrar_med.setColumns(20);
        mostrar_med.setRows(5);
        jScrollPane2.setViewportView(mostrar_med);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Nombre del insumo");

        nombre_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_medActionPerformed(evt);
            }
        });

        delete_med_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_med_button.setText("Eliminar");
        delete_med_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_med_buttonActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Clave");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Nombre");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setText("Cantidad");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setText("Precio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel31))
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(Medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                        .addComponent(precio_field, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cantidad_field, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre_med))
                                    .addGap(85, 85, 85)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(searchButton)
                                            .addComponent(guardar_med))
                                        .addComponent(delete_med_button))
                                    .addGap(122, 122, 122))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(limpia_med)
                                    .addGap(120, 120, 120)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel53)))))
                .addGap(346, 346, 346))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addGap(7, 7, 7)
                                .addComponent(nombre_med, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(guardar_med)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete_med_button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(limpia_med)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precio_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Insumos", jPanel4);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setText("Modificar Servicios Principales");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del Servicio");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Precio Base");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Precio por Kg de peso");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Estancia por dia");

        buscar_mainserv_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar_mainserv_button.setText("Buscar");
        buscar_mainserv_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_mainserv_buttonActionPerformed(evt);
            }
        });

        del_mainservice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        del_mainservice.setText("Eliminar");
        del_mainservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_mainserviceActionPerformed(evt);
            }
        });

        save_mainservice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save_mainservice.setText("Guardar");
        save_mainservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_mainserviceActionPerformed(evt);
            }
        });

        cancel_mainservice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel_mainservice.setText("Cancelar");
        cancel_mainservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_mainserviceActionPerformed(evt);
            }
        });

        mostrar_mainserv.setEditable(false);
        mostrar_mainserv.setColumns(20);
        mostrar_mainserv.setRows(5);
        jScrollPane3.setViewportView(mostrar_mainserv);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setText("Nombre");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setText("Precio base");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setText("$p/dia");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setText("$p/kg");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("ID del Servicio");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(service_name_field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(base_price_field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kg_pricefield, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(perday_pricefield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(service_id_field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(del_mainservice)
                            .addComponent(cancel_mainservice)
                            .addComponent(save_mainservice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscar_mainserv_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel56)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel58)))))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(save_mainservice)
                        .addGap(18, 18, 18)
                        .addComponent(del_mainservice)
                        .addGap(17, 17, 17)
                        .addComponent(cancel_mainservice))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(service_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar_mainserv_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(service_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(base_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(perday_pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(kg_pricefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Servicios Principales", jPanel2);

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel59.setText("Modificar Servicios Secundarios");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setText("Nombre del Servicio");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setText("Precio Base");

        opbase_price_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opbase_price_fieldActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setText("Precio extra a cobrar (0 si n/aplica)");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setText("Nombre");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setText("Precio base");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setText("$p/extra");

        mostrar_opserv.setEditable(false);
        mostrar_opserv.setColumns(20);
        mostrar_opserv.setRows(5);
        jScrollPane5.setViewportView(mostrar_opserv);

        search_opserv_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_opserv_button.setText("Buscar");
        search_opserv_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_opserv_buttonActionPerformed(evt);
            }
        });

        del_opserv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        del_opserv.setText("Eliminar");
        del_opserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_opservActionPerformed(evt);
            }
        });

        save_opserv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        save_opserv.setText("Guardar");
        save_opserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_opservActionPerformed(evt);
            }
        });

        cancel_opserv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel_opserv.setText("Cancelar");
        cancel_opserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_opservActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setText("ID del Servicio");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(opservice_name_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opbase_price_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opextra_price_field, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_opserv_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(del_opserv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save_opserv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel_opserv, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(opservice_id_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(363, 363, 363)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel65)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(search_opserv_button)
                                .addGap(61, 61, 61)
                                .addComponent(save_opserv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(del_opserv))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opservice_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opservice_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opbase_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancel_opserv)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opextra_price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificiar Servicios Secundarios", jPanel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setText("Vender Servicios");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Ticket de venta");

        ticket_servicios.setEditable(false);
        ticket_servicios.setColumns(20);
        ticket_servicios.setRows(5);
        jScrollPane9.setViewportView(ticket_servicios);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("Servicio");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Cantidad");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("Subtotal");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setText("Total");

        total_servicios.setEditable(false);
        total_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_serviciosActionPerformed(evt);
            }
        });

        cancelar_servicios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelar_servicios.setText("Cancelar");
        cancelar_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_serviciosActionPerformed(evt);
            }
        });

        terminar_servicios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        terminar_servicios.setText("Terminar");
        terminar_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminar_serviciosActionPerformed(evt);
            }
        });

        agrega_servicio.setText("Buscar");
        agrega_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrega_servicioActionPerformed(evt);
            }
        });

        seleccion_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion_servicioActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Ingrese un ID de servicio/producto a vender:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Cantidad a vender");

        kg_pricefield_chko.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Precio por Kg de peso");

        perday_pricefield_chko.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Días");

        base_price_field_chko.setEditable(false);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setText("Precio Base");

        med_quan_field_chko.setEditable(false);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Nombre del Servicio");

        service_name_field_chko.setEditable(false);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("$ c/u");

        preciounidad_med_chko.setEditable(false);
        preciounidad_med_chko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciounidad_med_chkoActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setText("Cobrar?");

        opextra_price_field_chko.setEditable(false);

        peso_field.setEditable(false);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Peso (Kg)");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Estancia por dia");

        days_field.setEditable(false);

        cobrar_extra.setEnabled(false);

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setText("Precio extra a cobrar");

        add_sell.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_sell.setText("Agregar al Carrito");
        add_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_sellActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setText("Nombre del insumo");

        nombre_med_chko1.setEditable(false);
        nombre_med_chko1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_med_chko1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(opextra_price_field_chko, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(cobrar_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel35)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(med_quan_field_chko, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(base_price_field_chko, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(kg_pricefield_chko, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(perday_pricefield_chko, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(service_name_field_chko, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(peso_field, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(days_field, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(nombre_med_chko1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(preciounidad_med_chko, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel43)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel40))
                                                .addComponent(seleccion_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(agrega_servicio))))
                                .addGap(97, 97, 97)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel46)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel48)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(total_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(terminar_servicios)
                                            .addComponent(cancelar_servicios)))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(add_sell)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seleccion_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agrega_servicio))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(preciounidad_med_chko, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_med_chko1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addGap(12, 12, 12)
                        .addComponent(med_quan_field_chko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(service_name_field_chko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(base_price_field_chko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perday_pricefield_chko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(days_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kg_pricefield_chko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opextra_price_field_chko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cobrar_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45)
                                .addComponent(jLabel46)
                                .addComponent(jLabel48))
                            .addComponent(jLabel50))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(total_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(cancelar_servicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(terminar_servicios)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane9))))
                .addGap(29, 29, 29)
                .addComponent(add_sell)
                .addGap(192, 192, 192))
        );

        jTabbedPane1.addTab("Vender Servicios", jPanel5);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setText("Ver Ventas");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Ingrese el ID de Venta");

        ventaID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaID_fieldActionPerformed(evt);
            }
        });

        ver_ventas_box.setEditable(false);
        ver_ventas_box.setColumns(20);
        ver_ventas_box.setRows(5);
        jScrollPane4.setViewportView(ver_ventas_box);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Servicio");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Cantidad");

        search_ventaid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_ventaid.setText("Buscar");
        search_ventaid.setToolTipText("");
        search_ventaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_ventaidActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setText("Subtotal");

        clean_button_verventas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clean_button_verventas.setText("Limpiar");
        clean_button_verventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clean_button_verventasActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Total de la venta");

        diatotalfield.setEditable(false);
        diatotalfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Total del dia");

        vertotalventafield.setEditable(false);

        corte_caja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        corte_caja.setText("Corte de Caja");
        corte_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corte_cajaActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Fecha de la venta");

        selldate.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(37, 37, 37)
                                .addComponent(ventaID_field, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32)
                                    .addComponent(search_ventaid))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clean_button_verventas)
                                    .addComponent(diatotalfield, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(corte_caja)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel29)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel51))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27)
                                    .addComponent(vertotalventafield, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selldate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(177, 177, 177))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(ventaID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clean_button_verventas)
                            .addComponent(search_ventaid))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(diatotalfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(corte_caja)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(vertotalventafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(selldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))))
        );

        jTabbedPane1.addTab("Ver Ventas", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_medActionPerformed

    private void limpia_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpia_medActionPerformed
        Medicamento.setText(null);
        nombre_med.setText(null);
        cantidad_field.setText(null);
        precio_field.setText(null);
        mostrar_med();
    }//GEN-LAST:event_limpia_medActionPerformed

    private void guardar_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_medActionPerformed
        try {
            Integer clave = Integer.parseInt(Medicamento.getText());
            String nombre = nombre_med.getText();
            Integer cantidad = Integer.parseInt(cantidad_field.getText());
            Float precio = Float.parseFloat(precio_field.getText());

            if (comprobar_ID(clave) || buscar_medicamento() != -1) {
                int index = buscar_medicamento();
                if (index == -1) {
                    insumos.add(new Insumos(clave, nombre, cantidad, precio, true));
                    mostrar_med();
                    guardar_med_en_archivo();
                    limpia_medActionPerformed(null);
                } else {
                    insumos.set(index, new Insumos(clave, nombre, cantidad, precio, true));
                    mostrar_med();
                    guardar_med_en_archivo();
                    limpia_medActionPerformed(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El ID ya existe");
            }
            limpia_medActionPerformed(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar bien los campos");
        }
    }//GEN-LAST:event_guardar_medActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        Integer id_search = buscar_medicamento();
        if (id_search == -1) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el insumo");
        } else {
            Insumos aux = insumos.get(id_search);
            nombre_med.setText(String.valueOf(aux.getNombre()));
            cantidad_field.setText(String.valueOf(aux.getCantidad()));
            precio_field.setText(String.valueOf(aux.getPreciocu()));
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void MedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicamentoActionPerformed
        ///Se buscara el medicamento
    }//GEN-LAST:event_MedicamentoActionPerformed

    private void buscar_cedula_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_cedula_bottonActionPerformed
        int index = buscar_cedula();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el usuario");
        } else {
            Doctor aux = doctores.get(index);
            cedula_field.setText(String.valueOf(aux.getNum_Cedula()));
            nombre_field.setText(aux.getNombre());
            pass_field.setText(aux.getPassword());
            is_active.setState(aux.getEsta_activo());
        }
    }//GEN-LAST:event_buscar_cedula_bottonActionPerformed

    private void buscar_cedula_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_cedula_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_cedula_fieldActionPerformed

    private void save_botton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_botton1ActionPerformed
        try{
        Integer cedula = Integer.parseInt(cedula_field.getText());
        String nombre = nombre_field.getText();
        String password = pass_field.getText();
        Boolean active = is_active.getState();

        if ("".equals(buscar_cedula_field.getText())) {
            doctores.add(new Doctor(nombre, password, cedula, active));
        } else {
            int index = buscar_cedula();
            doctores.set(index, new Doctor(nombre, password, cedula, active));
        }
        mostrar_usuarios();
        guardar_usuarios_en_archivo();
        clean_bottonActionPerformed(null);}
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese datos validos");
        }
    }//GEN-LAST:event_save_botton1ActionPerformed

    private void clean_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clean_bottonActionPerformed
        cedula_field.setText(null);
        nombre_field.setText(null);
        pass_field.setText(null);
        is_active.setState(true);
        buscar_cedula_field.setText(null);
        mostrar_usuarios();
    }//GEN-LAST:event_clean_bottonActionPerformed

    private void search_ventaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ventaidActionPerformed
        if ("".equals(ventaID_field.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID de venta");
        } else {
            int ventaid = Integer.parseInt(ventaID_field.getText());
            for (int i = 0; i < ventas.size(); i++) {
                Object[] aux = (Object[]) ventas.get(i);
                if ((int) aux[0] == ventaid) {
                    ver_ventas_box.setText((String) aux[1]);
                    vertotalventafield.setText(String.valueOf(aux[2]));
                    selldate.setText((String) aux[3]);
                }
            }
            if ("".equals(ver_ventas_box.getText())) {
                JOptionPane.showMessageDialog(null, "No se ha encontrado el id de venta");
            }
        }
    }//GEN-LAST:event_search_ventaidActionPerformed

    private void clean_button_verventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clean_button_verventasActionPerformed
        vertotalventafield.setText(null);
        ver_ventas_box.setText(null);
        ventaID_field.setText(null);
        selldate.setText(null);
    }//GEN-LAST:event_clean_button_verventasActionPerformed

    private void seleccion_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccion_servicioActionPerformed

    private void agrega_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrega_servicioActionPerformed
        if ("".equals(seleccion_servicio.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese primero un ID de insumo / servicio");
        } else {
            Integer ID = Integer.parseInt(seleccion_servicio.getText());

            for (int i = 0; i < insumos.size(); i++) {
                Insumos aux = (Insumos) insumos.get(i);
                if (Objects.equals(aux.getClave(), ID)) {
                    nombre_med_chko1.setText(aux.getNombre());
                    preciounidad_med_chko.setText(String.valueOf(aux.getPreciocu()));
                    med_quan_field_chko.setEditable(true);
                    insumo[0] = aux;
                    insumo[1] = i;
                    insumo[2] = false;
                    insumo[3] = 0;
                }
            }

            for (int i = 0; i < mainservicios.size(); i++) {
                Servicios_Principales aux = (Servicios_Principales) mainservicios.get(i);
                if (Objects.equals(aux.getId_serv(), ID)) {
                    service_name_field_chko.setText(aux.getServicio());
                    base_price_field_chko.setText(String.valueOf(aux.getPrecio()));
                    perday_pricefield_chko.setText(String.valueOf(aux.getPrecio_por_dias()));
                    kg_pricefield_chko.setText(String.valueOf(aux.getPrecio_por_peso()));
                    days_field.setEditable(true);
                    peso_field.setEditable(true);
                }
            }

            for (int i = 0; i < opservicios.size(); i++) {
                OtrosServ aux = (OtrosServ) opservicios.get(i);
                if (Objects.equals(aux.getId_serv(), ID)) {
                    service_name_field_chko.setText(aux.getServicio());
                    base_price_field_chko.setText(String.valueOf(aux.getPrecio()));
                    opextra_price_field_chko.setText(String.valueOf(aux.getBonus_de_malcomportamiento()));
                    cobrar_extra.setEnabled(true);
                }
            }
            seleccion_servicio.setText(null);
        }
    }//GEN-LAST:event_agrega_servicioActionPerformed

    private void terminar_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminar_serviciosActionPerformed
        if ("".equals(ticket_servicios.getText())) {
            JOptionPane.showMessageDialog(null, "Añada un producto para vender");
        } else {
            Object[] venta = new Object[4];
            venta[0] = id_venta+10;
            venta[1] = (String) ticket_servicios.getText();
            venta[2] = (Float) Float.parseFloat(total_servicios.getText());
            venta[3] = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            ventas.add(venta);
            crear_ticket();
            calcular_total_dia();
            total = 0f;
            total_servicios.setText(null);
            ticket_servicios.setText(null);
            seleccion_servicio.setText(null);
            limpiar_casillas_chkout();
            insumo[0] = null;
            insumo[1] = null;
            insumo[2] = false;
            insumo[3] = null;
        }
    }//GEN-LAST:event_terminar_serviciosActionPerformed

    private void cancelar_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_serviciosActionPerformed
        if ((boolean) insumo[2]) {
            Insumos aux = (Insumos) insumo[0];
            aux.setCantidad(aux.getCantidad() + (int) insumo[3]);
            insumos.set((int) insumo[1], new Insumos(aux.getClave(), aux.getNombre(), aux.getCantidad(), aux.getPreciocu(), aux.getActivo()));
            mostrar_med();
            guardar_med_en_archivo();
            insumo[0] = null;
            insumo[1] = null;
            insumo[2] = false;
            insumo[3] = null;
        }
        total = 0f;
        total_servicios.setText(null);
        ticket_servicios.setText(null);
        seleccion_servicio.setText(null);
        limpiar_casillas_chkout();
    }//GEN-LAST:event_cancelar_serviciosActionPerformed

    private void total_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_serviciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_serviciosActionPerformed

    private void delete_med_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_med_buttonActionPerformed
        insumos.remove(buscar_medicamento());
        mostrar_med();
        guardar_med_en_archivo();
        Medicamento.setText(null);
        precio_field.setText(null);
        cantidad_field.setText(null);
        nombre_med.setText(null);

    }//GEN-LAST:event_delete_med_buttonActionPerformed

    private void save_mainserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_mainserviceActionPerformed
        try {
            Integer id_servicio = Integer.parseInt(service_id_field.getText());
            String nombre = service_name_field.getText();
            Float precio_base = Float.parseFloat(base_price_field.getText());
            Float precio_por_kg = Float.parseFloat(kg_pricefield.getText());
            Float precio_por_dia = Float.parseFloat(perday_pricefield.getText());

            if (comprobar_ID(id_servicio) || buscar_mainservicios() != -1) {
                if (buscar_mainservicios() == -1) {
                    mainservicios.add(new Servicios_Principales(id_servicio, precio_base, nombre, precio_por_dia, precio_por_kg));
                } else {
                    int index = buscar_mainservicios();
                    mainservicios.set(index, new Servicios_Principales(id_servicio, precio_base, nombre, precio_por_dia, precio_por_kg));
                }

                guardar_mainservicios_en_archivo();
                mostrar_main_servicios();
                service_id_field.setText(null);
                service_name_field.setText(null);
                base_price_field.setText(null);
                kg_pricefield.setText(null);
                perday_pricefield.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "El ID ya existe");
                service_id_field.setText(null);
                service_name_field.setText(null);
                base_price_field.setText(null);
                kg_pricefield.setText(null);
                perday_pricefield.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar bien los campos");
        }

    }//GEN-LAST:event_save_mainserviceActionPerformed

    private void del_mainserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_mainserviceActionPerformed
        mainservicios.remove(buscar_mainservicios());
        guardar_mainservicios_en_archivo();
        service_name_field.setText(null);
        base_price_field.setText(null);
        kg_pricefield.setText(null);
        service_id_field.setText(null);
        perday_pricefield.setText(null);
        mostrar_main_servicios();
    }//GEN-LAST:event_del_mainserviceActionPerformed

    private void buscar_mainserv_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_mainserv_buttonActionPerformed
        if (buscar_mainservicios() == -1) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el servicio");
        } else {
            Servicios_Principales aux = (Servicios_Principales) mainservicios.get(buscar_mainservicios());
            service_name_field.setText(aux.getServicio());
            base_price_field.setText(String.valueOf(aux.getPrecio()));
            perday_pricefield.setText(String.valueOf(aux.getPrecio_por_dias()));
            kg_pricefield.setText(String.valueOf(aux.getPrecio_por_peso()));
        }
    }//GEN-LAST:event_buscar_mainserv_buttonActionPerformed

    private void cancel_mainserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_mainserviceActionPerformed
        service_id_field.setText(null);
        service_name_field.setText(null);
        base_price_field.setText(null);
        kg_pricefield.setText(null);
        perday_pricefield.setText(null);
        mostrar_main_servicios();
    }//GEN-LAST:event_cancel_mainserviceActionPerformed

    private void save_opservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_opservActionPerformed
        try {
            Integer id_servicio = Integer.parseInt(opservice_id_field.getText());
            String nombre = opservice_name_field.getText();
            Float precio_base = Float.parseFloat(opbase_price_field.getText());
            Float precio_extra = Float.parseFloat(opextra_price_field.getText());

            if (comprobar_ID(id_servicio) || buscar_opservicios() != -1) {
                if (buscar_opservicios() == -1) {
                    opservicios.add(new OtrosServ(id_servicio, precio_base, nombre, precio_extra));
                } else {
                    int index = buscar_opservicios();
                    opservicios.set(index, new OtrosServ(id_servicio, precio_base, nombre, precio_extra));
                }

                guardar_opservicios_en_archivo();
                mostrar_op_servicios();
                opservice_id_field.setText(null);
                opservice_name_field.setText(null);
                opbase_price_field.setText(null);
                opextra_price_field.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "El ID ya existe");
                opservice_id_field.setText(null);
                opservice_name_field.setText(null);
                opbase_price_field.setText(null);
                opextra_price_field.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar bien los campos");
        }
    }//GEN-LAST:event_save_opservActionPerformed

    //NO USADO
    private void opbase_price_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opbase_price_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opbase_price_fieldActionPerformed

    private void search_opserv_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_opserv_buttonActionPerformed
        if ("".equals(opservice_id_field.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese primero un ID");
        } else {
            if (buscar_opservicios() == -1) {
                JOptionPane.showMessageDialog(null, "No se ha encontrado el servicio");
            } else {
                OtrosServ aux = (OtrosServ) opservicios.get(buscar_opservicios());
                opservice_name_field.setText(aux.getServicio());
                opbase_price_field.setText(String.valueOf(aux.getPrecio()));
                opextra_price_field.setText(String.valueOf(aux.getBonus_de_malcomportamiento()));
            }
        }
    }//GEN-LAST:event_search_opserv_buttonActionPerformed

    private void del_opservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_opservActionPerformed
        if ("".equals(opservice_id_field.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese primero un ID");
        } else {
            opservicios.remove(buscar_opservicios());
            guardar_opservicios_en_archivo();
            opservice_id_field.setText(null);
            opservice_name_field.setText(null);
            opbase_price_field.setText(null);
            opextra_price_field.setText(null);
            mostrar_op_servicios();
        }
    }//GEN-LAST:event_del_opservActionPerformed

    private void cancel_opservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_opservActionPerformed
        opservice_id_field.setText(null);
        opservice_name_field.setText(null);
        opbase_price_field.setText(null);
        opextra_price_field.setText(null);
        mostrar_op_servicios();
    }//GEN-LAST:event_cancel_opservActionPerformed

    private void preciounidad_med_chkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciounidad_med_chkoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciounidad_med_chkoActionPerformed

    private void add_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_sellActionPerformed
        try {
            if ("".equals(preciounidad_med_chko.getText()) && "".equals(opextra_price_field_chko.getText()) && "".equals(perday_pricefield_chko.getText())) {
                JOptionPane.showMessageDialog(null, "Busque un producto");
            } else {
                if ("".equals(preciounidad_med_chko.getText())) {
                    if ("".equals(opextra_price_field_chko.getText())) {
                        prodventa[0] = service_name_field_chko.getText();
                        prodventa[1] = "N/A";
                        prodventa[2] = Float.parseFloat(base_price_field_chko.getText()) + (Float.parseFloat(perday_pricefield_chko.getText()) * Integer.parseInt(days_field.getText())) + (Float.parseFloat(kg_pricefield_chko.getText()) * Integer.parseInt(peso_field.getText()));

                    } else {
                        prodventa[0] = service_name_field_chko.getText();
                        prodventa[1] = "N/A";
                        prodventa[2] = Float.parseFloat(base_price_field_chko.getText());
                        if (cobrar_extra.getState()) {
                            prodventa[2] = Float.parseFloat(base_price_field_chko.getText()) + Float.parseFloat(opextra_price_field_chko.getText());
                        }

                    }
                } else {
                    Insumos aux = (Insumos) insumo[0];
                    if (aux.getCantidad() - Integer.parseInt(med_quan_field_chko.getText()) < 0 || aux.getCantidad() <= 0) {
                        JOptionPane.showMessageDialog(null, "Ya no queda más de este producto.");

                    } else {
                        prodventa[0] = nombre_med_chko1.getText();
                        prodventa[1] = med_quan_field_chko.getText();
                        prodventa[2] = Integer.parseInt(med_quan_field_chko.getText()) * Float.parseFloat(preciounidad_med_chko.getText());
                        insumo[2] = true;
                        insumo[3] = Integer.parseInt(med_quan_field_chko.getText());
                        insumos.set((int) insumo[1], new Insumos(aux.getClave(), aux.getNombre(), aux.getCantidad() - Integer.parseInt(med_quan_field_chko.getText()), aux.getPreciocu(), aux.getActivo()));
                        insumo[0] = insumos.get((int) insumo[1]);
                        mostrar_med();
                        guardar_med_en_archivo();
                    }
                }
                ver_lista_ventas();
            }
            limpiar_casillas_chkout();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar bien los campos");
        }
    }//GEN-LAST:event_add_sellActionPerformed

    private void nombre_med_chko1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_med_chko1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_med_chko1ActionPerformed

    private void ventaID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaID_fieldActionPerformed

    }//GEN-LAST:event_ventaID_fieldActionPerformed

    private void corte_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corte_cajaActionPerformed
        try {
            if (!ventas.isEmpty()) {
                Formatter corte = new Formatter("corte de caja.txt");
                String lista_corte = "";
                for (int i = 0; i < ventas.size(); i++) {
                    Object[] aux = (Object[]) ventas.get(i);
                    lista_corte += String.valueOf(aux[0]) + "\t\t" + String.valueOf(aux[2] + "\n");
                }
                corte.format("\tCORTE DE CAJA " + LocalDate.now() + "\n\nID\t\tVENTA\n%s\n\nTOTAL DE VENTAS: $ %s", lista_corte, diatotalfield.getText());
                corte.close();
                diatotalfield.setText(null);
                JOptionPane.showMessageDialog(null, "Se ha guardado el corte de caja en corte de caja.txt");
            } else {
                JOptionPane.showMessageDialog(null, "Haga primero una venta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el corte de caja");
        }


    }//GEN-LAST:event_corte_cajaActionPerformed

    public void guardar_usuarios_en_archivo() {
        try {
            Formatter guardar = new Formatter("usuarios.txt");
            for (int i = 0; i < doctores.size(); i++) {
                Doctor aux = (Doctor) doctores.get(i);
                guardar.format("%s %d %s %s\n", booleano_a_texto(aux), aux.getNum_Cedula(), aux.getPassword(), aux.getNombre());
            }
            guardar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar los datos.");
        }
        JOptionPane.showMessageDialog(null, "Se ha guardado la lista de doctores en /usuarios.txt");
    }

    public void guardar_med_en_archivo() {
        try {
            Formatter guardar = new Formatter("insumos.txt");
            for (int i = 0; i < insumos.size(); i++) {
                Insumos aux = (Insumos) insumos.get(i);
                guardar.format("%d %d %f %s\n", aux.getClave(), aux.getCantidad(), aux.getPreciocu(), aux.getNombre());
            }
            guardar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar los datos de los insumos.");
        }
        JOptionPane.showMessageDialog(null, "Se ha guardado la lista de medicinas en /insumos.txt");
    }

    public void guardar_mainservicios_en_archivo() {

        try {
            Formatter guardar = new Formatter("servicios_principales.txt");
            for (int i = 0; i < mainservicios.size(); i++) {
                Servicios_Principales aux = (Servicios_Principales) mainservicios.get(i);
                guardar.format("%d %f %f %f %s\n", aux.getId_serv(), aux.getPrecio(), aux.getPrecio_por_dias(), aux.getPrecio_por_peso(), aux.getServicio());
            }
            guardar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar los servicios principales");
        }
        JOptionPane.showMessageDialog(null, "Se ha guardado la lista de servicios principales en /servicios_principales.txt");
    }

    public void guardar_opservicios_en_archivo() {

        try {
            Formatter guardar = new Formatter("servicios_secundarios.txt");
            for (int i = 0; i < opservicios.size(); i++) {
                OtrosServ aux = (OtrosServ) opservicios.get(i);
                guardar.format("%d %f %f %s\n", aux.getId_serv(), aux.getPrecio(), aux.getBonus_de_malcomportamiento(), aux.getServicio());
            }
            guardar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar los servicios secundarios");
        }
        JOptionPane.showMessageDialog(null, "Se ha guardado la lista de servicios principales en /servicios_secundarios.txt");
    }

    public void crear_ticket() {
        id_venta += 10;
        try {
            Formatter ticket = new Formatter("ticket" + id_venta + ".txt");
            ticket.format(formato_ticket, id_venta, ticket_servicios.getText(), total_servicios.getText());
            ticket.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar el ticket");
        }
        JOptionPane.showMessageDialog(null, "El ticket se guardo en ticket" + id_venta + ".txt");
    }

    public void mostrar_usuarios() {
        mostrar_usuarios.setText("");
        for (int i = 0; i < doctores.size(); i++) {
            Doctor aux = (Doctor) doctores.get(i);
            mostrar_usuarios.append(aux.toString());

        }
    }

    public void mostrar_med() {
        mostrar_med.setText("");
        for (int i = 0; i < insumos.size(); i++) {
            Insumos aux = (Insumos) insumos.get(i);
            mostrar_med.append(aux.toString());
        }
    }

    public void mostrar_main_servicios() {
        mostrar_mainserv.setText("");
        for (int i = 0; i < mainservicios.size(); i++) {
            Servicios_Principales aux = (Servicios_Principales) mainservicios.get(i);
            mostrar_mainserv.append(aux.toString((Servicios) aux));
        }
    }

    public void mostrar_op_servicios() {
        mostrar_opserv.setText("");
        for (int i = 0; i < opservicios.size(); i++) {
            OtrosServ aux = (OtrosServ) opservicios.get(i);
            mostrar_opserv.append(aux.toString((Servicios) aux));
        }
    }

    public int buscar_cedula() {
        try {
            Integer buscar_cedula = Integer.parseInt(buscar_cedula_field.getText());
            int index = 0;
            for (int i = 0; i < doctores.size(); i++) {
                Doctor aux = (Doctor) doctores.get(i);
                if (Objects.equals(buscar_cedula, aux.getNum_Cedula())) {
                    index = i;
                    break;
                } else {
                    index = -1;
                }
            }
            return index;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID valido");
        }
        return -1;
    }

    public int buscar_medicamento() {
        try {
            Integer buscar_med = Integer.parseInt(Medicamento.getText());
            int index = 0;
            for (int i = 0; i < insumos.size(); i++) {
                Insumos aux = (Insumos) insumos.get(i);
                if (Objects.equals(buscar_med, aux.getClave())) {
                    index = i;
                    break;
                } else {
                    index = -1;
                }
            }
            return index;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID valido");
        }
        return -1;
    }

    public int buscar_mainservicios() {
        try {
            Integer buscar_id = Integer.parseInt(service_id_field.getText());
            int index = 0;
            for (int i = 0; i < mainservicios.size(); i++) {
                Servicios_Principales aux = (Servicios_Principales) mainservicios.get(i);
                if (Objects.equals(buscar_id, aux.getId_serv())) {
                    index = i;
                    break;
                } else {
                    index = -1;
                }
            }
            return index;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID valido");
        }
        return -1;
    }

    public int buscar_opservicios() {
        try {
            Integer buscar_id = Integer.parseInt(opservice_id_field.getText());
            int index = 0;
            for (int i = 0; i < opservicios.size(); i++) {
                OtrosServ aux = (OtrosServ) opservicios.get(i);
                if (Objects.equals(buscar_id, aux.getId_serv())) {
                    index = i;
                    break;
                } else {
                    index = -1;
                }
            }
            return index;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID valido");
        }
        return -1;
    }

    public void cargar_mainserv() {
        try {
            Scanner leer = new Scanner(new File("servicios_principales.txt"));
            while (leer.hasNext()) {
                Integer id_serv = leer.nextInt();
                Float precio_base = leer.nextFloat();
                Float precio_dias = leer.nextFloat();
                Float precio_kg = leer.nextFloat();
                String name = leer.nextLine();
                mainservicios.add(new Servicios_Principales(id_serv, precio_base, name, precio_dias, precio_kg));
            }
            leer.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha sucedido un error en la lectura del archivo de servicios principales");
        }
    }

    public void cargar_usuarios() {
        try {
            Scanner lectorarchivo = new Scanner(new File("usuarios.txt"));
            while (lectorarchivo.hasNext()) {
                Boolean active = texto_a_booleano(lectorarchivo.next());
                Integer num_cedula = lectorarchivo.nextInt();
                String pass = lectorarchivo.next();
                String nombre = lectorarchivo.nextLine();
                doctores.add(new Doctor(nombre, pass, num_cedula, active));
            }
            lectorarchivo.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha sucedido un error en la lectura del archivo de usuarios");
        }
    }

    public void cargar_med() {
        try {
            Scanner lectorarchivo = new Scanner(new File("insumos.txt"));
            while (lectorarchivo.hasNext()) {
                Integer clave = lectorarchivo.nextInt();
                Integer cantidad = lectorarchivo.nextInt();
                Float precio = lectorarchivo.nextFloat();
                String nombre = lectorarchivo.nextLine();
                insumos.add(new Insumos(clave, nombre, cantidad, precio, true));
            }
            lectorarchivo.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha sucedido error de lectura del archivo insumos.txt");
        }

    }

    public void cargar_opserv() {
        try {
            Scanner leer = new Scanner(new File("servicios_secundarios.txt"));
            while (leer.hasNext()) {
                Integer id_serv = leer.nextInt();
                Float precio_base = leer.nextFloat();
                Float precio_extra = leer.nextFloat();
                String name = leer.nextLine();
                opservicios.add(new OtrosServ(id_serv, precio_base, name, precio_extra));
            }
            leer.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha sucedido un error en la lectura del archivo de servicios_secundarios.txt");
        }
    }

    public void ver_lista_ventas() {
        if (prodventa [0]!=null&&prodventa [1] != null && prodventa [2] != null){
            ticket_servicios.append((String) prodventa[0] + "\t" + (String) prodventa[1] + "\t" + (Float) prodventa[2] + "\n");
            calcular_total();
        }
        
    }

    public void calcular_total() {
        total += (Float) prodventa[2];
        total_servicios.setText(String.valueOf(total));
    }

    public void calcular_total_dia() {
        diatotalfield.setText(null);
        Float total_dia = 0f;
        for (int i = 0; i < ventas.size(); i++) {
            Object[] aux = (Object[]) ventas.get(i);
            total_dia += (Float) aux[2];
        }
        diatotalfield.setText(String.valueOf(total_dia));
    }

    public void limpiar_casillas_chkout() {
        nombre_med_chko1.setText(null);
        nombre_med_chko1.setEditable(false);
        preciounidad_med_chko.setText(null);
        preciounidad_med_chko.setEditable(false);
        med_quan_field_chko.setText(null);
        med_quan_field_chko.setEditable(false);
        service_name_field_chko.setText(null);
        service_name_field_chko.setEditable(false);
        base_price_field_chko.setText(null);
        base_price_field_chko.setEditable(false);
        perday_pricefield_chko.setText(null);
        perday_pricefield_chko.setEditable(false);
        kg_pricefield_chko.setText(null);
        kg_pricefield_chko.setEditable(false);
        opextra_price_field_chko.setText(null);
        opextra_price_field_chko.setEditable(false);
        days_field.setText(null);
        days_field.setEditable(false);
        peso_field.setText(null);
        peso_field.setEditable(false);
        cobrar_extra.setEnabled(false);
        cobrar_extra.setState(false);
    }

    public static String booleano_a_texto(Doctor aux) {
        String texto_activo;
        if (aux.getEsta_activo() == true) {
            texto_activo = "Si";
        } else {
            texto_activo = "No";
        }
        return texto_activo;
    }

    public static Boolean texto_a_booleano(String aux) {
        Boolean activo;
        if ("Si".equals(aux)) {
            activo = true;
        } else {
            activo = false;
        }
        return activo;
    }

    public Boolean comprobar_ID(Integer id) {
        Boolean en_insumos = false;
        Boolean en_mainserv = false;
        Boolean en_opserv = false;

        for (int i = 0; i < insumos.size(); i++) {
            Insumos aux = (Insumos) insumos.get(i);
            if (Objects.equals(aux.getClave(), id)) {
                en_insumos = true;
            }
        }

        for (int i = 0; i < mainservicios.size(); i++) {
            Servicios_Principales aux = (Servicios_Principales) mainservicios.get(i);
            if (Objects.equals(aux.getId_serv(), id)) {
                en_mainserv = true;
            }
        }

        for (int i = 0; i < opservicios.size(); i++) {
            OtrosServ aux = (OtrosServ) opservicios.get(i);
            if (Objects.equals(aux.getId_serv(), id)) {
                en_opserv = true;
            }
        }

        return !en_insumos && !en_mainserv && !en_opserv;
    }

    public static void main(String args[]) {
        Menu cargar = new Menu();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Medicamento;
    private javax.swing.JButton add_sell;
    private javax.swing.JButton agrega_servicio;
    private javax.swing.JTextField base_price_field;
    private javax.swing.JTextField base_price_field_chko;
    private javax.swing.JButton buscar_cedula_botton;
    private javax.swing.JTextField buscar_cedula_field;
    private javax.swing.JButton buscar_mainserv_button;
    private javax.swing.JButton cancel_mainservice;
    private javax.swing.JButton cancel_opserv;
    private javax.swing.JButton cancelar_servicios;
    private javax.swing.JTextField cantidad_field;
    private javax.swing.JTextField cedula_field;
    private javax.swing.JButton clean_botton;
    private javax.swing.JButton clean_button_verventas;
    private java.awt.Checkbox cobrar_extra;
    private javax.swing.JButton corte_caja;
    private javax.swing.JTextField days_field;
    private javax.swing.JButton del_mainservice;
    private javax.swing.JButton del_opserv;
    private javax.swing.JButton delete_med_button;
    private javax.swing.JTextField diatotalfield;
    private javax.swing.JButton guardar_med;
    private java.awt.Checkbox is_active;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kg_pricefield;
    private javax.swing.JTextField kg_pricefield_chko;
    private javax.swing.JButton limpia_med;
    private javax.swing.JTextField med_quan_field_chko;
    private javax.swing.JTextArea mostrar_mainserv;
    private javax.swing.JTextArea mostrar_med;
    private javax.swing.JTextArea mostrar_opserv;
    private javax.swing.JTextArea mostrar_usuarios;
    private javax.swing.JTextField nombre_field;
    private javax.swing.JTextField nombre_med;
    private javax.swing.JTextField nombre_med_chko1;
    private javax.swing.JTextField opbase_price_field;
    private javax.swing.JTextField opextra_price_field;
    private javax.swing.JTextField opextra_price_field_chko;
    private javax.swing.JTextField opservice_id_field;
    private javax.swing.JTextField opservice_name_field;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JTextField perday_pricefield;
    private javax.swing.JTextField perday_pricefield_chko;
    private javax.swing.JTextField peso_field;
    private javax.swing.JTextField precio_field;
    private javax.swing.JTextField preciounidad_med_chko;
    private javax.swing.JButton save_botton1;
    private javax.swing.JButton save_mainservice;
    private javax.swing.JButton save_opserv;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton search_opserv_button;
    private javax.swing.JButton search_ventaid;
    private javax.swing.JTextField seleccion_servicio;
    private javax.swing.JTextField selldate;
    private javax.swing.JTextField service_id_field;
    private javax.swing.JTextField service_name_field;
    private javax.swing.JTextField service_name_field_chko;
    private javax.swing.JButton terminar_servicios;
    private javax.swing.JTextArea ticket_servicios;
    private javax.swing.JTextField total_servicios;
    private javax.swing.JTextField ventaID_field;
    private javax.swing.JTextArea ver_ventas_box;
    private javax.swing.JTextField vertotalventafield;
    // End of variables declaration//GEN-END:variables
}
