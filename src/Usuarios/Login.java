package Usuarios;

import Menus.Menu;
import static Menus.Menu.texto_a_booleano;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    LinkedList<Doctor> usuarios = new LinkedList();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login_botton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("# Cedula");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        login_botton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_botton.setText("Iniciar Sesión");
        login_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_bottonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("LogIn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userfield)
                            .addComponent(passfield, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(login_botton)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(login_botton)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_bottonActionPerformed
        try {
            Scanner lectorarchivo = new Scanner(new File("usuarios.txt"));
            while (lectorarchivo.hasNext()) {
                Boolean active = texto_a_booleano(lectorarchivo.next());
                Integer num_cedula = lectorarchivo.nextInt();
                String pass = lectorarchivo.next();
                String nombre = lectorarchivo.nextLine();
                usuarios.add(new Doctor(nombre, pass, num_cedula, active));
            }
            lectorarchivo.close();
            
            Integer campo_usuario = Integer.parseInt(userfield.getText());
            String campo_contrasenya = passfield.getText();
            
            int index = buscar_cedula(Integer.parseInt(userfield.getText()));
            Doctor aux = (Doctor) usuarios.get(index);
            
            if (campo_usuario == null || campo_contrasenya.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algún campo esta vacio");
            } else {
                if (Objects.equals(aux.getNum_Cedula(), campo_usuario) && campo_contrasenya.equals(aux.getPassword()) && aux.getEsta_activo()) {
                    Menu pc = new Menu();
                    pc.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Su usuario o contraseña es incorrecto o también su usuario está inactivo");
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique la exitencia del archivo usuarios.txt, asegurese de haber creado usuarios primero.");
            Menu pc = new Menu();
            pc.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_login_bottonActionPerformed

    public int buscar_cedula(int buscar_cedula) {
        int index = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            Doctor aux = (Doctor) usuarios.get(i);
            if (Objects.equals(buscar_cedula, aux.getNum_Cedula())) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_botton;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}