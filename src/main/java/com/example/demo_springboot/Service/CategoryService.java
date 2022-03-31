package com.example.demo_springboot.Service;

import com.example.demo_springboot.Dto.CategoryDto;
import com.example.demo_springboot.Modal.CategoryModal;

import java.util.List;

public interface CategoryService {
    public List<CategoryModal> getAll();
    public void createOrUpdateCategory(CategoryModal categoryModal);
    public void removeCategory(Integer id);
    public List<CategoryDto> getListByDto();
}
