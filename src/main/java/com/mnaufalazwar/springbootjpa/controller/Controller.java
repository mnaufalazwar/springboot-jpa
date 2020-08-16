package com.mnaufalazwar.springbootjpa.controller;

import com.mnaufalazwar.springbootjpa.dao.MahasiswaRepository;
import com.mnaufalazwar.springbootjpa.entity.Mahasiswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/con")
public class Controller {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public String insert(@RequestBody Mahasiswa mahasiswa){

        mahasiswaRepository.save(mahasiswa);

        return "success";

    }

    @RequestMapping(value = "/get-by-name", method = RequestMethod.GET)
    public List<Mahasiswa> getByName(@RequestParam(value = "nama") String nama){

        return mahasiswaRepository.findByNamaContaining(nama);

    }

}
