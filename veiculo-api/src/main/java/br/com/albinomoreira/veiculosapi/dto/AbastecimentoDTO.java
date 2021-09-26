package br.com.albinomoreira.veiculosapi.dto;

import br.com.albinomoreira.veiculosapi.model.Abastecimento;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AbastecimentoDTO {

    private String placa;
    private String tipoCombustivel;
    private double quantidadeLitrosAbastecimento;
    private BigDecimal valorLitroCombustivel;
    private BigDecimal totalPago;
    private Boolean isTanqueCheio;
    private Long quilometragemOdometro;
    private LocalDate dataAbastecimento;

    public static AbastecimentoDTO convert(Abastecimento abastecimento){
        AbastecimentoDTO abastecimentoDTO = new AbastecimentoDTO();
        abastecimentoDTO.setPlaca(abastecimento.getPlaca());
        abastecimentoDTO.setTipoCombustivel(abastecimento.getTipoCombustivel());
        abastecimentoDTO.setQuantidadeLitrosAbastecimento(abastecimento.getQuantidadeLitrosAbastecimento());
        abastecimentoDTO.setValorLitroCombustivel(abastecimento.getValorLitroCombustivel());
        abastecimentoDTO.setTotalPago(abastecimento.getTotalPago());
        abastecimentoDTO.setIsTanqueCheio(abastecimento.getIsTanqueCheio());
        abastecimentoDTO.setQuilometragemOdometro(abastecimento.getQuilometragemOdometro());
        abastecimentoDTO.setDataAbastecimento(abastecimento.getDataAbastecimento());
        return abastecimentoDTO;
    }
}
