package com.sys.org.nodeEntity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Objects;

/**
 * Created by Debasish on 23-Jan-18 8:15 AM
 */
@NodeEntity
public class Product {
    @GraphId
    private Long graphId;

    private String productName;

    public Long getGraphId() {
        return graphId;
    }

    public void setGraphId(Long graphId) {
        this.graphId = graphId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(graphId, product.graphId) &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(graphId, productName);
    }
}
