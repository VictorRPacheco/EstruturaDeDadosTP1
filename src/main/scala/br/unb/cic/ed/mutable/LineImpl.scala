package br.unb.cic.ed.mutable

class LineImpl[T](private val elements: br.unb.cic.ed.mutable.List[T]) extends Line[T] {

  private var pos = 0
  private var count = 0
  def push(value: T): Unit = {
    pos += 1
    for(cont<-0 until pos-1){
      elements.insert(count+1,elements.elementAt(count))
    }
    elements.insert(0, value)

  }

  def pop(): Option[T] = {
    val res = elements.elementAt(pos -1)
    res match {
      case Some(v) => {
        elements.remove(pos -1)
        pos -= 1
      }
      case None => {}
    }
    return res
  }

  def top(): Option[T] = elements.elementAt(pos -1)

  def size() : Int = pos
}
