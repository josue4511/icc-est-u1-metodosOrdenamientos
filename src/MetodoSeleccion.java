public class MetodoSeleccion {

    
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceDelMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[indiceDelMenor] > arr[j]) {
                    indiceDelMenor = j;
                }
            }

            if (i != indiceDelMenor) {
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }

    
    public static void sortDes(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMayor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[indiceMayor] < arr[j]) {
                    indiceMayor = j;
                }
            }

            if (i != indiceMayor) {
                int aux = arr[i];
                arr[i] = arr[indiceMayor];
                arr[indiceMayor] = aux;
            }
        }
    }

    public void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}