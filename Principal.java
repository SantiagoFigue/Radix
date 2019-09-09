package Diseño;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.AcceptPendingException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Componenetes.Funcion;
import Exception.Parentesis;

public class Principal extends JFrame{
	
	private Funcion datos;
	
	private JPanel pnlDisplay;
	private JPanel pnlTeclado;
	private JPanel pnlResultado;
	private JPanel pnlEntrada;
	
	private JLabel jtaEntrada;
	private JLabel jtaResultado;
	
	private JButton btnBorrarT;
	private JButton btnBorrar;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnSum;
	private JButton btnRes;
	private JButton btnPon;
	private JButton btnResul;
	private JButton btnParIzq;
	private JButton btnParDer;
	
	public Principal() {
		
		
		super("Calculadora");
		super.setLayout(new BorderLayout());
		super.setSize(350, 400);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(new GridLayout(2,1));
		
		Funcion datos= new Funcion();
		
		pnlDisplay=new JPanel(new BorderLayout());
		pnlDisplay.setLayout(new GridLayout(2,1));
		pnlDisplay.setBackground(Color.BLUE);
		
		
		pnlEntrada=new JPanel();
		pnlEntrada.setBorder(BorderFactory.createTitledBorder("Formula"));
		pnlEntrada.setBackground(Color.WHITE);
		jtaEntrada=new JLabel();
		jtaEntrada.setFont(new Font("Times New Roman", 2, 25));
		pnlEntrada.add(jtaEntrada,BorderLayout.WEST);
		
		pnlDisplay.add(pnlEntrada,BorderLayout.NORTH);
		pnlResultado=new JPanel();
		pnlResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));
		pnlResultado.setBackground(Color.GRAY);
		jtaResultado=new JLabel();
		jtaResultado.setFont(new Font("Times New Roman", 2, 25));
		pnlResultado.add(jtaResultado,BorderLayout.SOUTH);
		pnlDisplay.add(pnlResultado,BorderLayout.SOUTH);
		
		
		pnlTeclado=new JPanel();
		pnlTeclado.setBackground(Color.BLACK);
		pnlTeclado.setLayout(new GridLayout(4,4));
		
		btnBorrar=new JButton("DEL");
		btnBorrar.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLACK));
		btnBorrar.setFont(new Font("Times New Roman", 2, 25));
		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setBackground(Color.BLACK);
		btnBorrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.a();
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		
		btnBorrarT=new JButton("AC");
		btnBorrarT.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,Color.BLACK));
		btnBorrarT.setFont(new Font("Times New Roman", 2, 25));
		btnBorrarT.setForeground(Color.WHITE);
		btnBorrarT.setBackground(Color.BLACK);
		btnBorrarT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.ac();
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		
		btnA=new JButton("A");
		btnA.setFont(new Font("Times New Roman", 2, 25));
		btnA.setForeground(Color.WHITE);
		btnA.setBackground(Color.BLACK);
		btnA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('A');
				jtaEntrada.setText(datos.convertir());
			}
		});
		
		btnB=new JButton("B");
		btnB.setFont(new Font("Times New Roman", 2, 25));
		btnB.setForeground(Color.WHITE);
		btnB.setBackground(Color.BLACK);
		btnB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('B');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnC=new JButton("C");
		btnC.setFont(new Font("Times New Roman", 2, 25));
		btnC.setForeground(Color.WHITE);
		btnC.setBackground(Color.BLACK);
		btnC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('C');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnD=new JButton("D");
		btnD.setFont(new Font("Times New Roman", 2, 25));
		btnD.setForeground(Color.WHITE);
		btnD.setBackground(Color.BLACK);
		btnD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('D');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnE=new JButton("E");
		btnE.setFont(new Font("Times New Roman", 2, 25));
		btnE.setForeground(Color.WHITE);
		btnE.setBackground(Color.BLACK);
		btnE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('E');
				jtaEntrada.setText(datos.convertir());
			}
		});
		
		btnF=new JButton("F");
		btnF.setFont(new Font("Times New Roman", 2, 25));
		btnF.setForeground(Color.WHITE);
		btnF.setBackground(Color.BLACK);
		btnF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('F');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnMult=new JButton("*");
		btnMult.setFont(new Font("Times New Roman", 2, 25));
		btnMult.setForeground(Color.WHITE);
		btnMult.setBackground(Color.BLACK);
		btnMult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('*');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnDiv=new JButton("/");
		btnDiv.setFont(new Font("Times New Roman", 5, 25));
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setBackground(Color.BLACK);
		btnDiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('/');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		
		btnSum=new JButton("+");
		btnSum.setFont(new Font("Times New Roman", 2, 25));
		btnSum.setForeground(Color.WHITE);
		btnSum.setBackground(Color.BLACK);
		btnSum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('+');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnRes=new JButton("-");
		btnRes.setFont(new Font("Times New Roman", 2, 25));
		btnRes.setForeground(Color.WHITE);
		btnRes.setBackground(Color.BLACK);
		btnRes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('-');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnPon=new JButton("^");
		btnPon.setFont(new Font("Times New Roman", 2, 25));
		btnPon.setForeground(Color.WHITE);
		btnPon.setBackground(Color.BLACK);
		btnPon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('^');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnParIzq=new JButton("(");
		btnParIzq.setFont(new Font("Times New Roman", 2, 25));
		btnParIzq.setForeground(Color.WHITE);
		btnParIzq.setBackground(Color.BLACK);
		btnParIzq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar('(');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
		
		btnParDer=new JButton(")");
		btnParDer.setFont(new Font("Times New Roman", 2, 25));
		btnParDer.setForeground(Color.WHITE);
		btnParDer.setBackground(Color.BLACK);
		btnParDer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				datos.agregar(')');
				jtaEntrada.setText(datos.convertir());
				
			}
		});
			
		btnResul=new JButton("=");
		btnResul.setFont(new Font("Times New Roman", 5, 25));
		btnResul.setForeground(Color.WHITE);
		btnResul.setBackground(Color.BLACK);
		btnResul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (datos.pares()) {
					jtaResultado.setText(datos.resultado());
				}else {
					try {
						throw new Parentesis();
					} catch (Parentesis e1) {
						paren(e1);
					}
				}
				
			}
		});
		
		
		
		
		pnlTeclado.add(btnBorrar);
		pnlTeclado.add(btnBorrarT);
		pnlTeclado.add(btnMult);
		pnlTeclado.add(btnDiv);
		pnlTeclado.add(btnA);
		pnlTeclado.add(btnB);		
		pnlTeclado.add(btnPon);
		pnlTeclado.add(btnRes);
		pnlTeclado.add(btnC);
		pnlTeclado.add(btnD);
		pnlTeclado.add(btnParDer);
		pnlTeclado.add(btnSum);
		pnlTeclado.add(btnE);
		pnlTeclado.add(btnF);
		pnlTeclado.add(btnParIzq);
		pnlTeclado.add(btnResul);
		
		
		super.add(pnlDisplay);
		super.add(pnlTeclado);
		super.setVisible(true);
	}
	
	
	
	public void paren(Parentesis expare){
		JOptionPane.showMessageDialog(this, "Faltan parentesis","Error", JOptionPane.ERROR_MESSAGE);
	}
}
