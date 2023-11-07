public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    private String returnVehicle(String plateNumber){
        return "Vehicle with plate number " + plateNumber + " has been returned.";
    }

    public String service() {
        return returnVehicle(plateNumber);
    }
}
