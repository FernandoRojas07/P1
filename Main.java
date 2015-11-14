class Main{

	public static void main(String []args){
        
        ColaCircularTLSE cc = new ColaCircularTLSE();
        System.out.println("\nBienvenido a este progrma\n");
        int pro=Teclado.LeeEntero("\nNúmero de Trabajos: ");
        int pag=Teclado.LeeEntero("\nNúmero de hojas a imprimir por turno: ");
        
        System.out.println("Procesos iniciales creados:");
        for(int i=0;i<pro;i++){
            Trabajos inicial = new Trabajos();
            inicial.ListarT();
            cc.Insertar(inicial);
        }
        
        System.out.println("\nSe han creador los procesos! Iniciaran los procesos...\n");
            
        while(!cc.EstaVacia()){
        System.out.println("Se saca proceso: ");
         Trabajos aux = cc.Borrar();
         System.out.println(">>>>>>>>>>>");
         aux.ListarT();
         System.out.println(">>>>>>>>>>>");
         //cc.listar();
         if(aux.regresaNodo(pag)){
            cc.Insertar(aux);
         }else{
            System.out.println("Proceso terminado: ");
            aux.ListarT();
         }
         System.out.println("Inicia Listar");
         cc.Listar();
         System.out.println("Termina Listar");
         
        }
    
	}

}
