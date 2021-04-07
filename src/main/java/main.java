import java.util.Scanner;

public class main {
    private static int a;
    static Scanner input = new Scanner(System.in);

    public static void main (String[] args){

        System.out.println("Bienvenido al programa del taller 1 ");




            System.out.println("Las opciones son: ");
            System.out.println("1. Mostrar representación binaria");
            System.out.println("2. Mostrar representación decimal");
            System.out.println("0. salir");


            int opcion= input.nextInt();

            switch (opcion){
                case 1:
                    ingresarEnt();
                    System.out.println("El binario es:");
                   convertirBin(a);
                    imprimirBin();

                    break;
                case 2:
                    ingresarBin();
                    System.out.println("El decimal es: ");
                    convertirEnt(a);
                    imprimirDec();

                    break;
                case 0:
                    System.out.println("Adiós");

                    break;
                default:
                    break;
            }

    }
    public int leerNum(int a){

        return a;
    }
    public boolean validarNum(){
        if(0>a || a>255){
            System.out.println("el valor excede rango");
            System.out.println("ingrese de nuevo");
            ingresarEnt();
            return false;

        }
        return true;
    }
    public boolean validarBinario(){
        String bin8= Integer.toString(a);

        if(bin8.length()>8){
            System.out.println("el número excede los dígitos \n");
            System.out.println("intente de nuevo");
            ingresarBin();
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

        Integer.parseInt(Integer.toBinaryString(a));
        return a;
    }
    public static int convertirEnt(int a){
        Integer.parseInt(Integer.toString(a), 2);
        return a;
    }

    public static void ingresarBin(){

        try{ System.out.println("ingrese el valor de a");
            a= input.nextInt();
        }catch (Exception e){
            System.out.println("Error: entrada no válida");
            if (input.hasNextLine()) input.nextLine();
            ingresarBin();
        }

    }
    public static void ingresarEnt(){

        try{ System.out.println("ingrese el valor de a");
            a= input.nextInt();
        }catch (Exception e){
            System.out.println("Error: entrada no válida");
            if (input.hasNextLine()) input.nextLine();
            ingresarEnt();
        }

    }
}
