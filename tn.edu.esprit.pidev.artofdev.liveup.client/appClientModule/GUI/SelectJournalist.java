package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import GUI.model.JournalistTableModel;
import javax.swing.JScrollPane;

import tn.edu.esprit.pidev.artofdev.liveup.ejb.persistences.Journalist;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import org.hornetq.api.core.client.loadbalance.FirstElementConnectionLoadBalancingPolicy;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectJournalist extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable journalistTable;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					SelectJournalist frame = new SelectJournalist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectJournalist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 64, 483, 271);
		contentPane.add(scrollPane);
		
		journalistTable = new JTable();
		scrollPane.setViewportView(journalistTable);
		final JournalistTableModel journalistTableModel = new JournalistTableModel();
		journalistTable.setModel(journalistTableModel);
		
		JLabel lblSelectAJournalist = new JLabel("Select a journalist :");
		lblSelectAJournalist.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblSelectAJournalist.setBounds(24, 23, 229, 30);
		contentPane.add(lblSelectAJournalist);
		
		JButton btnAccept = new JButton("Exit");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAccept.setBounds(529, 363, 89, 23);
		contentPane.add(btnAccept);
		
		JButton btnReject = new JButton("Edit");
		btnReject.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			
				EditJournalist EJ= new EditJournalist();
				EJ.setVisible(true);
				int selectedRow = journalistTable.getSelectedRow();
				Journalist journalist = (Journalist) journalistTableModel.getValueAt(selectedRow, -1);
				EJ.getFirstNameText().setText(journalist.getFirstName());
			}
		});
		btnReject.setBounds(362, 363, 89, 23);
		contentPane.add(btnReject);
		//int selectedRow = journalistTable.getSelectedRow();
		//Journalist journalist = (Journalist) journalistTableModel.getValueAt(selectedRow, -1);
	}
}
