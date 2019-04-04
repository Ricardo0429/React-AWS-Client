// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutBuilderOps(val self: Put.Builder) extends AnyVal {

  final def withItemAsScala(value: Option[Map[String, AttributeValue]]): Put.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withTableNameAsScala(value: Option[String]): Put.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def withConditionExpressionAsScala(value: Option[String]): Put.Builder = {
    value.fold(self) { v =>
      self.conditionExpression(v)
    }
  } // String

  final def withExpressionAttributeNamesAsScala(value: Option[Map[String, String]]): Put.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeNames(v.asJava)
    } // Map[String, String]
  }

  final def withExpressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): Put.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.expressionAttributeValues(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withReturnValuesOnConditionCheckFailureAsScala(
      value: Option[ReturnValuesOnConditionCheckFailure]
  ): Put.Builder = {
    value.fold(self) { v =>
      self.returnValuesOnConditionCheckFailure(v)
    }
  } // String

}

final class PutOps(val self: Put) extends AnyVal {

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression) // String

  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]] =
    Option(self.expressionAttributeValues).map { v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
    } // Map[String, AttributeValue]

  final def returnValuesOnConditionCheckFailureAsScala: Option[ReturnValuesOnConditionCheckFailure] =
    Option(self.returnValuesOnConditionCheckFailure) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutOps {

  implicit def toPutBuilderOps(v: Put.Builder): PutBuilderOps = new PutBuilderOps(v)

  implicit def toPutOps(v: Put): PutOps = new PutOps(v)

}