class Main{
	public static void main(String []args)
   {
        int pro=0,pag=0,buffer=3;
        ColaTLSE cs= new ColaTLSE();
        ColaCircularTLSE cc = new ColaCircularTLSE();
        System.out.println("\nBienvenido a este progrma\n");
        pro=Teclado.LeeEntero("\nNúmero de Trabajos: ");
        pag=Teclado.LeeEntero("\nNúmero de hojas a imprimir por turno: ");
        System.out.println("Procesos iniciales creados:");
        for(int i=0;i<pro;i++)
        {
            Trabajos inicial = new Trabajos();
            inicial.ListarT();
            cs.Insertar(inicial);
        }
        System.out.println("\nSe han creador los procesos! \nIniciarán los procesos...\n");
        for(int i=0;i<buffer;i++)
        {
            cc.Insertar(cs.Borrar());
        }
        while(!cc.ValidaVacio() || cs.GetH()==null)
        {
            System.out.println("Se saca proceso: ");
            Trabajos aux = cc.Borrar();
            System.out.println(">>>>>>>>>>>");
            aux.ListarT();
            System.out.println(">>>>>>>>>>>");
            //cc.listar();
            if(aux.regresaNodo(pag))
               cs.Insertar(aux);
            else{
               System.out.println("Proceso terminado: ");
               aux.ListarT();
            }
            System.out.println("Inicia Listar");
            cc.Listar();
            System.out.println("Termina Listar");
            cc.Insertar(cs.Borrar());  
        }
	}
}
