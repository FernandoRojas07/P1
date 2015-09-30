class DireccionP{
	private String delegacion,colonia;
   public void CapturaDireccion()
   {
      LeeDelegacion();
      LeeColonia();
   }
   public void LeeDelegacion()
   {
      delegacion=Teclado.LeeCadena("Delegacion: ");
   }
   public void LeeColonia()
   {
      colonia=Teclado.LeeCadena("Colonia: ");
   }
   public void Listar()
   {
      System.out.println(delegacion+"\t"+colonia);
   }
}
