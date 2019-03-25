package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate, _ }
import software.amazon.awssdk.services.dynamodb.model.{ AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AutoScalingPolicyUpdateOps {

  implicit class ScalaAutoScalingPolicyUpdateOps(val self: ScalaAutoScalingPolicyUpdate) extends AnyVal {

    def toJava: JavaAutoScalingPolicyUpdate = {
      val result = JavaAutoScalingPolicyUpdate.builder()
      self.policyName.filter(_.nonEmpty).foreach(v => result.policyName(v)) // String, case String
      self.targetTrackingScalingPolicyConfiguration.foreach { v =>
        result.targetTrackingScalingPolicyConfiguration(v.toJava)
      } // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate, case Other

      result.build()
    }

  }

  implicit class JavaAutoScalingPolicyUpdateOps(val self: JavaAutoScalingPolicyUpdate) extends AnyVal {

    def toScala: ScalaAutoScalingPolicyUpdate = {
      ScalaAutoScalingPolicyUpdate()
        .withPolicyName(Option(self.policyName)) // String
        .withTargetTrackingScalingPolicyConfiguration(Option(self.targetTrackingScalingPolicyConfiguration).map { v =>
          v.toScala
        }) // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate, Map-12
    }

  }

}
