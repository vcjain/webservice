/**
 * 
 */
package com.vcjain.cxfclient;

import com.vcjain.cxfsoap.EmpService;
import com.vcjain.cxfsoap.EmpService_Service;
import com.vcjain.cxfsoap.Employee;
import com.vcjain.cxfsoap.NameMisMatchException;
import com.vcjain.cxfsoap.ObjectFactory;

/**
 * @author vcjain
 *
 */
public class EmpServiceClient {

	public static void main(String[] args) {
		
		Employee emp = new ObjectFactory().createEmployee();
		emp.setFirstName("Vikash");
		//emp.setLastName("Vikash");
		emp.setLastName("Jain");
		emp.getSubjects().add("Maths");
		emp.getSubjects().add("Chemistry");
		
		EmpService_Service ss = new EmpService_Service();
        EmpService port = ss.getEmpServicePort();
        String firstName = null;
		try {
			firstName = port.addEmp(emp);
			
		} catch (NameMisMatchException e) {
			System.out.println(e.getMessage());
		}
	    System.out.println("First Name "+firstName);
		
	}
}
