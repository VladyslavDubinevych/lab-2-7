package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Blanket extends Good {

    private float thickness;

    public Blanket(final String name, final int quantity,
                   final String manufacturer, final float price,
                   final float weight, final boolean isForHikingCamping,
                   final float thickness) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.thickness = thickness;
    }

    public String getHeaders() {
        return super.getHeaders() + ", thickness";
    }

    public String toCSV() {
        return super.toCSV() + ", " + thickness;
    }
}
