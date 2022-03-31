package com.example.demo_springboot.Dto;

import com.example.demo_springboot.Modal.CategoryModal;

import java.util.List;

public class CategoryDto {
    public String name;
    public Boolean isActive;
    public List<CategoryModal> childs;

    public CategoryDto() {
    }

    public CategoryDto(String name, Boolean isActive, List<CategoryModal> childs) {
        this.name = name;
        this.isActive = isActive;
        this.childs = childs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<CategoryModal> getChilds() {
        return childs;
    }

    public void setChilds(List<CategoryModal> childs) {
        this.childs = childs;
    }
}
