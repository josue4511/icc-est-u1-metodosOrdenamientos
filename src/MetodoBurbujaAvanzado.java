public class MetodoBurbujaAvanzado {

    int[] arreglo;

    public MetodoBurbujaAvanzado(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void sort(boolean asc) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < tam - 1; i++) {
            boolean huboIntercambios = false;

            for (int j = 0; j < tam - 1 - i; j++) {

                contComparaciones++;

                if (asc) {
                    // Ascendente
                    if (arreglo[j] > arreglo[j + 1]) {

                        int a = arreglo[j];
                        int b = arreglo[j + 1];

                        // Intercambio
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;

                        contCambios++;
                        huboIntercambios = true;

                        System.out.print(a + " -> " + b + " | arreglo=");
                        printArreglo();
                    }
                } else {
                    // Descendente
                    if (arreglo[j] < arreglo[j + 1]) {

                        int a = arreglo[j];
                        int b = arreglo[j + 1];

                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;

                        contCambios++;
                        huboIntercambios = true;

                        System.out.print(a + " -> " + b + " | arreglo=");
                        printArreglo();
                    }
                }
            }

            if (!huboIntercambios) {
                break;
            }

            System.out.println(); // separación de iteraciones
        }

       
        System.out.println("Total comparaciones: " + contComparaciones);
        System.out.println("Total cambios: " + contCambios);
    }

    public void printArreglo() {
        for (int num : arreglo) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}