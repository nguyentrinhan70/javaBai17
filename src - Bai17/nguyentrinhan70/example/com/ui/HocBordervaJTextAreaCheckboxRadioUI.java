package nguyentrinhan70.example.com.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBordervaJTextAreaCheckboxRadioUI extends JFrame {
	JTextField txtTen;
	JTextArea txtDiaChi;
	JButton btnOk;
	
	JCheckBox chkDiBoi, chkDiXemphim;
	JRadioButton radNam, radNu;
	ButtonGroup groupGioiTinh;
	public HocBordervaJTextAreaCheckboxRadioUI(String title){
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyLayThongTin();
			}
		});
	}

	protected void xuLyLayThongTin() {
		// TODO Auto-generated method stub
		String msg = txtTen.getText() + "\n";
		msg+=txtDiaChi.getText() +"\n";
	
		String soThich = "";
		if(chkDiBoi.isSelected()){
			soThich +=chkDiBoi.getText()+"\n";
		}
		if(chkDiXemphim.isSelected()){
			soThich +=chkDiXemphim.getText()+"\n";
		}
		msg+=soThich;
		String gioiTinh ="";
		if(radNam.isSelected())
		{
			gioiTinh=radNam.getText();
			
		}
		else
			gioiTinh =radNu.getText();
		msg+=gioiTinh;
		JOptionPane.showMessageDialog(null, msg);
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
		
		JPanel pnSoThichGioiTinh = new JPanel();
		pnSoThichGioiTinh.setLayout(new GridLayout(1, 2));
		JPanel pnSoThich = new JPanel();
		Border borderSoThich = BorderFactory.createLineBorder(Color.red);
		TitledBorder titledBorderSoThich = 
				new TitledBorder(borderSoThich,"Sở thích");
		pnSoThich.setBorder(titledBorderSoThich);
				
		pnSoThich.setLayout(new BoxLayout(pnSoThich, BoxLayout.Y_AXIS));
		chkDiBoi = new JCheckBox("Đi bơi");
		chkDiXemphim = new JCheckBox("Đi xem phim");
		pnSoThich.add(chkDiBoi);
		pnSoThich.add(chkDiXemphim);
		pnSoThichGioiTinh.add(pnSoThich);
		
		
		JPanel pnGioiTinh = new JPanel();
		Border borderGioiTinh = BorderFactory.createLineBorder(Color.red);
		TitledBorder titledBorderGioiTinh = new TitledBorder(borderGioiTinh,"Giới tính");
		pnGioiTinh.setBorder(titledBorderGioiTinh);
		pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
		radNam = new JRadioButton("Nam");
		radNu = new JRadioButton("Nữ");
		groupGioiTinh = new ButtonGroup();
		groupGioiTinh.add(radNam);
		groupGioiTinh.add(radNu);
		pnGioiTinh.add(radNam);
		pnGioiTinh.add(radNu);
		pnSoThichGioiTinh.add(pnGioiTinh);
		pnMain.add(pnSoThichGioiTinh);
		
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
