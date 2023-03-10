// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LambdaFunctionConfigurationBuilderOps(val self: LambdaFunctionConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): LambdaFunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaFunctionArnAsScala(value: Option[String]): LambdaFunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.lambdaFunctionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala(value: Option[Seq[Event]]): LambdaFunctionConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.events(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala(value: Option[NotificationConfigurationFilter]): LambdaFunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class LambdaFunctionConfigurationOps(val self: LambdaFunctionConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaFunctionArnAsScala: Option[String] = Option(self.lambdaFunctionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eventsAsScala: Option[Seq[Event]] = Option(self.events).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala: Option[NotificationConfigurationFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLambdaFunctionConfigurationOps {

  implicit def toLambdaFunctionConfigurationBuilderOps(
      v: LambdaFunctionConfiguration.Builder
  ): LambdaFunctionConfigurationBuilderOps = new LambdaFunctionConfigurationBuilderOps(v)

  implicit def toLambdaFunctionConfigurationOps(v: LambdaFunctionConfiguration): LambdaFunctionConfigurationOps =
    new LambdaFunctionConfigurationOps(v)

}
