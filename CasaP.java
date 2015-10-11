class CasaP {
   private PersonaP[] casas;
   int contperso=0,cont,noper;
   private PersonaP obj = new PersonaP();
   
   public void CasasCap(int cas)
   {
      casas= new PersonaP[cas];
      for(cont=0;cont<cas;cont++)
      {  
         noper=Teclado.LeeEntero("¿Cuántas personas hay en el hogar ["+(cont+1)+"]?");
         casas[cont]=new PersonaP();
         casas[cont].PersonaP(noper);
         contperso=contperso+noper; 
      }
   }
   public int getIngreso(int a)
   {
      int hj;
      hj=casas[a].getIng();
      return hj;
   }
   public int GetEstudios(int a)
   {
      int est;
      est=casas[a].GetEst();
      return est;
   }
   public int getEdad(int a, int b)
   {
      int eda;
      if(b==1)
         return casas[a].getEdV(noper);
      else
         return casas[a].getEdJ(noper);
   }
   public int getDireccion(int a){
   int d;
      d=casas[a].GetDir();
      return d;
   }
   public int getFemenino(int a){
   int f;
   f=casas[a].GetFem();
   return f;
   }
   public int GetIdioma(int a) {
      int id;
      id=casas[a].getIdi();
      return id;
   }
}
