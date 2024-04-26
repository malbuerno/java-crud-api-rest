package com.malbuerno.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malbuerno.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends  JpaRepository<Producto, Long>{

}
