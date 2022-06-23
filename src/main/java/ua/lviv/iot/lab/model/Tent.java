package ua.lviv.iot.lab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tent extends Good {

    private float area;
    private float height;
    private int maxCapacity;
    private String type;

    public Tent(final String name, final int quantity,
                final String manufacturer, final float price,
                final float weight, final boolean isForHikingCamping,
                final float area, final float height,
                final int maxCapacity, final String type) {
        super(name, quantity, manufacturer, price, weight, isForHikingCamping);
        this.area = area;
        this.height = height;
        this.maxCapacity = maxCapacity;
        this.type = type;
    }

    public String getHeaders() {
        return super.getHeaders() + ", area, height, maxCapacity, type";
    }

    public String toCSV() {
        return super.toCSV() + ", " + area + ", " + height +
                ", " + maxCapacity + ", " + type;
    }
}
