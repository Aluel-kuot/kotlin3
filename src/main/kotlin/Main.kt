fun main() {
    //quiz1
    word()
    //quiz2
    println(teach("Jane",22))
    //quiz3
println(width("characteristics"))
//quiz4
    call("Ann")
    call("Rose")

}
//quiz1
fun word(){
    val school="akirachix"
    println(school[0])
    println(school[2])
    println(school[3])
}
//quiz2
fun teach (name:String,age:Int):String{
    val sentence="Hi my name is $name and I am $age years old"
    return sentence
}
//quiz3
fun width(length:String):String{
    return("The length of the  length string is:"+ length.length)
}
//quiz4
fun call(tag:String){
    var b="Ann"
    if (tag==b){
        println  ("That's me!")
    }
    else{
        println("I don't know who that is")
    }

}




