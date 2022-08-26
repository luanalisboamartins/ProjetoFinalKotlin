class Cachorro(
    nome: String,
    idade: Int,
    pelagem: String,
    sexo: String,
    raca: String
) : Animal(nome, idade, pelagem, sexo, raca) {

    private val vacinas = mutableListOf<String>("Polivalente, Aintirrábica, V-8/V-10")


    fun exibirDog() {
        println(
            "Nome: $nome\n Idade: $idade"
        )
    }

    fun dogDetails() {

        println(
            "Nome: $nome\nIdade: $idade\nPelagem: $pelagem\nSexo:$sexo\nRaca: $raca"
        )
        println("Vacinas: $vacinas")
        println()
    }

}