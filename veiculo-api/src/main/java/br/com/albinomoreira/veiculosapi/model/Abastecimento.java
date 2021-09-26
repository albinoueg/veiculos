package br.com.albinomoreira.veiculosapi.model;

import br.com.albinomoreira.veiculosapi.dto.AbastecimentoDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Abastecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String placa;
    private String tipoCombustivel;
    private double quantidadeLitrosAbastecimento;
    private BigDecimal valorLitroCombustivel;
    private BigDecimal totalPago;
    private Boolean isTanqueCheio;
    private Long quilometragemOdometro;
    private LocalDate dataAbastecimento;

    public static Abastecimento convert(AbastecimentoDTO abastecimentoDTO){
        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setPlaca(abastecimentoDTO.getPlaca());
        abastecimento.setTipoCombustivel(abastecimentoDTO.getTipoCombustivel());
        abastecimento.setQuantidadeLitrosAbastecimento(abastecimentoDTO.getQuantidadeLitrosAbastecimento());
        abastecimento.setValorLitroCombustivel(abastecimentoDTO.getValorLitroCombustivel());
        abastecimento.setTotalPago(abastecimentoDTO.getTotalPago());
        abastecimento.setIsTanqueCheio(abastecimentoDTO.getIsTanqueCheio());
        abastecimento.setQuilometragemOdometro(abastecimentoDTO.getQuilometragemOdometro());
        abastecimento.setDataAbastecimento(abastecimentoDTO.getDataAbastecimento());
        return abastecimento;
    }
}
