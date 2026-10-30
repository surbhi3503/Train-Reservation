package phaseone;

public class Train {
    private String trainName;
    private int trainNumber;

    private Station[] stops;
    private Berth[] berths;

    public Train(String trainName, int trainNumber, Station[] stops) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.stops = stops;

        this.berths = new Berth[12];
        for (int i = 0; i < berths.length; i++) {
            berths[i] = new Berth(i + 1);
        }
    }
    public void bookBerth(int berthNumber){
        int index = berthNumber-1;
        berths[index].book();
    }
    public int countFreeBerths(){
        int count = 0 ;
        for(int i = 0 ; i < berths.length; i++){
            if(!berths[i].isBooked()){
                count++;
            }
        }
        return count;
    }
    public String toString(){
        return trainName + " (" + trainNumber + "): "
                + stops.length + " stops, "
                +  countFreeBerths() + " free berths";
    }

}
