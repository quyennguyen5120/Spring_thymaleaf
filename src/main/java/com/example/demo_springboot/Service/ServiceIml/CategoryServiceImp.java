package com.example.demo_springboot.Service.ServiceIml;

import com.example.demo_springboot.Dto.CategoryDto;
import com.example.demo_springboot.Modal.CategoryModal;
import com.example.demo_springboot.Repository.CategoryRepository;
import com.example.demo_springboot.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryModal> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public void createOrUpdateCategory(CategoryModal categoryModal) {
        categoryRepository.createOrUpdateCategory(categoryModal);
    }

    @Override
    public void removeCategory(Integer id) {
        categoryRepository.removeCategory(id);
    }

    @Override
    public List<CategoryDto> getListByDto() {
        List<CategoryDto> listCategoryDto = new ArrayList<>();
        for(CategoryModal x : CategoryModal.lstCategoryModal){
            if(x.getParentCode() == null || x.getParentCode() == ""){
                CategoryDto dto = new CategoryDto();
                dto.setName(x.getName());
                dto.setActive(x.getActive());
                List<CategoryModal> Childs =categoryRepository.findChildByParentCode(x.getCode());
                dto.setChilds(Childs);
                listCategoryDto.add(dto);
            }
        }
        return listCategoryDto;
    }
}
