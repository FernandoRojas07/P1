class Inicio
{
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
            case 1:
               break;
            case 2:
               break;
         }
      }
      while(opc>7);
   }
}
