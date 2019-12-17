package com.zackstore.zackapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZackapiApplication {

	public static void main(String[] args) {

		try {			

			Connection conn = DriverManager.getConnection("jdbc:sqlite:zackstore.db");
			System.out.println("Opened database successfully");

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM product");

			while (rs.next()) {
				Product prod = new Product(rs.getInt(1), rs.getString(2), Product.SECTION.values()[rs.getInt(3)], Product.PROVENANCE.values()[rs.getInt(4)]);
				ProductService.addProToList(prod);

			}
			rs.close();
			stmt.close();
			conn.close();				

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());			
		}	


		SpringApplication.run(ZackapiApplication.class, args);
	}

}
