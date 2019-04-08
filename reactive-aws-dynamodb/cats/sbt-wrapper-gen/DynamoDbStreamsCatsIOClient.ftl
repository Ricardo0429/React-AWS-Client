<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.dynamodb.streams.{ DynamoDbStreamsAsyncClient, DynamoDbStreamsClient }
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.streams.paginators.{ DescribeStreamPublisher, ListStreamsPublisher }

object ${baseName}CatsIOClient {

def apply(asyncClient: ${baseName}AsyncClient): ${baseName}CatsIOClient = new ${baseName}CatsIOClient {
override val underlying: ${baseName}AsyncClient = asyncClient
}

}

trait ${baseName}CatsIOClient extends ${baseName}Client[IO] {

val underlying: ${baseName}AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defCatsMethod method />

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>

