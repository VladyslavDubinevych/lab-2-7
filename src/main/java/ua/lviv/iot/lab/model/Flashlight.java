package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flashlight extends Good {

    private float brightness;

    public Flashlight(final String name, final int quantity,
                      final String manufacturer, final float price,
                      final float weight, final boolean isForHikingCamping,
                      final float brightness) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.brightness = brightness;
    }

    public String getHeaders() {
        return super.getHeaders() + ", brightness";
    }

    public String toCSV() {
        return super.toCSV() + ", " + brightness;
    }
}
