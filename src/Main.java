import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcionMenu=0;
        ArrayList<Carro> carros = new ArrayList<>();
        Carro myCarro = new Carro();
        myCarro.color="negro";
        myCarro.precio=10000000;
        myCarro.modelo="2022";

        carros.add(myCarro);

        while (opcionMenu<=4) {
            Scanner input = new Scanner(System.in);

            //llamar metodo
            mostrarMenu();
            opcionMenu= input.nextInt();
           // input.close();
            if (opcionMenu==1) {
               mostrarCarros(carros);
            } else if (opcionMenu==4) {
                Carro carroCreado = crearCarro(input);
                carros.add(carroCreado);
               // input.close();
            }
        }


    }
    static void mostrarMenu(){
        System.out.println(":::::::Menú Vehiculos:::::::");
        System.out.println("1.lista vehiculos");
        System.out.println("2.Modificar vehiculo");
        System.out.println("3.Eliminar vehiculo");
        System.out.println("4.Crear vehiculo");
        System.out.println("5.Salir");
        System.out.println("Seleccione una opción del menú");
    }

    static void mostrarCarros( ArrayList<Carro> carros){
        for (int i=0; i<carros.size(); i++){
            System.out.println("::::carro número "+ i);
            System.out.println("color: "+ carros.get(i).color);
            System.out.println("precio: "+ carros.get(i).precio);
            System.out.println("modelo: "+ carros.get(i).modelo);

        }
    }

    static Carro crearCarro(Scanner input){
        Carro carroCreado = new Carro();
        System.out.println("digite el modelo");
        carroCreado.modelo= input.next();
        System.out.println("digite el color");
        carroCreado.color= input.next();
        System.out.println("digite el precio");
        carroCreado.precio=input.nextFloat();
        return carroCreado;
    }

}