package order.Service;

import order.Dao.BuyTicket;
import order.Dao.CreateTrain;
import order.Dao.WorkDao;
import order.Do.Node;
import order.Do.Train;
import order.Do.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class WorkDaoService implements WorkDao, BuyTicket, CreateTrain {

    public User[] data = new User[10];



    @Override
    public int login(User user) {
        for(User user1:data){
            if(user.getName().equals(user1.getName())&&user.getPassword().equals(user1.getPassword())){
                System.out.println(user1.toString());
                System.out.println("登录成功");
                return user1.getId();
            }else if(user.getName().equals(user1.getName())&&!user.getPassword().equals(user1.getPassword())){
                System.out.println("密码输入错误");
                return -1;
            }
        }
        System.out.println("用户不存在");
        return 0;
    }
    @Override
    public User sign(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的姓名:");
        String name = scanner.nextLine();
        System.out.print("请输入你的电话号码:");
        String phone = scanner.nextLine();
        System.out.print("请输入你的密码:");
        String password1 = scanner.nextLine();
        System.out.print("请确认你的密码:");
        String password2 = scanner.nextLine();
        if(checkPhone(phone)&&checkPassword(password1,password2)){
            user.setName(name);
            user.setPassword(password1);
            user.setPhone(phone);
            System.out.println("注册成功");
            data[user.getId()-1] = user;
        }else{
            return null;
        }
        return null;
    }
    @Override
    public void searchUserInfo(int id) {
        for(User user: data){
            if(user.getId()==id){
                System.out.println(user);
                return;
            }
        }
        System.out.println("没有找到该用户");
        return;
    }


    //核验密码
    boolean checkPassword(String first,String second){
        if(first.length()<6){
            System.out.println("密码不符合规矩");
            return false;
        }
        if(first.equals(second)){
            return true;
        }else{
            System.out.println("两次密码输入不一致");
            return false;
        }
    }

    //核验电话号
    boolean checkPhone(String phone){
        if(phone.length()!=11){
            System.out.println("电话号不正确");
            return false;
        }else{
            return true;
        }
    }

    @Override
    public int buyTicket(String name, String sfz, String phone) {
        return 0;
    }

    @Override
    public int buyBaoXian(String name, String sfz, String phone) {
        return 0;
    }

    @Override
    public int buyTicket(User user) {
        return 0;
    }

    @Override
    public int buyBaoXian(User user) {
        return 0;
    }

    @Override
    public  Train[] createTrains(String id, String name, String node) throws ParseException {

        Train train1 = new Train(id,name,creatDate("2022-4-22 08:00:00"),creatDate("2022-4-23 08:00:00"),createTrainNode(node),500);
        Train[] trains = {train1};
        return trains;
    }

//字符串转date时间
    public Date creatDate(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       if(time.length()==0 || time.isEmpty()){
           Date now = new Date();
           String res = simpleDateFormat.format(now);
           Date now1 = simpleDateFormat.parse(res);
           return now1;
       }else{
           Date start = simpleDateFormat.parse(time);
           return start;
       }
    }


//车站的创建

   public  Node createTrainNode(String msg){

        if(msg.isEmpty() || msg.length()==0){
            return null;
        }
        String[] arr =  msg.split(",");
        Node node1 = new Node("");
        Node nodeHead = node1;
        for(String s : arr){
           Node node = new Node(s);
           node1.setNext(node);
           node1 = node;
        }
        System.out.println(nodeHead.getNext().toString());
        return nodeHead.getNext();
   }


    public static void main(String[] args) throws ParseException{

    }
}
