package explicacoes;
import java.awt.event.*;  
import javax.swing.*;   
public class ExemploJavaSwing {
 
	public static void main(String[] args) {  
	    JFrame f=new JFrame("Sistema Proa");  
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	    JButton b=new JButton("Clique Aqui");  
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            tf.setText("Bem-Vindo ao Java Swing");  
	        }  
	    });  
	    f.add(b);f.add(tf);  
	    f.setSize(300,200);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}  
	}  

