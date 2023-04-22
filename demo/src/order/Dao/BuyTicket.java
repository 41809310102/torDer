package order.Dao;

import order.Do.User;

public interface BuyTicket {

    int buyTicket(String name,String sfz,String phone);

    int buyBaoXian(String name,String sfz,String phone);

    int buyTicket(User user);

    int buyBaoXian(User user);
}
