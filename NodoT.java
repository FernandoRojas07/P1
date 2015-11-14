class NodoT {
//Atributos
private Trabajos info;
private NodoT sig;
//Constructores
public NodoT (Trabajos dato, NodoT sig){
info=dato;
this.sig=sig;
}
//Metodos
public void SetInfo(Trabajos dato){
info=dato;
}
public void SetSig(NodoT sig){
this.sig=sig;
}
public Trabajos GetInfo(){
return info;
}
public NodoT GetSig(){
return sig;
}
}
