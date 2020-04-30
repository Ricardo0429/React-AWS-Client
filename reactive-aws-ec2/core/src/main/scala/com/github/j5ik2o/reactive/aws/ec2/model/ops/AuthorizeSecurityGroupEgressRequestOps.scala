// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AuthorizeSecurityGroupEgressRequestBuilderOps(val self: AuthorizeSecurityGroupEgressRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.groupId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipPermissionsAsScala(value: Option[Seq[IpPermission]]): AuthorizeSecurityGroupEgressRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipPermissions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cidrIpAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.cidrIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fromPortAsScala(value: Option[Int]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.fromPort(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipProtocolAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.ipProtocol(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def toPortAsScala(value: Option[Int]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.toPort(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceSecurityGroupNameAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.sourceSecurityGroupName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceSecurityGroupOwnerIdAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
            value.fold(self){ v => self.sourceSecurityGroupOwnerId(v) }
            } 


}

final class AuthorizeSecurityGroupEgressRequestOps(val self: AuthorizeSecurityGroupEgressRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala: Option[String] = Option(self.groupId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cidrIpAsScala: Option[String] = Option(self.cidrIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fromPortAsScala: Option[Int] = Option(self.fromPort) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipProtocolAsScala: Option[String] = Option(self.ipProtocol) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def toPortAsScala: Option[Int] = Option(self.toPort) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceSecurityGroupNameAsScala: Option[String] = Option(self.sourceSecurityGroupName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceSecurityGroupOwnerIdAsScala: Option[String] = Option(self.sourceSecurityGroupOwnerId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizeSecurityGroupEgressRequestOps {

implicit def toAuthorizeSecurityGroupEgressRequestBuilderOps(v: AuthorizeSecurityGroupEgressRequest.Builder): AuthorizeSecurityGroupEgressRequestBuilderOps = new AuthorizeSecurityGroupEgressRequestBuilderOps(v)

implicit def toAuthorizeSecurityGroupEgressRequestOps(v: AuthorizeSecurityGroupEgressRequest): AuthorizeSecurityGroupEgressRequestOps = new AuthorizeSecurityGroupEgressRequestOps(v)

}

