import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Gestion_Tareas {
    //Pila para que pueda almacenar tareas pendientes
    private Stack<String> tareas_Pendi;

    //Cola para poder almacenar tareas completas
    private Queue<String> tareas_Comple;

    public Gestion_Tareas(){
        tareas_Pendi = new Stack<>();
        tareas_Comple = new LinkedList<>();
    }

    //Metodo que permitira agregar tareas
    public void Agregar_Tarea(String tarea) {
        tareas_Pendi.push(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    //Marcar
    public void Marcar_TareaComple(){
        if (tareas_Pendi.isEmpty()) {
            System.out.println("No hay tareas pendientes");
        }else{
            String tarea_Completada = tareas_Pendi.pop();
            tareas_Comple.add(tarea_Completada);
            System.out.println("Tarea Completada: " + tarea_Completada);
        }
    }

    public void Eliminar_Tarea(String tarea){
        if (tareas_Pendi.remove(tarea)) {
            System.out.println("Tarea Eliminanada" + tarea);
        }else {
            System.out.println("La tarea no se encontro en la lista de pendientes");
        }
    }
    
    public void Ver_TareasPendi(){
        if (tareas_Pendi.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        }else{
            System.out.println("Tareas pendientes: ");
            for(String tarea : tareas_Pendi){
                System.out.println("- " + tarea);
            }
        }
    }

    public void ver_ProximaTarea(){
        if (tareas_Pendi.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        }else{
            System.out.println("Proxima tarea a realizar: " + tareas_Pendi.peek());
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Gestion_Tareas sistem = new Gestion_Tareas();

        while (true) {
            System.out.println("\n==== Gestor de Tareas                 =");
            System.out.println("==== 1. Agregar tarea                 =");
            System.out.println("==== 2. Marcar tarea como completada  =");
            System.out.println("==== 3. Eliminar Tarea                =");
            System.out.println("==== 4. Ver tareas pendientes         =");
            System.out.println("==== 5. Ver proxima tarea             =");
            System.out.println("==== 6. Salir                         =");
            System.out.println("=======================================");
            System.out.println("Seleccione una opcion");    
        
            int opcion = scanner.nextInt();
            scanner.nextLine();//consumir el salto de linea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String nueva_Tarea = scanner.nextLine();
                    sistem.Agregar_Tarea(nueva_Tarea);
                    break;
                
                    case 2:
                    sistem.Marcar_TareaComple();
                    break;

                    case 3:
                    System.out.println("Ingrese la tarea a eliminar: ");
                    String Tarea_Eliminada = scanner.nextLine();
                    sistem.Eliminar_Tarea(Tarea_Eliminada);
                    break;

                    case 4:
                    sistem.Ver_TareasPendi();
                    break;

                    case 5:
                    sistem.ver_ProximaTarea();
                    break;

                    case 6:
                    System.out.println("Gracias por usar el programa");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opcion no valida, vuelve a ingresar");
            }
        }
    }
}
