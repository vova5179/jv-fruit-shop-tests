package core.basesyntax.dao;

public interface ShopDao {
    void add(String fruit, Integer quantity);

    String getAll();
}