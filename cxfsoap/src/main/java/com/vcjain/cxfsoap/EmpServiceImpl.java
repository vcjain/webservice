/**
 * 
 */
package com.vcjain.cxfsoap;

import javax.jws.WebService;

/**
 * @author vcjain
 * @param <Employee>
 *
 */
@WebService(endpointInterface = "com.vcjain.cxfsoap.EmpService")
public class EmpServiceImpl implements EmpService{

	@Override
	public String addEmp(Employee employee) throws NameMisMatchException {
		System.out.println("Employe "+employee.getFirstName()+" "+employee.getLastName());
		if(employee.getFirstName().equals(employee.getLastName())){
			throw new NameMisMatchException(101,"LastName and FirstName cant be equal");
		}
		return "Hello "+employee.getFirstName();
	}

}
