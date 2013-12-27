package com.vcjain.cxfsoap;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface EmpService {
    String addEmp(@WebParam(name="employee")Employee emp) throws NameMisMatchException;
}

