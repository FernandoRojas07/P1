class EstadisticasP
{
   CasaP person;
   public void EstadisticasP(CasaP arr)
   {
      person = arr;
      CalculaEstadisticas();
   }
   public int CalculaEstadisticas()
   {
      int opcion;
      do
        {
            opcion=Teclado.LeeEntero("1)Ingresos promedio por familia.\n2)Promedio de nivel de estudios.\n3)Porcentaje de personas que hablan más de un idioma.\n4)Promedio de persona más vieja por familia.\n5)Promedio de persona más joven por familia.\n6)Porcentaje de personas que trabajan.\n7)Porcentaje de personas que estudian.\n8)Promedio de edad.\n9)Porcentaje de hombres.\n10)Porcentaje de mujeres.\n11)Porcentaje de personas que tienen casa propia.\n12)Porcentaje de personas que rentar su vivienda.\n13)Salir.\n");
            if (opcion>13 || opcion<1)
                System.out.println("Error, opncion no valida");
            switch(opcion)
            {
               case 1: System.out.println("El promedio de ingresos es: "+PromIngresos());
                  break;
               case 2: PromNivelEst();
                  break;
               case 3: System.out.println("El porcentaje de personas que hablan más de un idioma es: "+PorcenIdioma()+"%.");
                  break;
               case 4: System.out.println("El promedio de edad más vieja en cada hogar es: "+PerVieja());
                  break;
               case 5: System.out.println("El promedio de edad más joven en cada hogar es: "+PerJoven());
                  break;
               case 6: System.out.println("El porcentaje de personas que trabajan es: "+PorcTrabaja()+"%.");
                  break;
               case 7: System.out.println("El porcentaje de personas que estudian es: "+PorcEstudia()+"%.");
                  break;
               case 8: System.out.println("El promedio de edad es: "+PromEdad());
                  break;
               case 9: System.out.println("El procentaje de hombres es: "+PorcHombre()+"%.");
                  break;
               case 10:System.out.println("El procentaje de mujeres es: "+PorcMujer()+"%.");
                  break;
               case 11: System.out.println("El promedio de Inmuebles propios es: "+PorcPropia()+"%.");
                  break;
               case 12: System.out.println("El promedio de Inmuebles rentados es: "+PorcRenta()+"%.");
                  break;
            }
        }while(opcion>13 || opcion<1);
        return opcion;
    }
    public int PromIngresos()
    {
      int i;
      int prom=0;
      for(i=0;i<(person.cont);i++)
      {
         prom=prom+person.getIngreso(i);
      }
      return prom/i;
    }
    public void PromNivelEst()
    {
      int i;
      int prom=0;
      for(i=0;i<(person.cont);i++)
      {
         prom=prom+person.getEstudios(i);
      }
      prom=prom/(person.contperso);
      PromNivelEst(prom);
    }
    public void PromNivelEst(int pr)
    {
        int op=pr;
        switch (op) 
        {
            case 1: System.out.println("El nivel promedio de estudios es: Primaria.");
                  break;
            case 2: System.out.println("El nivel promedio de estudios es: Secundaria.");
                  break;
            case 3: System.out.println("El nivel promedio de estudios es: Preparatoria.");
                  break;
            case 4: System.out.println("El nivel promedio de estudios es: Licenciatura.");
                  break;
            case 5: System.out.println("El nivel promedio de estudios es: Nivel superior a Licenciatura.");
                  break;
        }
    }
    public int PorcenIdioma()
    {
      int i;
      int prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+person.getIdioma(i);
      }
      prom=prom/person.contperso;
      return (prom*100);

    }
    public float PerVieja()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getEdad(i,1));
      }
      return(prom/i);
    }
    public float PerJoven()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getEdad(i,2));
      }
      return(prom/i);
    }
    public int PromEdad()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getEdad(i,3));
      }
      return(prom/person.contperso);
    }
    public int PorcEstudia()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getEst(i,1));
      }
      return(prom/(person.contperso))*100;
    }
    public int PorcTrabaja()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getEst(i,2));
      }
      return(prom/(person.contperso))*100;
    }
    public int PorcMujer()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getGenero(i,1));
      }
      return(prom/(person.contperso))*100;
    }
    public int PorcHombre()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getGenero(i,2));
      }
      return(prom/(person.contperso))*100;
    }
    public int PorcPropia()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getPropiedad(i));
      }
      return(prom/i)*100;
    }
    public int PorcRenta()
    {
      int i,prom=0;
      for(i=0;i<person.cont;i++)
      {
         prom=prom+(person.getRenta(i));
      }
      return(prom/i)*100;
    }
}
