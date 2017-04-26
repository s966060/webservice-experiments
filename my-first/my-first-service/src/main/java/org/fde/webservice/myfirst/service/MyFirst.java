package org.fde.webservice.myfirst.service;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;

@Stateless
@WebService
public class MyFirst {
    @WebMethod
    public List getItems()  {
        return Arrays.asList("A", "B", "C");
    }

    @WebMethod
    public void writeLog(String message) {
        System.out.println("message = " + message);
    }
}
