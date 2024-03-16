/**
 * Esta libreria se utiliza para hacer operacines
 */
public class Calculos {
    /**
     * Opcion para elegir Sumar
     */
    public static final int SUMA = 2;
    /**
     * Opcion para elegir Restar
     */
    public static final int RESTA = 3;
    /**
     * Opcion para elegir Multiplicar
     */
    public static final int MULTIPLICACION = 4;
    /**
     * Opcion para elegir Dividir
     */
    public static final int DIVISION = 5;
    /**
     * Opcion para elegir Raiz de caulquier indice
     */
    public static final int RAIZ = 6;

    /**
     *
     * @param valor1 primer operando para lás operaciones
     * @param valor2 segundo operando para lás operaciones
     * @param calculos opción para seleccionar la operación que se desea realizar
     * @return devuelve resultado de la operación
     */



    public static double calc (int valor1,int valor2,int calculos){
        double resultado= 0;
        switch (calculos){
            case SUMA:
                resultado = valor1+valor2;
                break;
            case RESTA:
                if (valor1>valor2){
                    resultado = valor1-valor2;
                } else if (valor2>valor1) {
                    resultado= valor2 - valor1;
                }
                break;
             case MULTIPLICACION:
                 resultado = valor1*valor2;
                 break;
            case DIVISION:
                try {
                    if (valor1>valor2){
                        resultado= valor1/valor2;
                    } else if (valor2>valor1) {
                        resultado= valor2/valor1;
                    }
                }catch (ArithmeticException ex){
                    resultado = 0; //igualo a cero la división
                    System.out.println("Error: "+ex.getMessage());
                }
                break;
            case RAIZ:
                resultado =  Math.pow(valor1, 1.0/ valor2);
                break;
        }
        return resultado;
    }
}
