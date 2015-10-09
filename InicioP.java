class InicioP {
   static int p;
   public static void main(String []args)
   {
      int opcion;
      CasaP cas = new CasaP();
      Menu menu=new Menu();
      EstadisticasP e=new EstadisticasP();
      do {
         opcion=menu.ListaMenu("1)Iniciar censo.\n2)Consultar estadisticas.\n3)Salir.\n",3);
         switch(opcion) {
            case 1:System.out.println("Iniciando...");
                   p=Teclado.LeeEntero("Dame el numero total de casas para el censo: ");
                   cas.CasasCap(p);
                  break;
            case 2:e.EstadisticasP(cas);
                  break;
                  }
      } while(opcion!=3);
   }
}
