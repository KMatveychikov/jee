package com.geekbrains.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PriceList extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(PriceList.class);





    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET");
        Map<String, Integer> priceList = new HashMap<String, Integer>();
        priceList.put("Apples",100);
        priceList.put("Percimons",150);
        priceList.put("Cucumbers",140);
        priceList.put("Cabbage",120);
        priceList.put("Chocolate",150);
        priceList.put("potato",10);
        priceList.put("Grape",190);
        priceList.put("Coconut",180);
        priceList.put("Carrot",50);
        priceList.put("Mango",200);
        resp.getWriter().printf("<html> <meta content=\"text/html; charset=utf-8\">");
        for (Map.Entry<String, Integer> item:priceList.entrySet()) {
            resp.getWriter().printf("<h1> %s , price %s </h1>\n", item.getKey(), item.getValue());

        }
        resp.getWriter().printf("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("Log: POST");
        resp.getWriter().printf("<html><body><h1>New POST request</h1></body></html>");
    }

    @Override
    public void destroy() {
        logger.debug("Destroy");
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}