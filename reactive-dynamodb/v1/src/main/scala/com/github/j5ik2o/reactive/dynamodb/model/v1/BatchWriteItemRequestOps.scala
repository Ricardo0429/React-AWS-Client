package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ BatchWriteItemRequest => JavaBatchWriteItemRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ BatchWriteItemRequest => ScalaBatchWriteItemRequest }

import scala.collection.JavaConverters._

object BatchWriteItemRequestOps {
  import WriteRequestOps._

  implicit class ScalaBatchWriteItemRequestOps(val self: ScalaBatchWriteItemRequest) extends AnyVal {

    def toJava: JavaBatchWriteItemRequest = {
      val result = new JavaBatchWriteItemRequest()
      self.requestItems.foreach(v => result.setRequestItems(v.mapValues(_.map(_.toJava).asJava).asJava))
      self.returnConsumedCapacity.foreach(result.setReturnConsumedCapacity)
      result
    }

  }

  implicit class JavaBatchWriteItemRequestOps(val self: JavaBatchWriteItemRequest) extends AnyVal {

    def toScala: ScalaBatchWriteItemRequest = {
      ScalaBatchWriteItemRequest()
        .withRequestItems(
          Option(self.getRequestItems).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala)))
        )
        .withReturnItemCollectionMetrics(Option(self.getReturnItemCollectionMetrics))
        .withReturnConsumedCapacity(Option(self.getReturnConsumedCapacity))
    }

  }

}
