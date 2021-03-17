package org.adactin.pom;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecuteSearchHotel extends LoginAdactin{
public static void main(String[] args) throws IOException {
	browserConfig();
	openBrowser("http://adactinhotelapp.com/");
	maximize();
    LoginAdactin l=new LoginAdactin();
   
//	 type(l.getTxtEmail(),value);
//	 
//	 type(l.getTxtPassword(), stringCellValue2);
     click(l.getBtnLogin());
     SearchHotel s=new SearchHotel();
     dropDownSelectbyText(s.getLocation(), "Melbourne");
     dropDownSelectbyText(s.getHotels(), "Hotel Hervey");
     
}
}
