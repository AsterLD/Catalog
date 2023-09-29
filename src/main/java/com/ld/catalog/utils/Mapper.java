package com.ld.catalog.utils;

import com.ld.catalog.dto.ItemDTO;
import com.ld.catalog.entity.Item;
import org.modelmapper.ModelMapper;

public class Mapper {

    public static ItemDTO mapItemToDTO(Item item) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(item, ItemDTO.class);
    }

    public static Item mapDTOtoItem(ItemDTO itemDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(itemDTO, Item.class);
    }
}
