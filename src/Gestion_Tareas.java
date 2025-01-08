import java.util.LinkedList;
import java.util.Queue;
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
        System.out.println("Hello, World!");
    }
}
