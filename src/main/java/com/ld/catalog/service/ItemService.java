package com.ld.catalog.service;

import com.ld.catalog.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    ItemDTO createItem(ItemDTO itemDTO);

    ItemDTO readItem(Long itemId);

    List<ItemDTO> readAllItems();

    ItemDTO updateItem(Long itemId, ItemDTO itemDTO);

    void  deleteItemById(Long itemId);

}
