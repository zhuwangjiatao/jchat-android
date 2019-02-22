package jiguang.chat.listener;

import java.io.File;

/**
 * 录音回调类
 *
 * @author zhu.chuanguang
 * @version [1.0.6]
 * @since [1.0.6]
 */
public interface RecordVoiceListener {

    /**
     * 结束录音回调
     *
     * @param voiceFile 录音文件
     * @param duration  录音时长
     */
    void onFinishRecord(File voiceFile, int duration);

}
