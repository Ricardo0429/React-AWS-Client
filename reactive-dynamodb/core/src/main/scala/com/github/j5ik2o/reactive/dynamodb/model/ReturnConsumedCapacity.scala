package com.github.j5ik2o.reactive.dynamodb.model
import enumeratum._

import scala.collection.immutable

sealed trait ReturnConsumedCapacity extends EnumEntry

object ReturnConsumedCapacity extends Enum[ReturnConsumedCapacity] {
  override def values: immutable.IndexedSeq[ReturnConsumedCapacity] = findValues

  case object INDEXES extends ReturnConsumedCapacity
  case object TOTAL   extends ReturnConsumedCapacity
  case object NONE    extends ReturnConsumedCapacity
}
