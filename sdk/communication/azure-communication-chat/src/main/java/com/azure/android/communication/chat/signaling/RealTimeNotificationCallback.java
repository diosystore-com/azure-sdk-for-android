// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.communication.chat.signaling;

import com.azure.android.communication.chat.signaling.chatevents.BaseEvent;


/**
 *  Funcitonal interface of real time notification callback
 */
@FunctionalInterface
public interface RealTimeNotificationCallback {

    /**
     * the call back method
     * @param chatEvent the chat event json object
     */
    void onChatEvent(BaseEvent chatEvent);

}