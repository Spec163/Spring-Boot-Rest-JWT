package com.billing.system.controller;

import com.billing.system.model.Tariff;
import com.billing.system.repository.TariffRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tariff")
public class TariffController {

    private final TariffRepository tariffRepository;

    public TariffController(TariffRepository tariffRepository) {
        this.tariffRepository = tariffRepository;
    }

    @GetMapping
    public List<Tariff> list() {
        return tariffRepository.findAll();
    }

    @GetMapping("{id}")
    public Tariff getOne(@PathVariable("id") Tariff tariff) {
        return tariff;
    }

    // не работает post-запрос !!! ()
    @PostMapping
    public Tariff create(@RequestBody Tariff tariff) {
        return tariffRepository.save(tariff);
    }

    @PutMapping("{id}")
    public Tariff update(
            @PathVariable("id") Tariff tariffFromDb,
            @RequestBody Tariff tariff
    ) {
        // копирование всех полей из запроса в БД, кроме "id"
        BeanUtils.copyProperties(tariff, tariffFromDb, "id");

        return tariffRepository.save(tariffFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Tariff tariff) {
        tariffRepository.delete(tariff);
    }

}
