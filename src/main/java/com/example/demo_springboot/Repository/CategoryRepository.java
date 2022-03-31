package com.example.demo_springboot.Repository;

import com.example.demo_springboot.Dto.CategoryDto;
import com.example.demo_springboot.Modal.CategoryModal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CategoryRepository {

    public List<CategoryModal> getAll() {
        return CategoryModal.lstCategoryModal;
    }

    public void createOrUpdateCategory(CategoryModal categoryModal) {
        CategoryModal cm = null;
        if (categoryModal.getId() != null) {
            for (int i = 0; i < CategoryModal.lstCategoryModal.size(); i++) {
                cm = CategoryModal.lstCategoryModal.get(i);
                if (cm.getId() == categoryModal.getId()) {
                    cm.setName(categoryModal.getName());
                    cm.setActive(categoryModal.getActive());
                    cm.setCode(categoryModal.getCode());
                    cm.setParentCode(categoryModal.getParentCode());
                }
            }
            //            CategoryModal contain = cm;
//            CategoryModal.lstCategoryModal.stream().forEach(x->{
//                if(x.getId() == categoryModal.getId()){
//                    this.removeCategory(x.getId());
//                }
//            });
//            CategoryModal.lstCategoryModal.add(contain);
//            if(cm != null){
//                cm.setName(categoryModal.getName());
//                cm.setActive(categoryModal.getActive());
//                cm.setCode(categoryModal.getCode());
//                cm.setParentCode(categoryModal.getCode());
//
//            }
        } else {
            int id = CategoryModal.lstCategoryModal.get(CategoryModal.lstCategoryModal.size() - 1).getId() + 1;
            cm = new CategoryModal();
            cm.setId(id);
            cm.setName(categoryModal.getName());
            cm.setActive(categoryModal.getActive());
            cm.setCode(categoryModal.getCode());
            if (categoryModal.getParentCode() != "")
                cm.setParentCode(categoryModal.getParentCode());
            CategoryModal.lstCategoryModal.add(cm);
        }
    }

    public void removeCategory(Integer id) {
        CategoryModal.lstCategoryModal.removeIf(x -> x.getId() == id);
    }

    public List<CategoryModal> findChildByParentCode(String codeParent) {
        List<CategoryModal> lst = new ArrayList<>();
        for (CategoryModal cm : CategoryModal.lstCategoryModal) {
            if (cm.getParentCode() != null && cm.getParentCode().equals(codeParent)) {
                lst.add(cm);
            }
        }
        return lst;
    }

    public List<String> getAllPerentCode() {
        List<String> lstString = new ArrayList<>();
        CategoryModal.lstCategoryModal.forEach(x -> {
            if (x.getParentCode() == null) {
                lstString.add(x.getCode());
            }
        });
        return lstString;
    }
}
