package com.mallcai.domain.category.front.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class FrontCategoryAssociatedItemQueryRequest implements Serializable {
    private static final long serialVersionUID = 8398165784498861890L;

    /**
     * 类目ID
     */
    private Long categoryId;

}
