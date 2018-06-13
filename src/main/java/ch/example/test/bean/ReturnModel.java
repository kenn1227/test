package ch.example.test.bean;

public class ReturnModel {
    private Object d;
    private String err;

    public Object getD() {
        return d;
    }

    public void setD(Object d) {
        this.d = d;
    }


    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    @Override
    public String toString() {
        return "ReturnModel{" +
                "d=" + d +
                ", err='" + err + '\'' +
                '}';
    }
}
