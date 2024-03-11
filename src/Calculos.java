
public class Calculos {
//creamos los atributos de ambos operandos
    private double valor1;
    private double valor2;
    int opcion=0;

//creamos el metodo para realizar los calculos
    public static double calc (double valor1,double valor2,int opcion){

     double resultado=0;



//hacemos la suma
    double suma = valor1+valor2;
//Hacemos la resta
    double resta=0;
        if (valor1>valor2){
             resta = valor1-valor2;
        } else if (valor2>valor1) {
             resta = valor2 - valor1;
        }
//Hacemos la multiplicación
    double mult = valor1*valor2;
//Hacemos la división
        double div=0;
//Hacemos un Try/Catch para manejar la posibilidad de que se intente dividir entre cero
        try {
            if (valor1>valor2){
                div = valor1/valor2;
            } else if (valor2>valor1) {
                div = valor2/valor1;
            }
        }catch (ArithmeticException ex){
        div = 0; //igualo a cero la división
            System.out.println("Error: "+ex.getMessage());
        }

//Preguntamos al usuario que resultado quiere mostrar
        switch (opcion){
            case 1:
                resultado=suma;
                break;
            case 2:
                resultado=resta;
                break;
             case 3:
                resultado=mult;
                break;
            case 4:
                resultado=div;
                break;
        }
//devolvemos el resultado deseado
        return resultado;
    }
}
