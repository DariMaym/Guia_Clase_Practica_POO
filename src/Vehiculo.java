public class Vehiculo {
    private String Marca; 
    private String Modelo;
    private int Año;
    private int Kilometraje;

    //creacion del constructor
    public Vehiculo(String Marca, String Modelo, int Año, int Kilometraje){
        this.Marca=Marca;
        this.Modelo=Modelo;
        this.Año=Año;
        this.Kilometraje=Kilometraje;
    }

    //metodos para el envio y recibo de datos
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
    Marca = marca;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public int getKilometraje() {
        return Kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        Kilometraje = kilometraje;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }


    //metodos para mostrar la información de los vehiculos
    public void mostrarInformacion(){
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Año: " + Año);
        System.out.println("Kilometreje: "+ Kilometraje);
    }

    void realizarMantenimiento (){
        System.out.println("               ==MANTENIMIENTO==");
        System.out.println("Recuerde, es importante realizar un mantenimiento a su vehiculo para evitar accidetes");
        System.out.println("Por favor, tenga en cuenta las siguientes partes a revisar de su auto");
        System.out.println(">>>>partes a realizar mantenimiento<<<<");

    }


}
