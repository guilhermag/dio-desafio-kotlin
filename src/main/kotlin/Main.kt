

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val name: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    override fun toString(): String {
        return "Formacao(nome='$nome', conteudos=$conteudos, nivel=$nivel, inscritos=$inscritos)"
    }


}

fun main(args: Array<String>) {
    val angular = listOf(
        ConteudoEducacional("introdução ao angular", 100),
        ConteudoEducacional("componentes", 150),
        ConteudoEducacional("projetos avançados")
    )

    val react = listOf(
        ConteudoEducacional("introdução ao react", 80),
        ConteudoEducacional("hooks", 100),
        ConteudoEducacional("projetos avançados")
    )

    val paulo = Usuario("Guilherme Gabriel")
    val felipe = Usuario("Miško Hevery")
    val daniela = Usuario("Jordan Walke")

    val formacaoAngular = Formacao("Angular", angular, Nivel.INTERMEDIARIO)
    val formacaoReact = Formacao("React", react, Nivel.BASICO)


    println(formacaoAngular)
    println(formacaoReact)
}