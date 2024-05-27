public class vehiculoCarga extends vehiculo {
    private int capacidadcarga ;

    //datos
    public vehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadcarga) {
        super(marca, modelo, año, kilometraje) ;
        this.capacidadcarga = capacidadcarga ;
    }
     
    //getter y setter para capacidadcarga
    public int getcapacidadcarga() {
        return capacidadcarga ;
    }

    public void setcapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }

    //sobrescribir el metodo MostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("capacidad de carga: " + capacidadcarga + "kg");
    }


}
