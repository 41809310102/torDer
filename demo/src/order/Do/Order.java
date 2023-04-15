package order.Do;

import java.util.Date;

public class Order extends Train{

    private String sfz;

    private String id;

    private float Money;

    private Date creatOrderTime;

    public Order(String id, String name, Date startTime, Date endTime, String[] arr, int seatNum) {
        super(id, name, startTime, endTime, arr, seatNum);
    }

    public Order(String id, String name, Date startTime, Date endTime, String[] arr, int seatNum, String sfz, String id1, float money, Date creatOrderTime) {
        super(id, name, startTime, endTime, arr, seatNum);
        this.sfz = sfz;
        this.id = id1;
        Money = money;
        this.creatOrderTime = creatOrderTime;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public float getMoney() {
        return Money;
    }

    public void setMoney(float money) {
        Money = money;
    }

    public Date getCreatOrderTime() {
        return creatOrderTime;
    }

    public void setCreatOrderTime(Date creatOrderTime) {
        this.creatOrderTime = creatOrderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sfz='" + sfz + '\'' +
                ", id='" + id + '\'' +
                ", Money=" + Money +
                ", creatOrderTime=" + creatOrderTime +
                '}';
    }
}
