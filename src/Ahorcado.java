
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new  Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos= 0;
        boolean palabraAdiv = false;

        //Arreglos
        char[] letrasAdiv = new char[palabraSecreta.length()];
        
        //Estructura de control iterativad
        for (int i = 0; i < letrasAdiv.length; i++) {
            letrasAdiv[i] = '_';
        }
        //Estructura de control Bucle
        while (!palabraAdiv && intentos < intentosMaximos) {

            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdiv)+"("+palabraSecreta.length()+"letras)");
            
            System.out.println("Introduce una letra");

            //Usamos clase escaner para pedir una letra
            //Character.toLowerCase sirve para volvver todas las letras minusculas
            char letra =  Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if(palabraSecreta.charAt(i) == letra){
                    letrasAdiv[i] = letra;
                    letraCorrecta = true;
                }
            }
            
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto, te quedan " + (intentosMaximos-intentos)+" intentos.");
            }
                
            if (String.valueOf(letrasAdiv).equals(palabraSecreta)){
                palabraAdiv = true;
                System.out.println("Felicidades, has Adivinado la palabra secreta: "+palabraSecreta);
            }    

        }
        if(!palabraAdiv){
            System.out.println("Pelaste");
        }

        scanner.close();
    }

}
