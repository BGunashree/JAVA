package com.xworkz.noodle.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.noodle.dto.ProductDTO;
import com.xworkz.noodle.rule.ProductImpl;
import com.xworkz.noodle.rule.ProductService;
import com.xworkz.noodle.dto.ProductDTO;
import com.xworkz.noodle.rule.ProductImpl;
import com.xworkz.noodle.rule.ProductService;

@WebServlet(loadOnStartup=1,urlPatterns="/product")
public class ProductServlet extends HttpServlet{
	
	public ProductServlet() {
		System.out.println("no arg const of ProductServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("running service in ProductServlet");

		String companyName = req.getParameter("cname");
		String productName = req.getParameter("pname");
		String productType = req.getParameter("types");
		String productQuantity = req.getParameter("quantity");
		String productCost=req.getParameter("cost");

		int quantity=Integer.parseInt(productQuantity);
		double cost=Double.parseDouble(productCost);
		ProductService service = new ProductImpl();
		ProductDTO dto = new ProductDTO(companyName, productName, productType, quantity,cost);

		if (service.validateAndSave(dto)) {
			System.out.println("valid data");
			double total=quantity*cost;
			req.setAttribute("productName", productName);
			req.setAttribute("t", "and total is");
			req.setAttribute("total", total);
			
		} else {
			System.out.println("invalid data");

			req.setAttribute("dto", dto);

			req.setAttribute("validationError", "order is failure");
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/product.jsp");
		requestDispatcher.forward(req, res);
	}


}
