package br.com.albinomoreira.veiculosapi.controller;

import br.com.albinomoreira.veiculosapi.dto.AbastecimentoDTO;
import br.com.albinomoreira.veiculosapi.dto.VeiculoDTO;
import br.com.albinomoreira.veiculosapi.service.AbastecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbastecimentoController {

    @Autowired
    private AbastecimentoService abastecimentoService;

    @GetMapping("/abastecimento")
    public List<AbastecimentoDTO> getAbastecimentos(){
        List<AbastecimentoDTO> abastecimentos = abastecimentoService.findAllAbastecimentos();
        return abastecimentos;
    }

    @GetMapping("/abastecimento/{placa}")
    List<AbastecimentoDTO> findAbastecimentoByPlaca(@PathVariable String placa){
        return abastecimentoService.findAbastecimentoByPlaca(placa);
    }

    @PostMapping("/abastecimento")
    public AbastecimentoDTO cadastraNovoVeiculo(@RequestBody AbastecimentoDTO abastecimentoDTO){
        return abastecimentoService.save(abastecimentoDTO);
    }
}
