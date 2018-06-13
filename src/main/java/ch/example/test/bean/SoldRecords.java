package ch.example.test.bean;

import java.math.BigDecimal;
import java.util.Date;

public class SoldRecords {
    private int tradeId;
    private int formulaId;
    private BigDecimal price;
    private Date date;
    private int refundType;

    public SoldRecords() {
    }

    public SoldRecords(int tradeId, int formulaId, BigDecimal price, Date date, int refundType) {
        this.tradeId = tradeId;
        this.formulaId = formulaId;
        this.price = price;
        this.date = date;
        this.refundType = refundType;
    }

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public int getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(int formulaId) {
        this.formulaId = formulaId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRefundType() {
        return refundType;
    }

    public void setRefundType(int refundType) {
        this.refundType = refundType;
    }

    @Override
    public String toString() {
        return "SoldRecords{" +
                "tradeId=" + tradeId +
                ", formulaId=" + formulaId +
                ", price=" + price +
                ", date=" + date +
                ", refundType=" + refundType +
                '}';
    }
}
