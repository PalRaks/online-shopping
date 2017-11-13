package com.pall.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pall.shoppingbackend.dao.CategoryDAO;
import com.pall.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
private static List<Category> categoryList = new ArrayList<>();
static{
	Category category = new Category();
	category.setId(1);
	category.setName("Television");
	category.setDescription("This is description for television");
	category.setImageURL("CAT_1.png");
	categoryList.add(category);
	Category category1 = new Category();
	category1.setId(2);
	category1.setName("Mobile");
	category1.setDescription("This is description for Mobile");
	category1.setImageURL("CAT_2.png");
	categoryList.add(category1);
	Category category2 = new Category();
	category2.setId(3);
	category2.setName("Laptop");
	category2.setDescription("This is description for Laptop");
	category2.setImageURL("CAT_3.png");
	categoryList.add(category2);
}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		
		return categoryList;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category:categoryList){
			if(category.getId()==id)
			return category;
		}
		return null;
	}

}
