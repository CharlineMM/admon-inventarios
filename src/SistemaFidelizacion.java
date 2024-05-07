public interface SistemaFidelizacion {

    void otorgarPuntosCompra(double montoCompra);

    void canjearPuntos(int puntos);

    void recordatrioMercado(); //Aplica para productos tipo alimenticio
}
