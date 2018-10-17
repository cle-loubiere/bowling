package bowling

import org.scalatest.{FunSpec, Matchers}

class FrameSpec extends FunSpec with Matchers {

    val frame = new Frame
    /*describe("A frame"){
        it("should have 10 pins"){
            assert(frame.pins.size == 10)
        }
        
    }*/
    describe("A new frame"){
        it("should have a score of 0"){
            assert(frame.getScore == 0)
        }
        it("should have 0 rolls"){
            assert(frame.numberOfRolls == 0)
        }
    }
    val strike = new Frame().roll(10) 
    describe("A frame with score of 10 in 1 roll"){
        it("is a strike"){
            assert(strike.isAStrike)
        }
        it("is not a spare"){
            assert(!strike.isASpare)
        }
    }

}