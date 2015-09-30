class CasaP
{
   int indice, personas;
   PersonaP []casas= new PersonaP[100];
   public void CasasCap()
   {
      for(indice=0;indice<casas.length;indice++)
      {
         casas[indice].CapturaPersona();
      }
   }
}
