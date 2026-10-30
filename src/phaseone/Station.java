package phaseone;

public class Station {
    private String stationName;
    private String code;

    public Station(String stationName, String code) {
        this.stationName = stationName;
        this.code = code;
    }

    public String getStationName(){
        return stationName;
    }
    public String getCode(){
        return code;
    }

    public String toString() {
        return stationName + " (" + code + " code )";
    }
}

