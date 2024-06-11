package com.sharath.runner;

import com.sharath.dto.MobileDto;
import com.sharath.repo.MobileRepo;
import com.sharath.repo.MobileRepoImpl;

public class MobileRunner {

	public static void main(String[] args) {

		MobileRepo repo = new MobileRepoImpl();

		MobileDto d1 = new MobileDto(1, "Sony", "White", 123333);
		MobileDto d2 = new MobileDto(2, "Xiomi", "Black", 223333);
		MobileDto d3 = new MobileDto(3, "Samsung", "Red", 323333);
		MobileDto d4 = new MobileDto(4, "Oppo", "Green", 423333);
		MobileDto d5 = new MobileDto(5, "Vivo", "Blue", 523333);

//////////////////////==--------------------saveandsaveall-----------------------------------//
//		repo.saveAndSaveAll(d1,d2,d3,d4,d5);

//		repo.saveAndSaveAll(d2,d5);
//		-------------------------------------readAll--------------------------------------------

//		for (MobileDto d : repo.readAll()) {
//			System.out.println(d);
//		}


//	==================================================readByName(Vararg)========================
		
//		System.out.println(repo.readByName("Xiomi","Oppo"));
		
		
//		====================================readById(varArg---------------------------
		
//				for(MobileDto d :repo.readById(1,3,5)) {
//					System.out.println(d);
//					
//				}
	
		
		
//		===========================updatePriceByName==============================
		
//		System.out.println(repo.updatePriceByName(54545455, "samsung")?"updated successfully" : "failed");
		
		
//		==========================deleteByName----------------------------------------
		
//		System.out.println(repo.deleteByName("xiomi")?"deleted successfully" : "failed deleted");
	}

}
