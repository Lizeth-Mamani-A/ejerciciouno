package ejerciciouno; 
import java.util.Scanner;
public class EjercicioUno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []numeros={10,25,32,45,18};
        System.out.println("ingrese numero a buscar: ");
        int numeroBuscado=sc.nextInt();
        boolean encontrado=false;
        for(int numero:numeros){
            if(numero==numeroBuscado){
                encontrado=true; break;
            }
        }if(encontrado) System.out.println("el numero "+numeroBuscado+" se encuentra en el array.");
        else System.out.println("el numero "+numeroBuscado+" no se encuentra en el array.");
        sc.close();
    }
}