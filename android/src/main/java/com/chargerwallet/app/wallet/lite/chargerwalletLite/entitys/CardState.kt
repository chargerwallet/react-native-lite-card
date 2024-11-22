package com.chargerwallet.app.wallet.lite.chargerwalletLite.entitys

import android.nfc.tech.IsoDep

data class CardState(
        var hasBackup: Boolean = false,
        var isNewCard: Boolean = true,
        var serialNum: String = "",
        var pinRetryCount: Int = 0
)
