package br.com.albinomoreira.veiculosapi.service;

import br.com.albinomoreira.veiculosapi.dto.AbastecimentoDTO;
import br.com.albinomoreira.veiculosapi.model.Abastecimento;
import br.com.albinomoreira.veiculosapi.repository.AbastecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbastecimentoService {

    @Autowired
    private AbastecimentoRepository abastecimentoRepository;

    public List<AbastecimentoDTO> findAllAbastecimentos() {
        List<Abastecimento> abastecimentos = abastecimentoRepository.findAll();
        if(abastecimentos.isEmpty()){
            return new ArrayList<>();
        }
        return abastecimentos.stream().map(AbastecimentoDTO::convert).collect(Collectors.toList());
    }

    public List<AbastecimentoDTO> findAbastecimentoByPlaca(String placa) {
        List<Abastecimento> abastecimentos = abastecimentoRepository.findAllByPlaca(placa);
        if(abastecimentos.isEmpty()){
            return new ArrayList<>();
        }
        return abastecimentos.stream().map(AbastecimentoDTO::convert).collect(Collectors.toList());
    }

    public AbastecimentoDTO save(AbastecimentoDTO abastecimentoDTO) {
        Abastecimento abastecimento = abastecimentoRepository.save(Abastecimento.convert(abastecimentoDTO));
        return AbastecimentoDTO.convert(abastecimento);
    }
}
