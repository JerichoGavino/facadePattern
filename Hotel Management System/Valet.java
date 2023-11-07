package hotelManagementSystem;

public class Valet implements HotelService {
    String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        System.out.println("Valet service is picking up vehicle with plate number: " + plateNumber);
    }

    @Override
    public void executeService() {
        pickUpVehicle();
    }
}

