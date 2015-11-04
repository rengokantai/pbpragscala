object hello extends App{

def getInfo(primaryKey : Int) = {
  ("Hernan", "Ke")
}

//tuple
val (fn, ln)=getInfo(1)
  //single value.
  val single = getInfo(2)

println(s"$fn")
  println(single._2)

}