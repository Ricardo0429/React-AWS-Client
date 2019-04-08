// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SequenceNumberRangeBuilderOps(val self: SequenceNumberRange.Builder) extends AnyVal {

  final def startingSequenceNumberAsScala(value: Option[String]): SequenceNumberRange.Builder = {
    value.fold(self) { v =>
      self.startingSequenceNumber(v)
    }
  }

  final def endingSequenceNumberAsScala(value: Option[String]): SequenceNumberRange.Builder = {
    value.fold(self) { v =>
      self.endingSequenceNumber(v)
    }
  }

}

final class SequenceNumberRangeOps(val self: SequenceNumberRange) extends AnyVal {

  final def startingSequenceNumberAsScala: Option[String] = Option(self.startingSequenceNumber)

  final def endingSequenceNumberAsScala: Option[String] = Option(self.endingSequenceNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSequenceNumberRangeOps {

  implicit def toSequenceNumberRangeBuilderOps(v: SequenceNumberRange.Builder): SequenceNumberRangeBuilderOps =
    new SequenceNumberRangeBuilderOps(v)

  implicit def toSequenceNumberRangeOps(v: SequenceNumberRange): SequenceNumberRangeOps = new SequenceNumberRangeOps(v)

}
