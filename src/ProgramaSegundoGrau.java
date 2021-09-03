import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgramaSegundoGrau {

	private JFrame frame;
	private JPanel pnlResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaSegundoGrau window = new ProgramaSegundoGrau();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgramaSegundoGrau() {
		initialize();
		pnlResultado.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner txtA = new JSpinner();
		txtA.setBounds(26, 28, 42, 20);
		frame.getContentPane().add(txtA);
		
		JSpinner txtB = new JSpinner();
		txtB.setBounds(154, 28, 42, 20);
		frame.getContentPane().add(txtB);
		
		JSpinner txtC = new JSpinner();
		txtC.setBounds(255, 28, 42, 20);
		frame.getContentPane().add(txtC);
		
		JLabel lblNewLabel = new JLabel("<html>x<sup>2</sup>+</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(79, 15, 42, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(194, 19, 49, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(303, 28, 59, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblB.setBounds(67, 70, 46, 14);
		frame.getContentPane().add(lblB);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblA.setBounds(141, 70, 63, 14);
		frame.getContentPane().add(lblA);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblC.setBounds(182, 70, 46, 14);
		frame.getContentPane().add(lblC);
		
		JLabel lblNewLabel_3 = new JLabel("<html><sup>2</sup>-4.</html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(108, 59, 49, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(".");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(167, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("<html>&Delta;=</html>");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(31, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnCalc = new JButton("<html>calcular &Delta;</html>");
		
		btnCalc.setBounds(141, 123, 135, 23);
		frame.getContentPane().add(btnCalc);
		
	    pnlResultado = new JPanel();
		pnlResultado.setBounds(0, 175, 276, 75);
		frame.getContentPane().add(pnlResultado);
		pnlResultado.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		pnlResultado.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("<html>valor de &Delta;</html>");
		lblNewLabel_7.setBounds(24, 11, 77, 14);
		pnlResultado.add(lblNewLabel_7);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(Color.BLUE);
		lblDelta.setBounds(180, 11, 46, 14);
		pnlResultado.add(lblDelta);
		
		JLabel lblNewLabel_9 = new JLabel("Tipos de raizes");
		lblNewLabel_9.setBounds(24, 50, 86, 14);
		pnlResultado.add(lblNewLabel_9);
		
		JLabel lblRaiz = new JLabel("0");
		lblRaiz.setForeground(Color.BLUE);
		lblRaiz.setBounds(120, 50, 146, 14);
		pnlResultado.add(lblRaiz);
		
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(txtA.getValue().toString());
				int b=Integer.parseInt(txtB.getValue().toString());
				int c=Integer.parseInt(txtC.getValue().toString());
				Double d=Math.pow(b, 2)-4*a*c;
				lblDelta.setText(String.format("%.1f",d));
					if (d<0) {
						lblRaiz.setText("não existem raizes reais");
					} else {
						lblRaiz.setText("existem raizes reais");
					}
			
				
				pnlResultado.setVisible(true);
			}
		});
	}
}
