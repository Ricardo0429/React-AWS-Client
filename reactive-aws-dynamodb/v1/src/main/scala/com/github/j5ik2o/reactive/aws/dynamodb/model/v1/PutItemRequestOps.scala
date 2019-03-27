// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ PutItemRequest => ScalaPutItemRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ PutItemRequest => JavaPutItemRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutItemRequestOps {

  implicit class ScalaPutItemRequestOps(val self: ScalaPutItemRequest) extends AnyVal {

    def toJava: JavaPutItemRequest = {
      val result = new JavaPutItemRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withItem(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.expected.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ExpectedAttributeValueOps._;
        result.withExpected(v.mapValues(_.toJava).asJava)
      } // Map[String, ExpectedAttributeValue]
      self.returnValues.foreach { v =>
        import ReturnValueOps._; result.withReturnValues(v.toJava)
      } // String
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.withReturnConsumedCapacity(v.toJava)
      } // String
      self.returnItemCollectionMetrics.foreach { v =>
        import ReturnItemCollectionMetricsOps._; result.withReturnItemCollectionMetrics(v.toJava)
      } // String
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.withConditionalOperator(v.toJava)
      } // String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.withConditionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExpressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]

      result
    }

  }

}
