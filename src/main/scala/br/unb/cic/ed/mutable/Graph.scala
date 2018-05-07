package br.unb.cic.ed.mutable
/*
 * Implementação de um trait da linguagem Scala
 * para um grafo dirigido.
 * @author paulovgf
 */

trait Graph[T] {
  def insertVertex(value: T) : Unit
  def removeVertex(value: T) : Unit
  def insertEdge(value: LinkedList[T]) : Option[Int]
  def removeEdge(source: T, end: T) : Option[Int]
  def size(): Int
}
