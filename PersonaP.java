class PersonaP 
{
   PersonaP obj1;
   private int[] edad, estudios;
   private int personas=0,generomas=0,generofem=0,ocupacion=0,idiom=0,idioma,estudiantes=0,trabajadores=0,per;
   private int ingresos, casaPropia,casaRenta;
   
   public void PersonaP(int per) 
   {
      personas=per;
      edad = new int[per];
      estudios = new int[per];
      capturaPerson();
   }
   public void capturaPerson()
   {
      LeeEdad();
      OrdenaEdades(edad,personas);
      CapturaIngresos();
      LeeGenero();
      LeeEstudios();
      LeeOcupacion();
      LeeIdioma();
      LeeInmueble();
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
      for(int i=0;i<per;i++)
      {
         idioma=Teclado.LeeEntero("El integrante "+(i+1)+" además del Español, ¿habla algun otro idioma?\n1.-Si\n2.-No\n ");
         if(idioma==1)
         {
            idiom=idiom+1;
            x=Teclado.LeeEntero("¿Cuantos?: ");
         }
      }
   }
   public void LeeInmueble()
   {
      int inmueble;
      do
        {
           inmueble=Teclado.LeeEntero("El inmueble donde habitan es:\n1)Propio.\n2)Rentado. ");
           if (inmueble>2 || inmueble<1)
                System.out.println("Error, opncion no valida");
            switch(inmueble)
            {
               case 1: casaPropia=1;
               break;
               case 2: casaRenta=1;
               break;
            }
        }while(inmueble>2 || inmueble<1);
   }
   public void OrdenaEdades(int []v, int indice)
   {
      int aux,i,j;
      for(i=1;i<indice;i++)
      {
         aux =v[i];
         for(j=i;j>0;j--)
         {
            if(v[j-1]>aux)
               v[j]=v[j-1];
         }
         v[j] = aux;
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
   public int getEdT(int a)
   {
      return edad[a];
   }
   public int getEst(int a)
   {
      return estudios[a];
   }
   public int getIdd()
   {
      return idiom;
   }
   public int getPerEstudia()
   {
      return estudiantes;
   }
   public int getPerTrabaja()
   {
      return trabajadores;
   }
   public int getMujer()
   {
      return generofem;
   }
   public int getHombre()
   {
      return generomas;
   }
   public int getInmueble(int a)
   {
      if(a==1)
         return casaPropia;
      else
         return casaRenta;
   }
}
