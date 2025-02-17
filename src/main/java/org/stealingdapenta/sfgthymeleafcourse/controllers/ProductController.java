package org.stealingdapenta.sfgthymeleafcourse.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.stealingdapenta.sfgthymeleafcourse.services.ProductService;

@RequiredArgsConstructor
@Controller
public class ProductController {

    private final ProductService productService;

    @RequestMapping("/product")
    public String getProductPage() {
        return "product";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "product"; // This should match the actual Thymeleaf template file name.
    }
}
