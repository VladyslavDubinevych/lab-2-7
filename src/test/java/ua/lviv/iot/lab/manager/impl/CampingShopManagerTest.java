package ua.lviv.iot.lab.manager.impl;

import org.junit.jupiter.api.*;
import ua.lviv.iot.lab.model.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class CampingShopManagerTest {

    private CampingShopManager shopManager;
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

        shopManager = new CampingShopManager();

        goodsList = new LinkedList<>();
        goodsList.add(blanket);
        goodsList.add(flashlight);
        goodsList.add(lighter);
        goodsList.add(tent);
        shopManager.addGoods(goodsList);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddGoods() {
        Assertions.assertNotNull(shopManager.getGoodsList());
    }

    @Test
    void testFindForHikingCamping() {
        List<Good> expected = new LinkedList<>();
        expected.add(flashlight);
        expected.add(lighter);
        expected.add(tent);
        List<Good> actual = shopManager.findForHikingCamping();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindByName() {
        List<Good> expected = new LinkedList<>();

        expected.add(blanket);
        Assertions.assertEquals(expected, shopManager.findByName("BlanketX"));
        expected.clear();

        expected.add(flashlight);
        Assertions.assertEquals(expected, shopManager.findByName("Bree"));
        expected.clear();

        expected.add(lighter);
        Assertions.assertEquals(expected, shopManager.findByName("Oroblam"));
        expected.clear();

        expected.add(tent);
        Assertions.assertEquals(expected, shopManager.findByName("Tent-S"));
        expected.clear();
    }

    @Test
    void testSortGoodsByWeight() {
        List<Good> expected = new LinkedList<>();
        expected.add(blanket);
        expected.add(flashlight);
        expected.add(lighter);
        expected.add(tent);
        expected = expected.stream()
                .sorted(Comparator.comparing(Good::getWeightInKilos).reversed())
                .collect(Collectors.toList());
        shopManager.sortGoodsByWeight(true);
        Assertions.assertEquals(expected, shopManager.getGoodsList());
        expected = expected.stream()
                .sorted(Comparator.comparing(Good::getWeightInKilos))
                .collect(Collectors.toList());
        shopManager.sortGoodsByWeight(false);
        Assertions.assertEquals(expected, shopManager.getGoodsList());
    }

    @Test
    void testSortGoodsByName() {
        List<Good> expected = new LinkedList<>();
        expected.add(blanket);
        expected.add(flashlight);
        expected.add(lighter);
        expected.add(tent);
        expected = expected.stream()
                .sorted(Comparator.comparing(Good::getName).reversed())
                .collect(Collectors.toList());
        shopManager.sortGoodsByName(true);
        Assertions.assertEquals(expected, shopManager.getGoodsList());
        expected = expected.stream()
                .sorted(Comparator.comparing(Good::getName))
                .collect(Collectors.toList());
        shopManager.sortGoodsByName(false);
        Assertions.assertEquals(expected, shopManager.getGoodsList());
    }
}