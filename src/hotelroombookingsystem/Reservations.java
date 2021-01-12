
package hotelroombookingsystem;

public class Reservations {
    private int price;
    private String name;
    private String board;
    private String roomType;
    
    public Reservations(int price, String name, String board, String roomType) {
        this.price = price;
        this.name = name;
        this.board = board;
        this.roomType = roomType;
    }
    
    public String toString(){
        return price + " " + name + " " + board + " " + roomType;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBoard() {
        return board;
    }

    public String getRoomType() {
        return roomType;
    }
    
}
