package se.agilecourse.repository.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import se.agilecourse.model.Company;
import se.agilecourse.model.Category;
import se.agilecourse.model.Material;
import se.agilecourse.model.Product;
import se.agilecourse.repository.CustomizedRepository;

import java.util.List;

public class CustomizedRepositoryImpl implements CustomizedRepository {

    @Autowired
    MongoTemplate mongoTemplate;


    @Override
    public List<Company> fidnBrandByCategoryId(String categoryId) {
        return null;
    }


    public List<Material> findMaterialsByProductId(String productId){
        Query query = new Query(Criteria.where("id").is(new ObjectId(productId)));
        Product product = mongoTemplate.findOne(query,Product.class,"products");
        List<Material> list = product.getMaterials();
        return list;
    }



    /*public List<String> findBrandByCategoryid(String categoryid){
        Aggregation agg = Aggregation.newAggregation(
                Aggregation.match(Criteria.where("id").is(categoryid)),
                Aggregation.group("products.brand")
        );

        AggregationResults<String> results = mongoTemplate.aggregate(agg, "categories", String.class);
        List<String> mappedResult = results.getMappedResults();
        return  mappedResult;
    }*/


      /* @Override
    public List<Product> findProductsByCategoryid(String categoryid) {
        Query query = new Query(Criteria.where("id").is(new ObjectId(categoryid)));
        Category category = mongoTemplate.findOne(query,Category.class,"categories");
        List<Product> list=category.getProducts();
        return list;
    }*/



}
