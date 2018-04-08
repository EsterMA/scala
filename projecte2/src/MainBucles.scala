object MainBucles {
  def main(args: Array[String]):Unit={
    println("Hola, anem a fer bucles!!!")
    println("per -> 1")
    println("mentre -> 2")
    var resultat = Integer.parseInt(readLine())
    if(resultat == 1){
      per
    }else if(resultat == 2){
      mentre
    }else{
      println("FUCK YOU!")
      throw new Exception("FUCKE YOU!")
    }
  }

  def per():Unit={
    for(i <- 0 to 100){
      if(i == 50){
        println(i +" es 50")
      } else if(i >= 50){
        println(i +" mes gran que 50")
      }else{
        println(i +" mes petit que 50")
      }
    }
  }

  def mentre():Unit={
    var fer = true
    var i = 0
    while(fer){
      if(i < 50){
        println("Soc mes petit que 50")
      }else{
        fer = false
      }
      i = i+1
    }
  }
}
