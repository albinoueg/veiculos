package br.com.albinomoreira.veiculosapi.model;

import br.com.albinomoreira.veiculosapi.dto.VeiculoDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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

    public static Veiculo convert(VeiculoDTO veiculoDTO){
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(veiculoDTO.getPlaca());
        veiculo.setChassi(veiculoDTO.getChassi());
        veiculo.setRenavam(veiculoDTO.getRenavam());
        veiculo.setNomeMarcaModelo(veiculoDTO.getNomeMarcaModelo());
        veiculo.setAnoModelo(veiculoDTO.getAnoModelo());
        veiculo.setAnoFabricacao(veiculoDTO.getAnoFabricacao());
        veiculo.setSituacao(veiculoDTO.getSituacao());
        veiculo.setEspecie(veiculoDTO.getEspecie());
        veiculo.setCategoria(veiculoDTO.getCategoria());
        veiculo.setCor(veiculoDTO.getCor());
        veiculo.setCombustivel(veiculoDTO.getCombustivel());
        veiculo.setTipo(veiculoDTO.getTipo());
        veiculo.setTipoFabricacao(veiculoDTO.getTipoFabricacao());
        veiculo.setPotencia(veiculoDTO.getPotencia());
        veiculo.setCilindradas(veiculoDTO.getCilindradas());
        veiculo.setCapacidadePassageiros(veiculoDTO.getCapacidadePassageiros());
        veiculo.setCapacidadeCarga(veiculoDTO.getCapacidadeCarga());
        veiculo.setPesoBrutoTotal(veiculoDTO.getPesoBrutoTotal());
        veiculo.setAnoUltimoLicenciamento(veiculoDTO.getAnoUltimoLicenciamento());
        veiculo.setAnoUltimoLicenciamentoPago(veiculoDTO.getAnoUltimoLicenciamentoPago());
        veiculo.setUfMunicipio(veiculoDTO.getUfMunicipio());
        veiculo.setMunicipio(veiculoDTO.getMunicipio());
        veiculo.setObservacao(veiculoDTO.getObservacao());
        veiculo.setRouboFurto(veiculoDTO.getRouboFurto());
        veiculo.setRecuperado(veiculoDTO.getRecuperado());
        veiculo.setNrCarroceria(veiculoDTO.getNrCarroceria());
        veiculo.setNrMotor(veiculoDTO.getNrMotor());
        veiculo.setDtAquisicao0KM(veiculoDTO.getDtAquisicao0KM());
        veiculo.setDtAquisicao(veiculoDTO.getDtAquisicao());
        veiculo.setDtInclusao(veiculoDTO.getDtInclusao());
        veiculo.setDesCarroceria(veiculoDTO.getDesCarroceria());
        veiculo.setTemComunicadoVenda(veiculoDTO.getTemComunicadoVenda());
        veiculo.setAptoComunicadoVenda(veiculoDTO.getAptoComunicadoVenda());
        veiculo.setInfoCrlvE(veiculoDTO.getInfoCrlvE());
        veiculo.setNmProprietario(veiculoDTO.getNmProprietario());
        veiculo.setCpfCnpj(veiculoDTO.getCpfCnpj());
        veiculo.setIntencaoVendaAtivo(veiculoDTO.getIntencaoVendaAtivo());
        veiculo.setAptIntencaoVenda(veiculoDTO.getAptIntencaoVenda());
        veiculo.setAptCancelarIntencaoVenda(veiculoDTO.getAptCancelarIntencaoVenda());
        veiculo.setTemCrve(veiculoDTO.getTemCrve());
        return veiculo;
    }
}
