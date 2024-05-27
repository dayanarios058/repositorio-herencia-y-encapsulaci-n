public class vehiculoPasajero extends vehiculo {
    private int numPasajeros ;

    //datos
    public vehiculoPasajero(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros ;
    }

    //getter y setter para numPasajeros
    public int getnumPasajeros() {
        return numPasajeros ;
    }

    public void setnumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros ;
    }

    // sobrescribir el metodo MostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: " + numPasajeros);
    }

}
