// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class BillingModeSummaryBuilderOps(val self: BillingModeSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingModeAsScala(value: Option[BillingMode]): BillingModeSummary.Builder = {
    value.fold(self) { v =>
      self.billingMode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateToPayPerRequestDateTimeAsScala(value: Option[java.time.Instant]): BillingModeSummary.Builder = {
    value.fold(self) { v =>
      self.lastUpdateToPayPerRequestDateTime(v)
    }
  }

}

final class BillingModeSummaryOps(val self: BillingModeSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateToPayPerRequestDateTimeAsScala: Option[java.time.Instant] =
    Option(self.lastUpdateToPayPerRequestDateTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBillingModeSummaryOps {

  implicit def toBillingModeSummaryBuilderOps(v: BillingModeSummary.Builder): BillingModeSummaryBuilderOps =
    new BillingModeSummaryBuilderOps(v)

  implicit def toBillingModeSummaryOps(v: BillingModeSummary): BillingModeSummaryOps = new BillingModeSummaryOps(v)

}
