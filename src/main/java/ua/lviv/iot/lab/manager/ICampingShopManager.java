package ua.lviv.iot.lab.manager;

import ua.lviv.iot.lab.model.Good;
import java.util.List;

public interface ICampingShopManager {

    List<Good> findForHikingCamping();
    List<Good> findByName(String name);
    void addGoods(List<Good> goods);
    void sortGoodsByWeight(boolean isDescending);
    void sortGoodsByName(boolean isDescending);
}
