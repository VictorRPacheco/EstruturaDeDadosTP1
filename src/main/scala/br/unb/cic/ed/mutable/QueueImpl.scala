package br.unb.cic.ed.mutable
/*
 * Implementação das operações de uma fila usando
 * o tipo abstrato List.
 *
 * @author Victor Pacheco / Paulo Victor
 */

class QueueImpl[T](private val elements: br.unb.cic.ed.mutable.List[T]) extends Queue[T] {

  private var _size = 0

  def insert(value: T): Unit = {
    elements.insert(_size, value)
    _size += 1
  }

  def remove(): Option[T] = {
    val res = elements.elementAt(0)
    res match {
      case Some(v) => {
        elements.remove(0)
        _size -= 1
      }
      case None => {}
    }
    return res
  }

  def front(): Option[T] = elements.elementAt(0)
  def rear(): Option[T] = elements.elementAt(_size-1)

  def size() : Int = _size
}
