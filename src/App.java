public class App {
    public static void main(String[] args) throws Exception {
        metodoburbuja();
       
    }
    public static void metodoburbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo =  new int[]{10,-5,0,2,7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDesendente();
        metodoBurbuja.imprimirArreglo();

    }
}
