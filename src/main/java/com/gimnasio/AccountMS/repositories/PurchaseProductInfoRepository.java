package com.gimnasio.AccountMS.repositories;

import com.gimnasio.AccountMS.models.PurchaseProductInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseProductInfoRepository extends MongoRepository<PurchaseProductInfo, String> {
}
