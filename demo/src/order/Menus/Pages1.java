package order.Menus;

import order.Do.Order;
import order.Do.Train;
import order.Do.User;
import order.controller.RunWorkController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pages1 {

    RunWorkController runWorkController = new RunWorkController();

    public int Menu1TrainList() throws InterruptedException, ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的起始地:");
        String startLocal = scanner.nextLine();
        System.out.println("请输入你的终点站:");
        String endLocal = scanner.nextLine();
        System.out.println("你选择的站点为:"+startLocal+"-"+endLocal);
        System.out.println("正在进入服务页，请稍等......");
        Thread.sleep(2);
        Menu01();
        int a = scanner.nextInt();
        Train[] res = null;
        //查询车次
        if(a==1){
            RunWorkController controller = new RunWorkController();
            res  = controller.SearchTrain(startLocal,endLocal);
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
        //选择车次
        Menu01();
        int b = scanner.nextInt();
        Train myCar = null;
        if(b==2){
            boolean flag = true;
            while (flag){
                System.out.println("请输入你要选择的列车车次:");
                Scanner sc = new Scanner(System.in);
                String id = sc.nextLine();
                myCar = null;
                for(Train train:res){
                    if(train!=null&&train.getId().equals(id)){
                        System.out.println("你选择的列车信息如下:");
                        System.out.println("*==============================================================");
                        System.out.println("=====序号:"+train.getId()+"    列车名称:"+train.getName());
                        System.out.println("=====发车时间:"+train.getStartTime()+"   到站时间:"+train.getEndTime());
                        System.out.println("=====站点信息:"+train.getArr().toString());
                        System.out.println("=====座位数:"+train.getSeatNum()+"  价格:"+train.getMoney());
                        System.out.println("===============================================================");
                        myCar = train;
                        flag = false;
                    }
                }
               if(flag){
                   System.out.println("抱歉,没有找到你要乘坐的列车,请重新输入信息");
               }
            }
        }
        //买票
        Menu01();
        int c = scanner.nextInt();
        ArrayList<Order> list = new ArrayList<>();
        if(c==3){
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你的姓名:");
            String name = sc.nextLine();
            System.out.println("输入你的证件号码:");
            String sfz = sc.nextLine();
            System.out.println("输入你的年龄:");
            int age = sc.nextInt();
            System.out.println("要买的车票数量为:");
            int num = sc.nextInt();
            User user = new User(1);
            user.setName(name);
            user.setAge(age);
            user.setSfz(sfz);
            user.setPhone("18891636438");
            user.setSex("男");
            for(int i =0 ;i<num;i++){
                Order order =  runWorkController.createOrder(user,myCar);
                order.setId(String.valueOf(i));
                list.add(order);
            }
            for(Order order : list){
                if(order!=null){
                    System.out.println("订单信息如下:");
                    System.out.println("*==============================================================");
                    System.out.println("=====订单号:"+order.getId()+"    用户名称:"+order.getName()+"  用户证件:"+order.getSfz());
                    System.out.println("=====发车时间:"+order.getStartTime()+"   到站时间:"+order.getEndTime());
                    System.out.println("=====站点信息:"+order.getArr());
                    System.out.println("=====座位数:"+order.getSeatNum()+"  订单价格:"+order.getMoney());
                    System.out.println("===============================================================");
                }
            }
        }
        Menu01();
        int d = scanner.nextInt();
        if(d==4){
            System.out.println("输入订单号码进行退票");
            Scanner scanner1 = new Scanner(System.in);
            int id =  scanner1.nextInt();
            list.remove(id);
            for(Order order: list){
                if(order!=null){
                    System.out.println("订单信息如下:");
                    System.out.println("*==============================================================");
                    System.out.println("=====订单号:"+order.getId()+"    用户名称:"+order.getName()+"  用户证件:"+order.getSfz());
                    System.out.println("=====发车时间:"+order.getStartTime()+"   到站时间:"+order.getEndTime());
                    System.out.println("=====站点信息:"+order.getArr());
                    System.out.println("=====座位数:"+order.getSeatNum()+"  订单价格:"+order.getMoney());
                    System.out.println("===============================================================");
                }
            }
        }

        return a;
    }

    public void Menu01(){
        System.out.println("       欢迎来到XX高铁订票系统       ");
        System.out.println("================================");
        System.out.println("===       1.查询当前车次       ===");
        System.out.println("===       2.选 择 车 次       ===");
        System.out.println("===       3.购 买 车 票       ===");
        System.out.println("===       4.退      票       ===");
        System.out.println("===       5.历 史 订 单       ===");
        System.out.println("===       6.订 单 修 改       ===");
        System.out.println("================================");
        System.out.println("请选择你需要的服务");
    }


    public static void main(String[] args) throws InterruptedException, ParseException {
        Pages1 pages1 = new Pages1();
        pages1.Menu1TrainList();
    }

}
