class DireccionP{
	private String delegacion;
   public void CapturaDireccion()
   {
      LeeDelegacion();
      }
   public void LeeDelegacion()
   {
      delegacion=Teclado.LeeCadena("Delegacion: ");
   }
   
   public void Listar()
   {
      System.out.println(delegacion);
   }
}
