import java.util.*
data class Password(private val length: Int, private val withSpecialChars: Boolean) {

    private val letters = arrayOf<String>("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")
    private val lettersAndSpecialChars =  arrayOf<String>("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","!","@","#","$","%","^","&","*","(",")","-","=","_","+","[","]","\\",";","\'","\"",",",".","/","`","~")

    var password = ""
    fun makePassword() {
        val charset = if(withSpecialChars == true){
            lettersAndSpecialChars
        }
        else{
            letters
        }
//        println(charset)

        for (i in 0 until length){
            password += charset.get((Math.random() * charset.size).toInt())
        }
    }


}
