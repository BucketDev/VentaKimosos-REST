package sales.kimosos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sales.kimosos.catalog.Product;

@RestController
public class ProductController {

    @RequestMapping("/product")
    public Product showProduct() {
        return new Product(1, "Bandana");
    }

}
