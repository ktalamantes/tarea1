import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern patron = Pattern.compile(""); //Aquí va la ER
        String cadena = "";
        Matcher mat = patron.matcher(cadena);
        Scanner sc = new Scanner(System.in);
        String text = "";

        System.out.println("1.- Generar 0, 1 y 2.");
        System.out.println("2.- Lenguaje Pascal.");
        System.out.println("3.- Expresión que termine con 00 ó 11.");
        System.out.println("4.- Expresión que termine con 00 ó 1");
        System.out.println("5.- ");
        System.out.println("6.- ");
        System.out.println("7.- ");
        System.out.println("8.- ");
        System.out.println("9.- ");
        System.out.println("Elige opcion: ");
        int n =sc.nextInt();

        System.out.println("Opcion elegida: " + n);

        switch (n){
            case 1:
                System.out.println("Ingrese cadena: ");
                 cadena = sc.next();
                 text = "(02+|0+|(2|1)+(0|2)*)";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                } break;

            case 2:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "^[A-Za-z]([A-Za-z0-9_])*";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 3:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "(0|1)*(00|11)";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 4:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "(11|0)*(00|1)";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 5:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "^[xy\\d][\\d\\+\\-\\*\\/\\(\\)=xy]*$";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 6:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "(a|c)*(b|a)";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 7:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "(0|1)*(01)";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 8:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "1(01)*";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

            case 9:
                System.out.println("Ingrese cadena: ");
                cadena = sc.next();
                text = "1(0|1)*00|0(0|1)*11";
                //Comprobarsi el string cadena contiene el patrón "abc"
                patron = Pattern.compile(text);
                mat = patron.matcher(cadena);

                if(mat.matches()){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }break;

        }
    }




}