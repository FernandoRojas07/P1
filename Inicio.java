class Inicio
{
   static CasaP cas = new CasaP();
   static Estadisticas estadis = new Estadisticas();
   public static int listaMenu()
   {
      int op;
      do 
      {
         op =Teclado.LeeEntero("1)Iniciar censo.\n2)Consultar estadisticas.\n3)Salir.\n");
         if (op>3 || op<1)
            System.out.println("Error, opción no valida.");
      }
      while(op>7);
      return op; 
   }
   public static void main(String []args)
   {
      int opc;
      do 
      {
         opc = listaMenu();
         switch(opc)
         {
            case 1: cas.CasasCap();
               break;
            case 2: estadis.listaMenu();
               break;
         }
      }
      while(opc>7);
   }
}
/*public static void main(String []args)   {
      int opcion,indice;
      Menu menu=new Menu();
      Estadisticas e;
      do {
         opcion=menu.Menu("1)Iniciar censo.\ln2)Consultar estadisticas.\ln3)Salir.\ln",3);
         switch(opcion) {
            case 1:System.out.println("Iniciando...");
                   indice=Teclado.Lee("Dame el numero total de casas para el censo: ");
                   per=new PersonaP[indice];
                  break;
            case 2:e.CalculaEstadisticas()
                  break;
                  }
      } while(opcion!=3);
}*/

