package com.renatoviana.id;

public class Main {

    public static void main(String[] args) {

        Pedidos pedidos = new Pedidos();

        RelatorioService relatorioService = new RelatorioService();
//        relatorioService.setPedidos(pedidos);

        System.out.println(relatorioService.totalPedidosMesAtual());
    }
}
