package com.sharath.pencilDto;

import java.util.Iterator;

import com.sharath.pencilRepo.PencilRepo;
import com.sharath.pencilRepo.PencilRepoImpl;

public class PencilRunner {

	public static void main(String[] args) {

		PencilRepo repo = new PencilRepoImpl();
		PencilDto d1 = new  PencilDto(1, "camel","1mm","normal", 7);
		PencilDto d2 = new  PencilDto(2, "Nataraja","1mm","normal", 6);
//		repo.save(d1);
//		System.out.println(repo.save(d10));
		
		PencilDto d3 = new  PencilDto(3, "Apsara","1mm","normal", 8);
		PencilDto d4 = new  PencilDto(4, "camel","1.5mm","normal", 9);
		PencilDto d5 = new  PencilDto(5, "Classmate","1mm","normal", 9);
		PencilDto d6 = new  PencilDto(6, "Reynolds","1mm","normal", 8);
		PencilDto d7 = new  PencilDto(7, "Apsara","0.5mm","normal", 4);
		PencilDto d8 = new  PencilDto(8, "Natraja","1.5mm","normal", 9);
		PencilDto d9 = new  PencilDto(9, "camel","0.5mm","normal", 5);
		PencilDto d10 = new  PencilDto(10, "Supreme","1mm","normal", 7);
		
//		repo.saveAll(d3,d4,d5,d6,d7,d8,d9,d10);
//		repo.save(d10);
//		
		
//		=================================readAll=========================================
		
//		for(PencilDto d :repo.readAll())
//		{
//			System.out.println();
//		}
//		
		
//		==================================readByName-====================================
		
//		for(PencilDto d :repo.readByName("nataraja"))
//		{
//			System.out.println(d);
//		}
		
		//========================================readById-using vararg================================
//		for(PencilDto d :repo.readById(1,4,7,8))
//		{
//			System.out.println(d);
//		}

//==================================updatePriceByName=========================================
		
//		System.out.println(repo.updatePriceByName(11,"Supreme"));
		
		
		
//		==================================deleteByNamePriceAndMm=================================
				System.out.println(repo.deleteByNamePriceAndMm("Supreme",7,"1mm"));
	}

}
