package service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Cashier {
    @RequestMapping("/cashier")
    double getTotal(double price) {
        if (price <= 0) {
            return 0;
        }
        return price >= 100 ? 0.95 * price : price;
    }
}
