package com.github.iweinzierl.android.utils.audio;

import android.media.AudioManager;

public final class AudioUtils {

    public static boolean areRingerAndNotificationVolumeLinked(AudioManager audioManager) {
        int ringerVolume = audioManager.getStreamVolume(AudioManager.STREAM_RING);
        int notificationVolume = audioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION);

        int testRingerVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_RING);
        int testNotificationVolume = 1;

        audioManager.setStreamVolume(AudioManager.STREAM_RING, testRingerVolume, 0);
        audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, testNotificationVolume, 0);

        int adjustedRingerVolume = audioManager.getStreamVolume(AudioManager.STREAM_RING);
        int adjustedNotificationVolume = audioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION);

        audioManager.setStreamVolume(AudioManager.STREAM_RING, ringerVolume, 0);
        audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, notificationVolume, 0);

        return !(adjustedRingerVolume == testRingerVolume && adjustedNotificationVolume == testNotificationVolume);
    }
}
