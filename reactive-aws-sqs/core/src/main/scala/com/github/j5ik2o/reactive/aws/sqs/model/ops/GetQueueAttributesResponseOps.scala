// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class GetQueueAttributesResponseBuilderOps(val self: GetQueueAttributesResponse.Builder) extends AnyVal {

  final def withAttributesAsScala(
      value: Option[Map[QueueAttributeName, String]]
  ): GetQueueAttributesResponse.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.String])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    } // Map[String, String]
  }

}

final class GetQueueAttributesResponseOps(val self: GetQueueAttributesResponse) extends AnyVal {

  final def attributesAsScala: Option[Map[QueueAttributeName, String]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetQueueAttributesResponseOps {

  implicit def toGetQueueAttributesResponseBuilderOps(
      v: GetQueueAttributesResponse.Builder
  ): GetQueueAttributesResponseBuilderOps = new GetQueueAttributesResponseBuilderOps(v)

  implicit def toGetQueueAttributesResponseOps(v: GetQueueAttributesResponse): GetQueueAttributesResponseOps =
    new GetQueueAttributesResponseOps(v)

}