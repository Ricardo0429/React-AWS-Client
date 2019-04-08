// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackInstanceResponseBuilderOps(val self: DescribeStackInstanceResponse.Builder) extends AnyVal {

  final def stackInstanceAsScala(value: Option[StackInstance]): DescribeStackInstanceResponse.Builder = {
    value.fold(self) { v =>
      self.stackInstance(v)
    }
  } // StackInstance

}

final class DescribeStackInstanceResponseOps(val self: DescribeStackInstanceResponse) extends AnyVal {

  final def stackInstanceAsScala: Option[StackInstance] = Option(self.stackInstance) // StackInstance

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackInstanceResponseOps {

  implicit def toDescribeStackInstanceResponseBuilderOps(
      v: DescribeStackInstanceResponse.Builder
  ): DescribeStackInstanceResponseBuilderOps = new DescribeStackInstanceResponseBuilderOps(v)

  implicit def toDescribeStackInstanceResponseOps(v: DescribeStackInstanceResponse): DescribeStackInstanceResponseOps =
    new DescribeStackInstanceResponseOps(v)

}
