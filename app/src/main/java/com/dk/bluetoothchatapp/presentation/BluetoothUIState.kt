package com.dk.bluetoothchatapp.presentation

import com.dk.bluetoothchatapp.domain.chat.BluetoothDevice

data class BluetoothUIState(
    val scannedDevices: List<BluetoothDevice> = emptyList(),
    val pairedDevices: List<BluetoothDevice> = emptyList()
)
