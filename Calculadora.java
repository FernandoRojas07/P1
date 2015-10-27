import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

public class Calculadora extends JFrame implements  ActionListener,WindowListener {
   Container cp;
   JTextField infija;
   JTextField postfija;
   JLabel respuesta;
   JButton evaluar;
   JLabel EInfija;
   JLabel EPostfija;
   JLabel respt;
   double valor=0;
   Parseador NPolaca=new Parseador(); //Constructor del parseador
	String ecuacion=new String(); //Expresión a parsear
   //Label info = new Label("Información en extremo importante           ", Label.CENTER);
	

public Calculadora(String titulo) {
super(titulo);
setLocation(100,100);
cp=getContentPane();
cp.setLayout(new GridLayout(5,2));
evaluar=new JButton("Evaluar ecuación");
infija=new JTextField();
postfija=new JTextField();
respuesta=new JLabel("         ");
EInfija=new JLabel("Ecuacion infija");
EPostfija=new JLabel("Ecuacion postfija");
respt=new JLabel("Resultado");
cp.add(EInfija);
cp.add(infija);
cp.add(EPostfija);
cp.add(postfija);
cp.add(evaluar);
cp.add(respuesta);
cp.add(respt);


evaluar.addActionListener(this);
this.addWindowListener(this);
run(490,200);
}
public void windowClosing(WindowEvent event) {
System.exit(0);
}
public void windowActivated(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowOpened(WindowEvent e) {}

public void run(int ancho, int largo) {
this.setSize(ancho,largo);
this.setVisible(true);
this.setResizable(false);
}

public void actionPerformed(ActionEvent e){
		if (e.getSource()==evaluar){ //Si se apretó el botón
			   ecuacion=infija.getText(); //Se lee la expresión
				postfija.setText(NPolaca.parsear(ecuacion)); //Se parsea la expresión
				respt.setText(""+redondeo(NPolaca.f(valor),5)); //Se evalúa el valor y se redondea
				}
		}//if del botón
		
	
   private double redondeo(double numero, int decimales){
		return ((double)Math.round(numero*Math.pow(10,decimales)))/Math.pow(10,decimales);
	}
public static void main(String[] args) {
new Calculadora("C A L C U L A D O R A");
}
}
