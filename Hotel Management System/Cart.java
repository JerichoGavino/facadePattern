package hotelManagementSystem;

public class Cart implements HotelService {
    int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println("Cart service is handling request for " + numberOfCarts + " carts");
    }

    @Override
    public void executeService() {
        requestCart();
    }
}

