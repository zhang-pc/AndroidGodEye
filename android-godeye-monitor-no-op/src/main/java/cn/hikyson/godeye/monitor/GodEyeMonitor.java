package cn.hikyson.godeye.monitor;

import android.content.Context;

import java.util.List;

import cn.hikyson.godeye.monitor.modules.AppInfoLabel;

/**
 * Created by kysonchao on 2017/11/27.
 */
public class GodEyeMonitor {

    public interface AppInfoConext {
        Context getContext();

        List<AppInfoLabel> getAppInfo();
    }

    public static void work(Context context) {
        //no op
    }

    public static void work(Context context, int port) {
        //no op
    }

    public static void shutDown() {
        //no op
    }

    public static void injectAppInfoConext(AppInfoConext appInfoConext) {
        //no op
    }
}
