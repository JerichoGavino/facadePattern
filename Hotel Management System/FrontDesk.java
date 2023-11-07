package hotelManagementSystem;

public class FrontDesk {
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk(String plateNumber, int roomNumber, int numberOfCarts) {
        this.valet = new Valet(plateNumber);
        this.houseKeeping = new HouseKeeping(roomNumber);
        this.cart = new Cart(numberOfCarts);
    }

    public void executeAllServices() {
        valet.executeService();
        houseKeeping.executeService();
        cart.executeService();
    }
}

