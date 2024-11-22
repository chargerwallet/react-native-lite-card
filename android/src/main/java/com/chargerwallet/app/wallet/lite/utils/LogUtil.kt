package com.chargerwallet.app.wallet.lite.utils

import com.chargerwallet.app.wallet.lite.chargerwalletLite.NfcConstant
import com.chargerwallet.app.wallet.lite.LoggerManager

object LogUtil {
    @JvmStatic
    fun printLog(tag: String, msg: String) {
        if (NfcConstant.DEBUG) LoggerManager.getInstance()?.logInfo("$tag: $msg")
    }
}
