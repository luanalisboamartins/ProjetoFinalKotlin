class Cliente(
    var nome: String,
    var endereco: String,
    var telefone: String,
    val cpf: String
) {
    var cliente = Cliente("", "", "", "")

    fun cadastro() {
        println("Digite seu nome:$nome ")
        println("Digite seu CPF: $cpf")
        println("Digite seu endereço:$endereco")
        println("Digite seu telefone: $telefone")
    }


}
