package order.Dao;

import order.Do.Train;

import java.text.ParseException;

/**
 欢迎来到XX高铁订票系统
 ================================
 ===       1.查询当前车次       ===
 ===       2.选 择 车 次       ===
 ===       3.购 买 车 票       ===
 ================================*/
public interface WinChooseTrain {

    // ===       1.查询当前车次       ===
    public Train[] SearchTrain(String startLocal, String endLocal) throws ParseException;

    // ===       2.选 择 车 次       ===
    public Train ChooseTrain();
}
