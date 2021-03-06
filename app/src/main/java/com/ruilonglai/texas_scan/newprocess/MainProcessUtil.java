package com.ruilonglai.texas_scan.newprocess;

import android.content.Context;
import android.content.pm.PackageManager;
import com.ruilonglai.texas_scan.util.MyLog;

import com.ruilonglai.texas_scan.ScreenShotUtil.ShellUtils;
import com.ruilonglai.texas_scan.models.AndroidProcess;
import com.ruilonglai.texas_scan.models.AndroidProcesses;

import java.util.List;

/**
 * Created by wgl on 2017/8/1.
 * create an new process with adb shell
 */

public class MainProcessUtil {

    private static MainProcessUtil instance;

    private ShellUtils shell;

    private boolean isExistMainProcess = false;

    private final static String TAG = "MainProcessUtil";

    private MainProcessUtil(){
        shell = new ShellUtils();
    }

    public static MainProcessUtil getInstance(){

        if(instance==null){
            synchronized (MainProcessUtil.class){
                if(instance == null)
                    instance = new MainProcessUtil();
            }
        }
        return  instance;
    }
    /*adb shell 启动一个java类*/
    public void createMainProcess(String packageName,boolean isPhone,boolean outoScanName){
        shell.Init(true);
       if(!isExistMainProcess){
           MyLog.e("command","启动main进程");
           shell.execCommand("adb shell");
           shell.execCommand("export CLASSPATH="+packageName+"/base.apk");
           packageName += "#"+isPhone + "#" +outoScanName;
           shell.execCommand("exec app_process /system/bin com.ruilonglai.texas_scan.newprocess.Main '"+packageName+"'");
       }
    }

    public void exit(Context context){
        PackageManager pm = context.getPackageManager();
        List<AndroidProcess> rp = AndroidProcesses.getRunningProcesses();
        for (int i = rp.size()-1; i > 0; i--) {
            AndroidProcess aap = rp.get(i);
            if(aap.name.contains("com.ruilonglai.texas_scan.newprocess.Main")){
                MyLog.e(TAG,"name:"+aap.name+"  pid:"+aap.pid);
                try{
                    shell.Init(true);
                    shell.execCommand("kill -9 "+aap.pid);
                }catch (Exception e){
                    MyLog.e(TAG,"指令出错了。。。");
                }
            }
        }
    }
}
