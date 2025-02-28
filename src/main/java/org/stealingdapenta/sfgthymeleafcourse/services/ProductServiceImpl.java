package org.stealingdapenta.sfgthymeleafcourse.services;


import org.springframework.stereotype.Service;
import org.stealingdapenta.sfgthymeleafcourse.domain.Author;
import org.stealingdapenta.sfgthymeleafcourse.domain.Product;
import org.stealingdapenta.sfgthymeleafcourse.domain.ProductCategory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> productMap;

    public ProductServiceImpl() {
        loadProducts();
    }

    private static Product getSpringCoreDevOps(Author jt) {
        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCourseName("Spring Core Dev-Ops");
        springCoreDevOps.setCourseSubtitle("Deploying Spring in the Enterprise and the cloud!");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("""
                Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.
                
                My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.
                
                You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jump-start your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.""");
        springCoreDevOps.setPrice(new BigDecimal("199"));
        springCoreDevOps.setImageUrl("SpringCoreDevOps.png");
        return springCoreDevOps;
    }

    private static Product getSpringCoreAdv(Author jt) {
        Product springCoreAdv = new Product();
        springCoreAdv.setId(5);
        springCoreAdv.setCourseName("Spring Core Advanced");
        springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription("""
                Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.
                
                My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.
                
                You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jump-start your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.""");
        springCoreAdv.setPrice(new BigDecimal("199"));
        springCoreAdv.setImageUrl("SpringCoreAdvanced.png");
        return springCoreAdv;
    }

    private static Product getSpringCore(Author jt) {
        Product springCore = new Product();
        springCore.setId(4);
        springCore.setCourseName("Spring Core");
        springCore.setCourseSubtitle("Spring Core - mastering Spring!");
        springCore.setAuthor(jt);
        springCore.setCourseDescription("""
                Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.
                
                My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.
                
                You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.""");
        springCore.setPrice(new BigDecimal("199"));
        springCore.setImageUrl("SpringCoreThumb.png");
        return springCore;
    }

    private static Product getThymeleaf(Author jt) {
        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("""
                Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.
                
                My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.
                
                You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.""");
        thymeleaf.setPrice(new BigDecimal("199"));
        thymeleaf.setImageUrl("ThymeleafThumb.png");
        return thymeleaf;
    }

    private static Product getSpringCoreUltimate(Author jt) {
        Product springCoreUltimate = new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("""
                Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.
                
                My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.
                
                You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.""");
        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("SpringCoreUltimateThumb.png");
        return springCoreUltimate;
    }

    private static Product getProduct(Author jt) {
        Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCourseName("Introduction to Spring");
        springIntro.setCourseSubtitle("Start Learning Spring!");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("""
                Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework.
                
                My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java.
                
                You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hot to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use.""");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        return springIntro;
    }

    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {
        return new ArrayList<>(productMap.values());
    }

    private void loadProducts() {

        Author jt = new Author();
        jt.setFirstName("John");
        jt.setLastName("Thompson");
        jt.setId(1);
        jt.setImage("instructor_jt.jpg");

        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");

        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring Core");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("Spring Boot");

        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("Thymeleaf");

        ProductCategory geapCat = new ProductCategory();
        geapCat.setId(5);
        geapCat.setCategory("G.E.A.P");

        productMap = new HashMap<>();

        Product springIntro = getProduct(jt);
        springIntro.getProductCategories().add(springIntroCat);
        springIntro.getProductCategories().add(springBootCat);
        productMap.put(1, springIntro);


        Product springCoreUltimate = getSpringCoreUltimate(jt);
        springCoreUltimate.getProductCategories().add(springCoreCat);
        springCoreUltimate.getProductCategories().add(springBootCat);
        productMap.put(2, springCoreUltimate);

        Product thymeleaf = getThymeleaf(jt);
        thymeleaf.getProductCategories().add(thymeleafCat);
        productMap.put(3, thymeleaf);

        Product springCore = getSpringCore(jt);
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        productMap.put(4, springCore);

        Product springCoreAdv = getSpringCoreAdv(jt);
        springCoreAdv.getProductCategories().add(springCoreCat);
        springCoreAdv.getProductCategories().add(springBootCat);
        productMap.put(5, springCoreAdv);

        Product springCoreDevOps = getSpringCoreDevOps(jt);
        springCoreDevOps.getProductCategories().add(springCoreCat);
        springCoreDevOps.getProductCategories().add(springBootCat);
        productMap.put(6, springCoreDevOps);

    }
}
