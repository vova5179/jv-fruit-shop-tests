package core.basesyntax.dao;

import core.basesyntax.storage.Storage;
import java.util.stream.Collectors;

public class ShopDaoImpl implements ShopDao {

    @Override
    public void add(String fruit, Integer quantity) {
        Storage.storage.put(fruit, quantity);
    }

    @Override
    public String getAll() {
        return Storage.storage.entrySet().stream()
                .map(key -> key.getKey() + "," + key.getValue())
                .collect(Collectors.joining("\n"));
    }
}
