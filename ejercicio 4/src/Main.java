import java.util.LinkedList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Se utiliza LinkedList porque permite insertar elementos
         * en posiciones intermedias de manera eficiente, sin necesidad
         * de desplazar todos los elementos como ocurre con los arreglos
         * o un ArrayList. Esto la hace ideal para un editor de texto simple.
         */
        LinkedList<String> texto = new LinkedList<>();

        // Texto inicial
        texto.add("Programar");
        texto.add("en");
        texto.add("Java");
        texto.add("es");
        texto.add("divertido");

        System.out.println("Texto original:");
        imprimirTexto(texto);

        // Inserciones en posiciones intermedias
        texto.add(2, "con");        // Inserta en el medio
        texto.add(4, "estructuras");// Nueva palabra intermedia

        System.out.println("\nTexto después de las inserciones:");
        imprimirTexto(texto);
    }

    // Método auxiliar solo para mostrar el texto
    public static void imprimirTexto(LinkedList<String> texto) {
        for (String palabra : texto) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}