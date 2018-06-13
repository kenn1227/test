package ch.example.test.service.implments;

import ch.example.test.bean.ReturnModel;
import ch.example.test.service.ITrade;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TradeImplments implements ITrade{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ReturnModel changeMaterialStock(JSONObject json) {


        return null;
    }
}
