class ColaTLSE
{
   //Atributos
   private NodoT H, T;
   //Métodos
   public void Insertar(Trabajos dato)
   {
      NodoT q=new NodoT(dato,null);
      if(T==null)
         H=q;
      else
         T.SetSig(q);
      T=q;
   }
   public Trabajos Borrar()
   {
      NodoT aux=H;
      if(H==null)
         System.out.println("Error: no hay datos...");
      else if(H==T)
         H=T=null;
      else
         H=H.GetSig();
      return aux.GetInfo();
   }
   public void Listar()
   {
      NodoT aux;
      for(aux=H;aux!=null;aux=aux.GetSig())
         System.out.println(aux.GetInfo());
   }
   public NodoT GetH()
   {
      return H;
   }
}
