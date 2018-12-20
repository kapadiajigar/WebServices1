package services;

public class CarService {

    private int id;
    private String carName;

    public CarService(int id, String carName) {
        this.id = id;
        this.carName = carName;
    }

    public int getId() {
        return id;
    }

    public String getCarName() {
        return carName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getResults(int id){

        return "Hello";
    }

    public static void main(String[] args) {

        System.out.printf("Hello, World!");
    }


}
