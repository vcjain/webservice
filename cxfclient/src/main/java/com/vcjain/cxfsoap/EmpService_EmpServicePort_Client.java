
package com.vcjain.cxfsoap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2013-12-27T11:25:37.651+05:30
 * Generated source version: 3.0.0-milestone1
 * 
 */
public final class EmpService_EmpServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://cxfsoap.vcjain.com/", "EmpService");

    private EmpService_EmpServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EmpService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        EmpService_Service ss = new EmpService_Service(wsdlURL, SERVICE_NAME);
        EmpService port = ss.getEmpServicePort();  
        
        {
        System.out.println("Invoking addEmp...");
        com.vcjain.cxfsoap.Employee _addEmp_employee = new ObjectFactory().createEmployee();
        try {
        	_addEmp_employee.setFirstName("vikash");
            java.lang.String _addEmp__return = port.addEmp(_addEmp_employee);
            System.out.println("addEmp.result=" + _addEmp__return);

        } catch (NameMisMatchException e) { 
            System.out.println("Expected exception: NameMisMatchException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
