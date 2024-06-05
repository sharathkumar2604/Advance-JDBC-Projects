package com.sharath.mobile.runner;

import java.util.ArrayList;
import java.util.List;

import com.sharath.mobile.dto.MobileDto;
import com.sharath.mobile.service.MobileService;
import com.sharath.mobile.service.MobileServiceImpl;

public class MobileRunner {

	public static void main(String[] args) {

		MobileService service = new MobileServiceImpl() ;
		
		
		MobileDto d1= new MobileDto(1,"Mi","red",12000,"1");
		MobileDto d2= new MobileDto(2,"RedMi","black",16000,"1");
		MobileDto d3= new MobileDto(3,"Motorola","Green",22000,"1");
		MobileDto d4= new MobileDto(4,"Poco","black",32000,"1");
		MobileDto d5= new MobileDto(5,"Apple","naturalTitanium",132000,"1");
		MobileDto d6= new MobileDto(6,"Samsung","blue",11200,"1");
		MobileDto d7= new MobileDto(7,"Oppo","purple",11300,"1");
		MobileDto d8= new MobileDto(8,"Vivo","light green",19000,"1");
		MobileDto d9= new MobileDto(9,"Sony","yellow",42000,"1");
		MobileDto d10= new MobileDto(10,"iqoo","red",19000,"1");
		MobileDto d11= new MobileDto(11,"Vivo","light green",19000,"1");
		MobileDto d12= new MobileDto(12,"Sony","yellow",42000,"1");
		MobileDto d13= new MobileDto(13,"iqoo","red",19000,"1");
		
//		service.save(d1);
		
		
//		MobileDto[] dd = {d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13};
//
//		for(MobileDto dto :dd)
//		{
//			service.save(dto);
//		}
//		
		//////////////////////saveall/////////////////////////////////////////////////////---------------------------------------
//		List<MobileDto> dd = new ArrayList<MobileDto>();
//		dd.add(d11);
//		dd.add(d12);
//		dd.add(d13);
//		
//		service.saveAll(dd);
		
		////////////=====================readAll==============================================
//		for(MobileDto d :service.readAll())
//		
//		{
//			
//			System.err.println(d);
//		}
//		
//		
//		
		
//		for(MobileDto d :service.readById(2,6,8))
//		{
//			System.out.println(d);
//		}
		
//		System.out.println(service.readById(2,6,8));
		
		
//		System.out.println(service.updateNameAndPriceByColor("lenovo",11111, "light green"));
		
		System.out.println(service.deleteByNamePriceAndColor("lenovo",11111, "purple"));
		
	}	
			
}
