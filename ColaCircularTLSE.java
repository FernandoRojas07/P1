class ColaCircularTLSE {

	private NodoT h,t;

	public void Insertar(Trabajos dato){
		NodoT q=new NodoT(dato,h);
		if(t==null){
			h=q;
			t=q;
			q.SetSig(h);
		}else{
			t.SetSig(q);
			t=q;
		}
	}

	public void Listar(){
		if(h!=null){
			h.GetInfo().ListarT();
			for(NodoT i=h.GetSig();i!=h;i=i.GetSig())
                i.GetInfo().ListarT();
		}

	}

	public Trabajos Borrar(){
		NodoT aux=h;
		if(h==null)
			System.out.println("No hay datos");
		else{
			if(h==t){
				h=null;
				t=null;
			}else{
				h=h.GetSig();
				t.SetSig(h);
			}
		}
		return aux.GetInfo();
	}
   
   public boolean EstaVacia(){
      NodoT aux = h;
      if(h == null)
         return true;
      else
         return false;     
   }

	
}
