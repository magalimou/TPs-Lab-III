package modelo;

import java.util.Arrays;
import java.util.Random;

public class Password {

    private int longitud;
    private String contrasenia;

    public Password()
    {
        longitud = 8;
        contrasenia = generatePassword(longitud);
    }

    public Password(int longitud)
    {
        this.longitud = longitud;
        contrasenia = generatePassword(longitud);
    }

    private String generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = numbers.charAt(random.nextInt(numbers.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }

        String pass = new String(password);
        return pass;
    }

    //esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 2
    // mayúsculas, más de 1 minúscula y más de 5 números.
    public boolean esFuerte()
    {
        boolean fuerte = false;
        int mayus = 0;
        int minus = 0;
        int digito = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isUpperCase(contrasenia.charAt(i))) {
                mayus ++;
            }else if(Character.isLowerCase(contrasenia.charAt(i))) {
                minus++;
            }else if(Character.isDigit(contrasenia.charAt(i))) {
                digito++;
            }
        }

        if(mayus >= 2 && minus >= 1 && digito >= 5 )
        {
            fuerte = true;
        }

        return fuerte;
    }


    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", contrasenia=" + contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
