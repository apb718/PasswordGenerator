fun main(args: Array<String>) {
    println("Hello World!")

    val passphrase = Password(20,true)
    passphrase.makePassword()

    println(passphrase.password)

    val password2 = Password(25, false)
    println(passphrase.password)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}