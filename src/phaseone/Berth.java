package phaseone;

public class Berth {
    private int berthNumber;
    private boolean isBooked = false;

    public Berth(int berthNumber) {
        this.berthNumber = berthNumber;

    }

    public int getBerthNumber() {
    return berthNumber;
    }
    public boolean isBooked(){
        return isBooked;
    }

    public  void book(){
        isBooked = true;
    }

    public String toString(){
        String status = isBooked ? "booked" : "free";
        return "Berth " + berthNumber + " - " + status;
    }
}
