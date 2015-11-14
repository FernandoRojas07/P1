class ColaTLSE {
//Atributos
private NodoT H, T;
//Métodos
public void Insertar(Trabajos dato){
NodoT q=new NodoT(dato,null);
if(T==null)
H=q;
else
T.SetSig(q);
T=q;
}
public NodoT Borrar(){
NodoT aux=H;
if(H==null)
System.out.println("Error: no hay datos...");
else if(H==T)
H=T=null;
else
H=H.GetSig();
return aux;
}
}
