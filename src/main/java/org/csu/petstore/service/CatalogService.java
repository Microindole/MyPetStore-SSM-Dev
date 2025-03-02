package org.csu.petstore.service;

import org.csu.petstore.vo.CategoryVO;
import org.csu.petstore.vo.ItemVO;
import org.csu.petstore.vo.ProductVO;

public interface CatalogService {

    public CategoryVO getCategory(String categoryId);

    public ProductVO getProduct(String productId);

    public ItemVO getItem(String itemId);
}
