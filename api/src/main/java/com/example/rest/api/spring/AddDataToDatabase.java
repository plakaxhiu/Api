package com.example.rest.api.spring;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.rest.api.entity.CatergoryType;
import com.example.rest.api.entity.Product;
import com.example.rest.api.entity.User;
import com.example.rest.api.entity.UserType;
import com.example.rest.api.persistence.repository.ProductRepository;
import com.example.rest.api.persistence.repository.UserRepository;
import com.example.rest.api.service.IProductService;
import com.example.rest.api.service.IUserService;

@Component
public class AddDataToDatabase implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;
	@Autowired
	IUserService iUserService;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	IProductService iProductService;

	@Override
	public void run(String... args) throws Exception {
		List<User> allUsers = iUserService.getAllUser();
		if (allUsers.size() == 0) {
			for (int i = 1; i < 3; i++) {
				User addUser = new User();
				addUser.setUsername("emp" + i);
				addUser.setLastname("empsur" + i);
				addUser.setNickname("empnic" + i);
				addUser.setUserType(UserType.CUSTOMER);
				userRepository.save(addUser);

			}
			for (int j = 0; j < 4; j++) {
				User addUser = new User();
				addUser.setUsername("cus" + j);
				addUser.setLastname("cussur" + j);
				addUser.setNickname("cusnic" + j);
				addUser.setUserType(UserType.CUSTOMER);
				userRepository.save(addUser);
			}
		}
		List<Product> allProducts = iProductService.getAllPro();
		if (allProducts.size() == 0) {
			for (int k = 1; k < 3; k++) {
				Product addProduct = new Product();
				addProduct.setName("pro" + k);
				addProduct.setQuantity(k + 10);
				addProduct.setDescription("Product Example" + k);
				addProduct.setUuid(UUID.randomUUID().toString());
				addProduct.setCatergoryType(CatergoryType.AUTOMOTIVE);
				addProduct.setCreatedDate(new Date());
				addProduct.setLastModifiedDate(new Date());
				addProduct.setCreatedBy("Auto");
				addProduct.setLastModifiedBy("Auto");
				productRepository.save(addProduct);

			}
			for (int l = 0; l < 3; l++) {
				Product addProduct = new Product();
				addProduct.setName("name" + l);
				addProduct.setQuantity(l + 10);
				addProduct.setDescription("Product Example" + l);
				addProduct.setUuid(UUID.randomUUID().toString());
				addProduct.setCatergoryType(CatergoryType.BRICOLAGE);
				addProduct.setCreatedDate(new Date());
				addProduct.setLastModifiedDate(new Date());
				addProduct.setCreatedBy("Auto");
				addProduct.setLastModifiedBy("Auto");
				productRepository.save(addProduct);

			}
			for (int m = 0; m < 3; m++) {
				Product addProduct = new Product();
				addProduct.setName("mame" + m);
				addProduct.setQuantity(m + 10);
				addProduct.setDescription("Product Example" + m);
				addProduct.setUuid(UUID.randomUUID().toString());
				addProduct.setCatergoryType(CatergoryType.GARDEN);
				addProduct.setCreatedDate(new Date());
				addProduct.setLastModifiedDate(new Date());
				addProduct.setCreatedBy("Auto");
				addProduct.setLastModifiedBy("Auto");
				productRepository.save(addProduct);

			}
			for (int n = 0; n < 3; n++) {
				Product addProduct = new Product();
				addProduct.setName("name" + n);
				addProduct.setQuantity(n + 10);
				addProduct.setDescription("Product Example");
				addProduct.setUuid(UUID.randomUUID().toString());
				addProduct.setCatergoryType(CatergoryType.TOOLS);
				addProduct.setCreatedDate(new Date());
				addProduct.setLastModifiedDate(new Date());
				addProduct.setCreatedBy("Auto");
				addProduct.setLastModifiedBy("Auto");
				productRepository.save(addProduct);

			}
			for (int o = 0; o < 3; o++) {
				Product addProduct = new Product();
				addProduct.setName("name" + o);
				addProduct.setQuantity(o + 10);
				addProduct.setDescription("Product Example");
				addProduct.setUuid(UUID.randomUUID().toString());
				addProduct.setCatergoryType(CatergoryType.WOODWORKING);
				addProduct.setCreatedDate(new Date());
				addProduct.setLastModifiedDate(new Date());
				addProduct.setCreatedBy("Auto");
				addProduct.setLastModifiedBy("Auto");
				productRepository.save(addProduct);

			}
			for (int p = 0; p < 3; p++) {
				Product addProduct = new Product();
				addProduct.setName("name" + p);
				addProduct.setQuantity(p + 10);
				addProduct.setDescription("Product Example");
				addProduct.setUuid(UUID.randomUUID().toString());
				addProduct.setCreatedDate(new Date());
				addProduct.setLastModifiedDate(new Date());
				addProduct.setLastModifiedBy("Auto");
				addProduct.setCreatedBy("Auto");
				productRepository.save(addProduct);
				
			}

		}

	}
}