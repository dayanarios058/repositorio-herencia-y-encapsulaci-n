public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //crear instancia tipo de vehiculo
        Auto auto = new Auto("toyota", "corolla", 2020, 15000, 5, "gasolina");

        Camion camion = new Camion("volvo", "fh", 2019, 75000, 20000, 4);
        
        //Mostrar la informacion de cada vehiculo
        System.out.println("Infirmacion del auto");
    auto.mostrarInfo() ;
    System.out.println("Informacion del camion ");
    camion.mostrarInfo() ;

    }
}
