import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Biodata extends JFrame {
    private JTextField textField1;
    private JComboBox Tanggal;
    private JTextArea textArea1;
    private JButton button1;
    private JTextField textField2;
    private JComboBox Bulan;
    private JComboBox Tahun;
    private JPanel panelMain;
    private JLabel HasilLabel;

    public Biodata() {
        setTitle("Data Mahasiswa");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        HasilLabel = new JLabel("Usia: ");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OutNama();
            }
        });
    }


    private void OutNama() {
        String Nama = textField1.getText();
        textField2.setText(Nama);
    }

    public static void main(String[] args) {
        Biodata b = new Biodata();
        b.setContentPane(b.panelMain);
        b.setSize(450, 300);
        b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b.setVisible(true);
    }
    }
