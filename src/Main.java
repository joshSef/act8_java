import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de su primer perro: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la raza de su primer perro: ");
        String raza1 = scanner.nextLine();
        System.out.print("Ingrese la edad de su primer perro: ");
        int edad1 = scanner.nextInt();
        Perro perro1 = new Perro(nombre1, raza1, edad1);

      //Perro 2
        System.out.print("Ingrese el nombre de su segundo perro: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la raza de su segundo perro: ");
        String raza2 = scanner.nextLine();
        System.out.print("Ingrese la edad de su segundo perro: ");
        int edad2 = scanner.nextInt();
        Perro perro2 = new Perro(nombre2, raza2, edad2);

        perro1.comer("Croqueta", 200);
        System.out.println(perro1.ladrar());

        perro2.comer("Sobre", 150);
        System.out.println(perro2.ladrar());
    }
}