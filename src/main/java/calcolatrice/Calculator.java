package calcolatrice;

public class Calculator {
    //METODO SOMMA
    public float add(float num1, float num2){
        return num1 + num2;
    }

    //METODO SOTTRAZIONE
    public float substract(float num1, float num2){
        return num1 - num2;
    }

    //METODO DIVISIONE
    public float divide(float num1, float num2) throws IllegalArgumentException{
        if (num2 == 0){
            throw new IllegalArgumentException("Il numero non può essere divisibile per 0.");
        }
        return num1 / num2;
    }

    //METODO MOLTIPLICAZIONE

    public float multiply(float num1, float num2){
        return num1 * num2;
    }

}
