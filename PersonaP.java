class PersonaP 
{
   private int[] edad, estudios;
   PersonaP obj1;
   private int personas=0,generomas=0,generofem=0,ocupacion=0,idioma=0,estudiantes=0,trabajadores=0,per;
   private int ingresos;
   
   public void PersonaP(int per) 
   {
      edad = new int[per];
      estudios = new int[per];
      capturaPerson();
   }
   public void capturaPerson()
   {
      personas=personas+per;
      //LeeEdad(per);
      //OrdenaEdades();
      CapturaIngresos();
      /*LeeGenero();
      LeeEstudios();
      LeeOcupacion();
      LeeIdioma();
      */
   }
   public void LeeEdad(int per)
   {
      for(int i=0;i<per;i++)
      {
         edad[i]=Teclado.LeeEntero("Dame la edad del intrante "+(i+1)+": ");
      }
   }
   public void LeeGenero()
   {
      int masc,fem;
      masc=Teclado.LeeEntero("¿Cuántos de los habitantes de su hogar son hombres? ");
      generomas=generomas+masc;
      fem=Teclado.LeeEntero("¿Cuántos de los habitantes de su hogar son mujeres? ");
      generofem=generofem+fem;
   }
   public void LeeEstudios()
   {
      for(int i=0;i<personas;i++)
      {
         estudios[i]=Teclado.LeeEntero("Nivel maximo de estudios del integrante "+(i+1)+":\n1.-Primaria\n2.-Secundaria\n3.-Preparatoria\n4.-Licenciatura\n5.-Otro\n ");
      }
   }
   public void LeeOcupacion()
   {
      int est,trab;
      est=Teclado.LeeEntero("¿Cuántos de los habitantes de su hogar estudian? ");
      estudiantes=estudiantes+est;
      trab=Teclado.LeeEntero("¿Cuántos de los habitantes de su hogar trabajan? ");
      trabajadores=trabajadores+trab;
   }
   public void LeeIdioma()
   {
      int x;
      for(int i=1;i<per;i++)
      {
         Teclado.LeeEntero("El integrante "+(i+1)+" además del Español, ¿habla algun otro idioma?\n1.-Si\n2.-No\n ");
         if(idioma==1)
         {
            idioma=idioma+1;
            x=Teclado.LeeEntero("¿Cuantos?: ");
         }
      }
   }
   public void OrdenaEdades()
   {
      int aux,i,j;
      for(i=1;i<per;i++)
      {
         aux =edad[i];
         for(j=i;j>0;j--)
         {
            if(edad[j-1]>aux)
               edad[j]=edad[j-1];
         }
         edad[j] = aux;
      }
   }
   public void CapturaIngresos()
   {
      ingresos=Teclado.LeeEntero("¿Cuál es el ingreso mensual de tu hogar?");
   }
   public int getIng()
   {
      return ingresos;
   }
}
