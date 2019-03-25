package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ QueryRequest => ScalaQueryRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ QueryRequest => JavaQueryRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object QueryRequestOps {

  implicit class ScalaQueryRequestOps(val self: ScalaQueryRequest) extends AnyVal {

    def toJava: JavaQueryRequest = {
      val result = JavaQueryRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String, case String
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String, case String
      self.select.foreach { v =>
        import SelectOps._; result.select(v.toJava)
      } // String, case Other
      self.attributesToGet.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.attributesToGet(v.asJava)
      } // Seq[String], case Seq[_], Defined
      self.limit.map(_.intValue).foreach(v => result.limit(v))                       // Int, case Int
      self.consistentRead.map(_.booleanValue).foreach(v => result.consistentRead(v)) // Boolean, case Boolean
      self.keyConditions.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.keyConditions(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition], case Map[_], UserDefined
      self.queryFilter.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.queryFilter(v.mapValues(_.toJava).asJava)
      } // Map[String, Condition], case Map[_], UserDefined
      self.conditionalOperator.foreach { v =>
        import ConditionalOperatorOps._; result.conditionalOperator(v.toJava)
      } // String, case Other
      self.scanIndexForward.map(_.booleanValue).foreach(v => result.scanIndexForward(v)) // Boolean, case Boolean
      self.exclusiveStartKey.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.exclusiveStartKey(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue], case Map[_], UserDefined
      self.returnConsumedCapacity.foreach { v =>
        import ReturnConsumedCapacityOps._; result.returnConsumedCapacity(v.toJava)
      } // String, case Other
      self.projectionExpression.filter(_.nonEmpty).foreach(v => result.projectionExpression(v)) // String, case String
      self.filterExpression.filter(_.nonEmpty).foreach(v => result.filterExpression(v))         // String, case String
      self.keyConditionExpression
        .filter(_.nonEmpty).foreach(v => result.keyConditionExpression(v)) // String, case String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.expressionAttributeNames(v.asJava)
      } // Map[String, String], case Map[_]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.expressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue], case Map[_], UserDefined

      result.build()
    }

  }

}
