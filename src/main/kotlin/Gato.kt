class Gato(
    nome: String,
    idade: Int,
    pelagem: String,
    sexo: String,
    raca: String,
    val descricao: String
) : Animal(nome, idade, pelagem, sexo, raca) {




    private val vacinas = mutableListOf<String>("Raiva, CVR-C, V-10")

    fun exibirCat() {
        println(
            "Gato: $nome tem $idade anos"
        )
    }

    fun catDetails() {

        println(
            "Nome: $nome\nIdade: $idade\nPelagem: $pelagem\nSexo:$sexo\nRaca: $raca"
        )
        println("Vacinas: $vacinas")
        println()
    }


}