import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GatoTest{


    var teste = Gato("riquijão",15,"marrom","F","siames","docil")
    @Test
    fun exibirCat() {
        teste.exibirCat()

    }

    @Test
    fun catDetails() {
        teste.catDetails()
    }

    @Test
    fun getDescricao() {
        teste.descricao
    }
}