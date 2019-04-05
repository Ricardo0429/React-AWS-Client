// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class DeleteMessageBatchResultEntryBuilderOps(val self: DeleteMessageBatchResultEntry.Builder) extends AnyVal {

  final def withIdAsScala(value: Option[String]): DeleteMessageBatchResultEntry.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class DeleteMessageBatchResultEntryOps(val self: DeleteMessageBatchResultEntry) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteMessageBatchResultEntryOps {

  implicit def toDeleteMessageBatchResultEntryBuilderOps(
      v: DeleteMessageBatchResultEntry.Builder
  ): DeleteMessageBatchResultEntryBuilderOps = new DeleteMessageBatchResultEntryBuilderOps(v)

  implicit def toDeleteMessageBatchResultEntryOps(v: DeleteMessageBatchResultEntry): DeleteMessageBatchResultEntryOps =
    new DeleteMessageBatchResultEntryOps(v)

}
