package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lighter extends Good {

    private float gasQuantity;

    public Lighter(final String name, final int quantity,
                   final String manufacturer, final float price,
                   final float weight, final boolean isForHikingCamping,
                   final float gasQuantity) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.gasQuantity = gasQuantity;
    }

    public String getHeaders() {
        return super.getHeaders() + ", gasQuantity";
    }

    public String toCSV() {
        return super.toCSV() + ", " + gasQuantity;
    }
}
