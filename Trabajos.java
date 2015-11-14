class Trabajos{
   //Atributos
	private int id, tamaño;
	private String nombre;
   //Constructor
   public Trabajos(){
      id=Teclado.LeeEntero("Introduce el numero del ID: ");
		nombre=Teclado.LeeCadena("Ingresa el nombre del trabajo: ");
		tamaño=Teclado.LeeEntero("Ingresa el numero de paginas: ");	
   }
   public void ListarT(){
        System.out.println("\n\t-------------------------");
        System.out.println("\t| Trabajo: "+nombre+"\t|");
        System.out.println("\t| ID: "+id+"\t\t|");
        System.out.println("\t| Tamaño: "+tamaño+"\t\t|");
        System.out.println("\t-------------------------\n");
    }
    public boolean regresaNodo(int pag){
        if(tamaño-pag <= 0){
         tamaño = 0;
         return false;
        }else{
         tamaño = tamaño-pag;
         return true;
        }
    }
}
