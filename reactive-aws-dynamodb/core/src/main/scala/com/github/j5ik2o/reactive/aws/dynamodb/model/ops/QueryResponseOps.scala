// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class QueryResponseBuilderOps(val self: QueryResponse.Builder) extends AnyVal {

  final def itemsAsScala(value: Option[Seq[Map[String, AttributeValue]]]): QueryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.items(v.map(_.asJava).asJava)
    } // Seq[Map[String, AttributeValue]]
  }

  final def countAsScala(value: Option[Int]): QueryResponse.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  } // Int

  final def scannedCountAsScala(value: Option[Int]): QueryResponse.Builder = {
    value.fold(self) { v =>
      self.scannedCount(v)
    }
  } // Int

  final def lastEvaluatedKeyAsScala(value: Option[Map[String, AttributeValue]]): QueryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.lastEvaluatedKey(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): QueryResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  } // ConsumedCapacity

}

final class QueryResponseOps(val self: QueryResponse) extends AnyVal {

  final def itemsAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.items).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap)
  } // Seq[Map[String, AttributeValue]]

  final def countAsScala: Option[Int] = Option(self.count) // Int

  final def scannedCountAsScala: Option[Int] = Option(self.scannedCount) // Int

  final def lastEvaluatedKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.lastEvaluatedKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity) // ConsumedCapacity

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryResponseOps {

  implicit def toQueryResponseBuilderOps(v: QueryResponse.Builder): QueryResponseBuilderOps =
    new QueryResponseBuilderOps(v)

  implicit def toQueryResponseOps(v: QueryResponse): QueryResponseOps = new QueryResponseOps(v)

}
