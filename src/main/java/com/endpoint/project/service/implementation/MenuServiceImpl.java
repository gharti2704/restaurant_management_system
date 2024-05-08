package com.endpoint.project.service.implementation;

import com.endpoint.project.entity.Menu;
import com.endpoint.project.repository.MenuRepository;
import com.endpoint.project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    // add other CRUD methods here
}