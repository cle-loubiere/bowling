package bowling

case class Frame(/*val pins : List[Pin] = List.fill(10)(new Pin)*/val score:(Int,Int)= (0,0), val numberOfRolls : Int = 0){
    

    def getScore : Int = {
        if(numberOfRolls == 0) 0
        else score._1 + score._2
    }

    def roll(numberOfPinKnocked:Int):Frame={
        if(numberOfRolls == 0)this.copy(score = (numberOfPinKnocked,0), numberOfRolls = numberOfRolls + 1)
        else if(numberOfRolls==1)this.copy(score = (score._1,numberOfPinKnocked), numberOfRolls = numberOfRolls + 1)
        else this
    }

    def isAStrike():Boolean={
        if(getScore == 10 && numberOfRolls == 1)true
        else false
    }
    def isASpare():Boolean={
        if(getScore == 10 && numberOfRolls == 2)true
        else false
    }


    /*private def getScore(actualPin:Int = 0, intermediateScore:Int = 0):Int ={
        if(actualPin >= pins.length) intermediateScore
        else {
            if (pins(actualPin).knocked == true) getScore(actualPin +1, intermediateScore +1)
            else getScore(actualPin +1, intermediateScore )
        }
    }*/


}