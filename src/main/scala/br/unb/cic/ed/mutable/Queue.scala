package br.unb.cic.ed.mutable

/**
  * Uma especificação do tipo Fila
  * usando a construção trait da linguagem
  * Scala.
  *
  * @author Victor Pacheco / Paulo Victor
  */
trait Queue[T] {
  def insert(value: T): Unit
  def remove(): Option[T]
  def front(): Option[T]
  def rear(): Option[T]
  def size(): Int
}
