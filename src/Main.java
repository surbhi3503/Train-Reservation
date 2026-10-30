import phaseone.Berth;
import phaseone.Station;
import phaseone.Train;

public class Main {
    public  static void main(String[] args) {

    Station[] stops = new Station[3];
    stops[0] = new Station("Indore" ,   "IDR");
    stops[1] = new Station("Ujjain" ,   "UJN");
    stops[2] = new Station("Ratlam" ,   "RTM");

    Train train = new Train("Rajdhani" , 123,stops);
        System.out.println(train);

        train.bookBerth(3);
        System.out.println(train);
        train.bookBerth(4);
        System.out.println(train);
        train.bookBerth(4);
        System.out.println(train);


    }

}
