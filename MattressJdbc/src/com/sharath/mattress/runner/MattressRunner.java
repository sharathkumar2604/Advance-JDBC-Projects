package com.sharath.mattress.runner;

import com.sharath.mattress.MattressDto;
import com.sharath.mattress.Service.MattressService;
import com.sharath.mattress.Service.MattressServiceImpl;

public class MattressRunner {
	
	
	public static void main(String[] args) {
		MattressService service = new MattressServiceImpl();
		
		MattressDto d1 = new MattressDto(1,"Sleepwell","King-Size","Foam",12000.000);
		MattressDto d2 = new MattressDto(2,"WakeFit","King-Size","Foam",11000.000);
		MattressDto d3 = new MattressDto(3,"DuroFlex","King-Size","Foam",12499.000);
		MattressDto d4 = new MattressDto(4,"Nilkamal","King-Size","Foam",15099.000);
		MattressDto d5 = new MattressDto(5,"Sleepwell","Queen-Size","Foam",8999.000);
		MattressDto d6 = new MattressDto(6,"DuroFlex","Queen-Size","Foam",9000.000);
		MattressDto d7 = new MattressDto(7,"WakeFit","Queen-Size","Foam",70000.000);
		MattressDto d8 = new MattressDto(8,"Flo","King-Size","Foam",12999.000);
		MattressDto d9 = new MattressDto(9,"Flo","Queen-Size","Foam",9999.000);
		MattressDto d10 = new MattressDto(10,"Nilkamal","Queen-Size","Foam",12999.000);
		
		
		
		
		
//		service.saveAndSaveAll(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
		
//		System.out.println(service.readById(4));
		
		
//		for(MattressDto c : service.readAll())
//		{
//			System.out.println(c);
//		}
		
		
//		System.out.println(service.readByName("Wakefit"));
		
//		service.updatePriceAndMaterialByName(10000.000, "coir-foam", "DuroFlex");
		
		
		service.deleteByName("Nilkamal");
		
		
		
	}

}
