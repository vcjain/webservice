/**
 * 
 */
package com.vcjain.cxfclient;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceFactory;

import com.vcjain.cxfsoap.Employee;
import com.vcjain.cxfsoap.ObjectFactory;

/**
 * @author vcjain
 * 
 */
public class DIIClient {

	public static void main(String[] args) throws Exception {
		String namespace = "http://cxfsoap.vcjain.com/";
		String serviceName = "EmpService";
		URL wsdlURL = new URL("http://localhost:8080/cxfsoap/emp?wsdl");

		QName serviceQN = new QName(namespace, serviceName);
		QName portName = new QName(namespace,
				"EmpServicePort");
		QName operationName = new QName("http://cxfsoap.vcjain.com/", "addEmp");

		ServiceFactory factory = ServiceFactory.newInstance();
		Service service = factory.createService(wsdlURL, serviceQN);

		Call call = service.createCall(portName, operationName);
		Employee emp = new ObjectFactory().createEmployee();
		emp.setFirstName("ABC");
		Object[] inputParams = new Object[] { emp };
		String name = (String) call.invoke(inputParams);
		System.out.println("The Name is = " + name);
	}
}
