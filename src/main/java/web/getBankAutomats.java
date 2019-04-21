package web;


import model.BankAutomat;
import service.BankAutomatService;
import service.BankAutomatServiceImpl;
import util.JsonConverter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GetBankAutomats", urlPatterns = {"/GetBankAutomats"})
public class getBankAutomats extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");

        ServletOutputStream out = resp.getOutputStream();

        List<BankAutomat> bankAutomatList = new BankAutomatServiceImpl().getBankAutomats();

        JsonConverter converter = new JsonConverter();
        String output = converter.convertToJson(bankAutomatList);

        out.print(output);
    }
}
