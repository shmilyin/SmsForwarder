package com.idormy.sms.forwarder.entity.action

import java.io.Serializable

data class RebootSetting(
    var description: String = "", //描述
    var rebootMethod: Int = 1, //状态：0-使用su重启；1-使用广播重启
) : Serializable
