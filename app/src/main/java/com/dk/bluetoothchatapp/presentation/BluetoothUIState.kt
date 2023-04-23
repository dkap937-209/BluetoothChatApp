package com.dk.bluetoothchatapp.presentation

import com.dk.bluetoothchatapp.domain.chat.BluetoothDevice
import com.dk.bluetoothchatapp.domain.chat.BluetoothMessage

data class BluetoothUIState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting : Boolean = false,
    val errorMessage : String? = null,
    val messages: List<BluetoothMessage> = emptyList()

)
