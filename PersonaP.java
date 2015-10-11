class PersonaP 
{
   private int[] edad, estudios;
   PersonaP obj1;
   private int personas=0,generomas=0,generofem=0,ocupacion=0,idioma=0,estudiantes=0,trabajadores=0,per, delegacion;
   private int ingresos;
   
   public void PersonaP(int per) 
   {
      personas=per;
      edad = new int[per];
      estudios = new int[per];
      capturaPerson();
   }
   public void capturaPerson()
   {
      personas=personas+per;
      //LeeEdad();
      //OrdenaEdades();
      //CapturaIngresos();
      LeeGenero();
      //LeeEstudios();
      //LeeOcupacion();
      LeeIdioma();
      //LeeDelegacion();
      
   }
   public void LeeDelegacion(){
delegacion=Teclado.LeeEntero("En que delegacion viven: \n1.-Coyoacan\n2.-Gustavo A. Madero\n3.-Iztapalapa\n4.-Álvaro Obregón\n5.-Tlalpan\n6.-Otra\n");
}

   public void LeeEdad()
   {
      for(int i=0;i<personas;i++)
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
      for(int i=0;i<personas;i++)
      {
         idioma=Teclado.LeeEntero("El integrante "+(i+1)+" además del Español, ¿habla algun otro idioma?\n1.-Si\n2.-No\n ");
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
   public int getEdV(int a)
   {
      return edad[personas-1];
   }
   public int getEdJ(int a)
   {
      return edad[0];
   }
   public int GetEst(){
   return estudios[0];
   }
   public int GetDir(){
   return delegacion;
   }
   public int GetMas(){
   return generomas;
   }
   public int GetFem(){
   return generofem;
   }
   public int getIdi(){
   return idioma;
   }
   
}
