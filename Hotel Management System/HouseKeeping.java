package hotelManagementSystem;

public class HouseKeeping implements HotelService {
    int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("HouseKeeping service is cleaning room number: " + roomNumber);
    }

    @Override
    public void executeService() {
        cleanRoom();
    }
}
