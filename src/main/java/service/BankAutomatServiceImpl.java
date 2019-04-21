package service;

import dao.BankAutomatDaoImpl;
import model.BankAutomat;

import java.util.List;

public class BankAutomatServiceImpl implements BankAutomatService{

    BankAutomatDaoImpl bankAutomatDao;

    @Override
    public List<BankAutomat> getBankAutomats() {
        return bankAutomatDao.findAll();
    }

    public BankAutomatServiceImpl() {

        bankAutomatDao = new BankAutomatDaoImpl();
    }
}
