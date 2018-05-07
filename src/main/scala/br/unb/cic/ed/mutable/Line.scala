package br.unb.cic.ed.mutable

/**
  * Uma especificação do tipo Fila
  * usando a construção trait da linguagem
  * Scala.
  *
  * @author Victor Pacheco
  */
trait Line[T] {
  def push(value: T): Unit
  def pop(): Option[T]
  def top(): Option[T]
  def size(): Int
}
