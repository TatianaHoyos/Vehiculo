public class Main {
    public static void main(String[] args) {
        //instancia de una clase para crear un objeto
            Carro myCarro = new Carro();
            myCarro.color = "negro";
            myCarro.modelo = "2022";
            myCarro.precio = 1000000f;

            System.out.println(myCarro.color);
            System.out.println(myCarro.modelo);
            System.out.println(myCarro.precio);

            myCarro.acelerar();
            //instanciando una clase
        Carro carro2 = new Carro();
        carro2.color = "blanco";
        carro2.modelo = "2021";
        carro2.precio= 2000000;
        System.out.println(carro2.color);
        System.out.println(carro2.modelo);
        System.out.println(carro2.precio);
        carro2.frenar();

        myCarro.color = "gris";
        System.out.println(myCarro.color);


    }
}