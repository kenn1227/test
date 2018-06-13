package ch.example.test.mapper;

import java.util.HashMap;
import java.util.Map;

public interface BunkerMappper {
    public void selectMetiralStock(HashMap map);

    public void updateMaterialStock(int stock,int output,int materialId);
}
