/* 
 * @(#)Action02BLogic.java
 *
 * Copyright (c) 2014, NTT DATA CORPORATION
 * All rights reserved.
 */

package jp.co.nttdata.project.pagemodule.logic;
import jp.co.nttdata.project.pagemodule.bean.io.InitialInputBean;
import jp.terasoluna.fw.service.thin.BLogicResult;

import org.springframework.stereotype.Controller;

@Controller("PageModule/InitialBLogic")
public class InitialBLogic extends AbstractInitialBLogic{

	@Override
	public BLogicResult execute(InitialInputBean params) {
	BLogicResult result= new BLogicResult();
               System.out.println("Hello World");
		return super.execute(params);
	}
	
}