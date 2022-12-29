package com.renatoviana.id;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class Pedidos {

    @Inject
    private EntityManager entityManager;

    public BigDecimal totalPedidosMesAtual() {
        return new BigDecimal("100");
    }
}
