public class Camion extends vehiculoCarga {
    private int numEjes ;


    //constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadcarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadcarga);
        this.numEjes = numEjes ;
    }
   
   //sobrescribir el metodo MostrarInfo()
   @Override
   public void mostrarInfo() {
       super.mostrarInfo();
       System.out.println("Numero de ejes: " + numEjes);
    }  
    
    public double costodemantenimiento(double costoporKM, double KM){
        double costototal = costoporKM * KM ;
        return costototal ;

    }
}