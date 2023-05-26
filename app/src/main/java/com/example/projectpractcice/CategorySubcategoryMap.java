package com.example.projectpractcice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategorySubcategoryMap {

    public static void main(String[] args) {
        // Creating a HashMap with key: List<CategoryModelClass> and value: String
        HashMap<List<CategoryModelClass>, String> categorySubcategoryMap = new HashMap<>();

        // Creating sample CategoryModelClass objects
        CategoryModelClass category1 = new CategoryModelClass("Category 1");
        CategoryModelClass category2 = new CategoryModelClass("Category 2");
        CategoryModelClass category3 = new CategoryModelClass("Category 3");

        // Creating sample subcategories
        String subcategory1 = "Subcategory 1";
        String subcategory2 = "Subcategory 2";
        String subcategory3 = "Subcategory 3";

        // Creating a list of CategoryModelClass objects
        List<CategoryModelClass> categories1 = new ArrayList<>();
        categories1.add(category1);
        categories1.add(category2);

        List<CategoryModelClass> categories2 = new ArrayList<>();
        categories2.add(category1);
        categories2.add(category3);

        // Adding mappings to the HashMap
        categorySubcategoryMap.put(categories1, subcategory1);
        categorySubcategoryMap.put(categories2, subcategory2);

        // Retrieving values from the HashMap
        String subcategoryValue1 = categorySubcategoryMap.get(categories1);
        String subcategoryValue2 = categorySubcategoryMap.get(categories2);

        System.out.println("Subcategory for categories1: " + subcategoryValue1); // Output: Subcategory 1
        System.out.println("Subcategory for categories2: " + subcategoryValue2); // Output: Subcategory 2
    }

}
