package org.stealingdapenta.sfgthymeleafcourse.services;


import org.stealingdapenta.sfgthymeleafcourse.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
