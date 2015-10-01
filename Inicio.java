class InicioP {
 
   public static void main(String []args)   {
      int opcion,indice;
      CasaP casa = new CasaP();
      Menu menu=new Menu();
      EstadisticasP e=new EstadisticasP();
      do {
         opcion=menu.Menu("1)Iniciar censo.\n2)Consultar estadisticas.\n3)Salir.\n",3);
         switch(opcion) {
            case 1:System.out.println("Iniciando...");
                   //indice=Teclado.LeeEntero("Dame el numero total de casas para el censo: ");
                   casa.CasasCap();
                  break;
            case 2:e.CalculaEstadisticas();
                  break;
                  }
      } while(opcion!=3);
}
}
