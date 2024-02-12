import by.belstu.it.vovna.Car;

public class Main {
    public static void main(String[] args) {
        //TODO print string "Hello world"
        System.out.println("Hello world!");

        //TODO create object by.belstu.it.vovna.Car
        Car car = new Car();
        Car car1 = new Car();

        System.out.println("New string");

        //TODO check hints
        for (int i=0; i<9; i++) {
            if (i>-1)
                if (i<10)
                    System.out.println(i);

        }
        onCreate();

    }
    public static void onCreate(){
        for (int count = 0; count < 10; count++) {
            System.out.println("Conter "+ count);
        }
    }
}