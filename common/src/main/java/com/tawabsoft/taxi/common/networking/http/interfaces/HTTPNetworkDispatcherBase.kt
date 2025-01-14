package com.tawabsoft.taxi.common.networking.http.interfaces

import com.tawabsoft.taxi.common.networking.socket.interfaces.RemoteResponse

interface HTTPNetworkDispatcherBase {
    fun dispatch(path: String, params: Map<String, Any>?, completionHandler: (RemoteResponse<Any, HTTPStatusCode>) -> Unit)
}