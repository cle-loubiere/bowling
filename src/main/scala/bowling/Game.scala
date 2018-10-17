package bowling

class Game(val frames : List[Frame] =  List.fill(10)(new Frame)){

    def score():Int={
        getEachFrameScore()
    }

    private def getEachFrameScore(actualFrame:Int = 0, intermediateScore:Int=0, doubledRoll:Int=0):Int={
        if(actualFrame >= frames.length) intermediateScore
        else {
            val frameScore =    if(doubledRoll == 2) frames(actualFrame).getScore * 2
                                else if (doubledRoll == 1) frames(actualFrame).getScore + frames(actualFrame).score._1
                                else frames(actualFrame).getScore

            if (frames(actualFrame).isASpare) getEachFrameScore(actualFrame + 1, intermediateScore + frameScore, 1)
            else if(frames(actualFrame).isAStrike) getEachFrameScore(actualFrame + 1, intermediateScore + frameScore, 2)
            else getEachFrameScore(actualFrame + 1, intermediateScore + frameScore, 0)
        }
        
        
    }
}