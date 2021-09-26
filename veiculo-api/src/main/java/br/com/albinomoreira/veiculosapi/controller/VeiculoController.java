package br.com.albinomoreira.veiculosapi.controller;

import br.com.albinomoreira.veiculosapi.dto.VeiculoDTO;
import br.com.albinomoreira.veiculosapi.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/veiculo")
    public List<VeiculoDTO> getveiculos(){
        List<VeiculoDTO> veiculos = veiculoService.getAllVeiculos();
        return veiculos;
    }

    @GetMapping("/veiculo/{placa}")
    VeiculoDTO findVeiculoByPlaca(@PathVariable String placa){
        return veiculoService.findVeiculoByPlaca(placa);
    }

    @PostMapping("/veiculo")
    public VeiculoDTO cadastraNovoVeiculo(@RequestBody VeiculoDTO veiculoDTO){
        return veiculoService.save(veiculoDTO);
    }
}
