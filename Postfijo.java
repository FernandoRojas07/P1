import java.util.*;

public class Postfijo{
   //Atributos
	private String ultimaExpresion;
	//CONSTRUCTORES
	public Postfijo(){
		ultimaExpresion="0";
	}
	public String postfijo(String expresion){ 
		Stack PilaNumeros=new Stack(); 
		Stack PilaOperadores= new Stack(); 
		String expr=quitaEspacios(expresion.toLowerCase());  
		String fragmento; 
		int pos=0, tamano, cont,anterior=0; 
		final String funciones[]={"1 2 3 4 5 6 7 8 9 0 ( ) + - * / ^"};
		final String parentesis="( ln log abs sen sin cos tan sec csc cot sgn asen asin acos atan asec acsc acot senh sinh cosh tanh sech csch coth sqrt round asenh asinh acosh atanh asech acsch acoth";
		while(pos<expr.length()){ 
				tamano=0;
				cont=1;
				while (tamano==0 && cont<=6){ 
					if(pos+cont<=expr.length() && funciones[cont-1].indexOf(expr.substring(pos,pos+cont))!=-1){
						tamano=cont;
					}
					cont++;
				}
				if(tamano==1){ 
					if(isNum(expr.substring(pos,pos+tamano))){ 
						if(anterior==1 || anterior==4){
							sacaOperadores(PilaNumeros, PilaOperadores, "*");
						}
						fragmento=""; 
						do{ 
							fragmento=fragmento+expr.charAt(pos);
							pos++;
						}while(pos<expr.length() && (isNum(expr.substring(pos,pos+tamano))));
							Double.valueOf(fragmento);
						PilaNumeros.push(new String(fragmento));
						anterior=1;
						pos--;
					}else if (expr.charAt(pos)=='+' || expr.charAt(pos)=='*' || expr.charAt(pos)=='/'){ 
						sacaOperadores(PilaNumeros, PilaOperadores, expr.substring(pos,pos+tamano));
						anterior=2;
					}else if (expr.charAt(pos)=='^'){ 
						PilaOperadores.push(new String("^"));
						anterior=2;
					}else if (expr.charAt(pos)=='-'){ 
						if(anterior==0 || anterior==2 || anterior==3){
							PilaNumeros.push(new String("-1"));
							sacaOperadores(PilaNumeros, PilaOperadores, "*");
						}else{
							sacaOperadores(PilaNumeros, PilaOperadores, "-");
						}
						anterior=2;
					}else if (expr.charAt(pos)=='('){
						if (anterior==1 || anterior == 4){ 
							sacaOperadores(PilaNumeros, PilaOperadores, "*");
						}
						PilaOperadores.push(new String("("));
						anterior=3;
					}else if (expr.charAt(pos)==')'){
						while(!PilaOperadores.empty() && parentesis.indexOf(((String)PilaOperadores.peek()))==-1){
							sacaOperador(PilaNumeros, PilaOperadores);
						}
						if(!((String)PilaOperadores.peek()).equals("(")){
							PilaNumeros.push(new String(((String)PilaNumeros.pop()) + " " + ((String)PilaOperadores.pop())));
						}else{
							PilaOperadores.pop();
						}
						anterior=4;
					}
				}else if(tamano>=2){ 
					fragmento=expr.substring(pos,pos+tamano);
					if (anterior==1 || anterior == 4){ 
							sacaOperadores(PilaNumeros, PilaOperadores, "*");
						}
						PilaOperadores.push(fragmento.substring(0,fragmento.length()-1)); 
						anterior=3;
				}
				pos+=tamano;
			}
		   while(!PilaOperadores.empty()){ 
				sacaOperador(PilaNumeros, PilaOperadores);
			}
		ultimaExpresion=((String)PilaNumeros.pop()); 
		return ultimaExpresion; 
	}
	public double f(String expresion, double x){ 
		Stack pilaEvaluar = new Stack(); 
		double a, b; 
		StringTokenizer tokens=new StringTokenizer(expresion); 
		String tokenActual; 
		 while(tokens.hasMoreTokens()){ 
				tokenActual=tokens.nextToken();
				if(tokenActual.equals("+")){
					b=((Double)pilaEvaluar.pop()).doubleValue();
					a=((Double)pilaEvaluar.pop()).doubleValue();
					pilaEvaluar.push(new Double(a+b));
				}else if(tokenActual.equals("-")){
					b=((Double)pilaEvaluar.pop()).doubleValue();
					a=((Double)pilaEvaluar.pop()).doubleValue();
					pilaEvaluar.push(new Double(a-b));
				}else if(tokenActual.equals("*")){
					b=((Double)pilaEvaluar.pop()).doubleValue();
					a=((Double)pilaEvaluar.pop()).doubleValue();
					pilaEvaluar.push(new Double(a*b));
				}else if(tokenActual.equals("/")){
					b=((Double)pilaEvaluar.pop()).doubleValue();
					a=((Double)pilaEvaluar.pop()).doubleValue();
					pilaEvaluar.push(new Double(a/b));
				}else if(tokenActual.equals("^")){
					b=((Double)pilaEvaluar.pop()).doubleValue();
					a=((Double)pilaEvaluar.pop()).doubleValue();
					pilaEvaluar.push(new Double(Math.pow(a,b)));
				}else{
					pilaEvaluar.push(Double.valueOf(tokenActual));
				}
			}
		a=((Double)pilaEvaluar.pop()).doubleValue(); 
		return a;
	}
	public double f(double x) {
				return f(ultimaExpresion,x);
		}
	private void sacaOperador(Stack Numeros, Stack operadores) {
		String operador, a, b;
		final String operadoresBinarios="+ - * / ^"; 
			operador=(String)operadores.pop(); 
			if(operadoresBinarios.indexOf(operador)!=-1){ 
				b=(String)Numeros.pop();
				a=(String)Numeros.pop();
				Numeros.push(new String(a+" "+b+" "+operador));
			}else{ 
				a=(String)Numeros.pop();
				Numeros.push(new String(a+" "+operador));
			}
		}
	private void sacaOperadores(Stack PilaNumeros, Stack PilaOperadores, String operador){
		final String parentesis="( ln log abs sen sin cos tan sec csc cot sgn asen asin acos atan asec acsc acot senh sinh cosh tanh sech csch coth sqrt round asenh asinh acosh atanh asech acsch acoth";
		while(!PilaOperadores.empty() && parentesis.indexOf((String)PilaOperadores.peek())==-1 && ((String)PilaOperadores.peek()).length()==1 && prioridad(((String)PilaOperadores.peek()).charAt(0))>=prioridad(operador.charAt(0))){
			sacaOperador(PilaNumeros, PilaOperadores); 
		}
		PilaOperadores.push(operador);
	}
	private int prioridad(char s) {
		if (s=='+' || s=='-') 
			return 0;
		else if (s=='*' || s=='/') 
			return 1;
		else if (s=='^')
			return 2;
		return -1; 
	}
	private boolean isNum(String s) {
		if (s.compareTo("0")>=0 && s.compareTo("9")<=0) 
			return true;   
		else
			return false;
	} 	
	private String quitaEspacios(String polinomio){
		String unspacedString = "";	
      for(int i = 0; i < polinomio.length(); i++){	
			if(polinomio.charAt(i) != ' ') 
				unspacedString += polinomio.charAt(i);
		}
      return unspacedString;
	}
}
