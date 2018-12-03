package se.agilecourse.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import se.agilecourse.annotation.CascadeSave;

import java.util.List;

@Document(collection="products")
public class Product {

    private String id;
    private String productNumber;
    private String name;
    private String description;
    // private String company;
    // private String category;

    @DBRef
    @CascadeSave
    private List<Material> materials;

    // public String getCompany() {
    //     return company;
    // }
    // public void setCompany(String company) {
    //     this.company = company;
    // }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    // public String getCategory() {
    //     return category;
    // }

    // public void setCategory(String category) {
    //     this.category = category;
    // }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public String getBrand() {
    //     return brand;
    // }

    // public void setBrand(String brand) {
    //     this.brand = brand;
    // }
}
