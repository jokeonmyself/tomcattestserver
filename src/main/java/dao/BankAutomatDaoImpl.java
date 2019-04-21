package dao;

import model.BankAutomat;

import java.util.ArrayList;
import java.util.List;

public class BankAutomatDaoImpl implements BankAutomatDao {

    @Override
    public List<BankAutomat> findAll() {

        List<BankAutomat> bankAutomats = new ArrayList<>();

        bankAutomats.add(new BankAutomat(55.782978, 37.640660));
        bankAutomats.add(new BankAutomat(55.834548, 37.645708));
        bankAutomats.add(new BankAutomat(55.834548, 37.645708));
        bankAutomats.add(new BankAutomat(55.869270, 37.590909));
        bankAutomats.add(new BankAutomat(55.651877, 37.506056));
        bankAutomats.add(new BankAutomat(55.637794, 37.656173));
        bankAutomats.add(new BankAutomat(55.637794, 37.656173));
        bankAutomats.add(new BankAutomat(55.749410, 37.582127));
        bankAutomats.add(new BankAutomat(55.636164, 37.794102));
        bankAutomats.add(new BankAutomat(55.625567, 37.716055));

        return bankAutomats;
    }
}
