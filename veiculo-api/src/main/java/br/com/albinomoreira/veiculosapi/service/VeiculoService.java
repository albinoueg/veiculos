package br.com.albinomoreira.veiculosapi.service;

import br.com.albinomoreira.veiculosapi.dto.VeiculoDTO;
import br.com.albinomoreira.veiculosapi.exception.VeiculoNotFoundException;
import br.com.albinomoreira.veiculosapi.model.Veiculo;
import br.com.albinomoreira.veiculosapi.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<VeiculoDTO> getAllVeiculos() {
        List<Veiculo> veiculos = veiculoRepository.findAll();
        return veiculos.stream().map(VeiculoDTO::convert).collect(Collectors.toList());
    }

    public VeiculoDTO findVeiculoByPlaca(String placa) {
        Optional<Veiculo> veiculo = veiculoRepository.findVeiculoByPlaca(placa);
        if(veiculo.isPresent()){
            return VeiculoDTO.convert(veiculo.get());
        }
        throw new VeiculoNotFoundException();
    }

    public VeiculoDTO save(VeiculoDTO veiculoDTO) {
        Veiculo veiculo = veiculoRepository.save(Veiculo.convert(veiculoDTO));
        return VeiculoDTO.convert(veiculo);
    }
}
