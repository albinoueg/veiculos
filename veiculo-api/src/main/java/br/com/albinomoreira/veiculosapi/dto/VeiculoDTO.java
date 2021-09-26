package br.com.albinomoreira.veiculosapi.dto;

import br.com.albinomoreira.veiculosapi.model.Veiculo;
import lombok.Data;

@Data
public class VeiculoDTO {

    private String placa;
    private String chassi;
    private String renavam;
    private String nomeMarcaModelo;
    private String anoModelo;
    private String anoFabricacao;
    private String situacao;
    private String especie;
    private String categoria;
    private String cor;
    private String combustivel;
    private String tipo;
    private String tipoFabricacao;
    private String potencia;
    private String cilindradas;
    private Integer capacidadePassageiros;
    private Double capacidadeCarga;
    private Double pesoBrutoTotal;
    private String anoUltimoLicenciamento;
    private String anoUltimoLicenciamentoPago;
    private String ufMunicipio;
    private String municipio;
    private String observacao;
    private String rouboFurto;
    private String recuperado;
    private String nrCarroceria;
    private String nrMotor;
    private String dtAquisicao0KM;
    private String dtAquisicao;
    private String dtInclusao;
    private String desCarroceria;
    private String temComunicadoVenda;
    private String aptoComunicadoVenda;
    private String infoCrlvE;
    private String nmProprietario;
    private String cpfCnpj;
    private Boolean intencaoVendaAtivo;
    private Boolean aptIntencaoVenda;
    private Boolean aptCancelarIntencaoVenda;
    private Boolean temCrve;

    public static VeiculoDTO convert(Veiculo veiculo){
        VeiculoDTO veiculoDTO = new VeiculoDTO();
        veiculoDTO.setPlaca(veiculo.getPlaca());
        veiculoDTO.setChassi(veiculo.getChassi());
        veiculoDTO.setRenavam(veiculo.getRenavam());
        veiculoDTO.setNomeMarcaModelo(veiculo.getNomeMarcaModelo());
        veiculoDTO.setAnoModelo(veiculo.getAnoModelo());
        veiculoDTO.setAnoFabricacao(veiculo.getAnoFabricacao());
        veiculoDTO.setSituacao(veiculo.getSituacao());
        veiculoDTO.setEspecie(veiculo.getEspecie());
        veiculoDTO.setCategoria(veiculo.getCategoria());
        veiculoDTO.setCor(veiculo.getCor());
        veiculoDTO.setCombustivel(veiculo.getCombustivel());
        veiculoDTO.setTipo(veiculo.getTipo());
        veiculoDTO.setTipoFabricacao(veiculo.getTipoFabricacao());
        veiculoDTO.setPotencia(veiculo.getPotencia());
        veiculoDTO.setCilindradas(veiculo.getCilindradas());
        veiculoDTO.setCapacidadePassageiros(veiculo.getCapacidadePassageiros());
        veiculoDTO.setCapacidadeCarga(veiculo.getCapacidadeCarga());
        veiculoDTO.setPesoBrutoTotal(veiculo.getPesoBrutoTotal());
        veiculoDTO.setAnoUltimoLicenciamento(veiculo.getAnoUltimoLicenciamento());
        veiculoDTO.setAnoUltimoLicenciamentoPago(veiculo.getAnoUltimoLicenciamentoPago());
        veiculoDTO.setUfMunicipio(veiculo.getUfMunicipio());
        veiculoDTO.setMunicipio(veiculo.getMunicipio());
        veiculoDTO.setObservacao(veiculo.getObservacao());
        veiculoDTO.setRouboFurto(veiculo.getRouboFurto());
        veiculoDTO.setRecuperado(veiculo.getRecuperado());
        veiculoDTO.setNrCarroceria(veiculo.getNrCarroceria());
        veiculoDTO.setNrMotor(veiculo.getNrMotor());
        veiculoDTO.setDtAquisicao0KM(veiculo.getDtAquisicao0KM());
        veiculoDTO.setDtAquisicao(veiculo.getDtAquisicao());
        veiculoDTO.setDtInclusao(veiculo.getDtInclusao());
        veiculoDTO.setDesCarroceria(veiculo.getDesCarroceria());
        veiculoDTO.setTemComunicadoVenda(veiculo.getTemComunicadoVenda());
        veiculoDTO.setAptoComunicadoVenda(veiculo.getAptoComunicadoVenda());
        veiculoDTO.setInfoCrlvE(veiculo.getInfoCrlvE());
        veiculoDTO.setNmProprietario(veiculo.getNmProprietario());
        veiculoDTO.setCpfCnpj(veiculo.getCpfCnpj());
        veiculoDTO.setIntencaoVendaAtivo(veiculo.getIntencaoVendaAtivo());
        veiculoDTO.setAptIntencaoVenda(veiculo.getAptIntencaoVenda());
        veiculoDTO.setAptCancelarIntencaoVenda(veiculo.getAptCancelarIntencaoVenda());
        veiculoDTO.setTemCrve(veiculo.getTemCrve());
        return veiculoDTO;
    }
}
