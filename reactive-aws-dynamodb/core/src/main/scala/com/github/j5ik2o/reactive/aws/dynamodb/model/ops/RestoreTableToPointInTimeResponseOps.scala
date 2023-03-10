// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class RestoreTableToPointInTimeResponseBuilderOps(val self: RestoreTableToPointInTimeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableDescriptionAsScala(value: Option[TableDescription]): RestoreTableToPointInTimeResponse.Builder = {
    value.fold(self) { v =>
      self.tableDescription(v)
    }
  }

}

final class RestoreTableToPointInTimeResponseOps(val self: RestoreTableToPointInTimeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableDescriptionAsScala: Option[TableDescription] = Option(self.tableDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreTableToPointInTimeResponseOps {

  implicit def toRestoreTableToPointInTimeResponseBuilderOps(
      v: RestoreTableToPointInTimeResponse.Builder
  ): RestoreTableToPointInTimeResponseBuilderOps = new RestoreTableToPointInTimeResponseBuilderOps(v)

  implicit def toRestoreTableToPointInTimeResponseOps(
      v: RestoreTableToPointInTimeResponse
  ): RestoreTableToPointInTimeResponseOps = new RestoreTableToPointInTimeResponseOps(v)

}
