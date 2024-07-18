package com.yash.productcart.mapper;

import com.yash.productcart.model.Product;
import com.yash.productcart.model.ProductCart;
import com.yash.productcart.model.ProductCartDto;
import com.yash.productcart.model.ProductRating;

import java.util.ArrayList;
import java.util.List;

public class ProductCartMapper {

    public static List<ProductCartDto> mapToProductCartDetail(List<ProductCart> productCart, List<Product> product, List<ProductRating> productRating) {
        ProductCartDto productCartMapper = new ProductCartDto();
        productCartMapper.setProductCart(new ArrayList<>(productCart));
        productCartMapper.setProduct(new ArrayList<>(product));
        productCartMapper.setProductRating(new ArrayList<>(productRating));
        List<ProductCartDto> list = new ArrayList<>();
        list.add(productCartMapper);
        return list;
    }

}
