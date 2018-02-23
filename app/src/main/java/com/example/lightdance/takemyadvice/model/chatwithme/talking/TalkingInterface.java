package com.example.lightdance.takemyadvice.model.chatwithme.talking;

import java.io.File;

/**
 * 音频交流接口类
 *
 * @author LightDance
 * @date 2018/2/5.
 */

interface TalkingInterface {
    interface AudioListener {
        /**
         * 成功录制
         */
        void onSuccess();

        /**
         * 种种原因导致的录制失败，如时间太短、内存不足等
         */
        void onFailure();
    }

    interface TalkingListener{
        /**
         * 成功回复or发问
         */
        void onSuccess();

        /**
         * 种种原因导致的语音交流失败，如网络故障、无法识别等
         */
        void onFailure();

    }

    /**
     * 向服务器发送文件
     * TODO 暂时还不知道音频文件要什么格式的
     * @param file 需要发送的音频文件
     * @param listener 回调监听
     */
    void sendAudioFileWithOkHttp(File file, TalkingListener listener);

    /**
     * 录制音频
     *
     * @param listener 回调监听
     */
    void recording(AudioListener listener);

    /**
     * 从服务器获取回复
     *
     * @param listener 回调监听
     */
    void getReply(AudioListener listener);

    void playAudio(RecordPlayer player,AudioListener listener);

}
