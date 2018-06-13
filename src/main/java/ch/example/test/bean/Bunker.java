package ch.example.test.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Bunker {
    private int bunkerId;
    private int machineId;
    private int materialId;
    private int type;
    private int materialStock;
    private int output;
    private Date date;

    public Bunker() {
    }

    public Bunker(int bunkerId, int machineId, int materialId, int type, int materialStock, int output, Date date) {
        this.bunkerId = bunkerId;
        this.machineId = machineId;
        this.materialId = materialId;
        this.type = type;
        this.materialStock = materialStock;
        this.output = output;
        this.date = date;
    }

    public int getBunkerId() {
        return bunkerId;
    }

    public void setBunkerId(int bunkerId) {
        this.bunkerId = bunkerId;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMaterialStock() {
        return materialStock;
    }

    public void setMaterialStock(int materialStock) {
        this.materialStock = materialStock;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "bunker{" +
                "bunkerId=" + bunkerId +
                ", machineId=" + machineId +
                ", materialId=" + materialId +
                ", type=" + type +
                ", materialStock=" + materialStock +
                ", output=" + output +
                ", date=" + date +
                '}';
    }
}
