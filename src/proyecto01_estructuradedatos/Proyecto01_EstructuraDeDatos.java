
package proyecto01_estructuradedatos;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Proyecto01_EstructuraDeDatos {

    
    public static void main(String[] args) {
        
        // Se crea la variable salida, para mantener el menú en funcionamiento
        boolean salida = false;
        // Se crean las siguientes variables para el almacenamiento de nuevos 
        // pacientes y medicamentos
        String nomPaciente = ""; 
        String nomMedicamento = "";
        int cantPacientes = 0;
        Scanner sc = new Scanner(System.in); // Se crean el objeto scanner
        // Se crean las listas para los pacientes y los medicamentos
        LinkedList<Paciente> Lista_Pacientes = new LinkedList();
        LinkedList<Medicamento> Lista_Medicamentos = new LinkedList();
        // Se crean dos pacientes y dos medicamentos como default del programa
        Lista_Pacientes.add(new Paciente("Ana", "Fortasec"));
        Lista_Pacientes.add(new Paciente("Juan", "Clamexil"));
        Lista_Medicamentos.add(new Medicamento("Fortasec", 1));
        Lista_Medicamentos.add(new Medicamento("Clamexil", 1));
        
        try{ 
            do {
                // Se imprimen en consola las distintas opciones del programa
                System.out.println(" ");
                System.out.println("           **Elija una de las opciones**");
                System.out.println("-------------------------------------------------");
                System.out.println("1- Ingresar medicina a la lista de medicamentos");
                System.out.println("2- Eliminar medicamento de la lista");
                System.out.println("3- Modificar medicina de la lista de medicamentos");
                System.out.println("4- Ingresar paciente a la lista de pacientes");
                System.out.println("5- Eiminar paciente de la lista de pacientes");
                System.out.println("6- Modificar paciente de la lista de pacientes");
                System.out.println("7- Agregar paciente nuevo y sus medicamentos");
                System.out.println("8- Imprimir pacientes que no tengan medicamentos");
                System.out.println("9- Imprimir todos los pacientes");
                System.out.println("10- Imprimir todos los medicamentos asignados");
                System.out.println("11- Salir del programa");
                System.out.println("-------------------------------------------------");
                System.out.println(" ");
             
               // Se le pide al usuario que indique una de las opciones anteriores
                System.out.println("Ingrese la opción que requiere: ");
                int opcion = sc.nextInt(); // Se lee el valor ingresado
                System.out.println(" ");
                // Se crea un switch para realizar la función correspondiente
                switch (opcion) {
                case 1:
                    // Se le piden los datos al usuario para ingresar un nuevo medicamento
                    System.out.println("Digite el nombre del medicamento");
                    String nuevoMed = sc.next();
                    Lista_Medicamentos.add(new Medicamento(nuevoMed, 1));
                    break;
                case 2:
                    // Se le pide al usuario digitar el número de medicamento por borrar
                    System.out.println("Digite el numero del medicamento que desea eliminar: ");
                    int elimMed = sc.nextInt();
                    // Se crea una variable para guardar la cantidad de medicamentos borrados
                    int eliminados=0;
                    // Bucle para recorrer la lista
                    for (Medicamento m : Lista_Medicamentos) {
                        // Se borran solo los que no tengan consumidores
                        if (m.getCant_Consumidores()==0) {
                            Lista_Medicamentos.remove(elimMed);
                            eliminados ++;
                        }else{
                            // Mensaje en caso de que no se cumpla lo anteriormente mencionado
                            System.out.println("El resto de medicamentos aun tienen consumidores. No pueden ser eliminados");
                        }
                        // Variable que muestra la cantidad de datos borrados
                        System.out.println("Cantidad de medicamentos eliminados: "+eliminados);
                    }
                    break;
                case 3:
                    // Se crea esta función para modificar los datos de un medicamento
                    System.out.println("Digite el numero del medicamento que desea modificar: ");
                    // Se utiliza este indice para indicar donde colocar los datos nuevos
                    int modMedicamento = sc.nextInt(); 
                    System.out.println("Digite el nuevo nombre del medicamento: ");
                    String nuevoNomMed = sc.next();
                    System.out.println("Digite la nueva cantidad del medicamento: ");
                    int nuevaCantMed = sc.nextInt();
                    // Se eliminan los datos anteriores para después ser remplazados
                    Lista_Medicamentos.remove(modMedicamento);
                    // Se modifican los datos anteriores por los nuevos
                    Lista_Medicamentos.add(modMedicamento, new Medicamento(nuevoNomMed, nuevaCantMed));
                    break;
                case 4:
                    // Se le piden los datos al usuario para ingresar un nuevo paciente
                    System.out.println("Digite el nombre del paciente");
                    String nuevoPac = sc.next();
                    System.out.println("Digite el medicamento del paciente");
                    String nuevoMedPac = sc.next();
                    Lista_Pacientes.add(new Paciente(nuevoPac, nuevoMedPac));
                    break;
                case 5:
                    // Se le pide al usuario digitar el número del paciente que desea borrar
                    System.out.println("Digite el numero del paciente que desea eliminar: ");
                    int elimPac = sc.nextInt();
                    // Se crea una variable para guardar la cantidad de medicamentos borrados
                    int elimin=0;
                    // Bucle para recorrer la lista
                    for (Paciente m : Lista_Pacientes) {
                        // Se borran datos solo si la lista tiene elementos
                        if (Lista_Pacientes.isEmpty()== false) {
                            Lista_Pacientes.remove(elimPac);
                            Lista_Medicamentos.remove(elimPac);
                            elimin ++;
                        }else{
                            // Mensaje en caso de que no se cumpla lo anteriormente mencionado
                            System.out.println("La lista no contiene pacientes");
                        }
                        // Variable que muestra la cantidad de datos borrados
                        System.out.println("Cantidad de pacientes eliminados: "+elimin);
                    }
                    break;
                case 6:
                    // Se crea esta función para modificar los datos de un paciente
                    System.out.println("Digite el numero del paciente que desea modificar: ");
                    // Se utiliza este indice para indicar donde colocar los datos nuevos
                    int modPaciente = sc.nextInt(); 
                    System.out.println("Digite el nuevo nombre: ");
                    String nuevoNom = sc.next();
                    System.out.println("Digite el nuevo medicamento: ");
                    String nuevoMedic = sc.next();
                    // Se eliminan los datos anteriores para posteriormente ser sobreescritos
                    Lista_Pacientes.remove(modPaciente);
                    // Se eliminan los datos anteriores para posteriormente ser sobreescritos
                    Lista_Medicamentos.remove(modPaciente);
                    // Se modifican los datos anteriores por los nuevos
                    Lista_Pacientes.add(modPaciente, new Paciente(nuevoNom, nuevoMedic));
                    // Tambien se modifica el medicamento
                    Lista_Medicamentos.add(modPaciente, new Medicamento(nuevoMedic, 1));
                    break;
                case 7:
                    // Se le pide al usuario ingresar el paciente y medicamento
                    System.out.println("Digite el nombre del paciente: ");
                    nomPaciente = sc.next();
                    System.out.println("Digite el nombre del medicamento: ");
                    nomMedicamento = sc.next();
                    // Se almacena el nuevo paciente en la lista correspondiente
                    Lista_Pacientes.add(new Paciente(nomPaciente, nomMedicamento));
                    // Se crea el condicional switch para incrementar los
                    // consumidores de un medicamento ya existente o de lo
                    // contrario agregar uno nuevo
                    switch (nomMedicamento) {
                        case "Fortasec":
                            byte indice = 0;
                            Lista_Medicamentos.remove(indice);
                            Lista_Medicamentos.add(indice, new Medicamento("Fortasec",2));
                            break;
                        case "Clamexil":
                            byte indicador = 1;
                            Lista_Medicamentos.remove(indicador);
                            Lista_Medicamentos.add(indicador, new Medicamento("Clamexil",2));
                            break;
                        default:
                            Lista_Medicamentos.add(new Medicamento(nomMedicamento, 1));  
                    }
                    break;
                case 8:
                    // Se usa un ciclo for para imprimir todos los pacientes sin
                    // medicamentos, así como la función noMedicamentos
                    for (Paciente p : Lista_Pacientes) {
                        p.noMedicamentos();
                    }
                    break;
                case 9:
                    // Se usa un ciclo for para imprimir todos los pacientes
                    for (Paciente p : Lista_Pacientes) {
                        System.out.println("Nombre: "+p.getNombre_Pac()+", Medicamento(s): "+p.getMedicamento_Pac());
                    }
                    break;
                case 10:
                    // Se usa un ciclo for para imprimir todos los medicamentos
                    for (Medicamento m : Lista_Medicamentos) {
                        System.out.println("Nombre: "+m.getNombre_Med()+", Cantidad: "+m.Cant_Consumidores);
                    }
                    break;
                // Se crea un default, en caso de que no se ingrese alguna de las opciones
                case 11:
                    // Opicón para salir del programa
                    salida = true;
                    break;
                default:
                    // En caso de que no se ninguno de los casos anteriores, se mostraría
                    //el siguiente aviso
                    System.out.println("Por favor ingrese una de las opciones anteriores");
                    break;
                }
                
            }while(salida!=true);
        }catch (InputMismatchException e) { 
            JOptionPane.showMessageDialog(null, "Por favor ingrese el valor adecuado");
            salida = false;
        }
        
        /*
        for (Medicamento m : Lista_Medicamentos) {
                        if (nomMedicamento == m.getNombre_Med()) {
                        m.setCant_Consumidores(m.getCant_Consumidores());
                    }else {
                        Lista_Medicamentos.add(new Medicamento(nomMedicamento, 1));
                    }
        }
        */
        
    }
    
}
