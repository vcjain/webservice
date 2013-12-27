package com.vcjain.cxfsoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2013-12-27T11:25:37.726+05:30
 * Generated source version: 3.0.0-milestone1
 * 
 */
@WebService(targetNamespace = "http://cxfsoap.vcjain.com/", name = "EmpService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EmpService {

    @WebResult(name = "response", targetNamespace = "http://cxfsoap.vcjain.com/", partName = "response")
    @WebMethod
    public java.lang.String addEmp(
        @WebParam(partName = "employee", name = "employee")
        Employee employee
    ) throws NameMisMatchException;
}