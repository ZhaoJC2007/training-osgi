package org.test.jpa.test;

import java.util.List;

import org.test.jpa.entity.User;
import org.test.jpa.service.IUserService;

/** Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or licence agreement with ST Electronics Info-comm Systems PTE. LTD.
 *
 * Project Name : test-jpa-service
 * <p>PackageName : org.test.jpa.test </p>
 * <p>ClassName   : TestJpa.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2016年9月19日T下午3:33:27</p>
 *
 * @author Jacob
 * @version 1.0
 *
 */
public class TestJpa {

	private IUserService userService;
	public void testJpa(){
//		for(int i = 0; i < 10; i++){
//			User u = new User(0,"OSGi_" + i, i + 10);
//			userService.add(u);
//		}
//		System.out.println("=========================save====================");
		List list = userService.queryAll();
		for(Object obj : list){
			System.out.println(obj.toString());
		}
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
