public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public String addCart (int numberOfCarts){
        return numberOfCarts + " has been added.";
    }

    public String service() {
        return addCart(numberOfCarts);
    }
}
