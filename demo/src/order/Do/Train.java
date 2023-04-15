package order.Do;

import java.util.Arrays;
import java.util.Date;

public class Train {

    private String id;

    private String name;

    private Date startTime;

    private Date endTime;

    private String[] arr; //站点

    private int seatNum;

    public Train(String id, String name, Date startTime, Date endTime, String[] arr, int seatNum) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.arr = arr;
        this.seatNum = seatNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", arr=" + Arrays.toString(arr) +
                ", seatNum=" + seatNum +
                '}';
    }
}
