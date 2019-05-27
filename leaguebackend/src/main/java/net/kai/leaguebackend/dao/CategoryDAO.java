package net.kai.leaguebackend.dao;

import java.util.List;

import net.kai.leaguebackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
	
	
}
