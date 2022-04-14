package tp1;

import java.awt.EventQueue;



import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;

public class Interfaz {

	private JFrame frmTatetoroV;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JTextField txtContadorX;
	private JTextField txtContadorO;
	private JTextField txtTurnoActual;
	private Logica l = new Logica();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmTatetoroV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTatetoroV = new JFrame();
		frmTatetoroV.setTitle("Ta-te-toro V1.0.");
		frmTatetoroV.setBounds(100, 100, 1200, 600);
		frmTatetoroV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTatetoroV.setLocationRelativeTo(null);
		frmTatetoroV.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmTatetoroV.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 2, 284, 184);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		
		boton1 = new JButton("");
		boton1.setBackground(Color.WHITE);
		boton1.setBounds(2, 2, 280, 180);
		boton1.setFont(new Font("Arial", Font.PLAIN, 99));
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton1.getText()=="" && l.getGanador() == false) {
					boton1.setText(l.getTurno());
					l.setBoton1(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton1.setForeground(Color.RED);
					}else {
						boton1.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_1.setLayout(null);
		panel_1.add(boton1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(287, 2, 284, 184);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		
		boton2 = new JButton("");
		boton2.setBackground(Color.WHITE);
		boton2.setBounds(2, 2, 280, 180);
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton2.getText()=="" && l.getGanador() == false) {
					boton2.setText(l.getTurno());
					l.setBoton2(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton2.setForeground(Color.RED);
					}else {
						boton2.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_2.setLayout(null);
		boton2.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_2.add(boton2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(572, 2, 284, 184);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		
		boton3 = new JButton("");
		boton3.setBackground(Color.WHITE);
		boton3.setBounds(2, 2, 280, 180);
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton3.getText()=="" && l.getGanador() == false) {
					boton3.setText(l.getTurno());
					l.setBoton3(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton3.setForeground(Color.RED);
					}else {
						boton3.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_3.setLayout(null);
		boton3.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_3.add(boton3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(2, 188, 284, 184);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		
		boton4 = new JButton("");
		boton4.setBackground(Color.WHITE);
		boton4.setBounds(2, 2, 280, 180);
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton4.getText()=="" && l.getGanador() == false) {
					boton4.setText(l.getTurno());
					l.setBoton4(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton4.setForeground(Color.RED);
					}else {
						boton4.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_4.setLayout(null);
		boton4.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_4.add(boton4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(287, 188, 284, 184);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		
		boton5 = new JButton("");
		boton5.setBackground(Color.WHITE);
		boton5.setBounds(2, 2, 280, 180);
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton5.getText()=="" && l.getGanador() == false) {
					boton5.setText(l.getTurno());
					l.setBoton5(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton5.setForeground(Color.RED);
					}else {
						boton5.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_5.setLayout(null);
		boton5.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_5.add(boton5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(572, 188, 284, 184);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		
		boton6 = new JButton("");
		boton6.setBackground(Color.WHITE);
		boton6.setBounds(2, 2, 280, 180);
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton6.getText()=="" && l.getGanador() == false) {
					boton6.setText(l.getTurno());
					l.setBoton6(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton6.setForeground(Color.RED);
					}else {
						boton6.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_6.setLayout(null);
		boton6.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_6.add(boton6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(2, 374, 284, 184);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		
		boton7 = new JButton("");
		boton7.setBackground(Color.WHITE);
		boton7.setBounds(2, 2, 280, 180);
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton7.getText()=="" && l.getGanador() == false) {
					boton7.setText(l.getTurno());
					l.setBoton7(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton7.setForeground(Color.RED);
					}else {
						boton7.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_7.setLayout(null);
		boton7.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_7.add(boton7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(287, 374, 284, 184);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		
		boton8 = new JButton("");
		boton8.setBackground(Color.WHITE);
		boton8.setBounds(2, 2, 280, 180);
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton8.getText()=="" && l.getGanador() == false) {
					boton8.setText(l.getTurno());
					l.setBoton8(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton8.setForeground(Color.RED);
					}else {
						boton8.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_8.setLayout(null);
		boton8.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_8.add(boton8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(572, 374, 284, 184);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		
		boton9 = new JButton("");
		boton9.setBackground(Color.WHITE);
		boton9.setBounds(2, 2, 280, 180);
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(boton9.getText()=="" && l.getGanador() == false) {
					boton9.setText(l.getTurno());
					l.setBoton9(l.getTurno());
					if(l.getTurno().equalsIgnoreCase("X")) {
						boton9.setForeground(Color.RED);
					}else {
						boton9.setForeground(Color.BLUE);
					}
					l.elijeJugador();
					l.comprobarGanador();
					txtTurnoActual.setText("Turno de " + l.getTurno());
				}
				if(l.getGanador() == true) {
					txtContadorX.setText(String.valueOf(l.getContadorX()));
					txtContadorO.setText(String.valueOf(l.getContadorO()));
					if(l.getFinRonda() == false) {
						JOptionPane.showMessageDialog(frmTatetoroV, "Jugador " + l.getJugadorGanador() + " es el ganador", "Ta-te-toro", JOptionPane.INFORMATION_MESSAGE);
					}
					l.setFinRonda(true);
				}
			}
		});
		panel_9.setLayout(null);
		boton9.setFont(new Font("Arial", Font.PLAIN, 99));
		panel_9.add(boton9);
		
		JLabel lblJugadorX = new JLabel("X:");
		lblJugadorX.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblJugadorX.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugadorX.setBounds(933, 158, 69, 73);
		panel.add(lblJugadorX);
		
		JLabel lblJugadorO = new JLabel("O:");
		lblJugadorO.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugadorO.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblJugadorO.setBounds(933, 81, 69, 73);
		panel.add(lblJugadorO);
		
		JLabel lblPuntuacion = new JLabel("Puntuaci\u00F3n");
		lblPuntuacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntuacion.setBounds(964, 30, 125, 40);
		panel.add(lblPuntuacion);
		
		txtContadorX = new JTextField();
		txtContadorX.setEditable(false);
		txtContadorX.setHorizontalAlignment(SwingConstants.CENTER);
		txtContadorX.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtContadorX.setText("0");
		txtContadorX.setBounds(1003, 178, 86, 33);
		panel.add(txtContadorX);
		txtContadorX.setColumns(10);
		
		txtContadorO = new JTextField();
		txtContadorO.setEditable(false);
		txtContadorO.setHorizontalAlignment(SwingConstants.CENTER);
		txtContadorO.setText("0");
		txtContadorO.setFont(new Font("Tahoma", Font.BOLD, 28));
		txtContadorO.setBounds(1003, 104, 86, 33);
		panel.add(txtContadorO);
		txtContadorO.setColumns(10);
		
		JButton botonReiniciar = new JButton("Reiniciar");
		botonReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTurnoActual.setText("Turno de " + l.getTurno());
				boton1.setText("");
				boton2.setText("");
				boton3.setText("");
				boton4.setText("");
				boton5.setText("");
				boton6.setText("");
				boton7.setText("");
				boton8.setText("");
				boton9.setText("");
				l.reiniciar();
			}
		});
		botonReiniciar.setFont(new Font("Tahoma", Font.BOLD, 22));
		botonReiniciar.setBounds(879, 436, 133, 61);
		panel.add(botonReiniciar);
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTatetoroV = new JFrame("Salir");
				if(JOptionPane.showConfirmDialog(frmTatetoroV, "¿Desea salir del programa?", "Ta-te-toro", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		botonSalir.setFont(new Font("Tahoma", Font.BOLD, 22));
		botonSalir.setBounds(1026, 436, 133, 61);
		panel.add(botonSalir);
		
		txtTurnoActual = new JTextField();
		txtTurnoActual.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTurnoActual.setText("Turno de X");
		txtTurnoActual.setEditable(false);
		txtTurnoActual.setHorizontalAlignment(SwingConstants.CENTER);
		txtTurnoActual.setBounds(914, 293, 207, 38);
		panel.add(txtTurnoActual);
		txtTurnoActual.setColumns(10);
		
		JLabel lblTurnoActual = new JLabel("Turno Actual:");
		lblTurnoActual.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTurnoActual.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurnoActual.setBounds(929, 249, 175, 33);
		panel.add(lblTurnoActual);
		
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTurnoActual.setText("Turno de " + l.getTurno());
				boton1.setText("");
				boton2.setText("");
				boton3.setText("");
				boton4.setText("");
				boton5.setText("");
				boton6.setText("");
				boton7.setText("");
				boton8.setText("");
				boton9.setText("");
				l.nuevaPartida();
				txtContadorX.setText("0");
				txtContadorO.setText("0");
			}
		});
		btnNuevaPartida.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNuevaPartida.setBounds(914, 355, 207, 61);
		panel.add(btnNuevaPartida);
	}
}
