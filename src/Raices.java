public class Raices {

    //Creamos los atribútos para las raíces

    //Valor del que se realizará la raíz
    private double RADICANDO;
    //Valor para saber si se deséa hacer la raíz cuadrada o la cúbica
    private double INDICE;






    //Creamos un metodo para decidir si se mostrará la raíz cuadrada o la cúbica
    public static double raiz (double RADICANDO,double INDICE){

    // raíz cuadrada de la variable número
        double RAIZCUADRADA = Math.sqrt(RADICANDO);

    // raíz cúbica de la variable número
        double RAIZCUBICA = Math.cbrt(RADICANDO);

     //Creamos la variable resultado para poder mostrar la raíz resultante
        double RESULTADO = 0;

    //Creamos el IF,conforme si la variable INDICE es igual a 2,se mostrará la raíz cuadrada
    //Y si INDICE es igual a 3 se muestre la raíz cúbica
        if (INDICE==2){
            RESULTADO=RAIZCUADRADA;
        }else if (INDICE==3){
            RESULTADO=RAIZCUBICA;
        }

        return RESULTADO;

    }

}
