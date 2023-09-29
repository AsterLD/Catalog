package com.ld.catalog.service.iml;

import com.ld.catalog.dto.ItemDTO;
import com.ld.catalog.entity.Item;
import com.ld.catalog.repo.ItemRepository;
import com.ld.catalog.service.ItemService;
import com.ld.catalog.utils.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public ItemDTO createItem(ItemDTO itemDTO) {
        Item item = Mapper.mapDTOtoItem(itemDTO);
        itemRepository.save(item);
        return itemDTO;
    }

    @Override
    public ItemDTO readItem(Long itemId) {
        return Mapper.mapItemToDTO(itemRepository.findById(itemId).orElseThrow());
    }

    @Override
    public List<ItemDTO> readAllItems() {
        List<Item> itemList = itemRepository.findAll();
        return itemList.stream().map(Mapper::mapItemToDTO).collect(Collectors.toList());
    }

    @Override
    public ItemDTO updateItem(Long itemId, ItemDTO itemDTO) {
        Item item = Mapper.mapDTOtoItem(itemDTO);
        item.setId(itemId);
        return itemDTO;
    }

    @Override
    public void deleteItemById(Long itemId) {
        if (itemRepository.existsById(itemId)) {
            itemRepository.deleteById(itemId);
        }
    }
}
