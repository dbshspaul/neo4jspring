package com.sys.org.neo4jrepository;

import com.sys.org.nodeEntity.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * Created by Debasish on 23-Jan-18 8:19 AM
 */
public interface ProductRepository extends Neo4jRepository<Product, Long> {
}
