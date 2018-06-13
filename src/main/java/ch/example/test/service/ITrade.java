package ch.example.test.service;

import ch.example.test.bean.ReturnModel;
import com.alibaba.fastjson.JSONObject;

public interface ITrade {

    public ReturnModel changeMaterialStock(JSONObject json);

}
