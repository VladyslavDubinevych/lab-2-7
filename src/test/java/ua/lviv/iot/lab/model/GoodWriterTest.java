package ua.lviv.iot.lab.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GoodWriterTest {

    private Blanket blanket;
    private Flashlight flashlight;
    private Lighter lighter;
    private Tent tent;
    List<Good> goodsList;

    @BeforeEach
    void setUp() {
        blanket = new Blanket("BlanketX", 15, "ZKF", 1800, 2, false, 0.4f);
        flashlight = new Flashlight("Bree", 40, "LHPR", 800, 0.4f, true, 1.7f);
        lighter = new Lighter("Oroblam", 6, "MBL", 400, 0.15f, true, 250);
        tent = new Tent("Tent-S", 4, "TMC", 2500, 2, true, 6, 2.5f, 2, "ETI");

        goodsList = new LinkedList<>();
        goodsList.add(blanket);
        goodsList.add(flashlight);
        goodsList.add(lighter);
        goodsList.add(tent);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testWriteToFile() throws IOException {
        GoodWriter writer = new GoodWriter();
        File file = new File("result.csv");
        writer.writeToFile(goodsList);
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()){
            result.append(scanner.nextLine());
        }
        String expected = "name, quantity, manufacturer, priceInUAH, weightInKilos, isForHikingCamping, " +
                "thicknessBlanketX, 15, ZKF, 1800.0, 2.0, false, 0.4Bree, 40, LHPR, 800.0, 0.4, true, 1.7Oroblam, 6, " +
                "MBL, 400.0, 0.15, true, 250.0Tent-S, 4, TMC, 2500.0, 2.0, true, 6.0, 2.5, 2, ETI";
        assertEquals(expected, result.toString());
    }
}