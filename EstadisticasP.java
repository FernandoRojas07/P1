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
   public int getEdad(int a, int b)
   {
      int eda=0;
      if(b==1)
         return casas[a].getEdV(noper);
      if(b==2)
         return casas[a].getEdJ(noper);
      else
      {
         for(int i=0;i<noper;i++)
            eda=eda+casas[a].getEdT(i);
         return eda;
      }
   }
   public int PersonasTotal()
   {
      return contperso;
   }
   public int getEstudios(int a)
   {
      int estu=0;
      for(int i=0;i<noper;i++)
      {
         estu = estu + casas[a].getEst(i);
      }
      return estu;
   }
   public int getIdioma(int a)
   {
      int idioma=0;
      for(int i=0;i<noper;i++)
      {
         idioma = idioma + casas[a].getIdd();
      }
      return idioma;
   }
   public int getEst(int a,int b)
   {
      int eda;
      if(b==1)
         return casas[a].getPerEstudia();
      else
         return casas[a].getPerTrabaja();
   }
   public int getGenero(int a,int b)
   {
      if(b==1)
         return casas[a].getMujer();
      else
         return casas[a].getHombre();
   }
   public int getPropiedad(int a)
   {
      return casas[a].getInmueble(1);
   }
   public int getRenta(int a)
   {
      return casas[a].getInmueble(2);
   }
}
