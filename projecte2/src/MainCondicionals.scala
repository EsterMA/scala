object MainCondicionals {

  def main(args:Array[String]):Unit={
    println("Quina edat tens?")
    var edat = Integer.parseInt(readLine())
    if(edat < 18){
      println("Sóc menor d'edat")
    } else if(edat >= 18 && edat < 30){
      println("Sóc jove")
    } else{
      println("Sóc major d'edat!!!!")
    }
  }
}
