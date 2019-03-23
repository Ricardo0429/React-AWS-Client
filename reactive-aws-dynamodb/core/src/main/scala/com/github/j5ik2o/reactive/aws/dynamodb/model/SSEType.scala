package com.github.j5ik2o.reactive.aws.dynamodb.model

import enumeratum._

import scala.collection.immutable

sealed trait SSEType extends EnumEntry

object SSEType extends Enum[SSEType] {
  override def values: immutable.IndexedSeq[SSEType] = findValues

  case object KMS    extends SSEType
  case object AES256 extends SSEType
}
