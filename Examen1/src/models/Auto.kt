package models

class Auto
{
    private var marca: String = ""
        set(value) {
            field = value
        }
    private var modelo: String = ""
        set(value) {
            field = value
        }

    private var caracteristicas: String = ""
        set(value) {
            field = value
        }

    private var caractEspe: String = ""
        set(value) {
            field = value
        }

    constructor(Marca: String, Modelo: String, Caracteristicas: String, CaractEspe: String) {
        this.marca = Marca
        this.modelo = Modelo
        this.caracteristicas = Caracteristicas
        this.caractEspe = CaractEspe
    }

    override fun toString(): String {
        return "Marca del auto:  $marca \nmodelo:  $modelo\ncaracteristicas: $caracteristicas \nCaracteristicas especiales: $caractEspe\n\n"
    }

}