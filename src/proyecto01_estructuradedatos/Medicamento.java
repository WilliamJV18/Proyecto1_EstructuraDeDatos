
package proyecto01_estructuradedatos;


public class Medicamento {
    
    // Se crean dos atributos la clase medicamento
    String Nombre_Med;
    int Cant_Consumidores;
    
    // Se crea un constructor para los medicamentos
    public Medicamento(String Nombre_Med, int Cant_Consumidores) {
        this.Nombre_Med = Nombre_Med;
        this.Cant_Consumidores = Cant_Consumidores;
    }
    
    // Se crean los get y set correspondientes de cada atributo anterior
    public String getNombre_Med() {
        return Nombre_Med;
    }

    public void setNombre_Med(String Nombre_Med) {
        this.Nombre_Med = Nombre_Med;
    }

    public int getCant_Consumidores() {
        return Cant_Consumidores;
    }

    public void setCant_Consumidores(int Cant_Consumidores) {
        this.Cant_Consumidores = Cant_Consumidores;
    }
    
}
