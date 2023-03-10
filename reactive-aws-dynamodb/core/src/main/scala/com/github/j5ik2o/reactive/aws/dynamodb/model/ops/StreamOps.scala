// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamBuilderOps(val self: Stream.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamArnAsScala(value: Option[String]): Stream.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): Stream.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamLabelAsScala(value: Option[String]): Stream.Builder = {
    value.fold(self) { v =>
      self.streamLabel(v)
    }
  }

}

final class StreamOps(val self: Stream) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamArnAsScala: Option[String] = Option(self.streamArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamLabelAsScala: Option[String] = Option(self.streamLabel)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamOps {

  implicit def toStreamBuilderOps(v: Stream.Builder): StreamBuilderOps = new StreamBuilderOps(v)

  implicit def toStreamOps(v: Stream): StreamOps = new StreamOps(v)

}
