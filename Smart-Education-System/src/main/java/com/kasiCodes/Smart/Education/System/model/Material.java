package com.kasiCodes.Smart.Education.System.model;

public class Material {

    private Long id;
    private String materialName;
    private String materialUrl; 

    public Material() {
    }
    public Material(String materialName, String materialUrl) {
        this.materialName = materialName;
        this.materialUrl = materialUrl;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMaterialName() {
        return materialName;
    }
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    public String getMaterialUrl() {
        return materialUrl;
    }
    public void setMaterialUrl(String materialUrl) {
        this.materialUrl = materialUrl;
    }
    
}
