package logicore.model;

/**
 * Φορτηγό: το όχημα που εκτελεί τις αποστολές.
 */
public class Truck {

    private Integer truckId;
    private String plate;
    private String truckType;   // SMALL ή LARGE

    public Truck(String plate, String truckType) {
        this.plate = plate;
        this.truckType = truckType;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
}
