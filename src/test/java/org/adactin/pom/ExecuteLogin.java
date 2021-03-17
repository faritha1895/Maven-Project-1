package org.adactin.pom;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

public class ExecuteLogin extends LoginAdactin {
public static void main(String[] args) throws IOException, InterruptedException {
	browserConfig();
	openBrowser("http://adactinhotelapp.com/");
	maximize();

	 LoginAdactin l=new LoginAdactin();
	 type(l.getTxtEmail(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 0));
	 type(l.getTxtPassword(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 1));
     click(l.getBtnLogin());
     
     SearchHotel s=new SearchHotel() ;
     dropDownSelectbyText(s.getLocation(), "Melbourne"); 
     dropDownSelectbyText(s.getHotels(),"Hotel Hervey");
     dropDownSelectbyText(s.getRoom_nos(),"3 - Three");
     type(s.getDatepick_in(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 2, 3));
     type(s.getDatepick_out(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 2, 4));
     dropDownSelectbyText(s.getAdult_room(), "1 - One");
     click(s.getSubmit());
     
     implicitWait(4);
     SelectHotel se=new SelectHotel();
     click(se.getRadioButton2());
     click(se.getBtnContinue());
     
     BookHotel b=new BookHotel();
     type(b.getFirst_name(), getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 0));
     type(b.getLast_name(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 1));
     type(b.getAddress(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 2));
     type(b.getCc_num(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 3));
     dropDownSelectbyValue(b.getdDcc_type(), "VISA");
     implicitWait(4);
     dropDownSelectbyText(b.getdDcc_exp_month(), "March");
     implicitWait(4);
     dropDownSelectbyText(b.getdDcc_exp_year(), "2022");
     type(b.getCc_cvv(),getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 4));
     click(b.getBtnBook_now());
}
}
 