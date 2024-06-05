package com.sharath.runner;

import java.awt.List;
import java.util.Iterator;

import com.sharath.dto.SocketDto;
import com.sharath.repo.SocketRepo;
import com.sharath.repo.SocketRepoImpl;

public class SocketRunner {

	public static void main(String[] args) {

		SocketRepo repo = new SocketRepoImpl();
		
		SocketDto d1 = new SocketDto(1,"HiFi","White",2,30);
		SocketDto d2 = new SocketDto(2,"HiFi","Black",2,35);
		SocketDto d3 = new SocketDto(3,"GM","White",2,40);
		SocketDto d4 = new SocketDto(4,"GM","Black",2,45);
		SocketDto d5 = new SocketDto(5,"Lysa","White",2,50);
		SocketDto d6 = new SocketDto(6,"Lysa","Black",2,55);
		SocketDto d7 = new SocketDto(7,"Polycab","White",2,60);
		SocketDto d8 = new SocketDto(8,"Polycab","Black",2,65);
		SocketDto d9 = new SocketDto(9,"Havells","White",2,70);
		SocketDto d10 = new SocketDto(10,"Havells","Black",2,75);
		SocketDto d11 = new SocketDto(11,"HiFi","White",3,50);
		SocketDto d12 = new SocketDto(12,"HiFi","Black",3,55);
		SocketDto d13 = new SocketDto(13,"GM","White",3,60);
		SocketDto d14 = new SocketDto(14,"GM","Black",3,65);
		SocketDto d15 = new SocketDto(15,"Lysa","White",3,70);
		SocketDto d16 = new SocketDto(16,"Lysa","Black",3,75);
		SocketDto d17 = new SocketDto(17,"Polycab","White",3,80);
		SocketDto d18 = new SocketDto(18,"Polycab","Black",3,85);
		SocketDto d19 = new SocketDto(19,"Havells","White",3,90);
		SocketDto d20 = new SocketDto(20,"Havells","Black",3,95);
		
//		repo.saveAndSaveAll(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20);
//		repo.saveAndSaveAll(d1);
		
//                            -----------readAll-----------------------
//		for(SocketDto s :repo.readAll())
//		{
//			System.out.println("--:--" + s +"--:--");
//		}
		
//		================================readBycolor======================================
		
//		for (SocketDto s :repo.readByColor("black"))
//		{System.out.println(s);
//		}

//===========================================updatePriceByNameAndColor======================

//	for(SocketDto d :repo.updatePriceByNameAndColor(100,"Havells","black"))
//		System.out.println(d);
//	
//	}

//=============================deleteByName==========================================
	
		System.out.println(repo.deleteByName("Hifi"));
		
		
}
}
