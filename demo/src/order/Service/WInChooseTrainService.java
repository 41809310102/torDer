package order.Service;

import order.Dao.WinChooseTrain;
import order.Do.Node;
import order.Do.Train;

import java.text.ParseException;

public class WInChooseTrainService implements WinChooseTrain {
    @Override
    public Train SearchTrain(String startLocal, String endLocal) throws ParseException {
        WorkDaoService service = new WorkDaoService();
        Train[] list = new Train[5];
        Train[] res = service.createTrains("D0001","和谐号列车1","西安,汉中,安康,杭州,上海");
        Train[] res1 =service.createTrains("D0002","和谐号列车2","宝鸡,汉中,安康,杭州,上海");
        Train[] res2 =service.createTrains("D0003","和谐号列车3","洛阳,汉中,安康,杭州,上海");
        Train[] res3 =service.createTrains("D0004","和谐号列车4","郑州,汉中,安康,杭州,上海");
        Train[] res4 = service.createTrains("D0005","和谐号列车5","武汉,汉中,安康,杭州,上海");
        list[0] = res[0];
        list[1] = res1[0];
        list[2] = res2[0];
        list[3] = res3[0];
        list[4] = res4[0];
        for(int i = 0;i<5;i++){
         Node heasd = list[i].getArr();
            if(heasd.getName().equals(startLocal)){
                while (heasd.getNext()!=null){
                     if(heasd.getNext().getName().equals(endLocal)){
                         System.out.println(list[i].toString());
                         return list[i];
                     }else{
                         heasd = heasd.getNext();
                     }
                }
            }
        }

        return null;
    }

    @Override
    public Train ChooseTrain() {
        return null;
    }
}
