import java.util.*

//запуск игры (знакомство с пользователем), выбор уровня сложности пользователем, запуск требуемой игры, когда отыграл - предлагаем заново выбрать уровень сложности и поиграть еще(если пользователь не отказался от выбора)
fun main(args: Array<String>) {
    welcome()
    chooseGame()
}

fun chooseGame() {
    ClassicGame.playClassicGame()
}

fun welcome() {
    println("Enter your name")
    val userName = Scanner(System.`in`).next().toUpperCase()
    println("Hello,$userName!")
}
