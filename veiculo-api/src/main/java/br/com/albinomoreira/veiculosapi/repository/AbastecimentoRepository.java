package br.com.albinomoreira.veiculosapi.repository;

import br.com.albinomoreira.veiculosapi.model.Abastecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long> {
    List<Abastecimento> findAllByPlaca(String placa);
}
