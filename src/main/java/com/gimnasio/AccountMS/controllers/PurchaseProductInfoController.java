package com.gimnasio.AccountMS.controllers;


import com.gimnasio.AccountMS.models.PurchaseProductInfo;
import com.gimnasio.AccountMS.repositories.PurchaseProductInfoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PurchaseProductInfoController {
    private final PurchaseProductInfoRepository purchaseProduct;

    public PurchaseProductInfoController(PurchaseProductInfoRepository purchaseProduct) {
        this.purchaseProduct = purchaseProduct;
    }

    @GetMapping("purchase/{product}")
    public Optional<PurchaseProductInfo> getPurchaseProductInfo(@PathVariable String product){
        return this.purchaseProduct.findById(product);
    }

    @PostMapping("/purchase")
    public PurchaseProductInfo newPurchaseProduct(@RequestBody PurchaseProductInfo purchaseProductInfo){
        return this.purchaseProduct.save(purchaseProductInfo);
    }

    @DeleteMapping("/purchase/{product}")
    public void deletePurchaseProduct(@PathVariable String product){
        purchaseProduct.deleteById(product);
    }

    @PutMapping("/purchase/{product}")
    public PurchaseProductInfo updatePurchaseProductInfo(@PathVariable String product, @RequestBody PurchaseProductInfo new_PurchaseProductInfo){
        PurchaseProductInfo old_purchaseProductInfo = purchaseProduct.findById(product).orElse(null);

        old_purchaseProductInfo.setProduct(new_PurchaseProductInfo.getProduct());
        old_purchaseProductInfo.setProductValue(new_PurchaseProductInfo.getProductValue());
        old_purchaseProductInfo.setPurchaseDate(new_PurchaseProductInfo.getPurchaseDate());
        return purchaseProduct.save(old_purchaseProductInfo);
    }
}

