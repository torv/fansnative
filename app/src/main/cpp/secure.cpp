#include <jni.h>
#include <string>

extern "C" {

    jstring Java_com_torv_adam_so_Secure_getAppKey(JNIEnv *env, jobject) {
        std::string key = "";
        return env->NewStringUTF(key.c_str());
    }

    jstring Java_com_torv_adam_so_Secure_getRedirectUrl(JNIEnv *env, jobject) {
        std::string url = "";
        return env->NewStringUTF(url.c_str());
    }
}