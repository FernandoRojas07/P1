class CasaP {
   private DireccionP dir=new DireccionP();
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
         dir.CapturaDireccion();
         contperso=contperso+noper; 
      }
   }
   public int getIngreso(int a)
   {
      int hj;
      hj=casas[a].getIng();
      return hj;
   }
   public int getEdadV(int a,int b)
   {
      if(b==1)
         return casas[a].GetEdV();
      else
         return casas[a].GetEdJ();
   }
}
