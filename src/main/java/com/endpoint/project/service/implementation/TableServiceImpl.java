package com.endpoint.project.service.implementation;

import com.endpoint.project.entity.Table;
import com.endpoint.project.repository.TableRepository;
import com.endpoint.project.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository;

    @Autowired
    public TableServiceImpl(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    // add other CRUD methods here
}