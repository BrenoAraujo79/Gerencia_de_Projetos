package com.sith.gerenciadordePonto.service;
import com.sith.gerenciadordePonto.model.Usuarios;

import java.util.List;


public interface UserService {

        public List<Usuarios> findAll();

        public Usuarios findById(Long id);

        public Usuarios save(Usuarios usuarios);

        public void delete();

        public void deleteById(Long id);

}

