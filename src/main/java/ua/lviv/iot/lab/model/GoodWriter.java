package ua.lviv.iot.lab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GoodWriter {

    public void writeToFile(final List<Good> goods) throws IOException {
        final File file = new File("result.csv");

        try (FileWriter writer = new FileWriter(file);) {
            writer.write(goods.get(0).getHeaders() + "\n");
            for (Good good: goods) {
                writer.write(good.toCSV() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
