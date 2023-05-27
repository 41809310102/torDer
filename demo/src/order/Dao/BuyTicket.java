package order.Dao;

import order.Do.Order;
import order.Do.Train;
import order.Do.User;

public interface BuyTicket {

    int buyTicket(String name, String sfz, String phone);

    int buyBaoXian(String name,String sfz,String phone);

    //买车票
    Order buyTicket(User user, Train train);

    int buyBaoXian(User user);
}
