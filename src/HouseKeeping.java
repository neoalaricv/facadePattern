public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

        private String cleanRoom(int roomNumber) {
            return "Room " + roomNumber + " has been cleaned.";
        }

        public String service() {
            return cleanRoom(roomNumber);
        }
    }
