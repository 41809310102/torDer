package order.Do;

public class Demo {

    public static void main(String[] args) {
       Node xian = new Node("西安");
       Node shanghai = new Node("上海");
       Node beijing = new Node("北京");
       Node hangzhou = new Node("杭州");
       xian.setNext(shanghai);
       shanghai.setNext(beijing);
       beijing.setNext(hangzhou);
       System.out.println(xian.toString());
    }
}
