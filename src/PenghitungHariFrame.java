
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sendi
 */
public class PenghitungHariFrame extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungHariFrame
     */
    public PenghitungHariFrame() {
        initComponents();
        jSpinner1.addChangeListener(e -> updateCalendar());
        jSpinner1.setValue(Calendar.getInstance().get(Calendar.YEAR));
        jComboBox1.addActionListener(e -> updateCalendar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("Pilih Bulan");

        jLabel2.setText("Tahun");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juili", "Agustus", "September", "Oktober", "November", "Desember" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Hitung Selisih");

        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, 0, 135, Short.MAX_VALUE)
                            .addComponent(jSpinner1))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(300, 311, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hitungHari();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        updateCalendar();
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungHariFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
private void updateCalendar() {
    int bulanIndex = jComboBox1.getSelectedIndex(); // Mendapatkan index bulan dari ComboBox
    int tahun = (int) jSpinner1.getValue(); // Mendapatkan tahun dari Spinner
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, tahun); // Mengatur tahun pada kalender
    cal.set(Calendar.MONTH, bulanIndex); // Mengatur bulan pada kalender
    cal.set(Calendar.DAY_OF_MONTH, 1); // Mengatur tanggal ke tanggal pertama di bulan 
    jCalendar1.setCalendar(cal); // Memperbarui kalender di JCalendar
    }
    
    private void hitungHari() {
    int bulanIndex = jComboBox1.getSelectedIndex() + 1;
    int tahun = (int) jSpinner1.getValue();
    YearMonth yearMonth = YearMonth.of(tahun, bulanIndex);
    int jumlahHari = yearMonth.lengthOfMonth();

    // Mendapatkan hari pertama dan terakhir dalam bulan
    LocalDate hariPertama = yearMonth.atDay(1);
    LocalDate hariTerakhir = yearMonth.atEndOfMonth();
    String namaHariPertama = hariPertama.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
    String namaHariTerakhir = hariTerakhir.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));

    // Mengecek apakah tahun kabisat
    boolean isLeapYear = yearMonth.isLeapYear();
    String kabisatInfo = isLeapYear ? "adalah tahun kabisat" : "bukan tahun kabisat";

    // Menghitung selisih hari antara dua tanggal dari jCalendar1 dan jCalendar2
    LocalDate date1 = LocalDate.of(jCalendar1.getCalendar().get(Calendar.YEAR),
                                   jCalendar1.getCalendar().get(Calendar.MONTH) + 1,
                                   jCalendar1.getCalendar().get(Calendar.DAY_OF_MONTH));
    LocalDate date2 = LocalDate.of(jCalendar2.getCalendar().get(Calendar.YEAR),
                                   jCalendar2.getCalendar().get(Calendar.MONTH) + 1,
                                   jCalendar2.getCalendar().get(Calendar.DAY_OF_MONTH));
    long daysBetween = ChronoUnit.DAYS.between(date1, date2);
    String selisihHari = "Selisih hari antara kedua tanggal yang dipilih: " + Math.abs(daysBetween) + " hari";

    // Menggabungkan semua informasi menjadi satu pesan
    String infoPesan = "Jumlah hari pada bulan yang anda pilih : "  + jumlahHari + " hari" +
                       "\nHari pertama dibulan ini: " + namaHariPertama +
                       "\nHari terakhir dibulan ini: " + namaHariTerakhir +
                       "\nTahun " + tahun + " " + kabisatInfo +
                       "\n" + selisihHari;

    // Menampilkan semua informasi dalam satu JOptionPane
    JOptionPane.showMessageDialog(this, infoPesan, "Informasi Lengkap", JOptionPane.INFORMATION_MESSAGE);
}
}
