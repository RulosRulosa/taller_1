import java.util.Scanner;

public class main {
    private static double a;
    static Scanner input = new Scanner(System.in);

    public static void main (String[] args){

        System.out.println("Bienvenido al programa del taller 1 ");
        boolean x= true;

        ingresarValor();

            System.out.println("a: " + a + " ¿Qué operación desea realizar? \n");
            System.out.println("Las opciones son: ");
            System.out.println("1. Mostrar representación binaria");
            System.out.println("2. Mostrar representación decimal");
            System.out.println("0. salir");


            String opcion= input.nextLine();

            switch (opcion){
                case "1":
                    System.out.println("El binario es:");
                    imprimirBin();

                    break;
                case "2":
                    System.out.println("El decimal es: ");
                    imprimirDec();

                    break;
                case "0":
                    System.out.println("Adiós");

                    break;
                default:
                    break;
            }

    }
    public int leerNum(int a){

        return a;
    }
    public boolean validarNum(int a){
        if(0>a || a>255){
            System.out.println("el valor excede rango");
            System.out.println("ingrese de nuevo");
            ingresarValor();
            return false;

        }
        return true;
    }
    public boolean validarBinario(int numBin){
        String bin8= Integer.toString(numBin);

        if(bin8.length()>8){
            System.out.println("el número excede los dígitos \n");
            System.out.println("intente de nuevo");
            ingresarValor();
            return false;
        }

        return true;
    }
    public static void imprimirDec(){
        System.out.println(a);
    }
    public static void imprimirBin(){
        System.out.println(a);
    }
    public static int convertirBin(int a){

        return a;
    }
    public static int convertirInt(int a){

        return a;
    }


    public static void ingresarValor (){

        try{ System.out.println("ingrese el valor de a");
            a= input.nextInt();
        }catch (Exception e){
            System.out.println("Error: entrada no válida");
            if (input.hasNextLine()) input.nextLine();
            ingresarValor();
        }

    }
}
