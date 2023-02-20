public class Main {
    public static void main(String[] args) {
        Car car = new Car("Benz", 2, "red", new Engine("Benz pro", 8400));
        System.out.println(car.getEngine().getModel());
    }
}
