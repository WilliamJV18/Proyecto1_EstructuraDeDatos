
package proyecto01_estructuradedatos;


public class Paciente {
    
    // Se crean dos atributos para la clase paciente
    String Nombre_Pac;
    String Medicamento_Pac;
    
    // Se crea un constructor para pacientes

    public Paciente(String Nombre_Pac, String Medicamento_Pac) {
        this.Nombre_Pac = Nombre_Pac;
        this.Medicamento_Pac = Medicamento_Pac;
    }
    
    // Se crean los get y set correspondientes de cada atributo anterior
    public String getNombre_Pac() {
        return Nombre_Pac;
    }

    public void setNombre_Pac(String Nombre_Pac) {
        this.Nombre_Pac = Nombre_Pac;
    }
    
    public String getMedicamento_Pac() {
        return Medicamento_Pac;
    }

    public void setMedicamento_Pac(String Medicamento_Pac) {
        this.Medicamento_Pac = Medicamento_Pac;
    }
    
    // Se crean la función noMedicamentos para listar los pacientes sin medicamentos
    public void noMedicamentos() {
        if (this.getMedicamento_Pac()==" "){
            System.out.println("Nombre: "+this.getNombre_Pac()+", No cuenta con medicamentos");
        }else{
            System.out.println("Todos los demás pacientes tienen medicamentos");
        }
    }
    
}
