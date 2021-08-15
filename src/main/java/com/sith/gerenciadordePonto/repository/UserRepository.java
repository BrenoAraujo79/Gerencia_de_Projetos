package com.sith.gerenciadordePonto.repository;

import com.sith.gerenciadordePonto.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuarios,Long> {


}
