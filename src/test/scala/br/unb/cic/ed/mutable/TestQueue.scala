package br.unb.cic.ed.mutable

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestQueue extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "A Queue"

  var queue : br.unb.cic.ed.mutable.QueueImpl[Int] = _

  it should "have size == 0 before inserting any element" in {
    queue.size() should be (0)
  }

  it should "have size == 3 after inserting 3 elements" in {
    queue.size() should be (0)

    queue.insert(3)
    queue.insert(2)
    queue.insert(1)

    queue.size() should be (3)
  }

  it should "return Some(30) after inserting the following elements: 30,20,10; and removing once" in {
    queue.size() should be (0)

    queue.insert(30)
    queue.insert(20)
    queue.insert(10)

    queue.size() should be (3)

    queue.remove() should be (Some(30))

    queue.size() should be (2)

    queue.remove() should be (Some(20))
    queue.remove() should be (Some(10))

    queue.size() should be (0)
  }

  it should "should return 5 when we call front() and 10 when we call rear after inserting 5, 10" in {
    queue.size() should be (0)

    queue.insert(5)
    queue.insert(7)
    queue.insert(10)

    queue.size() should be (3)

    queue.front() should be (Some(5))
    queue.rear() should be (Some(10))

    queue.remove() should be (Some(5))
    queue.remove() should be (Some(7))
    queue.remove() should be (Some(10))

    queue.size should be (0)

  }

  it should "should return None when we call remove() on an empty queue" in {
    queue.remove() should be (None)
  }

  it should "throw InvalidArgument when we call insert(1) on an full queue" in {
    val smallQueue = new br.unb.cic.ed.mutable.QueueImpl[Int](new ArrayList[Int](1))

    smallQueue.insert(1)

    intercept[InvalidArgument] {
      smallQueue.insert(1)
    }
  }

  before {
    queue = new br.unb.cic.ed.mutable.QueueImpl[Int](new ArrayList[Int]())
  }

}
