public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

              //crear las instancias de cada vehiculo
              Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

     

              Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);
      
              //Mostrar la info de cada vehiculo
              System.out.println("Información del auto");
              auto.mostrarInformacion();
      
              System.out.println("=================================");
      
              System.out.println("Informacion del Camion");
              camion.mostrarInformacion();

    }
}
