public class App {
    public static void main(String[] args) throws Exception {
        runMetodoBurbujaAvanzado();
    }

    public static void runMetodoBurbujaAvanzado() {
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};

        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);

        System.out.println("Arreglo original:");
        mBurbujaAvanzado.printArreglo();

        System.out.println("Orden ascendente:");
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();

        System.out.println("Orden descendente:");
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }
    public static void runSeleccion(){
        MetodoSeleccion  mSeleccion = new MetodoSeleccion();
        int[] arr = new int[]{1, 10, 7, 9, 0, 1, 3, 4};
        mSeleccion.printArreglo(arr);
        mSeleccion.sort(arr);
        mSeleccion.printArreglo(arr);
        mSeleccion.sortDes(arr);
        mSeleccion.printArreglo(arr);
    }
}
