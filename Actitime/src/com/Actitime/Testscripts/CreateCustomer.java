//createcustomer this class is link with generic.Listenerimplementation.
package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.Generic.Baseclass;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;
@Listeners(com.Actitime.Generic.ListenerImplementation.class)
public class CreateCustomer extends Baseclass {

      @Test
       public void createcustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	   HomePage hp=new HomePage(driver);
	   hp.Tasklnk();
	   TaskPage tp=new TaskPage(driver);
	   tp.Addnew();
	   Thread.sleep(5000);
	   }
}

//Framework 
//types of frame work
//Data driven,modular driven,Method driven,*Hybrid framework.