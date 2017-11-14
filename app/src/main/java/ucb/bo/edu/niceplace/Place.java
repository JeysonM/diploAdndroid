package ucb.bo.edu.niceplace;

/**
 * Created by jeysonmirabal on 14/11/17.
 */
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

public class Place extends RealmObject {
    @PrimaryKey
    private String id;
    private String name;
    private String description;
    private double latitude;
    private double longitude;

    @Ignore
    private Date discovered;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getDiscovered() {
        return discovered;
    }

    public void setDiscovered(Date discovered) {
        this.discovered = discovered;
    }

    @Override
    public String toString() {
        return "Place {" +
                "name ='" + name + '\'' +
                '}';
    }

}
