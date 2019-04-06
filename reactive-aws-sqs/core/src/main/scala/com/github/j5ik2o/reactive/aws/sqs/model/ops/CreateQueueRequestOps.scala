// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class CreateQueueRequestBuilderOps(val self: CreateQueueRequest.Builder) extends AnyVal {

  final def withQueueNameAsScala(value: Option[String]): CreateQueueRequest.Builder = {
    value.fold(self) { v =>
      self.queueName(v)
    }
  } // String

  final def withAttributesAsScala(value: Option[Map[QueueAttributeName, String]]): CreateQueueRequest.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    } // Map[String, String]
  }

}

final class CreateQueueRequestOps(val self: CreateQueueRequest) extends AnyVal {

  final def queueNameAsScala: Option[String] = Option(self.queueName) // String

  final def attributesAsScala: Option[Map[QueueAttributeName, String]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateQueueRequestOps {

  implicit def toCreateQueueRequestBuilderOps(v: CreateQueueRequest.Builder): CreateQueueRequestBuilderOps =
    new CreateQueueRequestBuilderOps(v)

  implicit def toCreateQueueRequestOps(v: CreateQueueRequest): CreateQueueRequestOps = new CreateQueueRequestOps(v)

}
