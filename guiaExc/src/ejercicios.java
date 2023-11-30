import java.time.LocalDate;

public class ejercicios {

    //ejercicio 1
    public int dividr (int num1, int num2) throws ArithmeticException
    {
        int rta = 0;
        if(num2 == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            rta = num1 / num2;
        }
        return rta;
    }


    // 2

    public int longitud (String cadena) throws NumberFormatException
    {
        for (int i = 0; i < cadena.length(); i++)
        {
            if (Character.isDigit(cadena.charAt(i)))
            {
                throw new NumberFormatException();
            }
        }
        return cadena.length();
    }

    //ejercicio 3
    public int fueraLimite(int indice, int [] arreglo) throws ArrayIndexOutOfBoundsException
    {
        if(indice > arreglo.length)
        {
            throw new ArrayIndexOutOfBoundsException();
        }

        return arreglo[indice];
    }

    public double radioneg (double radio) throws IllegalArgumentException
    {
        if(radio<0)
        {
            throw new IllegalArgumentException();
        }

        double area = Math.PI * (Math.pow(radio,2));
        return area;
    }

    //ejercicio 6
    public double calcularFactorialRec(int num) throws IllegalArgumentException
    {
        double rta=0;

        if(num < 0)
        {
            throw new IllegalArgumentException();
        }
        if(num == 1)
        {
            return num;
        }else
        {
            rta = num * calcularFactorialRec(num-1);
        }
        return rta;
    }

    //ejercicio 9
    public void contra(String cadena) throws InvalidPasswordException
    {
        int contNum = 0;
        int contMayus = 0;
        if(cadena.length() >= 8){

            for (int i = 0; i < cadena.length(); i++)
            {


                if (Character.isDigit(cadena.charAt(i))){
                    contNum++;
                }
                else if(Character.isUpperCase(cadena.charAt(i))){
                    contMayus++;
                }
            }

            if(contNum == 0 || contMayus == 0 )
            {
                throw new InvalidPasswordException("Error, contrasenia insegura");
            }

        }else
        {
            throw new InvalidPasswordException("Error, contrasenia insegura");
        }

    }


}
