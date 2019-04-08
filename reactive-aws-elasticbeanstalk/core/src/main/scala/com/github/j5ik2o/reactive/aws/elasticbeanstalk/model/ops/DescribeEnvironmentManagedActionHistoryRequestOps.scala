// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentManagedActionHistoryRequestBuilderOps(
    val self: DescribeEnvironmentManagedActionHistoryRequest.Builder
) extends AnyVal {

  final def environmentIdAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxItemsAsScala(value: Option[Int]): DescribeEnvironmentManagedActionHistoryRequest.Builder = {
    value.fold(self) { v =>
      self.maxItems(v)
    }
  }

}

final class DescribeEnvironmentManagedActionHistoryRequestOps(val self: DescribeEnvironmentManagedActionHistoryRequest)
    extends AnyVal {

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxItemsAsScala: Option[Int] = Option(self.maxItems)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentManagedActionHistoryRequestOps {

  implicit def toDescribeEnvironmentManagedActionHistoryRequestBuilderOps(
      v: DescribeEnvironmentManagedActionHistoryRequest.Builder
  ): DescribeEnvironmentManagedActionHistoryRequestBuilderOps =
    new DescribeEnvironmentManagedActionHistoryRequestBuilderOps(v)

  implicit def toDescribeEnvironmentManagedActionHistoryRequestOps(
      v: DescribeEnvironmentManagedActionHistoryRequest
  ): DescribeEnvironmentManagedActionHistoryRequestOps = new DescribeEnvironmentManagedActionHistoryRequestOps(v)

}
