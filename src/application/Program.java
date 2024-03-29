package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Department obj = new Department(1, "books");

		// Seller seller = new Seller(21, "bob","bob@gmail.com",new Date(), 3000.0,
		// obj);

		/*SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("**** TESTE 1: Seller findById ****");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("**** TESTE 2: Seller findByDepartment ****");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);

		}

		System.out.println("**** TESTE 3: Seller findAll ****");

		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("**** TESTE 4: Seller insert ****");

		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);

		System.out.println("insert new id = " + newSeller.getId());

		System.out.println("**** TESTE 5: Seller update ****");

		
		seller = sellerDao.findById(1);
		seller.setName("marta waine");
		sellerDao.update(seller);

		System.out.println("update complete");
		
		System.out.println("**** TESTE 6: Seller delete ****");
		System.out.println("entre com o id para deletar:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete complete");*/		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department newDepartment = new Department(null, "Comercial");
		departmentDao.insert(newDepartment);

		System.out.println("insert new id = " + newDepartment.getId());
		sc.close();

	}

}
