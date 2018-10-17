package bowling

import org.scalatest.{FunSpec, Matchers}

class GameSpec extends FunSpec with Matchers {

    val game = new Game
    describe("A new game"){
        it("should have a score of 0"){
            assert(game.score == 0)
        }
    }

}