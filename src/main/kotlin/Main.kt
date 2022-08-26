fun main() {

    val dogList = mutableListOf<Cachorro>(
        Cachorro("Totó", 5, "Caramelo", "Macho", "SRD"),
        Cachorro("Pirata", 8, "Preto", "Macho", "Pastor Alemão"),
        Cachorro("Belinha", 2, "Marrom", "Fêmea", "Pinscher"),
        Cachorro("Bino", 10, "Branco", "Macho", "SRD"),
        Cachorro("Luna", 7, "Marrom", "Fêmea", "Golden Retriever"),
        Cachorro("Princesa", 6, "Caramelo", "Fêmea", "Beagle")
    )

    val catList = mutableListOf<Gato>(
        Gato("Bóris", 2, "Marrom/Preto", "Macho", "Siamês", "Dócil"),
        Gato("Pitu", 5, "Preta", "Fêmea", "SRD", "Arisca"),
        Gato("Jemerias", 10, "Caramelo", "Macho", "SRD", "Bravo"),
        Gato("Trevis", 1, "Tigrado", "Macho", "SRD", "Dócil"),
        Gato("Peralta", 8, "Branco", "Fêmea", "Persa", "Agitado"),
        Gato("Whisky", 12, "Carvalho", "Macho", "Maine Coon", "Amargo")
    )

    print("Digite seu Login: ")
    var testaLogin = readln()

    print("Digite Sua Senha: ")
    var testasenha = readln().toInt()

    var acesso = Ong()

    while (true) {
        if (testaLogin == acesso.login && testasenha == acesso.senha) {
            println("Acesso Concedido! ")
            break
        } else {
            println("Acesso Negado")
            return main()
        }
    }

    while (true) {
        println()
        println("            BEM VINDE AO DEV PET            ")
        println("         DIGITE O NUMERO DA OPÇÃO DESEJADA        ")
        println()
        println("1- Adotar Cachorro")
        println("2- Adotar Gato")
        println("3-Fechar")
        println()
        when (readln()) {
            "1" -> {
                println(" lISTA DE DOGUINHOS PARA ADOÇÃO ")
                dogList.forEach { it.exibirDog() }
                println()
                print("Selecione qual Dog Você deseja conhecer: ")
                var opc = readln().toInt()

                opc -= 1

                println()
                dogList[opc].dogDetails()
                println()
                print("Deseja Adotar 1/Sim ou 2/Não: ")
                if (readln().toInt() == 1) {
                    println()
                    println(
                        "Parabéns, seu pet ${dogList[opc].nome} está te esperando\n" +
                                "Nosso Endereço Rua Blabla, Nº 0\n"
                    )
                    break
                } else {
                    println("Não foi dessa vez !")
                    break
                }


            }

            "2" -> {
                println(" lISTA DE GATINHOS PARA ADOÇÃO ")
                catList.forEach { it.exibirCat() }
                print("Digite qual Cat Você deseja conhecer:")
                var opc = readln().toInt()

                opc -= 1
                println()
                catList[opc].catDetails()

                println()
                print("Deseja Adotar 1/Sim ou 2/Não: ")
                if (readln() == "1") {
                    println()
                    println(
                        "Parabéns, seu pet ${catList[opc].nome} está te esperando\n" +
                                "Nosso Endereço Rua Blabla, Nº 0\n"
                    )
                    break
                } else {
                    println("Não foi dessa vez !")
                    break
                }

            }
            "3" -> break
            else -> {
                println("Opção inválida")
                break
            }

        }
    }
}
