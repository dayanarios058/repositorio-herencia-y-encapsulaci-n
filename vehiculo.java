public class vehiculo {
    public String marca ;
   public String modelo ;
   public int año ;
   public int kilometraje ;
   

    //constructor
    public vehiculo(String marca, String modelo, int año, int kilometraje){
        this.marca = "marca";
        this.modelo = "modelo";
        this.año = "año";
        this.kilometraje = "kilometraje" ;
        
    } 
    // Getters y Setters
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca ;
    }

    public String getmodelo(){
        return modelo ;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo ;
    }

    public int getaño(){
        return año ;
    }
    public void setaño(int año){
        this.año = año ;
    }

    public int getkilometraje(){
        return kilometraje ;
    }
    public void setkilometraje(int kilometraje){
        this.kilometraje = kilometraje ;
    }

    //metodo para mostrar la informacion de la persona
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("año: " + año);
        System.out.println("kilometraje: " + kilometraje);
    }   

}
