public class Main {
    public static void main(String[] args) {
//Creamos una variable en la que introducir el resultado de las operaciones
        double resultado=Calculos.calc(15,0,4);
//Imprimimos el resultado
        System.out.println("El resultado es: "+resultado);

//Creamos una variable en la que introducir los valores para la raíz
        double raices=Raices.raiz(16,2);
//Imprimimos el resultado
        System.out.println("El resultado de la raiz seleccionada es: "+raices);
//Creamos la variable de la raiz con Math.pow
        double todas=Raices.todosIndices();
//Imprimimos el resultado
        System.out.println("El resultado de la raíz con indice variable es: "+todas);
    }
}