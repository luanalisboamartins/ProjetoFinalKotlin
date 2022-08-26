import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach


internal class CachorroTest {

    var test1 = Cachorro("teste", 0, "teste", "teste", "teste")
    var test2 = dogDetails()

    @Test
    fun exibirDog() {
        test1.exibirDog()
        assertEquals(5, 5)

    }

    @Test
    fun dogDetails() {
        test2
    }
}