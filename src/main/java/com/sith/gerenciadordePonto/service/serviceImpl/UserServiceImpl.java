package com.sith.gerenciadordePonto.service.serviceImpl;

import com.sith.gerenciadordePonto.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sith.gerenciadordePonto.repository.UserRepository;
import com.sith.gerenciadordePonto.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Usuarios> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Usuarios findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Usuarios save(Usuarios usuarios) {

        Usuarios savos = userRepository.save(usuarios);
        System.out.println(savos.getId());
        return savos;

    }



}
