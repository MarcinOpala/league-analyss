package net.kai.leaguebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kai.leaguebackend.dao.CategoryDAO;
import net.kai.leaguebackend.dto.Category;

import org.springframework.stereotype.Repository;



@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description of television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//second category
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description of mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//third category
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description of laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {

		
		for(Category category : categories){
			
			if(category.getId() == id) return category; 
			
		}
		
		return null;
	}

}
