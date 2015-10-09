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
            opcion=Teclado.LeeEntero("1)Ingresos promedio por familia.\n2)Promedio de nivel de estudios.\n3)Porcentaje de personas que hablan más de un idioma.\n4)Promedio de persona más vieja por familia.\n5)Promedio de persona más joven por familia.\n6)Porcentaje de personas que trabajan.\n7)Porcentaje de personas que estudian.\n8)Promedio de edad.\n9)Promedio de personas por delegación.\n10)Porcentaje de hombres.\n11)Porcentaje de mujeres.\n12)Porcentaje de personas que tienen casa propia.\n14)Porcentaje de personas que rentar su vivienda.\n15)Salir.\n");
            if (opcion>15 || opcion<1)
                System.out.println("Error, opncion no valida");
            switch(opcion)
            {
               case 1: System.out.println(PromIngresos());
                  break;
               case 2: //System.out.println(PromNivelEst());
                  break;
               case 3: //System.out.println(PorcenIdioma());
                  break;
               case 4: //System.out.println(PerVieja());
                  break;
               case 5: //System.out.println(PerJoven());
                  break;
               case 6: //System.out.println(PorcEstudia());
                  break;
               case 7: //System.out.println(PorcTrabaja());
                  break;
               case 8: //System.out.println(PromEdad());
                  break;
               case 9: //System.out.println(PerColonia());
                  break;
               case 10: //System.out.println(PerDelegacion());
                  break;
               case 11: //System.out.println(PorcMujer());
                  break;
               case 12: //System.out.println(PorcHombre());
                  break;
               case 13: //System.out.println(PorcPropia());
                  break;
               case 14: //System.out.println(PorcRenta());
                  break;
            }
        }while(opcion>15 || opcion<1);
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
    /*
    public void PromNivelEst()
    {
    }
    public void PorcenIdioma()
    {
    }
    public float PerVieja()
    {
      int i,prom=0,cont=0;
      for(i=0;i<person.indice;i++)
      {
         prom=prom+(per.edad[per.edad.length-1]);
      }
      return(prom=prom/i);
    }
    public float PerVieja()
    {
      int i,prom=0,cont=0;
      for(i=0;i<=inc.p;i++)
      {
         prom=prom+(person.casas[i].edad[per.edad.length-1]);
      }
      prom=prom/i-1;
      return prom;
    }
    public float PerJoven()
    {
      int i,prom=0,cont=0;
      for(i=0;i<inc.p;i++)
      {
         prom=prom+(per.edad[0]);
      }
      return(prom=prom/i);
    }
    public void PorcEstudia()
    {
    }
    public void PorcTrabaja()
    {
    }
    public void PromEdad()
    {
    }
    public void PerColonia()
    {
    }
    public void PerDelegacion()
    {
    }
    public void PorcMujer()
    {
    }
    public void PorcHombre()
    {
    }
    public void PorcPropia()
    {
    }
    public void PorcRenta()
    {
    }*/
}
