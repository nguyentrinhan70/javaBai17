package nguyentrinhan70.example.com.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBordervaJTextAreaUI extends JFrame {
	JTextField txtTen;
	JTextArea txtDiaChi;
	JButton btnOk;
	
	public HocBordervaJTextAreaUI(String title){
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
			
		
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS) );
		
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		
		JLabel lblTen = new JLabel("Nhập tên:");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);
		
		JPanel pnDiaChi = new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		txtDiaChi = new JTextArea(5, 20);
		
		txtDiaChi.setWrapStyleWord(true);
		txtDiaChi.setLineWrap(true);
		JScrollPane sc = new JScrollPane(
				txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JLabel lblDiaChi = new JLabel("Địa chỉ:");
		
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		
		pnThongTin.add(pnDiaChi);
		
		pnMain.add(pnThongTin);
			
		Border borderThongTin = BorderFactory.createLineBorder(Color.blue);
		TitledBorder borderTitleThongTin = new 
				TitledBorder(borderThongTin,"Thông tin");
		borderTitleThongTin.setTitleColor(Color.red);
		borderTitleThongTin.setTitleJustification(TitledBorder.RIGHT);
		pnThongTin.setBorder(borderTitleThongTin);
		
		
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOk = new JButton("OK");
		pnOK.add(btnOk);
		
		pnMain.add(pnOK);
		lblDiaChi.setPreferredSize(lblTen.getPreferredSize());
		
	}
	public void showWindow() {
		
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
