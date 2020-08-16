package com.mnaufalazwar.springbootjpa.dao;

import com.mnaufalazwar.springbootjpa.entity.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, String> {

    public List<Mahasiswa> findByNamaContaining(String nama);

}
