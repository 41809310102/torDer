package order.Menus;

import order.Do.Train;
import order.controller.RunWorkController;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Pages1 {

    public int Menu1TrainList() throws InterruptedException, ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的起始地:");
        String startLocal = scanner.nextLine();
        System.out.println("请输入你的终点站:");
        String endLocal = scanner.nextLine();
        System.out.println("你选择的站点为:"+startLocal+"-"+endLocal);
        System.out.println("正在进入服务页，请稍等......");
        Thread.sleep(2);
        System.out.println("       欢迎来到XX高铁订票系统       ");
        System.out.println("================================");
        System.out.println("===       1.查询当前车次       ===");
        System.out.println("===       2.选 择 车 次       ===");
        System.out.println("===       3.购 买 车 票       ===");
        System.out.println("================================");
        System.out.println("请选择你需要的服务");
        int a = scanner.nextInt();
        if(a==1){
            RunWorkController controller = new RunWorkController();
            Train[] res  = controller.SearchTrain(startLocal,endLocal);
            System.out.println("查询到的车次如下:");
            for(Train train: res){
              try{
                 if(train!=null){
                     System.out.println("*==============================================================*");
                     System.out.println("=====序号:"+train.getId()+"    列车名称:"+train.getName());
                     System.out.println("=====发车时间:"+train.getStartTime()+"   到站时间:"+train.getEndTime());
                     System.out.println("=====站点信息:"+train.getArr().toString());
                     System.out.println("=====座位数:"+train.getSeatNum()+"  价格:"+train.getMoney());
                     System.out.println("===============================================================");
                 }
              }catch (Exception e){
                  System.out.println(e);
              }
            }
        }
        return a;
    }

//    String id = scanner.nextLine();
//    Train myCar = null;
//            for(Train train:res){
//        if(train!=null&&train.getId().equals(id)){
//            System.out.println("*==============================================================");
//            System.out.println("=====序号:"+train.getId()+"    列车名称:"+train.getName());
//            System.out.println("=====发车时间:"+train.getStartTime()+"   到站时间:"+train.getEndTime());
//            System.out.println("=====站点信息:"+train.getArr().toString());
//            System.out.println("=====座位数:"+train.getSeatNum()+"  价格:"+train.getMoney());
//            System.out.println("===============================================================");
//            myCar = train;
//        }
//    }
    public static void main(String[] args) throws InterruptedException, ParseException {
        Pages1 pages1 = new Pages1();
        pages1.Menu1TrainList();
    }

}
