package com.inher.quest4;

class WhatsappCommunication extends Communication {

    @Override
    void sendMessage() {
        System.out.println("Communication using WhatsApp");
    }

    void otherFeatures() {
        System.out.println(
            "Send photos, videos, audio, documents and messages"
        );
    }
}