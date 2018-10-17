package bowling

import org.scalatest.{FunSpec, Matchers}

class PinSpec extends FunSpec with Matchers {

    val pin = new Pin
    describe("A pin"){
        it("should come unknocked"){
            assert(pin.knocked == false)
        }
    }

    val knockedPin = new Pin(true)
    describe("A pin knocked"){
        it("should be knocked"){
            assert(knockedPin.knocked == true)
        }
    }
}