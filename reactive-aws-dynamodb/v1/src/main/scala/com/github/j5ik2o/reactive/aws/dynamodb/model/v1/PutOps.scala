// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Put => ScalaPut, _ }
import com.amazonaws.services.dynamodbv2.model.{ Put => JavaPut }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutOps {

  implicit class ScalaPutOps(val self: ScalaPut) extends AnyVal {

    def toJava: JavaPut = {
      val result = new JavaPut()
      self.item.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._; result.withItem(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))                     // String
      self.conditionExpression.filter(_.nonEmpty).foreach(v => result.withConditionExpression(v)) // String
      self.expressionAttributeNames.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).foreach { v =>
        import scala.collection.JavaConverters._; result.withExpressionAttributeNames(v.asJava)
      } // Map[String, String]
      self.expressionAttributeValues.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, AttributeValueOps._;
        result.withExpressionAttributeValues(v.mapValues(_.toJava).asJava)
      } // Map[String, AttributeValue]
      self.returnValuesOnConditionCheckFailure.foreach { v =>
        import ReturnValuesOnConditionCheckFailureOps._; result.withReturnValuesOnConditionCheckFailure(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaPutOps(val self: JavaPut) extends AnyVal {

    def toScala: ScalaPut = {
      ScalaPut()
        .withItem(Option(self.getItem).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withTableName(Option(self.getTableName)) // String
        .withConditionExpression(Option(self.getConditionExpression)) // String
        .withExpressionAttributeNames(Option(self.getExpressionAttributeNames).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap
        }) // Map[String, String]
        .withExpressionAttributeValues(Option(self.getExpressionAttributeValues).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withReturnValuesOnConditionCheckFailure(Option(self.getReturnValuesOnConditionCheckFailure).map { v =>
          import ReturnValuesOnConditionCheckFailureOps._; v.toScala
        }) // String
    }

  }

}
