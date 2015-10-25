import java.applet.*;
import java.awt.*;

public class PruebaParseador extends java.applet.Applet {
	Parseador miparser=new Parseador(); //Constructor del parseador
	String expresion=new String(); //Expresión a parsear
	double valor=0; //Valor en el que se va a evaluar
	TextField inputexpresion = new TextField("x + 5"); //Textfield donde se digita la expresión a parsear
	//TextField inputvalor = new TextField("0",5); //Textfield donde se digita el valor a evaluar en la expresión
	Button boton= new Button("Evaluar la expresión"); //Botón para evaluar
	TextField outputparseo = new TextField("          "); //Resultado de parsear la expresión
	TextField outputevaluar = new TextField("         "); //Resultado de la evaluación en la expresión
	Label info = new Label("Información en extremo importante           ", Label.CENTER); //Label donde se dan los errores

	public void init(){ //Todo se pone en el applet
		add(inputexpresion);
		//add(inputvalor);
		add(boton);
		add(outputparseo);
		add(outputevaluar);
		add(info);
	}//init

	public boolean action(Event evt, Object arg){
		if (evt.target instanceof Button){ //Si se apretó el botón
			try{
				info.setText(""); //Se pone el Label de los errores vacío
				expresion=inputexpresion.getText(); //Se lee la expresión
				//valor=Double.valueOf(inputvalor.getText()).doubleValue(); //Se lee el valor a evaluar
				outputparseo.setText(miparser.parsear(expresion)); //Se parsea la expresión
				outputevaluar.setText(""+redondeo(miparser.f(valor),5)); //Se evalúa el valor y se redondea
			}catch(Exception e){ //Si hubo error lo pone en el Label correspondiente
				info.setText(e.toString());
			}
		}//if del botón
		return true;
	}//action

	/*
	 *Se redondea un número con los decimales dados
	 */
	private double redondeo(double numero, int decimales){
		return ((double)Math.round(numero*Math.pow(10,decimales)))/Math.pow(10,decimales);
	}

}//PolCero
