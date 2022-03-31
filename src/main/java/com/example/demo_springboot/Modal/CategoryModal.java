package com.example.demo_springboot.Modal;

import java.util.ArrayList;
import java.util.List;

public class CategoryModal {
    private Integer id;
    private String name;
    private String code;
    private boolean isActive;
    private String parentCode;
    public static List<CategoryModal> lstCategoryModal = null;

    static {
        lstCategoryModal = new ArrayList<CategoryModal>();
        lstCategoryModal.add(new CategoryModal(0, "Thời sự", "TS", true, null));
        lstCategoryModal.add(new CategoryModal(1, "Góc nhìn", "GN", true, null));
        lstCategoryModal.add(new CategoryModal(2, "Thế giới", "TG", true, null));
        lstCategoryModal.add(new CategoryModal(3, "Chính trị", "CT", true, "TS"));
        lstCategoryModal.add(new CategoryModal(4, "Dân sinh", "DS", true, "TS"));
        lstCategoryModal.add(new CategoryModal(5, "Covid 19", "C19", true, "GN"));
        lstCategoryModal.add(new CategoryModal(6, "Nga vs Ukr", "NVU", true, "TG"));
    }

    public CategoryModal() {
    }

    public CategoryModal(Integer id, String name, String code, boolean isActive, String parentCode) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.isActive = isActive;
        this.parentCode = parentCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
