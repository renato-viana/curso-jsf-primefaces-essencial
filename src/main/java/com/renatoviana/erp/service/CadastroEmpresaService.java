package com.renatoviana.erp.service;

import com.renatoviana.erp.model.Empresa;
import com.renatoviana.erp.repository.Empresas;
import com.renatoviana.erp.util.Transacional;

import javax.inject.Inject;
import java.io.Serializable;

public class CadastroEmpresaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Empresas empresas;

    @Transacional
    public void salvar(Empresa empresa) {
        empresas.guardar(empresa);
    }

    @Transacional
    public void excluir(Empresa empresa) {
        empresas.remover(empresa);
    }

}
