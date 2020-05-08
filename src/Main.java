public class Main
{
    public static void main(String[] args) {
        AVL arbol = new AVL();
        arbol.insertar(4);
        arbol.insertar(8);
        arbol.insertar(2);
        arbol.insertar(5);
        arbol.insertar(9);
        arbol.insertar(6);
        arbol.insertar(100);
        arbol.insertar(11);
        arbol.insertar(7);
        arbol.insertar(1);
        arbol.insertar(22);
        arbol.insertar(25);
        arbol.insertar(30);
        arbol.insertar(28);
        arbol.insertar(27);

        Nodo<Integer> root = arbol.getRaiz();
        System.out.println("\nAltura: " + arbol.calcularAltura());
        new impresoraDeArbol<>(arbol).imprime();
        System.out.println("\nFE = " + (arbol.altura(root.getIzquierdo())- arbol.altura(root.getDerecho())));
        System.out.println("");
        arbol.remove(5);
        System.out.println("\nAltura: " + arbol.calcularAltura());
        new impresoraDeArbol<>(arbol).imprime();
        System.out.println("\nFE = " + (arbol.altura(root.getIzquierdo())- arbol.altura(root.getDerecho())));
    }
}