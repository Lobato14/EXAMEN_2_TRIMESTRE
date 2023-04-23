package Parte2_Herencia

open class Bebida(
    nomComercial: String,
    contenido_envase: Double,
    embalaje: Int,
    precioSinIva: Double,
    caducidad: String
) : Producto(nomComercial, contenido_envase, embalaje, precioSinIva) {
    // Variable que indica el año
    val anio = 2023
    override fun calcularIva(): Double {
        // porcentaje de IVA correspondiente a la bebida
        return 21.0
    }
}
