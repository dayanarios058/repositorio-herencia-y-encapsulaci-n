public class Auto extends vehiculoPasajero {
   private String Tipocombustible;

   //constructor
   public  Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String Tipoconbustible) {
      super(marca, modelo, año, kilometraje, Tipoconbustible);
      this.Tipocombustible = Tipocombustible ;
   } 
   //getter y setter para tipocombustible
   public String gettipocombustible() {
      return Tipocombustible ;
   }
   public void settipocombustible(int tipocombustible) {
      this.Tipocombustible = Tipocombustible ;
   }
  
  //sobrescribir el metodo MostrarInfo()
  @Override
   public void mostrarInfo() {
      super.mostrarInfo();
      System.out.println("tipo de conbustible: " +Tipocombustible);
   }

   public double costodemantenimiento(double costoporKM, double KM){
      double costototal = costoporKM * KM;
      return costototal ;
   }


}
