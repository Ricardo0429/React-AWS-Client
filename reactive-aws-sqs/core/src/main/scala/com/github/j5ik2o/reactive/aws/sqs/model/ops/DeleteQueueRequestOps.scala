// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteQueueRequestBuilderOps(val self: DeleteQueueRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): DeleteQueueRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

}

final class DeleteQueueRequestOps(val self: DeleteQueueRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteQueueRequestOps {

  implicit def toDeleteQueueRequestBuilderOps(v: DeleteQueueRequest.Builder): DeleteQueueRequestBuilderOps =
    new DeleteQueueRequestBuilderOps(v)

  implicit def toDeleteQueueRequestOps(v: DeleteQueueRequest): DeleteQueueRequestOps = new DeleteQueueRequestOps(v)

}
