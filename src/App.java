import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("===========================================================");
        System.out.println("Ingrese la capacidad de productos almacenables en su inventario: ");
        int CapInvent = leer.nextInt();
        leer.nextLine(); 

        String[] Produc = new String[CapInvent];
        double[] Precio = new double[CapInvent];

        System.out.println("===========================================================");
        for (int i = 0; i < CapInvent; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            Produc[i] = leer.nextLine();

            System.out.print("Ingresa el precio de " + Produc[i] + ": ");
            Precio[i] = leer.nextDouble();
            leer.nextLine(); 
        }
        System.out.println("===========================================================");

        System.out.println("Inventario:");
        for (int i = 0; i < CapInvent; i++) {
            System.out.println(Produc[i] + ": $" + Precio[i]);
        }
        System.out.println("===========================================================");

        System.out.print("¿Qué producto estás buscando? ");
        String ProducBuscado = leer.nextLine();

        try {
            int indiceEncontrado = BuscarProduc(Produc, ProducBuscado);
            if (indiceEncontrado != -1) {
                System.out.println("¡El producto " + ProducBuscado + " está en el inventario!");
            } else {
                System.out.println("El producto " + ProducBuscado + " no está en el inventario.");
            }
        } catch (Exception e) {
            System.out.println("Algo ha ocurrido: " + e.getMessage());
        }
    }

    public static int BuscarProduc(String[] Produc, String ProducBuscado) {
        for (int i = 0; i < Produc.length; i++) {
            if (Produc[i].equals(ProducBuscado)) { 
                return i;
            }
        }
        return -1;
    }
}