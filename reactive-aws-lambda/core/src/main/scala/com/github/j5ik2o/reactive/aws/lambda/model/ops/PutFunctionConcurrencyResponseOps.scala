// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PutFunctionConcurrencyResponseBuilderOps(val self: PutFunctionConcurrencyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedConcurrentExecutionsAsScala(value: Option[Int]): PutFunctionConcurrencyResponse.Builder = {
    value.fold(self) { v =>
      self.reservedConcurrentExecutions(v)
    }
  }

}

final class PutFunctionConcurrencyResponseOps(val self: PutFunctionConcurrencyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedConcurrentExecutionsAsScala: Option[Int] = Option(self.reservedConcurrentExecutions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutFunctionConcurrencyResponseOps {

  implicit def toPutFunctionConcurrencyResponseBuilderOps(
      v: PutFunctionConcurrencyResponse.Builder
  ): PutFunctionConcurrencyResponseBuilderOps = new PutFunctionConcurrencyResponseBuilderOps(v)

  implicit def toPutFunctionConcurrencyResponseOps(
      v: PutFunctionConcurrencyResponse
  ): PutFunctionConcurrencyResponseOps = new PutFunctionConcurrencyResponseOps(v)

}
