package Parte1_Hora

class Hora {
    // Creamos las variables para las horas, minutos y segundos
    var hora: Int = 0
        set(value) {
            field = if (value in 0..23) value else value % 24
        }

    var minutos: Int = 0
        set(value) {
            field = if (value in 0..59) value else {
                hora += value / 60
                value % 60
            }
        }

    var segundos: Int = 0
        set(value) {
            field = if (value in 0..59) value else {
                minutos += value / 60
                value % 60
            }
        }
    // constructor primario
    constructor(hora: Int, minutos: Int, segundos: Int) {
        this.hora = hora
        this.minutos = minutos
        this.segundos = segundos
    }
    // constructor para los segundos
    constructor(hora: Int, minutos: Int) : this(hora, minutos, 0)
    // constructor para los minutos y segundos
    constructor(hora: Int) : this(hora, 0, 0)
    // constructor secundario
    constructor(otraHora: Hora) : this(otraHora.hora, otraHora.minutos, otraHora.segundos)
    // Función que convierte el formato en el orden de hora, minutos y segundos
    override fun toString(): String {
        return "%02d:%02d:%02d".format(hora, minutos, segundos)
    }
    // Método SetLaHora que inicializa la hora, los minutos y los segundos
    public fun setLaHora(hora: Int, minutos: Int, segundos: Int) {
        this.hora = hora
        this.minutos = minutos
        this.segundos = segundos
    }
    // Función compararCon que compara la hora con la otra hora
    fun compararCon(otraHora: Hora): Int {
        return when {
            hora < otraHora.hora -> -1
            hora > otraHora.hora -> 1
            minutos < otraHora.minutos -> -1
            minutos > otraHora.minutos -> 1
            segundos < otraHora.segundos -> -1
            segundos > otraHora.segundos -> 1
            else -> 0
        }
    }
}