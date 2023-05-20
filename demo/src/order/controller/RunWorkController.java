package order.controller;

import order.Do.Train;
import order.Do.User;
import order.Service.WInChooseTrainService;
import order.Service.WorkDaoService;

import java.text.ParseException;
import java.util.Scanner;

public class RunWorkController {

    WorkDaoService service = new WorkDaoService();

    WInChooseTrainService wInChooseTrainService = new WInChooseTrainService();

    public void  Sign(){
        User user = new User(1);
        service.sign(user);
    }

    public void  searchUserinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要搜索的用户id:");
        int id = scanner.nextInt();
        service.searchUserInfo(id);
    }

    public void  login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要登录用户昵称:");
        String name = scanner.nextLine();
        System.out.print("请输入该用户密码:");
        String passeword = scanner.nextLine();
        User user = new User(0);
        user.setName(name);
        user.setPassword(passeword);
        service.login(user);
    }


   public Train[] SearchTrain(String startLocal, String endLocal) throws ParseException {
        return wInChooseTrainService.SearchTrain(startLocal,endLocal);
   }


    public static void main(String[] args) throws ParseException {


    }
}
